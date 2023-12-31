package com.oscar.repository;

import java.time.LocalDate;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.oscar.model.Pessoa;
import com.oscar.model.Sexo;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Integer> {
	
	@Query(value = "INSERT INTO PESSOA p (id, nomeArtistico, nomeVerdadeiro, sexo, Nascimento, site, anoInicioCarreira) VALUES(:id, :nomeArtistico, :nomeVerdadeiro, :sexo, :nascimento, :site, :anoInicioCarreira)", nativeQuery = true)
	void save(Integer id, String nomeArtistico, String nomeVerdadeiro, Sexo sexo, LocalDate nascimento, String site , Integer anoInicioCarreira);
	
}
