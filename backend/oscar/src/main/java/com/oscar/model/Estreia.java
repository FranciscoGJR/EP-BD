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
@Table(name = "TABLE")
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

}
