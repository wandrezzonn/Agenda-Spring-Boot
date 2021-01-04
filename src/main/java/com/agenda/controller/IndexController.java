package com.agenda.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.agenda.model.Contato;
import com.agenda.service.ContatoDAO;
import com.agenda.service.ContatoValid;


@Controller

public class IndexController {

	@Autowired
	private ContatoDAO dao;
	
	@Autowired
	private ContatoValid valid;
	@RequestMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("contato", dao.buscarTodos());
		return mv;
	}


	
	@RequestMapping(value = "/salvar", method = RequestMethod.POST)
	public String salvar(Contato contato) {
				
		return valid.validar(contato);
		
	}


}
