package main;

import java.util.Scanner;

import aeronave.Aeronave;

public class main {

	public static void main(String[] args) {
		String nome, tamanho, cor;
		int opcao = 0;
		boolean capsulaFuga = false, sistemaDefensivo = false, repetir = true;
		
		Aeronave aeronave = new Aeronave("", "", "", false, false);
		
		Scanner entrada = new Scanner(System.in);
		
		// INPUTS
		System.out.println("Informe um nome para sua aeronave: ");
		nome = entrada.nextLine();
		aeronave.setNomeNave(nome);
		
		System.out.println("Informe o tamanho desejado (pequena / média / grande) ");
		tamanho = entrada.nextLine();
		aeronave.setTamanhoNave(tamanho);
		
		System.out.println("Informe a cor de sua aeronave: ");
		cor = entrada.nextLine();
		aeronave.setCorNave(cor);
				
		do {
			System.out.println("\n -----------------------------------------------------------------------------\n");
			System.out.println("\tPasso 1: Aceita adicionar uma capsula de fuga em sua aeronave?\n\n"
					+ "\t\t\t\t1 - Sim\n"
					+ "\t\t\t\t2 - Não");
			opcao = entrada.nextInt();
			if(opcao == 1) {
				capsulaFuga = true;
				System.out.println("\n -----------------------------------------------------------------------------\\n");
				repetir = false;
			}else if(opcao == 2) {
				System.out.println("\n -----------------------------------------------------------------------------\\n");
				capsulaFuga = false;
				repetir = false;
			}else {
				System.err.print("Não entendi, por favor coloque a opção novamente!\n");
			}
		}while(repetir == true);
		
		
		
			do{
				System.out.println("\n --------------------------------------------------------------------------------------------\n");
				System.out.println("\tPasso 2: Aceita também adicionar um sistema defensivo em sua aeronave?\n"
						+ "\t\t\t\t1 - Sim\n"
						+ "\t\t\t\t2 - Não\n");
				opcao = entrada.nextInt();
				if(opcao == 1) {
					sistemaDefensivo = true;
					aeronave.setSistemaDefensivo(sistemaDefensivo);
					repetir =false;
				}else if(opcao == 2) {
					sistemaDefensivo = false;
					aeronave.setCapsulaFugaNave(capsulaFuga);
					repetir = false;
				}else {
					System.out.println("Não entendi, por favor coloque a opção novamente!");
					repetir = true;
				}
			}while(repetir == true);
		
		if(sistemaDefensivo == true) {
			System.out.println("\n --------------------------------------------------------------------------------------------\n");
			System.out.println("Informações da sua aeronave:");
			System.out.println("\nNome: "+ aeronave.getNomeNave() + "\n"
					+ "Tamanho: " + aeronave.getTamanhoNave() + "\n"
					+ "Cor: " +  aeronave.getCorNave()+ "\n"
					+ "Capsula de fuga: " + aeronave.isCapsulaFugaNave());
			System.out.println();
			aeronave.ativarSistemaDefensivo();
			aeronave.decolar();
		}else {
			System.out.println("\n --------------------------------------------------------------------------------------------\n");
			System.out.println("Informações da sua aeronave");
			System.out.println("\nNome: "+ aeronave.getNomeNave() + "\n"
					+ "Tamanho: " + aeronave.getTamanhoNave() + "\n"
					+ "Cor: " +  aeronave.getCorNave()+ "\n"
					+ "Capsula de fuga: "  + aeronave.isCapsulaFugaNave());
			System.out.println();
			aeronave.decolar();
		}
		
		
		
		

	}

}
