package model;

import interfaces.Animal;

public class Cachorro implements Animal{
	private String nome;
	private String idade;
	
	//get e Set
	
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
	
	
	
	@Override
	public String emitirSom() {
		return "esta latindo!\nAu, Au, Auuu!";
	}
	@Override
	public String correr() {
		return "esta correndo!";
	}
	@Override
	public void imprime() {
		System.out.println("\nO cachorro " + this.getNome() + " tem " + this.getIdade() + " anos:\n" + emitirSom() + "\n" + correr());
		
	}


}
