package br.com.angeloakm.entidades;

import br.com.angeloakm.abstratas.Animal;

public class Cachorro extends Animal {

	@Override
	public void comunicar() {
		System.out.println("Cachorro latindo");
	}

}
