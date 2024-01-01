package com.oscar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oscar.model.Edicao;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Service
public class EdicaoService {
	
	@Autowired
	private EntityManager entityManager;
	
	@Transactional
	public void save(Edicao edicao) {
		entityManager.createNativeQuery(
				"INSERT INTO EDICAO(ID_EDICAO, DATA, LOCALIZACAO, NOME_EDICAO) VALUES(? , ? , ? , ?)")
				.setParameter(1, edicao.getIdEdicao())
				.setParameter(2, edicao.getData())
				.setParameter(3, edicao.getLocalizacao())
				.setParameter(4, edicao.getNomeEdicao())
				.executeUpdate();
	}

}
 