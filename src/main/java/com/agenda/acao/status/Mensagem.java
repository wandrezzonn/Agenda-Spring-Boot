package com.agenda.acao.status;

public enum Mensagem {
	/*
	 * Enum para envio de mensagem ao front de acordo com a ação da Classe
	 * ContatoValid
	 */
	SUCESSO("Salvo com sucesso"), 
	VAZIO("Todos os campos devem ser preenchidos"),
	DELETADO_SUCESSO("Deletado com sucesso"), 
	DELETADO_FALHA("Falha ao deletar");

	private String mensagem;

	private Mensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}

}
