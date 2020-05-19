package exerciciosPOOJava;

public class ContaCorrente {
	private double numAgencia, numConta, saldoAtual, operacao, valor;
	
	public ContaCorrente(double numAgencia, double numConta, double saldoAtual, double operacao, double valor) {
		this.numAgencia = numAgencia;
		this.numConta = numConta;
		this.saldoAtual = saldoAtual;
		this.operacao = operacao;
		this.valor = valor;
	}

	public double getNumAgencia() {
		return numAgencia;
	}

	public void setNumAgencia(double numAgencia) {
		this.numAgencia = numAgencia;
	}

	public double getNumConta() {
		return numConta;
	}

	public void setNumConta(double numConta) {
		this.numConta = numConta;
	}

	public double getSaldoAtual() {
		return saldoAtual;
	}

	public void setSaldoAtual(double saldoAtual) {
		this.saldoAtual = saldoAtual;
	}

	public double getOperacao() {
		return operacao;
	}

	public void setOperacao(double operacao) {
		this.operacao = operacao;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public void deposito() {
		System.out.println("O valor de R$" + getValor() + " foi depositado com sucesso!");
	}
	
	public void saldo() {
		System.out.println("Seu saldo � de R$" + getSaldoAtual());
	}
	
	public void saque() {
		System.out.println("O valor de R$" + getValor() + " foi sacado com sucesso!");
	}
	
	

}
