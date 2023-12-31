package com.oscar.config;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.oscar.model.Pessoa;
import com.oscar.model.Sexo;
import com.oscar.service.PessoaService;

@Component
public class DataInitializer implements CommandLineRunner {

	@Autowired
	private PessoaService pessoaService;

	@Override
	public void run(String... args) throws Exception {

		Pessoa pessoa = new Pessoa(1, "Nome Artistico 1", "Nome Verdadeiro 1", Sexo.MASCULINO, LocalDate.now(), "Site 1", 2001);

		pessoaService.save(pessoa);
	}

}
