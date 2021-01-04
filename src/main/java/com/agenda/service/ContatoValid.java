package com.agenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.agenda.mensagens.Mensagem;
import com.agenda.model.Contato;

@Component
public class ContatoValid {

	@Autowired
	private ContatoDAO dao;
	
	public String validar(Contato contato,RedirectAttributes messagem) {
		String nome = contato.getNome();
		String telefone = contato.getTelefone();
		System.out.println("Valid " +contato.getNome());
		if(nome == null || nome.isEmpty() || telefone == null || telefone.isEmpty()) {
			messagem.addFlashAttribute("vazio", Mensagem.VAZIO.getMensagem());
			return "redirect:/";
		}else {
			dao.salvar(contato);
			messagem.addFlashAttribute("sucesso", Mensagem.SUCESSO.getMensagem());
			return "redirect:/";
		}
	}
	

}
