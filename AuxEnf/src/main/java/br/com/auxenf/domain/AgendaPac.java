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
public class AgendaPac extends GenericDomain{
	
	@Column(nullable = false)
	@Temporal(TemporalType.TIME)
	private Date hora;
	
	@Column(length = 14, nullable = false)
	@Temporal(TemporalType.DATE)
	private Date data;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	Atividades nome;

	public Date getHora() {
		return hora;
	}

	public void setHora(Date hora) {
		this.hora = hora;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Atividades getNome() {
		return nome;
	}

	public void setNome(Atividades nome) {
		this.nome = nome;
	}
	
}