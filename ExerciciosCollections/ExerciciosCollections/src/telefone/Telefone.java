package telefone;

public class Telefone {
	// Atributos
	private String nrTelefone;
	private int tipoTelefone;
	
	
	
	public Telefone(String nrTelefone, int tipoTelefone) {
		this.nrTelefone = nrTelefone;
		this.tipoTelefone = tipoTelefone;
	}

	// Getters e Setters dos meus atributos
	public String getNrTelefone() {
		return nrTelefone;
	}

	public void setNrTelefone(String nrTelefone) {
		this.nrTelefone = nrTelefone;
	}

	public int getTipoTelefone() {
		return tipoTelefone;
	}

	public void setTipoTelefone(int tipoTelefone) {
		this.tipoTelefone = tipoTelefone;
	}
	

}
