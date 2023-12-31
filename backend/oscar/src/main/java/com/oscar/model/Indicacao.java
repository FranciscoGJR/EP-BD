package com.oscar.model;

import javax.validation.constraints.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "INDICACAO")
public class Indicacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_INDICACAO")
	private Integer idIndicacao;

	@Column(name = "CATEGORIA", nullable = false)
	@NotNull
	private Categoria categoria;

	@OneToOne
	@JoinColumn(name = "ID_FILME", nullable = false)
	@NotNull
	private Filme filme;

	@OneToOne
	@JoinColumn(name = "ID_EDICAO", nullable = false)
	@NotNull
	private Edicao edicao;

	@OneToOne
	@JoinColumn(name = "ID_PESSOA")
	private Pessoa pessoa;

	public Indicacao() {
	}

	public Integer getIdIndicacao() {
		return idIndicacao;
	}

	public void setIdIndicacao(Integer idIndicacao) {
		this.idIndicacao = idIndicacao;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Filme getFilme() {
		return filme;
	}

	public void setFilme(Filme filme) {
		this.filme = filme;
	}

	public Edicao getEdicao() {
		return edicao;
	}

	public void setEdicao(Edicao edicao) {
		this.edicao = edicao;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

}
