package br.com.auxenf.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Enfermeiro extends GenericDomain{
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	private Usuario login;
	
	@Column(nullable = false)
	private int hrTrab;
	
	@Column(nullable = false)
	private int hrDisp;
	
	@Column(nullable = false)
	private Boolean status;

	public int getHrTrab() {
		return hrTrab;
	}

	public void setHrTrab(int hrTrab) {
		this.hrTrab = hrTrab;
	}

	public int getHrDisp() {
		return hrDisp;
	}

	public void setHrDisp(int hrDisp) {
		this.hrDisp = hrDisp;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Usuario getLogin() {
		return login;
	}

	public void setLogin(Usuario login) {
		this.login = login;
	}
	
	
	
}