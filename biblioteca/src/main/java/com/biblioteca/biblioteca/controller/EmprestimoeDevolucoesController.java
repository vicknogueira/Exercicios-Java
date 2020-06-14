package com.biblioteca.biblioteca.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.biblioteca.biblioteca.model.EmprestimoeDevolucaoModel;
import com.biblioteca.biblioteca.repository.EmprestimoeDevolucaoRepository;

@RestController
@RequestMapping("/emprestimosEdevolucoes")
@CrossOrigin("*")
public class EmprestimoeDevolucoesController {

	@Autowired
	private EmprestimoeDevolucaoRepository repository;
	
	// método getAll
	@GetMapping
	public ResponseEntity<List<EmprestimoeDevolucaoModel>> GetAllEmprestimoseDevolucoes(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	//métofo findById
	@GetMapping("/{id}")
	public ResponseEntity<EmprestimoeDevolucaoModel> FindByIdEmprestimoseDevolucao(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	//método findAllByStatusDevolucao
	@GetMapping("/statusDevolucao/{statusDevolucao}")
	public ResponseEntity<List<EmprestimoeDevolucaoModel>> FindAllByStatusDevolucao(@PathVariable String statusDevolucao){
		return ResponseEntity.ok(repository.findAllByStatusDevolucaoContainingIgnoreCase(statusDevolucao));
	}
	
	
	//método Post
	@PostMapping
	public ResponseEntity<EmprestimoeDevolucaoModel> PostEmprestimoeDevolucao(@RequestBody EmprestimoeDevolucaoModel emprestimoedevolucao){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(emprestimoedevolucao));
	}
	
	//método Put
	@PutMapping
	public ResponseEntity<EmprestimoeDevolucaoModel> PutEmprestimoeDevolucao(@RequestBody EmprestimoeDevolucaoModel emprestimoedevolucao){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(emprestimoedevolucao));
	}
	
	// método delete
	@DeleteMapping("/{id}")
	public void DeleteEmprestimoeDevolucao(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
