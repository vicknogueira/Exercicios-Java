package exerciciosPOOJava;

import java.util.Scanner;

public class UtilizandoContaCorrente {
	public static void main(String args[]) {
		double numAgencia = 0, numConta = 0, saldoAtual = 20, operacao = 0, valor = 0;
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
		
		// Imprimindo as op��es de opera��es 
		do {
			System.out.println("\nInforme a operacao a fazer: \n\n1 - Dep�sito\n2 - Saque\n");
			operacao = entrada.nextDouble();
			if(operacao == 1) {
				contaCorrente.setOperacao(operacao);
				depositoSaque = "Deposito";			
				continua = false;
			}else if(operacao == 2) {
				depositoSaque = "Saque";
				contaCorrente.setOperacao(operacao);
				continua = false;
			}else {
				System.err.print("\nOp��o inv�lida, informe outra opera��o: \n");
			}
		}while(continua == true);// enquanto ele errar as op��es se repetir�o
		
		
		// Pedindo o valor de acordo com a opera��o escolhida
		System.out.print("\n-----------------------------------\nInforme o valor para " + depositoSaque +  " R$");
		valor = entrada.nextDouble();
		
		// Verificando se o valor � v�lido e se � dep�sito ou saque
		if(valor > 5) {
			contaCorrente.setValor(valor);
			if(depositoSaque == "Saque") {
				if(saldoAtual >= valor) {
					saldoAtual -= valor;// tira o valor do saque do saldo
					contaCorrente.setSaldoAtual(saldoAtual);// o valor atualizado do saldo � adicionado ao atributo saldo
					contaCorrente.saque();// mostra o saque realizado
					contaCorrente.saldo();	// imprimindo o saldo
				}else {					
					contaCorrente.saldo(); // mostra que o saldo � insuficiente
					System.err.println("\nVoc� n�o tem dinheiro suficiente para sacar !");
					
					
				}
			}else if(depositoSaque == "Deposito"){
				contaCorrente.deposito();// imprime o m�todo de dep�sito
				saldoAtual += valor; // soma o valor do dep�sito ao saldo
				contaCorrente.setSaldoAtual(saldoAtual); // o valor � adicionado no atributo saldo
				contaCorrente.saldo(); // � imprimido o saldo
			}
			
			
		}

	}
}
