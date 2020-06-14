package com.biblioteca.biblioteca.model;


import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;



@Entity
@Table(name = "tb_emprestimoedevolucao")
public class EmprestimoeDevolucaoModel {
	
	//Atributos ou campos da tabela
	
	@Id
	@Column(name =  "cd_emprestimo") // primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // increment
	private long idEmprestimo;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cd_deBarras")
	private LivroModel codigodeBarra;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "cd_cliente")
	private ClienteModel idClientes;
	
	@Column(name = "dt_devolucao")
	private Date dataDevolucao = new java.sql.Date(System.currentTimeMillis());
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataEmprestimo = new java.sql.Date(System.currentTimeMillis());
	
	@Column(name = "dt_previstaDevolucao", nullable = false)
	private Date dataPrevistaDevolucao = new java.sql.Date(System.currentTimeMillis());
	
	@Column(name = "statusDevolucao", nullable = false)
	private String statusDevolucao;
	
	@Column(name = "cd_ISBN", nullable = false, unique = true)
	private long codigoISBN;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long qtdEmprestimo;


	
	// ------------------- Get and Set --------------------------
	
	public long getIdEmprestimo() {
		return idEmprestimo;
	}

	public void setIdEmprestimo(long idEmprestimo) {
		this.idEmprestimo = idEmprestimo;
	}


	public LivroModel getCodigodeBarra() {
		return codigodeBarra;
	}

	public void setCodigodeBarra(LivroModel codigodeBarra) {
		this.codigodeBarra = codigodeBarra;
	}

	public void setIdClientes(ClienteModel idClientes) {
		this.idClientes = idClientes;
	}

	public Date getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Date getDataEmprestimo() {
		return dataEmprestimo;
	}

	public void setDataEmprestimo(Date dataEmprestimo) {
		this.dataEmprestimo = dataEmprestimo;
	}

	public Date getDataPrevistaDevolucao() {
		return dataPrevistaDevolucao;
	}

	public void setDataPrevistaDevolucao(Date dataPrevistaDevolucao) {
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
	}


	public String getStatusDevolucao() {
		return statusDevolucao;
	}

	public void setStatusDevolucao(String statusDevolucao) {
		this.statusDevolucao = statusDevolucao;
	}

	public long getCodigoISBN() {
		return codigoISBN;
	}

	public void setCodigoISBN(long codigoISBN) {
		this.codigoISBN = codigoISBN;
	}

	public long getQtdEmprestimo() {
		return qtdEmprestimo;
	}

	public void setQtdEmprestimo(long qtdEmprestimo) {
		this.qtdEmprestimo = qtdEmprestimo;
	}
	
}
