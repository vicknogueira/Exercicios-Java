/*	3-Criar uma classe Conta Corrente com os seguintes atributos: número da agência, número da conta, saldo atual, operação (depósito ou saque) e valor. Implementar os seguintes métodos:
	Método para depósito.
	Método para saque.
	Método para imprimir o saldo atual.

*/


package exerciciosPOOJava;

import java.util.Scanner;

public class UtilizandoContaCorrente {
	public static void main(String args[]) {
		double numAgencia = 0, numConta = 0, saldoAtual = 0, operacao = 0, valor = 0;
		boolean continua = true;
		String depositoSaque = "";
		
		Scanner entrada = new Scanner(System.in);
		
		ContaCorrente contaCorrente = new ContaCorrente(numAgencia, numConta, saldoAtual, operacao, valor);
		
		// pedindo ao usuário infomação de agência e conta
		System.out.print("Informe sua agência: ");
		numAgencia = entrada.nextDouble();
		contaCorrente.setNumAgencia(numAgencia);
		
		System.out.print("Informe sua conta: ");
		numConta = entrada.nextDouble();
		contaCorrente.setNumConta(numConta);
		
		// Imprimindo as opções de operações para depósito e saque
		
			if(continua == true) {
//				System.out.println();
				contaCorrente.setSaldoAtual(saldoAtual);
				
				// Mostrando o saldo antes de pedir o valor de saque/depósito
				contaCorrente.saldo();
				do {
					System.out.println("\n\nInforme a operacao a fazer: \n\n1 - Depósito\n2 - Saque\n3 - Sair\n");
					operacao = entrada.nextDouble();
					if(operacao == 1) {
						contaCorrente.setOperacao(operacao);
						depositoSaque = "Deposito";		
						
						// Pedindo o valor de acordo com a operação escolhida
						System.out.print("\n-----------------------------------\nInforme o valor para " + depositoSaque +  " R$");
						valor = entrada.nextDouble();// guardando o valor na variável valor
						
						
						// Verificando se o valor é válido e se é depósito ou saque
						if(valor > 2 && valor < 1001) {
							contaCorrente.setValor(valor);
							if(depositoSaque == "Saque") {
								contaCorrente.saque();// mostra o saque realizado
								contaCorrente.saldo();	// imprimindo o saldo	
								System.out.println();
								continua= true;
							}else if(depositoSaque == "Deposito"){
								contaCorrente.deposito();// imprime o método de depósito
								contaCorrente.saldo(); // é imprimido o saldo
								System.out.println();
								continua = true;
							}				
						}else {
							System.out.println("Valor muito alto ou muito baixo para saque!");
						}
					}else if(operacao == 2) {
						depositoSaque = "Saque";
						contaCorrente.setOperacao(operacao);
						
						// Pedindo o valor de acordo com a operação escolhida
						System.out.print("\n-----------------------------------\nInforme o valor para " + depositoSaque +  " R$");
						valor = entrada.nextDouble();// guardando o valor na variável valor
						
						// Verificando se o valor é válido e se é depósito ou saque
						if(valor > 2 && valor < 1001) {
							contaCorrente.setValor(valor);
							if(depositoSaque == "Saque") {
								contaCorrente.saque();// mostra o saque realizado
								contaCorrente.saldo();	// imprimindo o saldo	
								System.out.println();
								continua= true;
							}else if(depositoSaque == "Deposito"){
								contaCorrente.deposito();// imprime o método de depósito
								contaCorrente.saldo(); // é imprimido o saldo
								System.out.println();
								continua = true;
							}				
						}else {
							System.err.println("Valor muito alto ou muito baixo para saque!");
						}
					}else if(operacao == 3) {
						System.out.println("Você saiu do caixa eletrônico!");
						continua = false;
					}else {
						System.err.print("\nOpção inválida, informe outra operação: \n");
					}
				}while(continua == true);// enquanto ele errar as opções se repetirão
			}	
	}
}


