package com.cancaonova.parsing.main;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.cancaonova.parsing.txt.ReadStatusNagios;
import com.cancaonova.parsing.vo.StatusVO;
import com.google.gson.Gson;

/**
 * @author Ricardo Luiz
 * 
 * Converter o arquivo de status do Nagios para json
 */
public class Execute {
	
	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger(Execute.class);
		
		ReadStatusNagios read = new ReadStatusNagios();
		StatusVO status = new StatusVO();
		
		logger.info("INICIO PROCESSAMENTO: " + System.currentTimeMillis());
		try {
			
			read.getContent();
			
			status.setHosts(read.getListHostVO());
			status.setServices(read.getListServiceVO());
			
			Gson gson = new Gson();
			String json = gson.toJson(status);
			
			FileWriter writer = new FileWriter(getFileName());
			writer.write(json);
			writer.close();
			
		} catch (Exception e) {
			logger.error("OCORREU UM ERRO NO PROCESSAMENTO: " + e.getMessage());
			logger.error("Erro", e);
		}
		logger.info("FINAL PROCESSAMENTO: " + System.currentTimeMillis());
	}

	private static String getFileName() throws IOException {
		Properties props = new Properties();
		FileInputStream file = new FileInputStream("./properties/application.properties");
		props.load(file);
		return props.getProperty("prop.app.dir.output").concat(props.getProperty("prop.app.filename.output"));
	}
}
