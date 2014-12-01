package com.cancaonova.parsing.txt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.text.WordUtils;
import org.apache.log4j.Logger;

import com.cancaonova.parsing.enumeration.EnumHostStatus;
import com.cancaonova.parsing.enumeration.EnumService;
import com.cancaonova.parsing.main.Base;
import com.cancaonova.parsing.vo.HostStatusVO;
import com.cancaonova.parsing.vo.HostVO;
import com.cancaonova.parsing.vo.ItemVO;
import com.cancaonova.parsing.vo.ProgramStatusVO;
import com.cancaonova.parsing.vo.ServiceStatusVO;
import com.cancaonova.parsing.vo.ServiceVO;

public class ReadStatusNagios extends Base {
	
	static final String HOSTSTATUS = "hoststatus {";
	static final String PROGRAMSTATUS = "programstatus {";
	static final String SERVICESTATUS = "servicestatus {";
	
	private List<HostVO> listHostVO = new ArrayList<HostVO>();
	private List<ServiceVO> listServiceVO = new ArrayList<ServiceVO>();
	
	Logger logger = Logger.getLogger(ReadStatusNagios.class);
	
	public ReadStatusNagios() {}
	
	/**
	 * ler o conteudo do arquivo status.dat do Nagios e converter as tag em uma lista de objetos
	 * 
	 * @return
	 * @throws IOException
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public void getContent() throws IOException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		
		// variaveis
		String fileName = getProp().getProperty("prop.app.dir.input").concat(getProp().getProperty("prop.app.filename.input"));
		String tipo = null;
		ItemVO item = null;
		Method meth = null;
		@SuppressWarnings("rawtypes")
		Class[] paramTypes = new Class[] {String.class};
		HostStatusVO hostStatusVO = null;
		ServiceStatusVO serviceStatusVO = null;
		ProgramStatusVO programStatusVO = null;
		List<HostStatusVO> listHostStatusVO = new ArrayList<HostStatusVO>();
		List<ServiceStatusVO> listServiceStatusVO = new ArrayList<ServiceStatusVO>();
		List<ProgramStatusVO> listProgramStatusVO = new ArrayList<ProgramStatusVO>();
		
		// leitura do arquivo
		BufferedReader in = new BufferedReader(new FileReader(fileName));
		
		while (in.ready()) {
			String tmp = in.readLine().trim();
			
			// verifica qual tag esta lendo e seta no objeto que representa uma tag igual o arquivo do Nagios utilizando reflection
			if (tipo == null) {
				if (tmp.equals(HOSTSTATUS)) {
					tipo = HOSTSTATUS;
					hostStatusVO = new HostStatusVO();
				} else if (tmp.equals(SERVICESTATUS)) {
					tipo = SERVICESTATUS;
					serviceStatusVO = new ServiceStatusVO();
				} else if (tmp.equals(PROGRAMSTATUS)) {
					tipo = PROGRAMSTATUS;
					programStatusVO = new ProgramStatusVO();
				} else {
					tipo = null;
					continue;
				}
			} else {
				switch (tipo) {
				case HOSTSTATUS:
					if (tmp.equals("}")) {
						listHostStatusVO.add(hostStatusVO);
						tipo = null;
					} else {
						item = processLine(tmp);
						meth = hostStatusVO.getClass().getMethod("set".concat(item.getChave()), paramTypes);
						meth.invoke(hostStatusVO, item.getValor());
					}
					break;
					
				case SERVICESTATUS:
					if (tmp.equals("}")) {
						if (serviceStatusVO.getPlugin_output() != null) {
							listServiceStatusVO.add(serviceStatusVO);
						}
						
						tipo = null;
					} else {
						item = processLine(tmp);
						meth = serviceStatusVO.getClass().getMethod("set".concat(item.getChave()), paramTypes);
						meth.invoke(serviceStatusVO, item.getValor());
					}
					break;	
					
				case PROGRAMSTATUS:
					if (tmp.equals("}")) {
						listProgramStatusVO.add(programStatusVO);
						tipo = null;
					} else {
						item = processLine(tmp);
						meth = programStatusVO.getClass().getMethod("set".concat(item.getChave()), paramTypes);
						meth.invoke(programStatusVO, item.getValor());
					}
					break;
					
				default:
					break;
				}
			}
		}
		
		// obter a lista de servidores monitorados do properties
		List<String> servers = Arrays.asList(getProp().getProperty("prop.server.monit").split(";"));
		
		// varrer lista com os hosts para criar nova lista só com os monitorados 
		HostVO hostVO = null;
		for (HostStatusVO itHost : listHostStatusVO) {
			for (String server : servers) {
				if (itHost.getHost_name().equalsIgnoreCase(server)) {
					hostVO = new HostVO();
					hostVO.setHostname(itHost.getHost_name());
					hostVO.setStatus(EnumHostStatus.getHostStatus(itHost.getPlugin_output()).getStatus());
					this.listHostVO.add(hostVO);
				} else {
					
				}
			}
		}
		
		// varrer lista com os serviços para criar lista só com os monitorados
		for (ServiceStatusVO itService : listServiceStatusVO) {
			for (String server : servers) {
				if (itService.getHost_name().equalsIgnoreCase(server)) {
					if (itService.getService_description().equalsIgnoreCase(EnumService.HD.getName())) {
						this.listServiceVO.addAll(processHds(itService.getPlugin_output(), itService.getHost_name()));
					} else if (itService.getService_description().equalsIgnoreCase(EnumService.MEMORIA.getName())) {
						this.listServiceVO.addAll(processMemory(itService.getPlugin_output(), itService.getHost_name()));
					} else if (itService.getService_description().equalsIgnoreCase(EnumService.PROCESSADOR.getName())) { 
						this.listServiceVO.add(processProcessor(itService.getPlugin_output(), itService.getHost_name()));
					}
				}
			}
		}
		
		in.close();
	}
	
	// Processar a linha
	private ItemVO processLine(String str) {
		ItemVO ret = new ItemVO();
		String[] line = str.split("=");
		
		// se a linha não tiver nada retorna nulo
		if (line.length == 0) return null;
		
		// trata o valor caso tenha um "=" nos valores
		ret.setChave(WordUtils.capitalize(line[0]));
		for (int i = 1; i < line.length; i++) {
			ret.setValorConcat(line[i]);
		}
		
		return ret;
	}

	// processa o plugin_output quando for HDs
	private List<ServiceVO> processHds(String value, String hostname) {
		List<ServiceVO> listRet = new ArrayList<ServiceVO>();
		ServiceVO tempService = new ServiceVO();
		
		String[] tmp = value.split(" ");
		String val1, val2;
		
		try {
			for (int i = 0; i < tmp.length; i++) {
				val1 = tmp[i];
				if (tempService == null) {
					tempService = new ServiceVO();
				}
				if (i % 2 == 0 && val1.matches("[/].*")) {
					tempService.setHostname(hostname);
					tempService.setName(EnumService.HD.getName());
					tempService.setAttribute(val1.replace(":", ""));
				} else if (val1.matches("[\\d].*")) {
					val2 = val1.substring(0, val1.indexOf("%")) + ";";
					val2 = val2 + val1.substring(val1.indexOf("(")+1, val1.indexOf("/")-1).replaceAll("\\D", "") + ";";
					val2 = val2 + val1.substring(val1.indexOf("/")+1, val1.indexOf(")")).replaceAll("\\D", "");
					tempService.setValue(val2);
					listRet.add(tempService);
					tempService = null;
				}
			}
		} catch (Exception e) {
			logger.error("ERRO AO PROCESSAR SERVICE [HDs] DO HOST [" + hostname + "]: " + e.getMessage());
			logger.error("Erro", e);
		}
		
		return listRet;
	}
	
	// processa o plugin_output quando for MEMORIA
	private List<ServiceVO> processMemory(String value, String hostname) {
		List<ServiceVO> listRet = new ArrayList<ServiceVO>();
		ServiceVO tempService;
		String[] tmp = value.split(" ");
		
		try {
			// Memoria RAM
			tempService = new ServiceVO();
			tempService.setHostname(hostname);
			tempService.setName(EnumService.MEMORIA.getName());
			tempService.setAttribute(tmp[0]);
			tempService.setValue(tmp[2].replaceAll("\\D", ""));
			listRet.add(tempService);
			
			// Memoria SWAP
			tempService = new ServiceVO();
			tempService.setHostname(hostname);
			tempService.setName(EnumService.MEMORIA.getName());
			tempService.setAttribute(tmp[3]);
			tempService.setValue(tmp[5].replaceAll("\\D", ""));
			listRet.add(tempService);
		} catch (Exception e) {
			logger.error("ERRO AO PROCESSAR SERVICE [MEMORIA] DO HOST [" + hostname + "]: " + e.getMessage());
			logger.error("Erro", e);
		}
			
		return listRet;
	}
	
	// processa o plugin_output quando for PROCESSADOR
	private ServiceVO processProcessor(String value, String hostname) {
		ServiceVO ret = new ServiceVO();
		String[] tmp = value.split(" ");
		
		try {
			ret.setHostname(hostname);
			ret.setName(EnumService.PROCESSADOR.getName());
			ret.setAttribute(tmp[2] + " " + tmp[3]);
			ret.setValue(tmp[4].substring(0, tmp[4].indexOf("%")));
		} catch (Exception e) {
			logger.error("ERRO AO PROCESSAR SERVICE [PROCESSADOR] DO HOST [" + hostname + "]: " + e.getMessage());
			logger.error("Erro", e);
		}
		
		return ret;
	}
	
	// Getters & Setters
	public List<HostVO> getListHostVO() {
		return listHostVO;
	}

	public void setListHostVO(List<HostVO> listHostVO) {
		this.listHostVO = listHostVO;
	}

	public List<ServiceVO> getListServiceVO() {
		return listServiceVO;
	}

	public void setListServiceVO(List<ServiceVO> listServiceVO) {
		this.listServiceVO = listServiceVO;
	}

}
