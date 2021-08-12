package com.projeto.restapi.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.restapi.entity.Sistema;
import com.projeto.restapi.service.SistemaService;

@RestController
public class SistemaController {
	
	@Autowired
	private static SistemaService sistemaService;
	
	@GetMapping
	public List<Sistema> sistemas(){
		return sistemaService.listaDeSistemas();
	}

}
