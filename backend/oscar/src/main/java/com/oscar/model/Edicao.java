package com.oscar.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Edicao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idEdicao;
	
	@Column(name = "NOME_EDICAO")
	private String nomeEdicao;
	
	@Column(name = "LOCALIZACAO")
	private String localizacao;
	
	@Column(name = "DATA")
	private LocalDate data;

}
