package com.projeto.restapi.entity;

import com.projeto.restapi.Conexao;

public class Sistema {
	private int id;
	private String nome;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	Conexao con = new Conexao();
	String sql = "INSERT into Sistema (id, nome) values (default,nome)";
	int res = con.executaSQL(sql);

	
}
