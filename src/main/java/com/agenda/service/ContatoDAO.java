package com.agenda.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agenda.model.Contato;
import com.agenda.repository.ContatoRepository;
@Service
public class ContatoDAO {
 
	@Autowired
	private ContatoRepository repor;
	
	public List<Contato> buscarTodos(){
		
		return repor.findAll();
	}
	
	public Contato salvar(Contato contato) {
		return repor.save(contato);
	}
	
 public void deletar(Integer id) {
	 repor.deleteById(id);
 }
	
	
}
