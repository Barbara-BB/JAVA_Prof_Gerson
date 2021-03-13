package br.com.fatec.processadores;


import br.com.fatec.dominio.Caminhao;


public class DetalhadorCaminhao extends Detalhador<Caminhao>{
	@Override
	public void detalhesEspecificos(Caminhao t) {
		System.out.println("Caminhao: "+ t.getEixos());
		System.out.println("-----------------------------");

	}
	

}
