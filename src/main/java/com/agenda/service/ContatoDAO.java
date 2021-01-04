package com.agenda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.agenda.model.Contato;
import com.agenda.repository.ContatoRepository;

public class ContatoDAO {
 
	@Autowired
	private static ContatoRepository repor;
	
	public List<Contato> buscarTodos(){
		
		return repor.findAll();
	}
	
	
}
