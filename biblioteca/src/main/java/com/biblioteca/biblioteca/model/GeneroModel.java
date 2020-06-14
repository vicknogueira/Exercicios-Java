package com.biblioteca.biblioteca.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_genero")
public class GeneroModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_genero")
	private int cdgenero;
	
	@OneToMany(mappedBy = "cddoGenero")
	private List<LivroModel> cdGeneros;
	
	@Column(name = "nm_genero", nullable = false, unique = true)
	@Size(min = 4, max = 40)
	private String nomeGenero;
	
	@Column(name = "dt_generoAdicionado")
	@Temporal(TemporalType.TIMESTAMP)
	private Date datageneroAdicionado = new java.sql.Date(System.currentTimeMillis());
	
	
	
	// ------------------- Get and Set --------------------------


	public String getNomeGenero() {
		return nomeGenero;
	}



	public long getCdgenero() {
		return cdgenero;
	}



	public void setCdgenero(int cdgenero) {
		this.cdgenero = cdgenero;
	}



	public void setNomeGenero(String nomeGenero) {
		this.nomeGenero = nomeGenero;
	}

	public Date getDatageneroAdicionado() {
		return datageneroAdicionado;
	}

	public void setDatageneroAdicionado(Date datageneroAdicionado) {
		this.datageneroAdicionado = datageneroAdicionado;
	}
	
	
	

}
