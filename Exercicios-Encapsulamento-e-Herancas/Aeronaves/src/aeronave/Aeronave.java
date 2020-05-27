package aeronave;

public class Aeronave {
	
	//ATRIBUTOS
	private String corNave;
	private String tamanhoNave;
	private String nomeNave;
	private boolean capsulaFugaNave;
	private boolean sistemaDefensivo;
	
	// GETTERS and SETTERS
	
	public Aeronave(String corNave, String tamanhoNave, String nomeNave, boolean capsulaFugaNave, boolean sistemaDefensivo) {
		this.corNave = corNave;
		this.tamanhoNave = tamanhoNave;
		this.nomeNave = nomeNave;
		this.capsulaFugaNave = capsulaFugaNave;
		this.sistemaDefensivo = sistemaDefensivo;
	}
	
	public String getCorNave() {
		return corNave;
	}
	public void setCorNave(String corNave) {
		this.corNave = corNave;
	}
	public String getTamanhoNave() {
		return tamanhoNave;
	}
	public void setTamanhoNave(String tamanhoNave) {
		this.tamanhoNave = tamanhoNave;
	}
	public String getNomeNave() {
		return nomeNave;
	}
	public void setNomeNave(String nomeNave) {
		this.nomeNave = nomeNave;
	}
	public boolean isCapsulaFugaNave() {
		return capsulaFugaNave;
	}
	public void setCapsulaFugaNave(boolean capsulaFugaNave) {
		this.capsulaFugaNave = capsulaFugaNave;
	}
	public boolean isSistemaDefensivo() {
		return sistemaDefensivo;
	}
	public void setSistemaDefensivo(boolean sistemaDefensivo) {
		this.sistemaDefensivo = sistemaDefensivo;
	}
	
	
	//MÉTODOS
	public void decolar() {
		System.out.println("Preparando decolagem...\n");
		System.out.println("A aeronave " + this.nomeNave + " esta decolando!");
	}
	public void ativarSistemaDefensivo()
	{
		System.out.println("A aeronave " + this.nomeNave + " ativou o sistema defensivo para sua segurança!");
	}
	
}
