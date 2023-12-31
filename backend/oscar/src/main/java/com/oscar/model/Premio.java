package com.oscar.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "PREMIO")
public class Premio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PREMIO")
	private Integer idPremio;

	@Column(name = "NOME_PROPRIO", length = 32)
	private String nomeProprio;

	@ManyToOne
	@JoinColumn(name = "ID_EDICAO")
	private Edicao edicao;

	@OneToOne
	@JoinColumn(name = "ID_INDICACAO")
	private Indicacao indicacao;

	public Premio() {
	}

	public Integer getIdPremio() {
		return idPremio;
	}

	public void setIdPremio(Integer idPremio) {
		this.idPremio = idPremio;
	}

	public String getNomeProprio() {
		return nomeProprio;
	}

	public void setNomeProprio(String nomeProprio) {
		this.nomeProprio = nomeProprio;
	}

	public Edicao getEdicao() {
		return edicao;
	}

	public void setEdicao(Edicao edicao) {
		this.edicao = edicao;
	}

	public Indicacao getIndicacao() {
		return indicacao;
	}

	public void setIndicacao(Indicacao indicacao) {
		this.indicacao = indicacao;
	}

}
