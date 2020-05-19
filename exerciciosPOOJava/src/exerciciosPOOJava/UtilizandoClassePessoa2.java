package exerciciosPOOJava;

import java.util.Scanner;

public class UtilizandoClassePessoa2 {
	public static void main(String args[]) {
		String nome = "";
		int	anoNasc = 0, idade = 0;
		Scanner input = new Scanner(System.in);
		
		Pessoa2 idadeDaquiUnsAnos = new Pessoa2("", 2001);
		
		System.out.print("Informe seu nome: ");
		nome = input.nextLine();
		idadeDaquiUnsAnos.setNome(nome);
		
		System.out.print("Informe ano de nascimento: ");
		anoNasc = input.nextInt();
		
		idade = 2020 - anoNasc;
		
		idadeDaquiUnsAnos.setAnoNasc(idade + 50);
		
		idadeDaquiUnsAnos.calculoIdade();
		
	}

}
