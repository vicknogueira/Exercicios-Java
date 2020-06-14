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

import com.biblioteca.biblioteca.model.LivroModel;
import com.biblioteca.biblioteca.repository.LivroRepository;

@RestController
@RequestMapping("/livros")
@CrossOrigin("*")
public class LivroController {

	@Autowired
	private LivroRepository repository;
	
	// método get all
	@GetMapping
	public ResponseEntity<List<LivroModel>> GetAllLivros(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	
	//método findbyId
	@GetMapping("/{idLivro}")
	public ResponseEntity<LivroModel> FindByIdLivro(@PathVariable long idLivro){
		return repository.findById(idLivro).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	
	// método findbyTituloLivro
	@GetMapping("/tituloLivro/{tituloLivro}")
	public ResponseEntity<List<LivroModel>> FindByTituloLivro(@PathVariable String tituloLivro){
		return ResponseEntity.ok(repository.findAllByTituloLivroContainingIgnoreCase(tituloLivro));
	}
	
	
	// método PostLivro
	@PostMapping
	public ResponseEntity<LivroModel> PostLivro(@RequestBody LivroModel livro){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(livro));
	}
	
	// método PutLivro
	@PutMapping
	public ResponseEntity<LivroModel> PutLivro(@RequestBody LivroModel livro){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(livro));
	}
	
	// método delete livro
	@DeleteMapping("/{idLivro}")
	public void DeleteLivro(@PathVariable long idLivro){
		repository.deleteById(idLivro);
	}
	
}
