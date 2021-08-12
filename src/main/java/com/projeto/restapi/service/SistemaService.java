package com.projeto.restapi.service;

import java.util.ArrayList;
import java.util.List;

import com.projeto.restapi.entity.Sistema;

public class SistemaService {
	
	private static List<Sistema> sistemas;
	
	public SistemaService() {
		
		sistemas = new ArrayList<Sistema>();
		
		Sistema sistema = new Sistema();
		sistema.setNome("Contas");
		sistema.setId(01);
				
		sistemas.add(sistema);
		
		sistema = new Sistema();
		sistema.setNome("Vendas");
		sistema.setId(02);
		
		sistemas.add(sistema);
	}
	
	
public static List<Sistema> listaDeSistemas(){
		return sistemas;
	}

}
