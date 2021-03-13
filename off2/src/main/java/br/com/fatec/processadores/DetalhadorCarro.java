package br.com.fatec.processadores;

import br.com.fatec.dominio.Carro;


public class DetalhadorCarro extends Detalhador<Carro> {

	@Override
	public void detalhesEspecificos(Carro t) {

		System.out.println("Airbag: "+ t.getAirbag());
		System.out.println("-----------------------------");

	}

}
