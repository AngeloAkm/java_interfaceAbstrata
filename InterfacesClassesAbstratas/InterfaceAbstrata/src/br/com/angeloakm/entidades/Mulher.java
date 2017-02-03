package br.com.angeloakm.entidades;

import br.com.angeloakm.abstratas.AnimalRacional;

public class Mulher extends AnimalRacional {

	@Override
	public void raciocinar() {
		System.out.println("Mulher pensou, acertou o combo e mandou uma tela branca do Akuma");
	}

}
