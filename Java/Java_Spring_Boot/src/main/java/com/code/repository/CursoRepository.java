package com.code.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.code.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nomeCurso);

}