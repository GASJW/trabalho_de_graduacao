package br.com.auxenf.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Anamnese extends GenericDomain{
	
	@Column(length = 255, nullable = false)
	private String tratMed;
	
	@Column(length = 255, nullable = false)
	private String medUso;
	
	@Column(length = 255, nullable = false)
	private String antAlerg;
	
	@Column(nullable = false)
	private Boolean marcapasso;
	
	@Column(length = 255, nullable = false)
	private String altCard;
	
	@Column(nullable = false)
	private Boolean hipoT;
	
	@Column(nullable = false)
	private Boolean hiperT;
	
	@Column(length = 255, nullable = false)
	private String distCirc;
	
	@Column(length = 255, nullable = false)
	private String distRenal;
	
	@Column(length = 255, nullable = false)
	private String distHorm;
	
	@Column(length = 255, nullable = false)
	private String distGastro;
	
	@Column(nullable = false)
	private Boolean epilepsia;
	
	@Column(length = 255, nullable = false)
	private String altPsi;
	
	@Column(length = 255, nullable = false)
	private String estresse;
	
	@Column(length = 255, nullable = false)
	private String antOnco;
	
	@Column(length = 255, nullable = false)
	private String diabetes;
	
	@Column(length = 255, nullable = false)
	private String outros;
	
	@Column(length = 3, nullable = false)
	private String tipoSang;
	
	@Column(length = 255, nullable = false)
	private String queixas;
	
	@Column(length = 255, nullable = false)
	private String antecedentes;
	
	@Column(length = 255, nullable = false)
	private String histMorbPreg;
	
	@Column(length = 255, nullable = false)
	private String histDoenAtual;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	Pacientes pacCpf;

	public Pacientes getPacCpf() {
		return pacCpf;
	}

	public void setPacCpf(Pacientes pacCpf) {
		this.pacCpf = pacCpf;
	}

	public String getTratMed() {
		return tratMed;
	}

	public void setTratMed(String tratMed) {
		this.tratMed = tratMed;
	}

	public String getMedUso() {
		return medUso;
	}

	public void setMedUso(String medUso) {
		this.medUso = medUso;
	}

	public String getAntAlerg() {
		return antAlerg;
	}

	public void setAntAlerg(String antAlerg) {
		this.antAlerg = antAlerg;
	}

	public Boolean getMarcapasso() {
		return marcapasso;
	}

	public void setMarcapasso(Boolean marcapasso) {
		this.marcapasso = marcapasso;
	}

	public String getAltCard() {
		return altCard;
	}

	public void setAltCard(String altCard) {
		this.altCard = altCard;
	}

	public Boolean getHipoT() {
		return hipoT;
	}

	public void setHipoT(Boolean hipoT) {
		this.hipoT = hipoT;
	}

	public Boolean getHiperT() {
		return hiperT;
	}

	public void setHiperT(Boolean hiperT) {
		this.hiperT = hiperT;
	}

	public String getDistCirc() {
		return distCirc;
	}

	public void setDistCirc(String distCirc) {
		this.distCirc = distCirc;
	}

	public String getDistRenal() {
		return distRenal;
	}

	public void setDistRenal(String distRenal) {
		this.distRenal = distRenal;
	}

	public String getDistHorm() {
		return distHorm;
	}

	public void setDistHorm(String distHorm) {
		this.distHorm = distHorm;
	}

	public String getDistGastro() {
		return distGastro;
	}

	public void setDistGastro(String distGastro) {
		this.distGastro = distGastro;
	}

	public Boolean getEpilepsia() {
		return epilepsia;
	}

	public void setEpilepsia(Boolean epilepsia) {
		this.epilepsia = epilepsia;
	}

	public String getAltPsi() {
		return altPsi;
	}

	public void setAltPsi(String altPsi) {
		this.altPsi = altPsi;
	}

	public String getEstresse() {
		return estresse;
	}

	public void setEstresse(String estresse) {
		this.estresse = estresse;
	}

	public String getAntOnco() {
		return antOnco;
	}

	public void setAntOnco(String antOnco) {
		this.antOnco = antOnco;
	}

	public String getDiabetes() {
		return diabetes;
	}

	public void setDiabetes(String diabetes) {
		this.diabetes = diabetes;
	}

	public String getOutros() {
		return outros;
	}

	public void setOutros(String outros) {
		this.outros = outros;
	}

	public String getTipoSang() {
		return tipoSang;
	}

	public void setTipoSang(String tipoSang) {
		this.tipoSang = tipoSang;
	}

	public String getQueixas() {
		return queixas;
	}

	public void setQueixas(String queixas) {
		this.queixas = queixas;
	}

	public String getAntecedentes() {
		return antecedentes;
	}

	public void setAntecedentes(String antecedentes) {
		this.antecedentes = antecedentes;
	}

	public String getHistMorbPreg() {
		return histMorbPreg;
	}

	public void setHistMorbPreg(String histMorbPreg) {
		this.histMorbPreg = histMorbPreg;
	}

	public String getHistDoenAtual() {
		return histDoenAtual;
	}

	public void setHistDoenAtual(String histDoenAtual) {
		this.histDoenAtual = histDoenAtual;
	}
	
}