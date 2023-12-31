package com.oscar.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "FILME")
public class Filme {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_FILME")
	private Integer idFilme;

	@Column(name = "TITULO")
	private String titulo;

	@Column(name = "IDIOMA_ORIGINAL")
	private String idiomaOriginal;

	@Column(name = "DATA_DE_PRODUCAO")
	private LocalDate dataDeProducao;

	@Column(name = "NACIONALIDADE")
	private String nacionalidade;

	@Column(name = "NOME_EM_PORTUGUES")
	private String nomeEmPortugues;

	@Column(name = "GENERO")
	private String genero;

	public Filme() {
	}

	public Integer getIdFilme() {
		return idFilme;
	}

	public void setIdFilme(Integer idFilme) {
		this.idFilme = idFilme;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getIdiomaOriginal() {
		return idiomaOriginal;
	}

	public void setIdiomaOriginal(String idiomaOriginal) {
		this.idiomaOriginal = idiomaOriginal;
	}

	public LocalDate getDataDeProducao() {
		return dataDeProducao;
	}

	public void setDataDeProducao(LocalDate dataDeProducao) {
		this.dataDeProducao = dataDeProducao;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public String getNomeEmPortugues() {
		return nomeEmPortugues;
	}

	public void setNomeEmPortugues(String nomeEmPortugues) {
		this.nomeEmPortugues = nomeEmPortugues;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

}
