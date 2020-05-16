/*3- Faça um programa que mostre uma contagem na tela de 233 a 456, 
só que contando de  3 em 3 quando estiver entre 300 e 400 e de 5 em 5 quando não estiver.
*/

package Ex;

public class Ex03 {
	public static void main(String args[]) {
		
		for(int i = 233; i < 455; i++) {
			if(i > 300 && i < 400) {
				if(i % 3 == 0) {
					System.out.println("De 3 em 3: " + i);
				}
			}else{
				i += 5;
				System.out.println("De 5 em 5: " + i);
				i -= 1;
			}
		}
		
	}

}
