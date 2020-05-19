package exerciciosPOOJava;

import java.util.Scanner;

public class UtilizandoClassePessoa {

	public static void main(String[] args) {
		String nome= "", email ="", telefone = "";
		
		Scanner input = new Scanner(System.in);
		// instanciando classe Pessoa e criando objeto cartaoVisita
		
		Pessoa cartaoVisita = new Pessoa("", "", "");
		
		// Pedindo para o usuário digitar
		System.out.print("Informe seu nome: ");
		nome = input.nextLine();
		cartaoVisita.setNome(nome);
		
		System.out.print("Informe seu email: ");
		email = input.nextLine();
		cartaoVisita.setEmail(email);
		
		System.out.print("Informe seu telefone: ");
		telefone = input.nextLine();
		cartaoVisita.setTelefone(telefone);
		
		cartaoVisita.impressaocartaoDeVisitas();
	}

}
