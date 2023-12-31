package com.oscar.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oscar.model.Pessoa;
import com.oscar.repository.PessoaRepository;

@Service
public class PessoaService {

	@Autowired
	private PessoaRepository pessoaRepository;

	public void save(Pessoa pessoa) {
		pessoaRepository.save(pessoa.getId(), pessoa.getNomeArtistico(), pessoa.getNomeVerdadeiro(), pessoa.getSexo(), pessoa.getNascimento(), pessoa.getSite(), pessoa.getAnoInicioCarreira());
	}

}
