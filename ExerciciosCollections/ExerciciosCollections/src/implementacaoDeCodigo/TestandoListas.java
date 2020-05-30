package implementacaoDeCodigo;

import java.util.List;
import java.util.ArrayList;

public class TestandoListas {

	public static void main(String[] args) {
		String aula1 = "Modelando a classe Aula"; // Uma variável String nomeada aula1 que recebe um texto.
		String aula2 = "Conhecendo mais de listas"; // Uma variável String nomeada aula2 que recebe um texto.
		String aula3 = "Trabalhando com Cursos e Sets"; // Uma variável String nomeada aula3 que recebe um texto.
		ArrayList<String> aulas = new ArrayList<>();// Um ArrayList de chave String nomeado aulas que instancia uma ArrayList
		aulas.add(aula1); // Adiciono o conteúdo da variável aula1 em aulas
		aulas.add(aula2); // Adiciono o conteúdo da variável aula2 em aulas
		aulas.add(aula3); // Adiciono o conteúdo da variável aula3 em aulas
		
		System.out.println(aulas);// Impressão dos elementos que estão dentro de aulas em forma de array
		System.out.println(aulas.size()); // Impressão do tamanho/quantidade de elementos da minha arraylist aulas 
		// cuidado! <= faz sentido aqui? Se usado <= nessa estrutura de repetição retornará um erro, pois o ultimo indice de aulas é 2 e usando <= ira para 3 o que não é possivel.
		for (int i = 0; i < aulas.size(); i++) { // usando < o contador i irá percorrer corretamente o tamanho de aulas e incrementará a cada repetição até chegar ao tamanho total de aulas
			System.out.println("Aula: " + aulas.get(i));// Impressão do texto "Aula: " + cada elemento do ArrayList aulas
		}
	}

}
