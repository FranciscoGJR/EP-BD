package com.oscar.model;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Premio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_PREMIO")
	private Integer idPremio;
	
	private String nomeProprio;
	
	private Indicacao ganhador;

}
