package com.oscar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oscar.model.Estreia;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Service
public class EstreiaService {

	@Autowired
	private EntityManager entityManager;
	
	@Transactional
	public void save(Estreia estreia) {
		entityManager.createNativeQuery(
				"INSERT INTO ESTREIA (ID_ESTREIA, ID_FILME, ARRECADACAO_PRIMEIRO_ANO, LOCALIZACAO) VALUES(?, ?, ?, ?)")
				.setParameter(1, estreia.getIdEstreia())
				.setParameter(2, estreia.getFilme().getIdFilme())
				.setParameter(3, estreia.getArrecadacaoPrimeiroAno())
				.setParameter(4, estreia.getLocalizacao())
				.executeUpdate();
	}
	
}
