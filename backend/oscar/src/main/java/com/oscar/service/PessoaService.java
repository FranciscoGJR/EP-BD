package com.oscar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oscar.model.Pessoa;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Service
public class PessoaService {

	@Autowired
	private EntityManager entityManager;

	@Transactional
	public void save(Pessoa pessoa) {
		entityManager.createNativeQuery(
				"INSERT INTO PESSOA (ID_PESSOA, NOME_ARTISTICO, NOME_VERDADEIRO, SEXO, DATA_NASCIMENTO, SITE, ANO_INICIO_CARREIRA) VALUES(? , ? , ? , ? , ? , ? , ?)")
				.setParameter(1, pessoa.getId()).setParameter(2, pessoa.getNomeArtistico())
				.setParameter(3, pessoa.getNomeVerdadeiro()).setParameter(4, pessoa.getSexo())
				.setParameter(5, pessoa.getNascimento()).setParameter(6, pessoa.getSite())
				.setParameter(7, pessoa.getAnoInicioCarreira()).executeUpdate();
	}

}
