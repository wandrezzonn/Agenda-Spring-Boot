package com.agenda.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.agenda.acao.status.Mensagem;
import com.agenda.model.Contato;

@Component
public class ContatoValid {

	@Autowired
	private ContatoDAO dao;

	public String validar(Contato contato, RedirectAttributes messagem) {
		String nome = contato.getNome();
		String telefone = contato.getTelefone();
		System.out.println("Valid " + contato.getNome());
		if (nome == null || nome.isEmpty() || telefone == null || telefone.isEmpty()) {
			messagem.addFlashAttribute("mensagem", Mensagem.VAZIO.getMensagem());
			return "redirect:/";
		} else {
			dao.salvar(contato);
			messagem.addFlashAttribute("mensagem", Mensagem.SUCESSO.getMensagem());
			return "redirect:/";
		}
	}
	
	public String validarDelete(Integer id, RedirectAttributes messagem) {
		
		if(id > 0) {
			messagem.addFlashAttribute("mensagem", Mensagem.DELETADO_SUCESSO.getMensagem());
			dao.deletar(id);
			return "redirect:/";
			
		}else {
		messagem.addFlashAttribute("mensagem", Mensagem.DELETADO_FALHA.getMensagem());
			return "redirect:/";
		}
		
		
	}

}
