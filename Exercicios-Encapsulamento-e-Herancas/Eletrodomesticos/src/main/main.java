package main;

import java.util.Scanner;

import eletrodomestico.Eletrodomestico;

public class main {

	public static void main(String[] args) {
		String tipo, marca;
		double valor = 0;
		int opcao = 0;
		boolean repetir = true;
		
		Eletrodomestico eletrodomestico = new Eletrodomestico("", "", 0);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o tipo de eletrodoméstico: ");
		tipo = entrada.nextLine();
		eletrodomestico.setTipo(tipo);
		
		System.out.println("Informe a marca de seu ou sua " + eletrodomestico.getTipo() + ":");
		marca = entrada.nextLine();
		eletrodomestico.setMarca(marca);
		
		System.out.print("Informe o valor pago: R$");
		valor = entrada.nextDouble();
		eletrodomestico.setValor(valor);
		
		System.out.println("\n-------------------------------------------\n");
		
		do {
			System.out.println("Deseja ligar seu eletrodomético?\n\n"
					+ "\t1 - Sim\n"
					+ "\t2 - Não\n\n");
			opcao = entrada.nextInt();
			if(opcao == 1) {
				eletrodomestico.ligar();
				repetir = false;
			}else if(opcao == 2) {
				System.out.println("Okay, você não ligou seu eletrodoméstico");
				repetir = false;
			}else {
				System.err.print("\nNão entendi, repita a sua opção\n");
				repetir = true;
			}
			
		}while(repetir == true);
		
		
		do {
			if(opcao == 1) {
				opcao = 0;
				System.out.println("Agora deseja desligar seu eletrodomético?\n\n"
						+ "\t1 - Sim\n"
						+ "\t2 - Não\n\n");
				opcao = entrada.nextInt();
				if(opcao == 1) {
					eletrodomestico.desligar();
					repetir = false;
				}else if(opcao == 2) {
					System.out.println("Okay, você não desligou seu eletrodoméstico");
					repetir = false;
				}else {
					System.err.println("\nNão entendi, repita a sua opção\n");
				}
			}
			
		}while(repetir == true);

	}

}
