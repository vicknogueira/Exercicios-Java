package com.biblioteca.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.biblioteca.model.EmprestimoeDevolucaoModel;

public interface EmprestimoeDevolucaoRepository extends JpaRepository<EmprestimoeDevolucaoModel, Long>{

	public List<EmprestimoeDevolucaoModel> findAllByStatusDevolucaoContainingIgnoreCase(String statusDevolucao);
	
}
