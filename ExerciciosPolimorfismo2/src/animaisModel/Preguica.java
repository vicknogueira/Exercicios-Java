package animaisModel;

import interfaces.InterfaceAnimal;

public class Preguica implements InterfaceAnimal{
	private String nome = "Sr.Pregui�a";

	@Override
	public String emitirSom() {
		return "Aaahhhhh que pregui�aaaa";
	}

	@Override
	public void imprime() {
		System.out.println("\n================================\n");
		System.out.println(this.nome + " emitiu um som: " + this.emitirSom());
		
	}
}
