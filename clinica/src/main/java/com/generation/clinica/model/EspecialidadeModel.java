package com.generation.clinica.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbEspecialidade")
public class EspecialidadeModel {
	
	@Id // chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto incremento
	private long codEspecialidade;
	
	@Column(name= "nm_especialidade", nullable = false, length = 50)
	private String nomeEspecialidade;

	
//	------- GET e SET -------------
	public long getCodEspecialidade() {
		return codEspecialidade;
	}

	public void setCodEspecialidade(long codEspecialidade) {
		this.codEspecialidade = codEspecialidade;
	}

	public String getNomeEspecialidade() {
		return nomeEspecialidade;
	}

	public void setNomeEspecialidade(String nomeEspecialidade) {
		this.nomeEspecialidade = nomeEspecialidade;
	}
	
	

}
