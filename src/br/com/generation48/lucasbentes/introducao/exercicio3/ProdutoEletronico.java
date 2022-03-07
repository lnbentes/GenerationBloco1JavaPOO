package br.com.generation48.lucasbentes.introducao.exercicio3;

public class ProdutoEletronico {
	
	/*Crie uma classe produto eletrônico e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto produto eletrônico,
defina as instancias deste objeto e apresente as informações deste objeto
no console.*/
	
	//TV
	 private int volume;
	    private int channel;

	    public ProdutoEletronico() {
	        this.volume = 0;
	        this.channel = 0;
	    }

	    public void trocarChannel(int canal) {
	    	this.channel = canal;
	    }
	    
	    public int trocarVolumeUp(){
	        return this.volume += 1;
	    }

	    public int trocarVolumeDown(){
	        return this.volume -= 1;
	    }

	    public int trocarChannelUp(){
	        return this.channel += 1;
	    }

	    public int trocarChannelDown(){
	        return this.channel -= 1;
	    }

	    public void status() {
	        System.out.println("Canal: " + this.channel);
	        System.out.println("Volume: " + this.volume + "\n");
	    }
	

}
