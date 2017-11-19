package com.facear.myemployee.model;
/*Coust
 * */
public class Contract_agreement 
                           {

	              private int idcontrato = 0;
	              private Employer employer;
	              private Employee employee;
	              private String cargo = null;
	              private Double salario;
	              private String dataInicio;
	              private String dataFinal;
	              private int cargaHoraria;
	
	public Contract_agreement(int codigo, Employer employer, Employee employee, String cargo, Double salario,
			String dataInicio, String dataFinal, int cargaHoraria) {
		          super();
		          this.idcontrato = codigo;
		          this.employer = employer;
		          this.employee = employee;
		          this.cargo = cargo;
		          this.salario = salario;
		          this.dataInicio = dataInicio;
		          this.dataFinal = dataFinal;
		          this.cargaHoraria = cargaHoraria;
	}
	
	public int getCodigo() {
		return idcontrato;
	}
	public void setCodigo(int codigo) {
		this.idcontrato = codigo;
	}
	public Employer getEmpregador() {
		return employer;
	}
	public void setEmpregador(Employer employer) {
		this.employer = employer;
	}
	public Employee getEmpregado() {
		return employee;
	}
	public void setEmpregado(Employee employee) {
		this.employee = employee;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public Double getSalario() {
		return salario;
	}
	public void setSalario(Double salario) {
		this.salario = salario;
	}
	public String getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}
	public String getDataFinal() {
		return dataFinal;
	}
	public void setDataFinal(String dataFinal) {
		this.dataFinal = dataFinal;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
}
