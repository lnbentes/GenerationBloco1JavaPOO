package br.com.generation48.lucasbentes.introducao.exercicio7;

import br.com.generation48.lucasbentes.introducao.exercicio1.Cliente;

public class Paciente extends Cliente{
	
	/*Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

	private int idPac;
	private String complicacao;
	private boolean alta;
	
	public Paciente(String nome, int idade, int id, String endereco, int idPac, String compl) {
		super(nome, idade, id, endereco);
		this.idPac = idPac;
		this.complicacao = compl;
		this.alta = false;
	}
	
	public void ficha() {
		System.out.println("#### Ficha do pasciente ####");
		System.out.println("Nome: " + super.getNome());
		System.out.println("Idade: " + super.getIdade());
		System.out.println("Numero de registro: " + this.idPac);
		System.out.println("Complicacao: " + this.complicacao);
		System.out.println("Endereco: " + super.getEndereco());
		System.out.println("Paciente em alta?: " + this.isAlta());
	}

	public String isAlta() {
		if(this.alta == false) {
			return "Pasciente internado";
		}
		return "Pasciente em alta";
	}

	public void setAlta(boolean alta) {
		this.alta = alta;
	}

	
	
}
