package br.com.generation48.lucasbentes.introducao.exercicio7;

public class MainPasciente {

	public static void main(String[] args) {
		
		Paciente pasci = new Paciente("Joao", 22, 334422, "Av. paulo", 190, "Infeccao");
		
		pasci.ficha();
		
		pasci.setAlta(true);
		
		pasci.ficha();

	}

}
