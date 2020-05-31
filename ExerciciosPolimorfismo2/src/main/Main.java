/*		2- Implemente um programa que crie os 3 tipos de animais definidos no exerc�cio anterior e
		invoque o m�todo que emite o som de cada um de forma polim�rfica, isto �, independente do
		tipo de animal.
 * 
 * */


package main;

import animaisModel.Cachorro;
import animaisModel.Cavalo;
import animaisModel.Preguica;
import interfaces.InterfaceAnimal;

public class Main {

	public static void main(String[] args) {
		InterfaceAnimal cachorro = new Cachorro();
		InterfaceAnimal cavalo = new Cavalo();
		InterfaceAnimal preguica = new Preguica();
		
		
		cachorro.imprime();
		cavalo.imprime();
		preguica.imprime();
	}

}
