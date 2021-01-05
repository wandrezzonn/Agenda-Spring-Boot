package com.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.agenda.model.Contato;

import com.agenda.service.ContatoDAO;
import com.agenda.service.ContatoValid;


@Controller
public class AlterarController {
	@Autowired
	private ContatoDAO dao;
	
	@Autowired
	private ContatoValid valid;
	
	@RequestMapping(value = "/alterar/{id}", method = RequestMethod.GET)
	public String alterar(@PathVariable("id") Integer id , Model model, Contato contato) {
		contato = dao.buscarPorId(id);
		model.addAttribute("contato", contato);
		return "alterar";
	}
	
	
	@PostMapping(value = "/alterar/alterar")
	public String alterar(@ModelAttribute Contato contato, RedirectAttributes mensagem) {
		valid.validarSalvar(contato, mensagem);
		return "redirect:/";
	}
	
}
