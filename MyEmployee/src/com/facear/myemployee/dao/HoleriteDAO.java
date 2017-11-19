package com.facear.myemployee.dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.facear.myemployee.model.Holerite;

public class HoleriteDAO extends GenericDAO{

	private PreparedStatement ps;	
	private String SQL_INSERT = "INSERT INTO tbcustomer"
			+ "(Nome , idcontrato , idcontrato , idcontrato , idbeneficio )"
			+ "VALUES (? , ? , ? , ? , ?);";

	/*listar a tabela holerite de acordo com o empregador */
	private String INNERJOIN = ("SELECT * FROM TB_EMPREGADOR"
			+ "INNER JOIN  TB_CONTRATO ON (TB_CONTRATO.empregadorId == TB_EMPREGADOR.Id)"
			+ "WHERE empregador.nome =Josmar Bahia;");	


	public void insert(Holerite h){
		try{
			// Abrir conexão
			openConnection();
			// Preparar o comando SQL a ser enviado ao BD
			ps = connect.prepareStatement(SQL_INSERT);
			ps.setObject(1, h.getEmployee().getNomeCompleto());
			ps.setObject(2, h.getContract_agreement().getCargo());
			ps.setObject(3, h.getContract_agreement().getSalario());
			ps.setObject(4, h.getContract_agreement().getEmpregador().getNomeCompleto());
			ps.setObject(5, h.getBenefits().getValor());
			// Executar o comando de INSERT, logo não se espera retorno
			ps.executeUpdate();
			// Fechar conexão
			closeConnection();
		} catch (ClassNotFoundException e) {
			System.out.println("Class not Found");
		} catch (IOException e) {
			System.out.println("File not Found");
		} catch (SQLException e) {
			System.out.println("Error on Connecting(SALVAR)");
		}
	}

	/*Method list*/
	public List<Holerite> listar() throws ClassNotFoundException,IOException,SQLException{

		List<Holerite> lista = new ArrayList<Holerite>();

		openConnection();

		ps = connect.prepareStatement(INNERJOIN);

		ResultSet rs = ps.executeQuery();

		if(rs != null){
			while(rs.next()){


				Holerite ho = new Holerite();
				lista.add(ho);
			}
		}
		closeConnection();

		return lista;
	}



}
