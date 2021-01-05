package com.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.agenda.service.ContatoValid;

@Controller
public class DeletarController {
	
	@Autowired
	private ContatoValid valid;
	
	@RequestMapping(value = "/deletar/{id}")
	public String deletar(@PathVariable("id")Integer id, RedirectAttributes mensagem) {
		
		return valid.validarDelete(id, mensagem);
		
	}

}
