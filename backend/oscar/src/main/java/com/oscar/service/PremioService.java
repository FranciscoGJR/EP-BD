package com.oscar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oscar.model.Premio;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Service
public class PremioService {

	@Autowired
	private EntityManager entityManager;

	@Transactional
	public void save(Premio premio) {
		entityManager.createNativeQuery(
				"INSERT INTO PREMIO (ID_PREMIO, ID_EDICAO, ID_INDICACAO, NOME_PROPRIO) VALUES(?, ?, ?, ?)")
				.setParameter(1, premio.getIdPremio())
				.setParameter(2, premio.getEdicao().getIdEdicao())
				.setParameter(3, premio.getIndicacao().getIdIndicacao())
				.setParameter(4, premio.getNomeProprio())
				.executeUpdate();
	}
	
}
