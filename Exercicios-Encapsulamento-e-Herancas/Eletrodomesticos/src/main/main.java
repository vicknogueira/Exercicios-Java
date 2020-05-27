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
		
		System.out.println("Informe o tipo de eletrodom�stico: ");
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
			System.out.println("Deseja ligar seu eletrodom�tico?\n\n"
					+ "\t1 - Sim\n"
					+ "\t2 - N�o\n\n");
			opcao = entrada.nextInt();
			if(opcao == 1) {
				eletrodomestico.ligar();
				repetir = false;
			}else if(opcao == 2) {
				System.out.println("Okay, voc� n�o ligou seu eletrodom�stico");
				repetir = false;
			}else {
				System.err.print("\nN�o entendi, repita a sua op��o\n");
				repetir = true;
			}
			
		}while(repetir == true);
		
		
		do {
			if(opcao == 1) {
				opcao = 0;
				System.out.println("Agora deseja desligar seu eletrodom�tico?\n\n"
						+ "\t1 - Sim\n"
						+ "\t2 - N�o\n\n");
				opcao = entrada.nextInt();
				if(opcao == 1) {
					eletrodomestico.desligar();
					repetir = false;
				}else if(opcao == 2) {
					System.out.println("Okay, voc� n�o desligou seu eletrodom�stico");
					repetir = false;
				}else {
					System.err.println("\nN�o entendi, repita a sua op��o\n");
				}
			}
			
		}while(repetir == true);

	}

}
