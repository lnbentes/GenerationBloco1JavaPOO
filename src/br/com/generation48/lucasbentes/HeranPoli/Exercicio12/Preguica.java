package br.com.generation48.lucasbentes.HeranPoli.Exercicio12;

public class Preguica extends Animal{

	
	public double subirArvore(int espaco, int tempo) {
		velocidade = espaco / tempo;
		return velocidade;
	}
	
	@Override
	public String emitirSom() {
		return "...";
	}
	
}
