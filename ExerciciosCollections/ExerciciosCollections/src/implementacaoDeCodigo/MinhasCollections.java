package implementacaoDeCodigo;

import java.util.ArrayList; // importação do ArrayList
import java.util.HashSet; // importação do HashSet
import java.util.Iterator; // importação do Iterator
import java.util.List; // importação do List
import java.util.Set; // importação do Set

public class MinhasCollections {
	public static void main(String[] args) {
		List<Integer> minhaLista = new ArrayList<Integer>(); // Uma List do tipo inteiro chamado "minhaLista" e instanciei em uma ArrayList também inteiro
		minhaLista.add(1); // adiciona o valor 1 inteiro a minha ArrayList "minhaLista"
		minhaLista.add(2); // adiciona o valor 2 inteiro a minha ArrayList "minhaLista"
		minhaLista.add(2); // adiciona o valor 3 inteiro a minha ArrayList "minhaLista"
		
		for (Integer listaElementos : minhaLista) {// Um for each que cria uma variável listaElementos que recebe e percorre "minhaLista" por cada indice
			System.out.println(listaElementos); // Imprime cada valor de "MinhaLista" que ele guardou, por índice e na ordem específicada em mihaLista
		}

		Set<Integer> meuSet = new HashSet<Integer>(); // Um Set de chave integer nomeado "meuSet" que instacia o HashSet também inteiro
		meuSet.add(1); // meuSet adiciona o valor 1 
		meuSet.add(2); // meuSet adiciona o valor 2
		meuSet.add(3); // meuSet adiciona o valor 3 
		meuSet.add(1); // meuSet adiciona o valor 1 
		Iterator<Integer> iMeuSet = meuSet.iterator(); // Interator inteiro nomeado iMeuSet que vai comparar cada dado do meuSet desde o primeiro indice

		while(iMeuSet.hasNext()){//  percorra do meu primeiro indice até o ultimo indice
		System.out.println(iMeuSet.next()); // Imprime cada próximo valor do "meuSet", mas como observado não imprime o valor 1 repetido em "meuSet" pois o HashMap não permite chaves duplicadas
		}
		}
}
