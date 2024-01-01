package com.oscar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oscar.model.Jurado;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Service
public class JuradoService {

	@Autowired
	private EntityManager entityManager;

	@Transactional
	public void save(Jurado jurado) {
		entityManager.createNativeQuery(
				"INSERT INTO JURADO (ID_JURADO, ID_PESSOA) VALUES(? , ? )")
				.setParameter(1, jurado.getIdJurado())
				.setParameter(2, jurado.getPessoa().getId())
				.executeUpdate();
	}
}
