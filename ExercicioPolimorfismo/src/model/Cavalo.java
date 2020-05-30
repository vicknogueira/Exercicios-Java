package model;

import interfaces.Animal;

public class Cavalo implements Animal{
	private String nome;
	private String idade;
	
	@Override
	public String emitirSom() {
		return "O cavalo relinchou!";
	}
	@Override
	public String correr() {
		return "O cavalo correu!";
		
	}
	@Override
	public void imprime() {
		System.out.println("\n---------------------------------------\n");
		System.out.println("O cavalo " + this.getNome() + " tem " + this.getIdade() + " anos:\n" + this.emitirSom() + "\n" + this.correr());
		
	}
	
	// Get e Set
	public String getNome() {
		return nome;
	}
	public String getIdade() {
		return idade;
	}
	@Override
	public void setNome(String nome) {
		this.nome = nome;
		
	}
	@Override
	public void setIdade(String idade) {
		this.idade = idade;
		
	}
	
	

}
