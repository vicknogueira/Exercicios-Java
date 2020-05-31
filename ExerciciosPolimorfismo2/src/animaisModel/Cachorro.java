package animaisModel;

import interfaces.InterfaceAnimal;

public class Cachorro implements InterfaceAnimal{
	private String nome = "Sr.Marley";

	@Override
	public String emitirSom() {
		return "Au, au";
	}

	@Override
	public void imprime() {
		System.out.println(this.nome + " emitiu um som: " + this.emitirSom());
		
	}
}
