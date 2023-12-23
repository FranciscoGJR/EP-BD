package com.oscar.model;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
	
	@Column(name = "ESTREIA")
	private List<Estreia> estreias;
}
