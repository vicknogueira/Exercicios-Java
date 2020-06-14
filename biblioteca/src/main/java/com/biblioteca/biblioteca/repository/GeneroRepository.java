package com.biblioteca.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.biblioteca.model.GeneroModel;

public interface GeneroRepository extends JpaRepository<GeneroModel, Long>{

	public List<GeneroModel> findAllByNomeGeneroContainingIgnoreCase(String nomeGenero);
}
