package br.com.generation48.lucasbentes.HeranPoli.Exercicio12;

public class Main {
	/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
características de forma que tudo o que for comum a todos os animais fique na classe
Animal:

Implemente um programa que crie os 3 tipos de animais definidos no exercício
anterior e invoque o método que emite o som de cada um de forma polimórfica, isto
é, independente do tipo de animal.
*/
	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Preguica preguica = new Preguica();
		
		cachorro.setNome("Biagle");
		cachorro.setIdade(3);
		
		cavalo.setNome("Avelin");
		cavalo.setIdade(20);
		
		preguica.setNome("Bradypus variegatus");
		preguica.setIdade(10);
		
		System.out.println("O cachorro esta correndo a: " + cachorro.correr(20, 20) + ", Emitindo o som: " + cachorro.emitirSom());
		System.out.println("O cachorro esta correndo a: " + cavalo.correr(20, 5) + ", Emitindo o som: " + cavalo.emitirSom());
		System.out.println("O cachorro esta correndo a: " + preguica.subirArvore(20, 60) + ", Emitindo o som: " + preguica.emitirSom());
		
	}
}
