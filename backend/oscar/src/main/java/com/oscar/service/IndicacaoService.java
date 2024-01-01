package com.oscar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oscar.model.Indicacao;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Service
public class IndicacaoService {

	@Autowired
	private EntityManager entityManager;

	@Transactional
	public void save(Indicacao indicacao) {
		entityManager.createNativeQuery(
				"INSERT INTO INDICACAO (ID_INDICACAO, CATEGORIA, ID_EDICAO, ID_FILME, ID_PESSOA) VALUES(?, ?, ?, ?, ?)")
				.setParameter(1, indicacao.getIdIndicacao())
				.setParameter(2, indicacao.getCategoria())
				.setParameter(3, indicacao.getEdicao().getIdEdicao())
				.setParameter(4, indicacao.getFilme().getIdFilme())
				.setParameter(5, indicacao.getPessoa().getId())
				.executeUpdate();
	}
	
}
