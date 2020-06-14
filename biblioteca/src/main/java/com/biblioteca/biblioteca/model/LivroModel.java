package com.biblioteca.biblioteca.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;



@Entity
@Table(name = "tb_livro")
public class LivroModel {

	@Id
	@Column(name = "cd_deBarras", nullable = false, unique= true)
	private long codigodeBarras;
	
	@Column(name = "nm_tituloLivro", nullable = false)
	@Size(min = 3, max = 50)
	private String tituloLivro;
	
	@Column(name = "dt_publicacaoLivro")
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataPublicacaoLivro = new java.sql.Date(System.currentTimeMillis());
	
	@Column(name = "cd_ISBN", nullable = false, unique = true)
	private long codigoISBN;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cd_genero")
	private GeneroModel cddoGenero;
	
	
	
	// ------------------- Get and Set --------------------------


	public String getTituloLivro() {
		return tituloLivro;
	}



	public long getCodigodeBarras() {
		return codigodeBarras;
	}



	public void setCodigodeBarras(long codigodeBarras) {
		this.codigodeBarras = codigodeBarras;
	}



	public void setTituloLivro(String tituloLivro) {
		this.tituloLivro = tituloLivro;
	}

	public Date getDataPublicacaoLivro() {
		return dataPublicacaoLivro;
	}

	public void setDataPublicacaoLivro(Date dataPublicacaoLivro) {
		this.dataPublicacaoLivro = dataPublicacaoLivro;
	}

	public long getCodigoISBN() {
		return codigoISBN;
	}

	public void setCodigoISBN(long codigoISBN) {
		this.codigoISBN = codigoISBN;
	}



	public GeneroModel getCddoGenero() {
		return cddoGenero;
	}



	public void setCddoGenero(GeneroModel cddoGenero) {
		this.cddoGenero = cddoGenero;
	}



}
