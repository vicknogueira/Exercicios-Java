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

import com.generation.clinica.model.EspecialidadeModel;
import com.generation.clinica.repository.EspecialidadeRepository;

@RestController
@RequestMapping("/especialidade")
@CrossOrigin("*")
public class EspecialidadeController {
	
	//Injeção de dependencias
	@Autowired
	private EspecialidadeRepository repository;
	
	// método get
	// pegando a especialidade pelo codigo
	@GetMapping("/{codEspecialidade}")
	public ResponseEntity<EspecialidadeModel> GetByIdEspecialidade(@PathVariable long codEspecialidade){
		return repository.findById(codEspecialidade).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping
	public ResponseEntity<List<EspecialidadeModel>> GetAllEspecialidades(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	
	@GetMapping("/nomeespecialidade/{nomeEspecialidade}")
	public ResponseEntity<List<EspecialidadeModel>> FindAllByNomeEspecialidade(@PathVariable String nomeEspecialidade){
		return ResponseEntity.ok(repository.findAllByNomeEspecialidadeContainingIgnoreCase(nomeEspecialidade));
	}
	// método post
	
	@PostMapping
	public ResponseEntity<EspecialidadeModel> PostEspecialidade(@RequestBody EspecialidadeModel especialidade){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(especialidade));
	}
	// método put
	@PutMapping
	public ResponseEntity<EspecialidadeModel> PutEspecialidade(@RequestBody EspecialidadeModel especialidade){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(especialidade));
	}
	
	// método delete
	@DeleteMapping("/{codEspecialidade}")
	public void DeleteEspecialidade(@PathVariable long codEspecialidade) {
		repository.deleteById(codEspecialidade);
	}
	
}
