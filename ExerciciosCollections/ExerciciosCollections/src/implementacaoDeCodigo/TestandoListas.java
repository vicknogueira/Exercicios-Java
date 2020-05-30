package implementacaoDeCodigo;

import java.util.List;
import java.util.ArrayList;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Modelando a classe Aula"; // Uma vari�vel String nomeada aula1 que recebe um texto.
		String aula2 = "Conhecendo mais de listas"; // Uma vari�vel String nomeada aula2 que recebe um texto.
		String aula3 = "Trabalhando com Cursos e Sets"; // Uma vari�vel String nomeada aula3 que recebe um texto.
		ArrayList<String> aulas = new ArrayList<>();// Um ArrayList de chave String nomeado aulas que instancia uma ArrayList
		aulas.add(aula1); // Adiciono o conte�do da vari�vel aula1 em aulas
		aulas.add(aula2); // Adiciono o conte�do da vari�vel aula2 em aulas
		aulas.add(aula3); // Adiciono o conte�do da vari�vel aula3 em aulas
		
		System.out.println(aulas);// Impress�o dos elementos que est�o dentro de aulas em forma de array
		System.out.println(aulas.size()); // Impress�o do tamanho/quantidade de elementos da minha arraylist aulas 
		// cuidado! <= faz sentido aqui? Se usado <= nessa estrutura de repeti��o retornar� um erro, pois o ultimo indice de aulas � 2 e usando <= ira para 3 o que n�o � possivel.
		for (int i = 0; i < aulas.size(); i++) { // usando < o contador i ir� percorrer corretamente o tamanho de aulas e incrementar� a cada repeti��o at� chegar ao tamanho total de aulas
			System.out.println("Aula: " + aulas.get(i));// Impress�o do texto "Aula: " + cada elemento do ArrayList aulas
		}
	}

}
