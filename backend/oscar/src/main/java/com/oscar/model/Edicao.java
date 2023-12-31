package com.oscar.model;

import java.time.LocalDate;
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
	@Column(name = "ID_EDICAO")
	private Integer idEdicao;

	@Column(name = "NOME_EDICAO", length = 64, nullable = false)
	@NotNull
	private String nomeEdicao;

	@Column(name = "LOCALIZACAO", length = 32)
	private String localizacao;

	@Column(name = "DATA")
	private LocalDate data;

	@ManyToMany
	@JoinTable(name = "EDICAO_JURADO", joinColumns = @JoinColumn(name = "ID_EDICAO"), inverseJoinColumns = @JoinColumn(name = "ID_PESSOA"))
	private List<Jurado> jurados;

}
