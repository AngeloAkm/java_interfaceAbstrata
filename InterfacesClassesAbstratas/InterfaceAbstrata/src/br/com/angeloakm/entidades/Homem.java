package br.com.angeloakm.entidades;

import br.com.angeloakm.abstratas.AnimalRacional;

public class Homem extends AnimalRacional {

	@Override
	public void raciocinar() {
		System.out.println("Homem pensou e gritou: gooool");
	}

}
