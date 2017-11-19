package com.facear.myemployee.model;

public class User 
               {

	          private int codigo = 0;
	          private String tipo = null;
	          private String usuario = null;
 	          private String senha = null;
	          private String status = null;
	          private int contaAssociada = 0;
	    
	public User()
	{
		//Construct default
	}
	
	public User(int codigo, String tipo, String usuario, String senha, String status, int contaAssociada) 
	{
		      super();
		      this.codigo = codigo;
		      this.tipo = tipo;
		      this.usuario = usuario;
		      this.senha = senha;
		      this.status = status;
		      this.contaAssociada = contaAssociada;
	}

	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getContaAssociada() {
		return contaAssociada;
	}
	public void setContaAssociada(int contaAssociada) {
		this.contaAssociada = contaAssociada;
	}
}
