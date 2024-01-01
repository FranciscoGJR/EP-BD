package com.oscar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oscar.model.Filme;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Service
public class FilmeService {

	@Autowired
	private EntityManager entityManager;

	@Transactional
	public void save(Filme filme) {
		entityManager.createNativeQuery(
				"INSERT INTO FILME (ID_FILME, TITULO, NOME_EM_PORTUGUES, IDIOMA_ORIGINAL, NACIONALIDADE, DATA_DE_PRODUCAO, GENERO) VALUES (?, ?, ?, ?, ?, ?, ?)")
				.setParameter(1, filme.getIdFilme())
				.setParameter(2, filme.getTitulo())
				.setParameter(3, filme.getNomeEmPortugues())
				.setParameter(4, filme.getIdiomaOriginal())
				.setParameter(5, filme.getNacionalidade())
				.setParameter(6, filme.getDataDeProducao())
				.setParameter(7, filme.getGenero())
				.executeUpdate();
	}

}
