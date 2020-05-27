package model;

public class Veiculo {
	
	private String cor;
	private String marca;
	private boolean gasolina;
	
	public Veiculo(String cor, String marca, boolean gasolina) {
		this.cor = cor;
		this.marca= marca;
		this.gasolina = gasolina;
	}
	
	//GET and SET
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public boolean isGasolina() {
		return gasolina;
	}
	public void setGasolina(boolean gasolina) {
		this.gasolina = gasolina;
	}
	
	
	//MÉTODOS
	public void abastecer() {
		System.out.println("O tanque do seu " + this.marca + " acabou de ser abastecido!");
	}
	
}
