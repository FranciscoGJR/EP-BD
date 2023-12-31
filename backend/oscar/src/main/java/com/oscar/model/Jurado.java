package com.oscar.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "JURADO")
public class Jurado {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_JURADO")
	private Integer idJurado;
	
	@OneToOne
	@JoinColumn(name = "ID_PESSOA", nullable = false)
	@NotNull
	private Pessoa pessoa;

	@OneToMany
	@JoinColumn(name = "ID_EDICAO")
	private List<Edicao> edicao;

}
