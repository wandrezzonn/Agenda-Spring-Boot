package com.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.agenda.model.Contato;
import com.agenda.service.ContatoValid;

@Controller
public class SalvarController {
	
	
	@Autowired
	private ContatoValid valid;

	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public String salvar(Contato contato) {

		return valid.validar(contato);

	}
}
