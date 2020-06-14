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

import com.biblioteca.biblioteca.model.GeneroModel;
import com.biblioteca.biblioteca.repository.GeneroRepository;

@RestController
@RequestMapping("/generos")
@CrossOrigin("*")
public class GeneroController {
	
	@Autowired
	private GeneroRepository repository;
	
	// método getAll
	@GetMapping
	public ResponseEntity<List<GeneroModel>> GetAllGenero(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	//método fidByid
	@GetMapping("/{idGenero}")
	public ResponseEntity<GeneroModel> FindByGenero(@PathVariable long idGenero){
		return repository.findById(idGenero).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	// método findByNomegenero
	@GetMapping("/nomeGenero/{nomeGenero}")
	public ResponseEntity<List<GeneroModel>> FindByNomeGenero(@PathVariable String nomeGenero){
		return ResponseEntity.ok(repository.findAllByNomeGeneroContainingIgnoreCase(nomeGenero));
	}
	
	// método Post Genero
	@PostMapping
	public ResponseEntity<GeneroModel> PostGenero(@RequestBody GeneroModel genero){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(genero));
	}
	
	// método put genero
	@PutMapping
	public ResponseEntity<GeneroModel> PutGenero(@RequestBody GeneroModel genero){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(genero));
	}
	
	// método delete genero
	@DeleteMapping("/{idGenero}")
	public void DeleteGenero(@PathVariable long idGenero) {
		repository.deleteById(idGenero);
	}

}
