package br.com.fatec;

public class Aluno {
	// java é fortemente tipada
	public String nome; //default, não escrito explicitamente
	public String cpf;
	public int idade;
	public String ra;
	
	public Telefone telefone;
	// alt+shift+s
	public Aluno(String nome, String cpf, int idade, String ra) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.ra = ra;
	}
	
	public Aluno(String nome, String cpf, int idade, String ra, Telefone telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
		this.ra = ra;
		this.telefone = telefone;
	}
	

}
