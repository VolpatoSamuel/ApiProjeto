package com.projeto.restapi.entity;

import java.sql.Date;

public class Equipamento {
	private int id;
	private String nome;
	private String enderecoIP;
	private Date DataCadastro;
	private int subSistema;
	
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
	public String getenderecoIP() {
		return enderecoIP;
	}
	public void setenderecoIP(String enderecoIP) {
		this.enderecoIP = enderecoIP;
	}
	public Date getDataCadastro() {
		return DataCadastro;
	}
	public void setDataCadastro(Date DataCadastro) {
		this.DataCadastro = DataCadastro;
	}
	public int getsubSistema() {
		return subSistema;
	}
	public void setsubSistema(int subSistema) {
		this.subSistema = subSistema;
	}

}
