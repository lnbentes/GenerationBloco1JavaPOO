package br.com.generation48.lucasbentes.introducao.exercicio5;

public class MainPatinet {
	public static void main(String[] args) {
		
		Patinet patinet = new Patinet();
		
		patinet.ficha();
		
		patinet.setMarcar("Matel");
		patinet.setMaterial("Fibra de carbono");
		patinet.setModelo("ptx335");
		patinet.setNumeroRodas(2);
		
		patinet.ficha();
		
	}

}
