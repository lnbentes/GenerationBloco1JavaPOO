package br.com.generation48.lucasbentes.introducao.exercicio6;

public class Conta {
	/*Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.*/

	private double valor;
	private String nome;
	private int id;
	
	public Conta(String nome, int id) {
		this.valor = 0;
		this.nome = nome;
		this.id = id;
	}
	
	public void depositar(double valor) {
		if(valor > 0) {
			this.valor += valor;
			System.out.println("Deposito realizad0!");
		}
		else {
		System.out.println("Nao se deposita valor negativo");
		}
	}
	
	public void sacar(double valor) {
		if(valor <= this.valor) {
			this.valor -= valor;
			System.out.println("Saque realizado!");
		}
		else {
		System.out.println("Saldo insuficiente");
		}
	}
	
	public void trasferir(double valor, int id) {
		this.sacar(valor);
		System.out.println("Valor de " + valor + " trasferido para a conta " + id);
	}
	
	public void extrato() {
		System.out.println("\n#### Extrato ####");
		System.out.println("Cliente: " + this.nome);
		System.out.println("Numero da conta: " + this.id);
		System.out.println("Saldo: " + this.valor);
		System.out.println("########################");
	}
	
}
