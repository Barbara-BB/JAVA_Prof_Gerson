package br.com.fatec.processadores;


import br.com.fatec.dominio.Moto;


public class DetalhadorMoto extends Detalhador<Moto>{
	@Override
	public void detalhesEspecificos(Moto t) {
		System.out.println("Cilindros: "+ t.getCilindros());
		

	}
	

}
