package model;

public class Moto extends Veiculo{
	public Moto(String cor, String marca, boolean gasolina) {
		super(cor, marca, gasolina);
		
	}

	private boolean capacete;

	public boolean isCapacete() {
		return capacete;
	}

	public void setCapacete(boolean capacete) {
		this.capacete = capacete;
	}
	
	public void empinarMoto() {
		System.out.println("Sua moto " + getMarca()+ " empinou!");
	}
	
	
}
