package model;

import interfaces.metodos;

public class Veterinario implements metodos{

	@Override
	public void examinar(Vaca vaca, Cachorro cachorro, Gato gato) {
		
		System.out.println("Examinando vaca...");
		System.out.println("Sa�de perfeita!");
		vaca.emitirSom();
		
		System.out.println("---------------------");
		System.out.println("Examinando cachorro...");
		System.out.println("Sa�de perfeita!");
		cachorro.emitirSom();
		
		System.out.println("---------------------");
		System.out.println("Examinando gato...");
		System.out.println("Sa�de perfeita!");
		gato.emitirSom();
		
		
		
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		
	}
	




}
