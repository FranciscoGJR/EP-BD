package com.oscar.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ESTREIA")
public class Estreia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ESTREIA")
	private Integer idEstreia;

	@Column(name = "LOCALIZACAO")
	private String localizacao;

	@Column(name = "ARRECADACAO_PRIMEIRO_ANO")
	private Double arrecadacaoPrimeiroAno;

	@ManyToOne
	@JoinColumn(name = "ID_FILME")
	private Filme filme;

	public Estreia() {
	}
	
	public Estreia(Integer idEstreia, String localizacao, Double arrecadacaoPrimeiroAno, Filme filme) {
		super();
		this.idEstreia = idEstreia;
		this.localizacao = localizacao;
		this.arrecadacaoPrimeiroAno = arrecadacaoPrimeiroAno;
		this.filme = filme;
	}

	public Integer getIdEstreia() {
		return idEstreia;
	}

	public void setIdEstreia(Integer idEstreia) {
		this.idEstreia = idEstreia;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public Double getArrecadacaoPrimeiroAno() {
		return arrecadacaoPrimeiroAno;
	}

	public void setArrecadacaoPrimeiroAno(Double arrecadacaoPrimeiroAno) {
		this.arrecadacaoPrimeiroAno = arrecadacaoPrimeiroAno;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

}
