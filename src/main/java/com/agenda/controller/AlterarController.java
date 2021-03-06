package com.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.agenda.model.Contato;

import com.agenda.service.ContatoDAO;
import com.agenda.service.ContatoValid;


@Controller
@RequestMapping("/alterar")
public class AlterarController {
	@Autowired
	private ContatoDAO dao;
	
	@Autowired
	private ContatoValid valid;
	
	@GetMapping(value = "/{id}")
	public String alterar(@PathVariable("id") Integer id , Model model, Contato contato) {
		contato = dao.buscarPorId(id);
		model.addAttribute("contato", contato);
		return "alterar";
	}
	
	
	@PostMapping(value = "/alterar")
	public String alterar(Contato contato, RedirectAttributes mensagem) {
		valid.validarSalvar(contato, mensagem);
		return "redirect:/";
	}
	
}
