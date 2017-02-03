package br.com.angeloakm.abstratas;

import br.com.angeloakm.interfaces.Acao;
import br.com.angeloakm.interfaces.Comunicacao;

public abstract class Animal implements Comunicacao, Acao {

	private String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void locomover() {
		System.out.println(this.nome + " esta andando");
	}
}
