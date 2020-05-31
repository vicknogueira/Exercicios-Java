/*	3- Implemente uma classe Veterinario que contenha um método examinar() cujo parâmetro
	de entrada é um Animal, quando o animal for examinado ele deve emitir um som, passe os 3
	animais com parâmetro.
*/

package main;

import java.util.Scanner;

import interfaces.metodos;
import model.Cachorro;
import model.Gato;
import model.Vaca;
import model.Veterinario;

public class Main {

	public static void main(String[] args) {
		boolean repetir = true;
		int resposta;
		
		Cachorro cachorro = new Cachorro();
		Vaca vaca = new Vaca();
		Gato gato = new Gato();
		metodos veterinario = new Veterinario();
		
		Scanner entrada = new Scanner(System.in);

		do {
			System.out.println("Deseja examinar vaca, gato e cachorro?\n"
					+ "1 - Sim\n"
					+ "2 - Não");
			resposta = entrada.nextInt();
			if(resposta == 1) {
				veterinario.examinar(vaca, cachorro, gato);
				repetir = false;
			}else if (resposta == 2) {
				System.out.print("\n------------------------\n");
				System.out.print("Você saiu do veterinário\n");
				repetir = false;
			}else {
				System.err.println("Não entendi, repita:");
				repetir = true;
			}
		}while(repetir == true);

		entrada.close();
	}

}
