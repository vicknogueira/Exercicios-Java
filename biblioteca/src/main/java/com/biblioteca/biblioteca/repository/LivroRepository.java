package com.biblioteca.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.biblioteca.model.LivroModel;

public interface LivroRepository extends JpaRepository<LivroModel, Long>{

	public List<LivroModel> findAllByTituloLivroContainingIgnoreCase(String tituloLivro);
}
