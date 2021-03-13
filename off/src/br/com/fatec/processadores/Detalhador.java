package br.com.fatec.processadores;

import br.com.fatec.dominio.Veiculo;

//s�o estruturas que especificam um ou mais comportamentos que uma classe deve ter
// a  principio interface possui metodos abstratos
//T comportamento gen�rico
public abstract class Detalhador<T> {
	public abstract void detalhesEspecificos(T t);
	
	public void detalhes(Veiculo v) {
		System.out.println("Placa: "+ v.getPlaca());
		System.out.println("Modelo: "+ v.getModelo());
		System.out.println("Cor: "+ v.cor);
	}
}
