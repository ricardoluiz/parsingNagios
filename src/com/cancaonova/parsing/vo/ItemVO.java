package com.cancaonova.parsing.vo;

public class ItemVO extends BaseVO {

	private String chave;
	private String valor;
	
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	public void setValorConcat(String valor) {
		if (this.valor == null) {
			this.valor = valor;
		} else {
			this.valor.concat(valor);
		}
	}
}
