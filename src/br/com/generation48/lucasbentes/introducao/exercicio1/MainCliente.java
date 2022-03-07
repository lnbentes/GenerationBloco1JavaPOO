package br.com.generation48.lucasbentes.introducao.exercicio1;

public class MainCliente {
	public static void main(String[] args) {
		
		Cliente c1 = new Cliente("Lucas Bentes", 28, 55443322, "Av Sao Paulo");
		
		System.out.println("Bem vindo " + c1.getNome() + ", ");
		System.out.println("#### Seus dados ####");
		System.out.println("Idade: " + c1.getIdade());
		System.out.println("ID: " + c1.getId());
		System.out.println("Endereco: " + c1.getEndereco());
		
	}

}
