package animaisModel;

import interfaces.InterfaceAnimal;

public class Cavalo implements InterfaceAnimal{
	private String nome = "Sr.Horse";

	@Override
	public String emitirSom() {
		return "sahdgasudia";
	}

	@Override
	public void imprime() {
		System.out.println("\n================================\n");
		System.out.println(this.nome + " emitiu um som: " + this.emitirSom());
		
	}
	
	

}
