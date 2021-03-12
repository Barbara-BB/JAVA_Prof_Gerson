package br.com.fatec;

//public class Principal -> aasinatura da classe
// public - > modificador de acesso Tipos: public,private,default e protected
// função -> def -> método
// void- se não retorna nada
// main... ele é especial! todo métoodo existe, apenas dentro de classe.
// o main é o ponto de partida da minha aplicação
// toda máquina tem um ponto de partida
public class Principal {
	public static void main(String[] args) {
		//	declaração de objeto: Tipo variavel = 'new' Construtor(parametros)
		// Construtor -> mesmo nome da classe
		Telefone tel = new Telefone();
		tel.ddd = "12";
		tel.numero = "99999999";
		
		Aluno a = new Aluno("Gerson Penha","99999",100,"1235",new Telefone("9999","12"));
		

		
		
		System.out.println("numero: "+a.telefone.numero);
	}
}
