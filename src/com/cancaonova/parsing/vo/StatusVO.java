package com.cancaonova.parsing.vo;

import java.util.ArrayList;
import java.util.List;

public class StatusVO extends BaseVO {

	private List<HostVO> hosts = new ArrayList<HostVO>();
	private List<ServiceVO> services = new ArrayList<ServiceVO>();
	
	public List<HostVO> getHosts() {
		return hosts;
	}
	public void setHosts(List<HostVO> listHostVO) {
		this.hosts = listHostVO;
	}
	public List<ServiceVO> getServices() {
		return services;
	}
	public void setServices(List<ServiceVO> listServiceVO) {
		this.services = listServiceVO;
	}
}
