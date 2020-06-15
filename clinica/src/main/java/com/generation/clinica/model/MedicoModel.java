package com.generation.clinica.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tbMedico")
public class MedicoModel {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long crm;
	
	@Column(name="nome", nullable = false)
	@Size(min=2, max=80)
	private String nome;
	
	//chave estrangeira - relacionada com a tabela especialidade
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "codEspecialidade", referencedColumnName = "codEspecialidade")
	private EspecialidadeModel codEspecialidade;

	
//	-------- GET e SET ----------------
	public long getCrm() {
		return crm;
	}

	public void setCrm(long crm) {
		this.crm = crm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EspecialidadeModel getCodEspecialidade() {
		return codEspecialidade;
	}

	public void setEspecialidade(EspecialidadeModel codEspecialidade) {
		this.codEspecialidade = codEspecialidade;
	}
	
	
	
	
}
