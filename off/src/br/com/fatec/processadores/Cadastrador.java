package br.com.fatec.processadores;

import java.util.ArrayList;

import br.com.fatec.dominio.Caminhao;
import br.com.fatec.dominio.Carro;
import br.com.fatec.dominio.Moto;
import br.com.fatec.dominio.Veiculo;

public class Cadastrador {
	private Detalhador detalhador;
	public ArrayList<Veiculo> veiculos = new ArrayList<Veiculo>();
	
	public void detalhar() {
		for (Veiculo v : veiculos) {
			if(v instanceof Carro) {
				detalhador = new DetalhadorCarro();
			}
			if(v instanceof Moto) {
				detalhador = new DetalhadorMoto();
			}
			if(v instanceof Caminhao) {
				detalhador = new DetalhadorCaminhao();
			}
			detalhador.detalhes(v);
			detalhador.detalhesEspecificos(v);
		
		}

	}

}
