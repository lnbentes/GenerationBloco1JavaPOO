package br.com.generation48.lucasbentes.HeranPoli.Exercicio12;

public class Animal {
	
	private String nome;
	private int idade;
	protected int velocidade;
	
	public String emitirSom() {
		return "Grauu...";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}
