package com.oscar.model;


import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Estreia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_ESTREIA")
	private Integer idEstreia;
	
	@Column(name = "LOCALIZACAO")
	private String localizacao;
	
	@Column(name = "ARRECADACAO_PRIMEIRO_ANO")
	private Double arrecadacaoPrimeiroAno;
}
