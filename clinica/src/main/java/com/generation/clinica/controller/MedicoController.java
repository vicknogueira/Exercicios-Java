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

import com.generation.clinica.model.MedicoModel;
import com.generation.clinica.repository.MedicoRepository;

@RestController
@RequestMapping("/medico")
@CrossOrigin("*")
public class MedicoController {

	//Injeção de dependencias
		@Autowired
		private MedicoRepository repository;
		
		// método get
		// pegando a medico pelo codigo
		@GetMapping("/{crm}")
		public ResponseEntity<MedicoModel> GetByIdMedico(@PathVariable long crm){
			return repository.findById(crm).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
		}
		
		@GetMapping
		public ResponseEntity<List<MedicoModel>> GetAllMedicos(){
			return ResponseEntity.ok(repository.findAll());
		}
		
		
		@GetMapping("/medico/{nome}")
		public ResponseEntity<List<MedicoModel>> FindAllByNomeMedico(@PathVariable String nome){
			return ResponseEntity.ok(repository.findAllByNomeContainingIgnoreCase(nome));
		}
		// método post
		
		@PostMapping
		public ResponseEntity<MedicoModel> PostMedico(@RequestBody MedicoModel medico){
			return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(medico));
		}
		// método put
		@PutMapping
		public ResponseEntity<MedicoModel> PutMedico(@RequestBody MedicoModel medico){
			return ResponseEntity.status(HttpStatus.OK).body(repository.save(medico));
		}
		
		// método delete
		@DeleteMapping("/{crm}")
		public void DeleteMedico(@PathVariable long crm) {
			repository.deleteById(crm);
		}

}
