package com.oscar.model;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PESSOA")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PESSOA")
	@NotNull
	private Integer id;

	@Column(name = "NOME_ARTISTICO", length = 64, nullable = false)
	@NotNull
	private String nomeArtistico;

	@Column(name = "NOME_VERDADEIRO", length = 64, nullable = false)
	@NotNull
	private String nomeVerdadeiro;

	@Column(name = "SEXO")
	private Sexo sexo;

	@Column(name = "DATA_NASCIMENTO")
	private LocalDate Nascimento;

	@Column(name = "SITE")
	private String site;

	@Column(name = "ANO_INICIO_CARREIRA")
	private Integer anoInicioCarreira;

	public Pessoa() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNomeArtistico() {
		return nomeArtistico;
	}

	public void setNomeArtistico(String nomeArtistico) {
		this.nomeArtistico = nomeArtistico;
	}

	public String getNomeVerdadeiro() {
		return nomeVerdadeiro;
	}

	public void setNomeVerdadeiro(String nomeVerdadeiro) {
		this.nomeVerdadeiro = nomeVerdadeiro;
	}

	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	public LocalDate getNascimento() {
		return Nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		Nascimento = nascimento;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public Integer getAnoInicioCarreira() {
		return anoInicioCarreira;
	}

	public void setAnoInicioCarreira(Integer anoInicioCarreira) {
		this.anoInicioCarreira = anoInicioCarreira;
	}

}
