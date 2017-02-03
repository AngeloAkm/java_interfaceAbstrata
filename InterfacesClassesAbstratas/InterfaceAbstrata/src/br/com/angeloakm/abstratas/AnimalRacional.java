package br.com.angeloakm.abstratas;

import br.com.angeloakm.interfaces.Raciocinio;

public abstract class AnimalRacional extends Animal implements Raciocinio {
	
	public void comunicar(){
		System.out.println("humano falando");
	}

}
