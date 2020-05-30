package model;

import interfaces.Animal;

public class Preguica implements Animal{
	private String nome;
	private String idade;
	
	public void subirArvore() {
		
	}
	
	// Get e Set
	
	public String getNome() {
		return nome;
	}
	public String getIdade() {
		return idade;
	}
	
	// Anotações, implementaçoes
	@Override
	public void setIdade(String idade) {
		this.idade = idade;
		
	}
	@Override
	public void setNome(String nome) {
		this.nome = nome;
		
	}

	@Override
	public String emitirSom() {
		return "Que sonoooo";
		
	}
	@Override
	public String correr() {
		return "Correr pra que se eu posso dormir?";
		
	}
	@Override
	public void imprime() {
		System.out.println("\n---------------------------------------\n");
		System.out.println("O bixo preguiça " + this.getNome() + " tem " + this.getIdade() + " anos:\n" + this.emitirSom() + "\n" + this.correr());
		
	}


	

}
