/*	3-Criar uma classe Conta Corrente com os seguintes atributos: n�mero da ag�ncia, n�mero da conta, saldo atual, opera��o (dep�sito ou saque) e valor. Implementar os seguintes m�todos:
	M�todo para dep�sito.
	M�todo para saque.
	M�todo para imprimir o saldo atual.

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
		
		// pedindo ao usu�rio infoma��o de ag�ncia e conta
		System.out.print("Informe sua ag�ncia: ");
		numAgencia = entrada.nextDouble();
		contaCorrente.setNumAgencia(numAgencia);
		
		System.out.print("Informe sua conta: ");
		numConta = entrada.nextDouble();
		contaCorrente.setNumConta(numConta);
		
		// Imprimindo as op��es de opera��es para dep�sito e saque
		
			if(continua == true) {
//				System.out.println();
				contaCorrente.setSaldoAtual(saldoAtual);
				
				// Mostrando o saldo antes de pedir o valor de saque/dep�sito
				contaCorrente.saldo();
				do {
					System.out.println("\n\nInforme a operacao a fazer: \n\n1 - Dep�sito\n2 - Saque\n3 - Sair\n");
					operacao = entrada.nextDouble();
					if(operacao == 1) {
						contaCorrente.setOperacao(operacao);
						depositoSaque = "Deposito";		
						
						// Pedindo o valor de acordo com a opera��o escolhida
						System.out.print("\n-----------------------------------\nInforme o valor para " + depositoSaque +  " R$");
						valor = entrada.nextDouble();// guardando o valor na vari�vel valor
						
						
						// Verificando se o valor � v�lido e se � dep�sito ou saque
						if(valor > 2 && valor < 1001) {
							contaCorrente.setValor(valor);
							if(depositoSaque == "Saque") {
								contaCorrente.saque();// mostra o saque realizado
								contaCorrente.saldo();	// imprimindo o saldo	
								System.out.println();
								continua= true;
							}else if(depositoSaque == "Deposito"){
								contaCorrente.deposito();// imprime o m�todo de dep�sito
								contaCorrente.saldo(); // � imprimido o saldo
								System.out.println();
								continua = true;
							}				
						}else {
							System.out.println("Valor muito alto ou muito baixo para saque!");
						}
					}else if(operacao == 2) {
						depositoSaque = "Saque";
						contaCorrente.setOperacao(operacao);
						
						// Pedindo o valor de acordo com a opera��o escolhida
						System.out.print("\n-----------------------------------\nInforme o valor para " + depositoSaque +  " R$");
						valor = entrada.nextDouble();// guardando o valor na vari�vel valor
						
						// Verificando se o valor � v�lido e se � dep�sito ou saque
						if(valor > 2 && valor < 1001) {
							contaCorrente.setValor(valor);
							if(depositoSaque == "Saque") {
								contaCorrente.saque();// mostra o saque realizado
								contaCorrente.saldo();	// imprimindo o saldo	
								System.out.println();
								continua= true;
							}else if(depositoSaque == "Deposito"){
								contaCorrente.deposito();// imprime o m�todo de dep�sito
								contaCorrente.saldo(); // � imprimido o saldo
								System.out.println();
								continua = true;
							}				
						}else {
							System.err.println("Valor muito alto ou muito baixo para saque!");
						}
					}else if(operacao == 3) {
						System.out.println("Voc� saiu do caixa eletr�nico!");
						continua = false;
					}else {
						System.err.print("\nOp��o inv�lida, informe outra opera��o: \n");
					}
				}while(continua == true);// enquanto ele errar as op��es se repetir�o
			}	
	}
}


