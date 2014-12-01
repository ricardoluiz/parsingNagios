package com.cancaonova.parsing.enumeration;

public enum EnumService {

	PING("Ping"),
	UPTIME("Uptime"),
	HD("HDs"),
	MEMORIA("Memoria"),
	PROCESSADOR("Processador");
	
	private String name;

	private EnumService(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

}
