package br.com.generation48.lucasbentes.introducao.exercicio1;

public class Cliente {

	/*Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
	
	
	private String nome;
	private int idade;
	private int id;
	private String endereco;
	
	public Cliente(String nome, int idade, int id, String endereco) {
		this.nome = nome;
		this.idade = idade;
		this.id = id;
		this.endereco = endereco;
	}
	
	
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public int getId() {
		return id;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
}
