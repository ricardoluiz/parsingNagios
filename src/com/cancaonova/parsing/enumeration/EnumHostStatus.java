package com.cancaonova.parsing.enumeration;

public enum EnumHostStatus {

	OK(0, "PING OK - Packet loss"),
	UNDEFINED(1, "STATUS NAO DEFINIFO");
	
	private Integer status;
	private String description;
	
	private EnumHostStatus(Integer status, String desc) {
		this.status = status;
		this.description = desc;
	}
	
	public Integer getStatus() {
		return status;
	}

	public String getDescription() {
		return description;
	}

	/**
	 * Retorna um Enum para o status passado no parametro para normalizar os dados
	 * @param str
	 * @return Enum com o tipo selecionado
	 */
	public static EnumHostStatus getHostStatus(String str) {
		str = str.trim();
		if (OK.getDescription().equalsIgnoreCase(str)) {
			return EnumHostStatus.OK;
		}
		return EnumHostStatus.UNDEFINED;
	}
}
