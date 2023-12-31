package com.oscar.model;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "PESSOA")
public class Pessoa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PESSOA")
	@NotNull
	private Integer id;

	@Column(name = "NOME_ARTISTICO", length = 64, nullable = false)
	@NotNull
	private String nomeArtistico;

	@Column(name = "NOME_VERDADEIRO", length = 64, nullable = false)
	@NotNull
	private String nomeVerdadeiro;

	@Column(name = "SEXO")
	private Sexo sexo;

	@Column(name = "DATA_NASCIMENTO")
	private LocalDate Nascimento;

	@Column(name = "SITE")
	private String site;

	@Column(name = "ANO_INICIO_CARREIRA")
	private Integer anoInicioCarreira;

}
