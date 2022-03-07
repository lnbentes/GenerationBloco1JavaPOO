package br.com.generation48.lucasbentes.introducao.exercicio5;

public class Patinet {
	
	/*Crie uma classe patinete e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto patinete, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/
	
	private String marcar;
	private String modelo;
	private int numeroRodas;
	private String material;
	
	public Patinet() {
		this.marcar = "xxxxx";
		this.modelo = "xxxxx";
		this.material = "xxxxx";
		this.numeroRodas = 0;
	}
	
	public void ficha() {
		System.out.println("#### Ficha Tecnica ####");
		System.out.println("Marcar: " + this.marcar);
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Material: " + this.material);
		System.out.println("Numero de Rodas: " + this.numeroRodas + "\n");
	}

	public void setMarcar(String marcar) {
		this.marcar = marcar;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public void setNumeroRodas(int numeroRodas) {
		this.numeroRodas = numeroRodas;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	

}
