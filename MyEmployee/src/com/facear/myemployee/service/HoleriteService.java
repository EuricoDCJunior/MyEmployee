package com.facear.myemployee.service;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.facear.myemployee.dao.HoleriteDAO;
import com.facear.myemployee.model.Holerite;


public class HoleriteService 
                       {
	
	HoleriteDAO dao = new HoleriteDAO();

	public Holerite insertHolerite(Holerite h)
    {
		if(h != null){
			dao.insert(h);
		}
		return null;
	}

	public List<Holerite> listAll() throws ClassNotFoundException, IOException, SQLException
	{	
		List<Holerite> list = new ArrayList<Holerite>();
		list = dao.listar();
		return list;
	}
}
