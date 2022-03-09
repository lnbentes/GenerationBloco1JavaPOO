package br.com.generation48.lucasbentes.HeranPoli.Exercicio12;

public abstract class Animal {
	
	private String nome;
	private int idade;
	
	public abstract String emitirSom();
	
	public String mover() {
		return "Correndo...";
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
