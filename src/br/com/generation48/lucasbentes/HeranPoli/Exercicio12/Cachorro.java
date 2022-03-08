package br.com.generation48.lucasbentes.HeranPoli.Exercicio12;

public class Cachorro extends Animal {
	
	
	public double correr(int espaco, int tempo) {
		velocidade = espaco / tempo;
		return velocidade;
	}
	
	@Override
	public String emitirSom() {
		return "Au. au.";
	}

}
