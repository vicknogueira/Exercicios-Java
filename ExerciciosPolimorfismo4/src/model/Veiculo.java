package model;

import java.util.Scanner;

public abstract class Veiculo {
	// Atributos
	private double pesoQuilo;
	private double velocMax;
	private double preco;
	
	Scanner entrada = new Scanner(System.in);

	
	// Get e Set
	public double getPesoQuilo() {
		return pesoQuilo;
	}
	public void setPesoQuilo(double pesoQuilo) {
		this.pesoQuilo = pesoQuilo;
	}
	public double getVelocMax() {
		return velocMax;
	}
	public void setVelocMax(double velocMax) {
		this.velocMax = velocMax;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
	// M�todos
	public void EntrVeic() {
		System.out.println("Peso do veiculo: ");
		pesoQuilo = entrada.nextDouble();
		
		System.out.println("Velocidade m�xima do ve�culo: ");
		this.velocMax = entrada.nextDouble();
		
		System.out.print("Pre�o: R$");
		this.preco =entrada.nextDouble();
		
	}
	public void MostrVeic() {
		System.out.println("----------------- Informa��es Veiculo ---------------------");
		System.out.println("Peso: " + pesoQuilo);
		System.out.println("Velocidade m�xima: " + velocMax);
		System.out.println("Pre�o: R$" + preco);
	}
	
	
}
