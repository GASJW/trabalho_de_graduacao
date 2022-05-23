package br.com.auxenf.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.auxenf.domain.Enfermeiro;

@SuppressWarnings("serial")
@Entity
public class Pacientes extends GenericDomain{

	@ManyToOne
	@JoinColumn(nullable = false)
	private Pessoa pessoa;
	
	@Column(length = 255, nullable = false)
	private String nomeResp;
	
	@Column(nullable = false)
	private Date dtNasc;
	
	@Column(length = 255, nullable = false)
	private String endereco;
	
	@Column(length = 20, nullable = false)
	private String telResp;
	
	@Column(nullable = false)
	private Boolean status;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	Enfermeiro enfCpf;
	
	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
	
	public String getNomeResp() {
		return nomeResp;
	}

	public void setNomeResp(String nomeResp) {
		this.nomeResp = nomeResp;
	}

	public Date getDtNasc() {
		return dtNasc;
	}

	public void setDtNasc(Date dtNasc) {
		this.dtNasc = dtNasc;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelResp() {
		return telResp;
	}

	public void setTelResp(String telResp) {
		this.telResp = telResp;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Enfermeiro getEnfCpf() {
		return enfCpf;
	}

	public void setEnfCpf(Enfermeiro enfCpf) {
		this.enfCpf = enfCpf;
	}

	
}