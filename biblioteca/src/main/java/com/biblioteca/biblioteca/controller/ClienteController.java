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

import com.biblioteca.biblioteca.model.ClienteModel;
import com.biblioteca.biblioteca.repository.ClienteRepository;


@RestController
@RequestMapping("/clientes")
@CrossOrigin("*")
public class ClienteController {
	
	@Autowired
	private ClienteRepository repository;
	
	//método find all
	@GetMapping
	public ResponseEntity<List<ClienteModel>> GETAllClientes(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	//método findById
	@GetMapping("/{idCliente}")
	public ResponseEntity<ClienteModel> FindIdCliente(@PathVariable long idCliente){
		return repository.findById(idCliente).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	// método findByNomeClient
	@GetMapping("/nomeCliente/{nomecompletoCliente}")
	public ResponseEntity<List<ClienteModel>> FindByNomeCliente(@PathVariable String nomecompletoCliente){
		return ResponseEntity.ok(repository.findAllByNomecompletoClienteContainingIgnoreCase(nomecompletoCliente));
	}
	
	
	// método Post para cadastrar o cliente
	@PostMapping
	public ResponseEntity<ClienteModel> PostCliente(@RequestBody ClienteModel cliente){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(cliente));
	}
	
	// método put para editar o cadastro do cliente
	@PutMapping
	public ResponseEntity<ClienteModel> PutCliente(@RequestBody ClienteModel cliente){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(cliente));
	}
	
	
	//método delete
	@DeleteMapping("/{idCliente}")
	public void DeleteCliente(@PathVariable long idCliente) {
		repository.deleteById(idCliente);
	}
}
