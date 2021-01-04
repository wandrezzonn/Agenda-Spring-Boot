package com.agenda.mensagens;

public enum Mensagem {

	SUCESSO("Salvo com sucesso"),
	VAZIO("Todos os campos devem ser preenchidos");
	private String mensagem;

	private Mensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public String getMensagem() {
		return mensagem;
	}


}
