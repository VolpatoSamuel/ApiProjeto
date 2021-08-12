package com.projeto.restapi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


public class Conexao {
	private String url;
	private String usuario;
	private String senha;
	private Connection con;
	
	public Conexao(){
		url = "jdbc:postgresql://localhost:5432/apiProjeto";
		usuario = "postgres";
		senha = "savo";
		
		try {
			con = DriverManager.getConnection(url,usuario,senha);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public int executaSQL(String sql) {
		try {
			Statement stm = con.createStatement();
			int res = stm.executeUpdate(sql);
			con.close();
			return res;
			
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
}
