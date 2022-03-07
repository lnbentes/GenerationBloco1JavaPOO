package br.com.generation48.lucasbentes.introducao.exercicio4;

import br.com.generation48.lucasbentes.introducao.exercicio1.Cliente;

public class Funcionario extends Cliente{
	
	private int idFuncionario;

	public Funcionario(String nome, int idade, int id, String endereco, int idF) {
		super(nome, idade, id, endereco);
		this.idFuncionario = idF;
	}
	
	public int getIdFuncionario() {
		return this.idFuncionario;
	}
	
	public void ficha() {
		System.out.println("#### Ficha de funcionario ####");
		System.out.println("Nome: " + super.getNome());
		System.out.println("Numero de identificacao: " + this.idFuncionario);
		System.out.println("Idade: " + super.getIdade() + "\n");
	}

}
