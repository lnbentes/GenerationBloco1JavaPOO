package br.com.generation48.lucasbentes.introducao.exercicio6;

import java.util.Scanner;

public class MainConta {

	public static void main(String[] args) {
		
		int opcao;
		double valor;
		int id;
		Conta conta = new Conta("Lucas Bentes", 9933513);
		Scanner ler = new Scanner(System.in);
		
		System.out.println("#### Bem vindo a sua conta bancaria ####");
		do {
			
			System.out.println("\nEscolha a opção: 1-Sacar  2-Depositar  3-Trasferir  4-Extrato  5-Sair");
			
			opcao = ler.nextInt();
			
			switch (opcao) {
            case 1:
                System.out.print("Quanto deseja sacar? ");
                valor = ler.nextDouble();
                conta.sacar(valor);
                break;            
            case 2: 
            	System.out.print("Quanto deseja depositar? ");
                valor = ler.nextDouble();
                conta.depositar(valor);
            	break;
            case 3:
            	System.out.print("Quanto deseja Tasferir? ");
                valor = ler.nextDouble();
                System.out.print("Para qual conta? ");
                id = ler.nextInt();
                conta.trasferir(valor, id);
                break;
            case 4:
            	conta.extrato();
                break;
            case 5:
            	
            	break;            
            default: System.out.println("Opção Inválida! Tente novamente.");
			}
			
		}while(opcao != 5);
		
		ler.close();
		
	}
}
