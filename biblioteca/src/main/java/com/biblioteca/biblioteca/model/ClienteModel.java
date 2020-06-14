package com.biblioteca.biblioteca.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;


@Entity // Entidade
@Table(name = "tb_cliente") // Nome da tabela
public class ClienteModel {
	
	// atributos ou campos
	
	@Id // Chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) //  Auto incremento
	@Column(name = "cd_cliente")
	private long idCliente;
	
	@Column(name = "cpf", nullable = false, unique = true)
	@Size(min = 11, max = 11)
	private String cpf;
	
	@Column(name = "nm_completoCliente", nullable = false)
	@Size(min=7, max=80)
	private String nomecompletoCliente;
	
	@Column(name = "nm_emailCliente")
	@Size(min= 11, max=30)
	private String emailCliente;
	
	@Column(name = "dt_nascimento", nullable = false)
	private Date dataNascimento = new java.sql.Date(System.currentTimeMillis());
	
	@Column(name = "nm_telefone")
	@Size(min = 11, max = 13)
	private String telefone;


	@OneToMany(mappedBy = "idClientes")
	private List<EmprestimoeDevolucaoModel> idcliente;
	
	// ------------------- Get and Set --------------------------
	
	public long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(long idCliente) {
		this.idCliente = idCliente;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomecompletoCliente() {
		return nomecompletoCliente;
	}

	public void setNomecompletoCliente(String nomecompletoCliente) {
		this.nomecompletoCliente = nomecompletoCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
