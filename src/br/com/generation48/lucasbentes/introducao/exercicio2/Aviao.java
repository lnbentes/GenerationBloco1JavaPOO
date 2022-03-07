package br.com.generation48.lucasbentes.introducao.exercicio2;

public class Aviao {

	/*Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
	
	private String tipo;
	private int nivelGasolina;
	private boolean funcionando;
	
	public Aviao(String nome) {
		this.tipo = nome;
		this.nivelGasolina = 50;
		this.funcionando = true;
	}
	
	public void ficha() {
		System.out.println("### Ficha tecnica ###");
		System.out.println("Modelo do aviao: " + this.tipo);
		System.out.println("Funcionando: " + this.isFuncionando());
		System.out.println("Nivel de gasolina: " + this.nivelGasolina + "%\n");
	}

	
	public void setNivelGasolina(int nivelGasolina) {
		this.nivelGasolina = nivelGasolina;
	}

	public String isFuncionando() {
		if(this.funcionando == true) {
			return "Aviao funcional";
		}
		return "Aviao nao funcional";
	}

	public void setFuncionando(boolean funcionando) {
		this.funcionando = funcionando;
	}
	
	
	
}
