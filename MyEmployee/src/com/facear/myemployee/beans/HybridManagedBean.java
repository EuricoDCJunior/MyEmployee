package com.facear.myemployee.beans;

import java.io.IOException;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.facear.myemployee.model.Contract_agreement;
import com.facear.myemployee.model.Employee;
import com.facear.myemployee.model.Employer;
import com.facear.myemployee.model.Holerite;
import com.facear.myemployee.service.EmployeeService;
import com.facear.myemployee.service.HoleriteService;

@ManagedBean(name = "hybridManagedBean")
@SessionScoped
public class HybridManagedBean implements Serializable
{
	private static final long serialVersionUID = -9004785433894347006L;	

	private Holerite holerite;
	private List<Holerite> listHolerite;
	private Employee employee;
	private Employer employer;
	private Contract_agreement contract;
	private List<Contract_agreement> listEmpregado;
	private HoleriteService service;
	private EmployeeService serviceEm;

	public HybridManagedBean() throws ClassNotFoundException, IOException, SQLException
	{
		service = new HoleriteService();
		contract = new Contract_agreement(0, employer, employee, null, 0.00, null, null, 0);
		serviceEm = new EmployeeService();
		holerite = new Holerite();
		listEmpregado = serviceEm.listAll();
		
	
	}
	
	/*Method de insert*/
	public String insertHolerite()throws ClassNotFoundException, IOException, SQLException
	{
		service.insertHolerite(holerite);
		holerite = new Holerite();
		listHolerite = service.listAll();
		return "index";
	}
	
	public Holerite getHolerite() {
		return holerite;
	}

	public void setHolerite(Holerite holerite) {
		this.holerite = holerite;
	}

	public List<Holerite> getListHolerite() {
		return listHolerite;
	}

	public void setListHolerite(List<Holerite> listHolerite) {
		listHolerite = listHolerite;
	}

	public List<Contract_agreement> getListEmpregado() {
		return listEmpregado;
	}

	public void setListEmpregado(List<Contract_agreement> listEmpregado) {
		this.listEmpregado = listEmpregado;
	}
	
}
