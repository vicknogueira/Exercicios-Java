package model;

import java.util.Scanner;

public class CarroPasseio extends Veiculo{
	public CarroPasseio() {
		super();
		// TODO Auto-generated constructor stub
	}
	private String cor;
	private String modelo;
	
	
	// Get e Set
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	Scanner entrada = new Scanner(System.in);
	
	
	
	// M�todos
	public void EntrPass() {
		System.out.println();
		System.out.println("Cor do ve�culo: ");
		cor = entrada.nextLine();
		
		System.out.println("Modelo do ve�culo: ");
		modelo = entrada.nextLine();
	}
	public void MostrPass() {
		System.out.println("----------------- Informa��es Carro de Passeio ---------------------");
		System.out.println("Cor: " + cor);
		System.out.println("Modelo: " + modelo);
	}
}
