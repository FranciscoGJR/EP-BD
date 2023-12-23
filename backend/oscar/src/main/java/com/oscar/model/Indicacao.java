package com.oscar.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Indicacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_INDICACAO")
	private Integer idIndicacao;
	
	@Column(name = "CATEGORIA")
	private Categoria categoria;
	
	@Column(name = "FILME")
	private Filme filme;
	
	@Column(name = "PESSOA")
	private Pessoa pessoa;
	
	
}
