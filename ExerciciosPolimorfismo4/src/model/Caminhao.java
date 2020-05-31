package model;

import java.util.Scanner;

public class Caminhao extends Veiculo{
	public Caminhao() {
		super();
		// TODO Auto-generated constructor stub
	}
	private double toneladas;
	private int alturaMax;
	private int comprimento;	
	
	
	Scanner entrada = new Scanner(System.in);
	
	
	//Get e Set
	public double getToneladas() {
		return toneladas;
	}
	public void setToneladas(double toneladas) {
		this.toneladas = toneladas;
	}
	public int getAlturaMax() {
		return alturaMax;
	}
	public void setAlturaMax(int alturaMax) {
		this.alturaMax = alturaMax;
	}
	public int getComprimento() {
		return comprimento;
	}
	public void setComprimento(int comprimento) {
		this.comprimento = comprimento;
	}
	
	
	//Métodos
	public void EntrCam() {
		System.out.println();
		System.out.println("Carga máxima em tonelada: ");
		toneladas = entrada.nextDouble();
		
		System.out.println("Altura máxima do caminhão: ");
		alturaMax = entrada.nextInt();
		
		System.out.println("Comprimento do caminhão: ");
		comprimento = entrada.nextInt();
	}
	public void MostrCam() {
		System.out.println("----------------- Informações Caminhão ---------------------"); 	
		System.out.println("Carga máxima: " + toneladas);
		System.out.println("Altura máxima: " + alturaMax);
		System.out.println("Comprimento: " + comprimento);
		
	}
}
