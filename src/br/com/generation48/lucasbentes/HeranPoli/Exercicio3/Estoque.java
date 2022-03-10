package br.com.generation48.lucasbentes.HeranPoli.Exercicio3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Estoque {
	
	private List<String> lista;
	
	public Estoque() {
		lista = new ArrayList<String>();
	}
	
	public void armazenar(String objeto) {
		lista.add(objeto);
	}
	
	public void remover(int numeroDoObjeto) {
		lista.remove(numeroDoObjeto - 1);
	}
	
	public void atualizar(int index, String objeto) {
		lista.add(index, objeto);
	}
	
	public void organizar() {
		Collections.sort(lista);
	}
	
	public void listar() {
		System.out.println("##### Lista do Estoque #####");
		for(int i = 0; i < lista.size(); i++) {
			System.out.println((i + 1) + " --- " + lista.get(i));
		}
	}

}
