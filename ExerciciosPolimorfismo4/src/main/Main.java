/*	4- Fa�a um programa para armazenar dados sobre ve�culos.
		a- Crie a classe Veiculo com os atributos: Peso em quilos, VelocMax em Km/h e Preco em
		R$. E com os m�todos:�EntrVeic�para entrada dos dados e�MostrVeic�para mostrar os
		dados.
		b- Crie a subclasse CarroPasseio usando a superclasse�Veiculo�como base. Inclua os
		atributos Cor (string) e Modelo (string). E os m�todos:�EntrPass�para entrada dos
		dados e�MostrPass�para mostrar os dados.
		c- Crie a subclasse Caminhao usando a superclasse�Veiculo�como base. Inclua os atributos
		Toneladas (carga m�xima), AlturaMax (int) e�Comprimento�(int). E os
		m�todos:�EntrCam�para entrada dos dados e�MostrCam�para mostrar os dados.
		
 * */

package main;

import model.Caminhao;
import model.CarroPasseio;
import model.Veiculo;

public class Main {

	public static void main(String[] args) {
		
		CarroPasseio carroPasseio  = new CarroPasseio();
		Caminhao caminhao = new Caminhao();
		Veiculo veiculo = new Veiculo() {
			
		};
		veiculo.EntrVeic();
		veiculo.MostrVeic();
		
		carroPasseio.EntrPass();
		carroPasseio.MostrPass();
		
		caminhao.EntrCam();
		caminhao.MostrCam();
		
		

	}

}
