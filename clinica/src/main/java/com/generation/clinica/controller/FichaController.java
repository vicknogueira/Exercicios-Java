package com.generation.clinica.controller;

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

import com.generation.clinica.model.FichaModel;
import com.generation.clinica.repository.FichaRepository;

@RestController
@RequestMapping("/ficha")
@CrossOrigin("*")
public class FichaController {
	
	//Injeção de dependencias
	@Autowired
	private FichaRepository repository;
	
	// método get
	// pegando a ficha pelo codigo
	@GetMapping("/{codFicha}")
	public ResponseEntity<FichaModel> GetByIdFicha(@PathVariable long codFicha){
		return repository.findById(codFicha).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping
	public ResponseEntity<List<FichaModel>> GetAllFichas(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	// método post
	
	@PostMapping
	public ResponseEntity<FichaModel> PostFicha(@RequestBody FichaModel ficha){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(ficha));
	}
	// método put
	@PutMapping
	public ResponseEntity<FichaModel> PutFicha(@RequestBody FichaModel ficha){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(ficha));
	}
	
	// método delete
	@DeleteMapping("/{codFicha}")
	public void DeleteFicha(@PathVariable long codFicha) {
		repository.deleteById(codFicha);
	}

}
