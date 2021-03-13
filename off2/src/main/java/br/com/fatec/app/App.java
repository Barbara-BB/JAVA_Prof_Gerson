package br.com.fatec.app;

import com.google.gson.Gson;

import br.com.fatec.dominio.Caminhao;
import br.com.fatec.dominio.Carro;
import br.com.fatec.dominio.Moto;
import br.com.fatec.dominio.Veiculo;
import br.com.fatec.processadores.Cadastrador;

public class App {

	public static void main(String[] args) {
		Veiculo cr = new Carro("GHF","Corsa","Azul","SEM");
		Veiculo mt = new Moto("DFD","CG","Azul","125cc");
		Veiculo cm = new Caminhao("AKD","VOLVO","Branco",3);
		
		Cadastrador cd = new Cadastrador();
		cd.veiculos.add(cr);cd.veiculos.add(mt);cd.veiculos.add(cm);
		cd.detalhar();
		
		Gson gs = new Gson();
		String crj = gs.toJson(cr);
		System.out.println(crj);

	}

}
