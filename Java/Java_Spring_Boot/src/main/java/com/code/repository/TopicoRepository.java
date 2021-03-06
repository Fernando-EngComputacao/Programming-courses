package com.code.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import com.code.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{

	Page<Topico> findByCursoNome(String nomeCurso, Pageable paginacao);
	
	//@Query("SELECT tl FROM Topico tl WHERE tl.curso.nome = :nomeCurso")
	//List<Topico> carregarPorNomeCurso(@Param("nomCurso") String nomeCurso);
	
}
