package br.com.generation48.lucasbentes.introducao.exercicio3;

public class MainTV {
	public static void main(String[] args) {
		
		ProdutoEletronico tv = new ProdutoEletronico();
		
		tv.trocarChannel(7);
		tv.status();
		
		tv.trocarVolumeUp();
		tv.trocarVolumeUp();
		tv.trocarVolumeUp();
		
		tv.status();
		
		tv.trocarChannelDown();
		tv.status();
	}

}
