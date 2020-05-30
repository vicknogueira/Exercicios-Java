package main;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import telefone.Telefone;

public class Main {

	public static void main(String[] args) {
		List<Telefone> numerosTelefones = new ArrayList<Telefone>();
		
		Telefone telefoneResidencial = new Telefone("3981-2839", 0);
		Telefone telefoneComercial = new Telefone("9981-2839", 2);
		Telefone telefoneCelular = new Telefone("3981-2839", 1);
		
		
		numerosTelefones.add(telefoneResidencial);
		numerosTelefones.add(telefoneComercial);
		numerosTelefones.add(telefoneCelular);
		
		System.out.println(numerosTelefones);
		Iterator<Telefone> iteracao = numerosTelefones.iterator();
		
		Telefone tipos;
		while(iteracao.hasNext()) {
			tipos = iteracao.next();
			System.out.println(tipos.getNrTelefone());
			switch (tipos.getTipoTelefone()) {
			case 0:
				System.out.println("Residencial");
				break;
			case 1:
				System.out.println("Comercial");
				break;
			case 2:
				System.out.println("Celular");
				break;
			default:
				System.out.println("Aconteceu um erro inesperado");
			}
			
		}

	}

}
