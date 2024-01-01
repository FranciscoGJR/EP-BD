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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "EDICAO")
public class Edicao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_EDICAO", insertable = false, nullable = false)
	private Integer idEdicao;

	@Column(name = "NOME_EDICAO", length = 64, nullable = false)
	@NotNull
	private String nomeEdicao;

	@Column(name = "LOCALIZACAO", length = 32)
	private String localizacao;

	@Column(name = "DATA")
	private LocalDate data;

	@ManyToMany()
	@JoinTable( name = "JURADOS", 
				joinColumns = { @JoinColumn(name = "ID_EDICAO")}, 
				inverseJoinColumns = { @JoinColumn(name = "ID_")})
	private List<Pessoa> jurados = new ArrayList<>();

	
	public Edicao() {
	}

	
	public Edicao(Integer idEdicao, @NotNull String nomeEdicao, String localizacao, LocalDate data) {
		super();
		this.idEdicao = idEdicao;
		this.nomeEdicao = nomeEdicao;
		this.localizacao = localizacao;
		this.data = data;
	}


	public Integer getIdEdicao() {
		return idEdicao;
	}

	public void setIdEdicao(Integer idEdicao) {
		this.idEdicao = idEdicao;
	}

	public String getNomeEdicao() {
		return nomeEdicao;
	}

	public void setNomeEdicao(String nomeEdicao) {
		this.nomeEdicao = nomeEdicao;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

}
