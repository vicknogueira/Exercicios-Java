package com.biblioteca.biblioteca.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.biblioteca.biblioteca.model.ClienteModel;

public interface ClienteRepository extends JpaRepository<ClienteModel, Long> {
	public List<ClienteModel> findAllByNomecompletoClienteContainingIgnoreCase(String nomecompletoCliente);
//	public List<ClienteModel> findAllByTelefoneContainingIgnoreCase(String telefone);
}
