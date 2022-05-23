package br.com.auxenf.domain;

import javax.persistence.Column;
import javax.persistence.Entity;

@SuppressWarnings("serial")
@Entity
public class Pessoa extends GenericDomain{
	
	@Column(length = 255, nullable = false)
	private String nome;
	
	@Column(length = 14, nullable = false)
	private String cpf;

	@Column(length = 12, nullable = false)
	private String rg;
	
	@Column(length = 11, nullable = false)
	private String telefone;
	
	@Column(length = 255, nullable = false)
	private String email;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
}