package main;

import java.util.Scanner;

import model.Carro;
import model.Moto;
import model.Veiculo;

public class main {

	public static void main(String[] args) {
		String marca, cor;
		boolean repetir = true, gasolina = false;
		int opcao =0; 
		
		Veiculo veiculo = new Veiculo("", "", false);
		Moto moto = new Moto("", "", false);
		Carro carro = new Carro("", "", false);
		
		Scanner entrada = new Scanner(System.in);
		
		// CARRO entrada
		System.out.println("Informe a marca do seu carro: ");
		marca = entrada.nextLine();
		carro.setMarca(marca);
		
		System.out.println("Informe a cor do seu carro: ");
		cor = entrada.nextLine();
		carro.setCor(cor);
		
		// Perguntando se esta abastecido o carro
		
		do {
			System.out.println("Possui gasolina?\n\n"
					+ "1 - Sim\n"
					+ "2 - Não");
			opcao = entrada.nextInt();
			if(opcao == 1) {
				gasolina = true;
				carro.setGasolina(gasolina);
				repetir = false;
			}else if(opcao == 2) {
				carro.abastecer();
				gasolina = true;
				carro.setGasolina(gasolina);
				repetir = false;
			}else {
				System.err.println("Não entendi, por favor repita!");
				repetir = false;
			}
		}while(repetir == true);
		
		entrada.nextLine();
		// MOTO entrada
		System.out.println("Informe a marca da sua moto: ");
		marca = entrada.nextLine();
		moto.setMarca(marca);
		
		System.out.println("Informe a cor da sua moto: ");
		cor = entrada.nextLine();
		moto.setCor(cor);
		
		// Perguntando se esta abastecido a moto
		
		do {
			System.out.println("Possui gasolina?\n\n"
					+ "1 - Sim\n"
					+ "2 - Não");
			opcao = entrada.nextInt();
			if(opcao == 1) {
				gasolina = true;
				moto.setGasolina(gasolina);
				repetir = false;
			}else if(opcao == 2) {
				moto.abastecer();
				gasolina = true;
				moto.setGasolina(gasolina);
				repetir = false;
			}else {
				System.err.println("Não entendi, por favor repita!");
				repetir = false;
			}
		}while(repetir == true);
		
		
	// Impressão
		System.out.println("\n___________________________________\n");
		System.out.println("Informações do seu carro: ");
		System.out.println("\nMarca: " + carro.getMarca());
		System.out.println("Cor: " + carro.getCor());
		System.out.println("Tem gasolina: " + carro.isGasolina());
		
			System.out.println();
			carro.buzinar();
		
		System.out.println("\n___________________________________\n");
		System.out.println("Informações da sua moto: ");
		System.out.println("Marca: " + moto.getMarca());
		System.out.println("Cor: " + moto.getCor());
		System.out.println("Tem gasolina: " + moto.isGasolina());

			System.out.println();
			moto.empinarMoto();


		
		
		
		

	}

}
