package br.com.fatec.dominio;

public class Carro extends Veiculo {
	private String airbag;

	public Carro(String placa, String modelo, String cor, String airbag) {
		super(placa, modelo, cor);
		this.airbag = airbag;
		
	}

	public String getAirbag() {
		return airbag;
	}
}
