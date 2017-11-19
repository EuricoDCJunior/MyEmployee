package com.facear.myemployee.model;

public class Benefits 
                  {
	
	          private int idbeneficio = 0;
	          private String descricao = null;
	          private double valor = 0;
	
	public int getCodigo() {
		return idbeneficio;
	}
	public void setCodigo(int codigo) {
		this.idbeneficio = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	
}
