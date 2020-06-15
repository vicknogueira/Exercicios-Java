package com.generation.clinica.model;

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

@Entity
@Table(name="tbFicha")
public class FichaModel {
	
	@Id
	@Column(name = "codFicha")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codFicha;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "paciente", referencedColumnName = "codPaciente")
	private PacienteModel paciente;
	
	// esse name é como esta sendo chamado aqui e o referenced para o campo que esta referenciando na outra tabela
//	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "crm", referencedColumnName = "crm")
	private String crm;
	
	@Column(name = "dataConsulta")
	private Date dataConsulta = new java.sql.Date(System.currentTimeMillis());
	
	@Column(name = "valorConsulta", nullable = false)
	private double valorConsulta;
	
	@Column(name="diagnostico", length = 255)
	private String diagnostico;
	
	@Column(name="procedimento", length = 255)
	private String procedimento;
	
	@Column(name="exame", length = 255)
	private String exame;
	
	@Column(name = "dataRetorno")
	private Date dataRetorno;

	
//	---------- GET e SET -----------------
	
	
	public PacienteModel getPaciente() {
		return paciente;
	}

	public long getCodFicha() {
		return codFicha;
	}

	public void setCodFicha(long codFicha) {
		this.codFicha = codFicha;
	}

	public void setPaciente(PacienteModel paciente) {
		this.paciente = paciente;
	}

	public String getCrm() {
		return crm;
	}

	public void setCrm(String crm) {
		this.crm = crm;
	}

	public Date getDataConsulta() {
		return dataConsulta;
	}

	public void setDataConsulta(Date dataConsulta) {
		this.dataConsulta = dataConsulta;
	}

	public double getValorConsulta() {
		return valorConsulta;
	}

	public void setValorConsulta(double valorConsulta) {
		this.valorConsulta = valorConsulta;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getProcedimento() {
		return procedimento;
	}

	public void setProcedimento(String procedimento) {
		this.procedimento = procedimento;
	}

	public String getExame() {
		return exame;
	}

	public void setExame(String exame) {
		this.exame = exame;
	}

	public Date getDataRetorno() {
		return dataRetorno;
	}

	public void setDataRetorno(Date dataRetorno) {
		this.dataRetorno = dataRetorno;
	}
	
	
}
