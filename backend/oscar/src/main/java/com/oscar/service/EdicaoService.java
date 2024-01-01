package com.oscar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oscar.model.Edicao;
import com.oscar.model.Pessoa;
import com.oscar.repository.EdicaoRepository;
import com.oscar.repository.PessoaRepository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Service
public class EdicaoService {
	
	@Autowired
	private EntityManager entityManager;
	
	@Autowired
	private EdicaoRepository edicaoRepository;
	
	@Autowired
	private PessoaService pessoaService;
	
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

	public void addJurado(Edicao edicao, Pessoa jurado) {
		List<Pessoa> juradosAtuais = edicao.getJurados();
		juradosAtuais.add(jurado);
		edicao.setJurados(juradosAtuais);
		edicaoRepository.save(edicao);	
		
		pessoaService.addEdicao(jurado, edicao);
	}

}
 