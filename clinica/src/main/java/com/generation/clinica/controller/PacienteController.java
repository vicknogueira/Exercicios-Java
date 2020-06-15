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

import com.generation.clinica.model.PacienteModel;
import com.generation.clinica.repository.PacienteRepository;

@RestController
@RequestMapping("/paciente")
@CrossOrigin("*")
public class PacienteController {

	//Injeção de dependencias
	@Autowired
	private PacienteRepository repository;
	
	// método get
	// pegando a paciente pelo codigo
	@GetMapping("/{codPaciente}")
	public ResponseEntity<PacienteModel> GetByIdPaciente(@PathVariable long codPaciente){
		return repository.findById(codPaciente).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping
	public ResponseEntity<List<PacienteModel>> GetAllPacientes(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	
	@GetMapping("/paciente/{nomePaciente}")
	public ResponseEntity<List<PacienteModel>> FindAllByNomePaciente(@PathVariable String nomePaciente){
		return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nomePaciente));
	}
	// método post
	
	@PostMapping
	public ResponseEntity<PacienteModel> PostPaciente(@RequestBody PacienteModel paciente){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(paciente));
	}
	// método put
	@PutMapping
	public ResponseEntity<PacienteModel> PutPaciente(@RequestBody PacienteModel paciente){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(paciente));
	}
	
	// método delete
	@DeleteMapping("/{codPaciente}")
	public void DeletePaciente(@PathVariable long codPaciente) {
		repository.deleteById(codPaciente);
	}

}
