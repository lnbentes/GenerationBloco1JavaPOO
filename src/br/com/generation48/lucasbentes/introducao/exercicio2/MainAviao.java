package br.com.generation48.lucasbentes.introducao.exercicio2;

public class MainAviao {
	public static void main(String[] args) {
		
		Aviao aviao = new Aviao("Boeing 747");
		
		aviao.ficha();
		aviao.setNivelGasolina(100);
		
		aviao.ficha();
		aviao.setFuncionando(false);
		
		aviao.ficha();
		
	}
}
