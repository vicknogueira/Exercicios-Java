/*2- Escreva um sistema estruturado que gere os números de 1000 a 1999 e escreva somente os números que são divisíveis por 11 ou cujo resto é 5.
*/
package Ex;

public class Ex02 {
	public static void main(String args[]) {
		
		System.out.println("Números de resto 5: ");
		
		for(int i = 1000; i <= 1999; i++) {
			if(i % 5 == 0) {
				System.out.println(i);
			}
		}
		
	}

}
