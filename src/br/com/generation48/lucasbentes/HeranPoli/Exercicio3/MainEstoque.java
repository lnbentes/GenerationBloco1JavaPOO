package br.com.generation48.lucasbentes.HeranPoli.Exercicio3;

public class MainEstoque {

	public static void main(String[] args) {
		
		Estoque lista = new Estoque();
		
		lista.armazenar("Bombrio");
		lista.armazenar("Sabonete");
		lista.armazenar("Amora");
		lista.armazenar("Couve");
	
		lista.listar();
		
		lista.remover(3);
		
		lista.listar();
		
		lista.atualizar();
		
		lista.listar();

	}

}
