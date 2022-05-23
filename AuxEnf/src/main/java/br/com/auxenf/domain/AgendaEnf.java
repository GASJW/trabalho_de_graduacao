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
public class AgendaEnf extends GenericDomain{
	
	@ManyToOne
	@JoinColumn(nullable = false)
	Enfermeiro enfCpf;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	Pacientes pacCpf;
	
	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date dtPac;
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIME)
	private Date horaPac;

	public Enfermeiro getEnfCpf() {
		return enfCpf;
	}

	public void setEnfCpf(Enfermeiro enfCpf) {
		this.enfCpf = enfCpf;
	}

	public Pacientes getPacCpf() {
		return pacCpf;
	}

	public void setPacCpf(Pacientes pacCpf) {
		this.pacCpf = pacCpf;
	}

	public Date getDtPac() {
		return dtPac;
	}

	public void setDtPac(Date dtPac) {
		this.dtPac = dtPac;
	}

	public Date getHoraPac() {
		return horaPac;
	}

	public void setHoraPac(Date horaPac) {
		this.horaPac = horaPac;
	}
	
	
}
