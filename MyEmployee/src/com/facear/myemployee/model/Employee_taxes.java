package com.facear.myemployee.model;

public class Employee_taxes 
                       {

	           private int codigo = 0;
	           private String descricao = null;
	           private double valor = 0;
	
	
	public Employee_taxes(int codigo, String descricao, double valor) {
		      super();
		      this.codigo = codigo;
		      this.descricao = descricao;
		      this.valor = valor;
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
