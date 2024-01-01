package com.oscar.config;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.oscar.model.Categoria;
import com.oscar.model.Edicao;
import com.oscar.model.Filme;
import com.oscar.model.Indicacao;
import com.oscar.model.Pessoa;
import com.oscar.model.Premio;
import com.oscar.model.Sexo;
import com.oscar.service.EdicaoService;
import com.oscar.service.FilmeService;
import com.oscar.service.IndicacaoService;
import com.oscar.service.PessoaService;
import com.oscar.service.PremioService;

@Component
public class DataInitializer implements CommandLineRunner {

	@Autowired
	private PessoaService pessoaService;
	
	@Autowired
	private EdicaoService edicaoService;
	
	@Autowired
	private IndicacaoService indicacaoService;
	
	@Autowired
	private FilmeService filmeService;
	
	@Autowired
	private PremioService premioService;

	@Override
	public void run(String... args) throws Exception {

		Pessoa pessoa1 = new Pessoa(1, "Nome Artistico", "Nome Verdadeiro", Sexo.MASCULINO, LocalDate.now(), "Site", 2001);
		Pessoa pessoa2 = new Pessoa(2, "Nome Artistico", "Nome Verdadeiro", Sexo.MASCULINO, LocalDate.now(), "Site", 2001);
		pessoaService.save(pessoa1);
		pessoaService.save(pessoa2);
		
		Edicao edicao1 = new Edicao(1, "Nome Edicao", "Localizacao", LocalDate.now());
		edicaoService.save(edicao1);
		
		Filme filme1 = new Filme(1, "Titulo", "Idioma Original", LocalDate.now(), "Nacionalidade", "Nome em Portugues", "Genero");
		filmeService.save(filme1);
		
		Indicacao indicacao1 = new Indicacao(1, Categoria.MELHOR_ATOR_PRINCIPAL, filme1, edicao1, pessoa1);
		indicacaoService.save(indicacao1);
		
		Premio premio = new Premio(1, "Nome Proprio", edicao1, indicacao1);
		premioService.save(premio);
		
	}

}
