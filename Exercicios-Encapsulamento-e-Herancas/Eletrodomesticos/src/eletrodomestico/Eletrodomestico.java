package eletrodomestico;

public class Eletrodomestico {
	private String tipo;
	private String marca;
	private double valor;
	
	public Eletrodomestico(String tipo, String marca, double valor) {
		this.tipo = tipo;
		this.marca = marca;
		this.valor = valor;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void ligar() {
		System.out.println("Você ligou o(a) " + this.tipo);
	}
	public void desligar() {
		System.out.println("Você desligou o(a) " + this.tipo);
	}
}
