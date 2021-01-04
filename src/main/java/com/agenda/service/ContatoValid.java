package com.agenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.agenda.model.Contato;

@Component
public class ContatoValid {

	@Autowired
	private ContatoDAO dao;
	
	public String validar(Contato contato) {
		String nome = contato.getNome();
		System.out.println("Valid " +contato.getNome());
		if(nome == null || nome.isEmpty()) {
			System.out.println("Redirecionando");
			return "redirect:/";
		}else {
			dao.salvar(contato);
			System.out.println("Sucesso");
			return "redirect:/";
		}
	}
}
