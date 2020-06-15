package com.generation.clinica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbPaciente")
public class PacienteModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codPaciente;
	
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name= "endereco", nullable = false)
	private String endereco;
	
	@Column(name = "cep", nullable = false)
	private String cep;
	
	@Column(name = "telefone", length = 16)
	private String telefone;

	
	
//	------------- GET e SET ----------------------
	public long getCodPaciente() {
		return codPaciente;
	}

	public void setCodPaciente(long codPaciente) {
		this.codPaciente = codPaciente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
	

}
