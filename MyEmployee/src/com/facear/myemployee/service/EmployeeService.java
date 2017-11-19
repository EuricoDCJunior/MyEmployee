package com.facear.myemployee.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.facear.myemployee.dao.EmployeeDAO;
import com.facear.myemployee.model.Contract_agreement;

public class EmployeeService 
                       {
	      EmployeeDAO dao = new EmployeeDAO();
	
	      public List<Contract_agreement> listAll() throws ClassNotFoundException, IOException, SQLException
 	                          {
		             List<Contract_agreement> list = new ArrayList<Contract_agreement>();
		             list = dao.listar();
		             
		return list;
	}
}
