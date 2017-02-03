package br.com.angeloakm.entidades;

import br.com.angeloakm.interfaces.Acao;

public class Carro implements Acao{

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public void locomover() {
		System.out.println("Carro esta em movimento");
		
	}
}
