package com.facear.myemployee.model;

import java.util.Date;

public class Employee 
                 {

	           private int codigo;
	           private String nomecompleto;
	           private Date dataNascimento;
	           private String cpf;
	           private String rg;
	           private String telefoneFixo;
	           private String telefoneCelular;
	           private String cep;
	           private String enderecoRua;
	           private Integer enderecoNumero;
	           private String complemento;
	           private String bairro;
	           private String cidade;
	           private String uf;
	           private String email;
	           private String status;
	           private String sexo; 

	public Employee() 
	{
		//Construct default	
	}
	

	public Employee(int codigo, String nomeCompleto, Date dataNascimento, String cpf, String rg,
			String telefoneFixo, String telefoneCelular, String cep, String enderecoRua, Integer enderecoNumero,
			String complemento, String bairro, String cidade, String uf, String email, String status, String sexo) {
		       super();
		       this.codigo = codigo;
		       this.nomecompleto = nomeCompleto;
		       this.dataNascimento = dataNascimento;
		       this.cpf = cpf;
		       this.rg = rg;
		       this.telefoneFixo = telefoneFixo;
		       this.telefoneCelular = telefoneCelular;
		       this.cep = cep;
		       this.enderecoRua = enderecoRua;
		       this.enderecoNumero = enderecoNumero;
		       this.complemento = complemento;
		       this.bairro = bairro;
		       this.cidade = cidade;
		       this.uf = uf;
		       this.email = email;
		       this.status = status;
		       this.sexo = sexo;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNomeCompleto() {
		return nomecompleto;
	}

	public void setNomeCompleto(String nomeCompleto) {
		this.nomecompleto = nomeCompleto;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEnderecoRua() {
		return enderecoRua;
	}

	public void setEnderecoRua(String enderecoRua) {
		this.enderecoRua = enderecoRua;
	}

	public Integer getEnderecoNumero() {
		return enderecoNumero;
	}

	public void setEnderecoNumero(Integer enderecoNumero) {
		this.enderecoNumero = enderecoNumero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}	
}
