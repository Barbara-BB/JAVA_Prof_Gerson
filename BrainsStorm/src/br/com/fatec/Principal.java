package br.com.fatec;

//public class Principal -> aasinatura da classe
// public - > modificador de acesso Tipos: public,private,default e protected
// fun��o -> def -> m�todo
// void- se n�o retorna nada
// main... ele � especial! todo m�toodo existe, apenas dentro de classe.
// o main � o ponto de partida da minha aplica��o
// toda m�quina tem um ponto de partida
public class Principal {
	public static void main(String[] args) {
		//	declara��o de objeto: Tipo variavel = 'new' Construtor(parametros)
		// Construtor -> mesmo nome da classe
		Telefone tel = new Telefone();
		tel.ddd = "12";
		tel.numero = "99999999";
		
		Aluno a = new Aluno("Gerson Penha","99999",100,"1235",new Telefone("9999","12"));
		

		
		
		System.out.println("numero: "+a.telefone.numero);
	}
}
