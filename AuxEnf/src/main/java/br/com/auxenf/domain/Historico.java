package br.com.auxenf.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@SuppressWarnings("serial")
@Entity
public class Historico extends GenericDomain{

	@ManyToOne
	@JoinColumn(nullable = false)
	Pacientes pacientes;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dtConsulta;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIME)
	private Date horaConsulta;
	
	@Column(length = 255, nullable = false)
	private String nomeMed;
	
	@Column(length = 255, nullable = false)
	private String especMed;
	
	@Column(length = 255, nullable = false)
	private String descrConsulta;
	
	public Pacientes getPacientes() {
		return pacientes;
	}

	public void setPacientes(Pacientes pacientes) {
		this.pacientes = pacientes;
	}

	public Date getDtConsulta() {
		return dtConsulta;
	}

	public void setDtConsulta(Date dtConsulta) {
		this.dtConsulta = dtConsulta;
	}

	public Date getHoraConsulta() {
		return horaConsulta;
	}

	public void setHoraConsulta(Date horaConsulta) {
		this.horaConsulta = horaConsulta;
	}

	public String getNomeMed() {
		return nomeMed;
	}

	public void setNomeMed(String nomeMed) {
		this.nomeMed = nomeMed;
	}

	public String getEspecMed() {
		return especMed;
	}

	public void setEspecMed(String especMed) {
		this.especMed = especMed;
	}

	public String getDescrConsulta() {
		return descrConsulta;
	}

	public void setDescrConsulta(String descrConsulta) {
		this.descrConsulta = descrConsulta;
	}
	
}