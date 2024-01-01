package com.oscar.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
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

	@ManyToMany(mappedBy = "jurados")
	private List<Edicao> edicao;
	
	public Pessoa() {
	}

	public Pessoa(@NotNull Integer id, @NotNull String nomeArtistico, @NotNull String nomeVerdadeiro, Sexo sexo,
			LocalDate nascimento, String site, Integer anoInicioCarreira) {
		super();
		this.id = id;
		this.nomeArtistico = nomeArtistico;
		this.nomeVerdadeiro = nomeVerdadeiro;
		this.sexo = sexo;
		Nascimento = nascimento;
		this.site = site;
		this.anoInicioCarreira = anoInicioCarreira;
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
