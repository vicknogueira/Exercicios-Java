//  2-Criar uma classe Pessoa com os seguintes atributos: nome e ano de nascimento.
//   Implemente os seguintes métodos:  Método para calcular a idade da pessoa. 
//     Método para calcular a idade da pessoa daqui 50 anos.

package exerciciosPOOJava;

public class Pessoa2 {
	private String nome;
	private int anoNasc, idade, idade50;
	
	public Pessoa2(String nome, int anoNasc) {
		this.nome = nome;
		this.anoNasc= anoNasc;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAnoNasc() {
		return anoNasc;
	}

	public void setAnoNasc(int anoNasc) {
		this.anoNasc = anoNasc;
	}
	
	public void calculoIdade(){
		System.out.print(getNome() + ", daqui 50 anos você terá " + getAnoNasc() + " anos.");
	}

}
