/*1- Desenvolver um sistema que efetue a soma de todos os n�meros �mpares
que s�o m�ltiplos de tr�s e que se encontram no conjunto dos n�meros de 1
at� 500.
*/

package Ex;

public class Ex01 {
	public static void main(String args[]) {
		
		int somaImpar = 0;
//		System.out.println("Numeros impares entre 1 a 500:\n");
		for(int i = 1; i <= 500; i++) {			
			if(i % 2 == 1 && i % 3 == 0) {
				System.out.println(i);
				somaImpar += i;
			}
		}
		System.out.println("\nA soma dos numeros impares que s�o multiplos de 3 e que est�o entre 1 e 500 �: \n" + somaImpar);
		
	}

}
