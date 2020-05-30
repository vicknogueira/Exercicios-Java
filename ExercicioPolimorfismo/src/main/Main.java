package main;

import java.util.Scanner;

import interfaces.Animal;
import model.Cachorro;
import model.Cavalo;
import model.Preguica;

public class Main {

	public static void main(String[] args) {
		String nomecachorro, nomecavalo, nomepreguica;
		String idadecachorro, idadecavalo, idadepreguica;
		
		Animal cachorro = new Cachorro();
		Animal cavalo = new Cavalo();
		Animal preguica =new Preguica();
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Dê um nome para o cachorro:");
		nomecachorro = entrada.nextLine();
		System.out.print("Agora a idade de " + nomecachorro + ":");
		idadecachorro = entrada.nextLine();
		cachorro.setNome(nomecachorro);
		cachorro.setIdade(idadecachorro);
		
		
		System.out.print("Dê um nome para o cavalo:");
		nomecavalo = entrada.nextLine();
		System.out.print("Agora a idade de " + nomecavalo + ":");
		idadecavalo = entrada.nextLine();
		cavalo.setNome(nomecavalo);
		cavalo.setIdade(idadecavalo);
		
		System.out.print("Dê um nome para o bixo preguiça:");
		nomepreguica = entrada.nextLine();
		System.out.print("Agora a idade de " + nomepreguica + ":");
		idadepreguica = entrada.nextLine();
		preguica.setNome(nomepreguica);
		preguica.setIdade(idadepreguica);
		
		cachorro.imprime();
		cavalo.imprime();
		preguica.imprime();
		
		entrada.close();

	}

}
