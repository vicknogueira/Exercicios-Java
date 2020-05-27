package model;

public class Carro extends Veiculo{
	public Carro(String cor, String marca, boolean gasolina) {
		super(cor, marca, gasolina);
	}

	private int assentos;

	public int getAssentos() {
		return assentos;
	}

	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}
	
	public void buzinar() {
		System.out.println("Seu carro " + getMarca() + " buzinou!");
	}

}

