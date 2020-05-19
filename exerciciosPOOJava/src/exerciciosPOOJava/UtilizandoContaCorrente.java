package exerciciosPOOJava;

import java.util.Scanner;

public class UtilizandoContaCorrente {
	public static void main(String args[]) {
		double numAgencia = 0, numConta = 0, saldoAtual = 20, operacao = 0, valor = 0;
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
		
		// Imprimindo as opções de operações 
		do {
			System.out.println("\nInforme a operacao a fazer: \n\n1 - Depósito\n2 - Saque\n");
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
				System.err.print("\nOpção inválida, informe outra operação: \n");
			}
		}while(continua == true);// enquanto ele errar as opções se repetirão
		
		
		// Pedindo o valor de acordo com a operação escolhida
		System.out.print("\n-----------------------------------\nInforme o valor para " + depositoSaque +  " R$");
		valor = entrada.nextDouble();
		
		// Verificando se o valor é válido e se é depósito ou saque
		if(valor > 5) {
			contaCorrente.setValor(valor);
			if(depositoSaque == "Saque") {
				if(saldoAtual >= valor) {
					saldoAtual -= valor;// tira o valor do saque do saldo
					contaCorrente.setSaldoAtual(saldoAtual);// o valor atualizado do saldo é adicionado ao atributo saldo
					contaCorrente.saque();// mostra o saque realizado
					contaCorrente.saldo();	// imprimindo o saldo
				}else {					
					contaCorrente.saldo(); // mostra que o saldo é insuficiente
					System.err.println("\nVocê não tem dinheiro suficiente para sacar !");
					
					
				}
			}else if(depositoSaque == "Deposito"){
				contaCorrente.deposito();// imprime o método de depósito
				saldoAtual += valor; // soma o valor do depósito ao saldo
				contaCorrente.setSaldoAtual(saldoAtual); // o valor é adicionado no atributo saldo
				contaCorrente.saldo(); // é imprimido o saldo
			}
			
			
		}

	}
}
