package animaisModel;

import interfaces.InterfaceAnimal;

public class Preguica implements InterfaceAnimal{
	private String nome = "Sr.Preguiça";

	@Override
	public String emitirSom() {
		return "Aaahhhhh que preguiçaaaa";
	}

	@Override
	public void imprime() {
		System.out.println("\n================================\n");
		System.out.println(this.nome + " emitiu um som: " + this.emitirSom());
		
	}
}
