package com.coopcomunitaria.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coopcomunitaria.backend.entity.Cliente;
import com.coopcomunitaria.backend.service.ClienteService;

@RestController
@RequestMapping("/cliente")
public class ClienteController {
	
	
	

	@Autowired
	private ClienteService clienteService;
	
	@GetMapping("/")
	public List<Cliente> listarCliente(){
		return clienteService.listarCliente();
	}
	
	@PostMapping("/")
	public Cliente cadastrar(@RequestBody Cliente cliente) {
		return clienteService.save(cliente);
	}
	
	@PutMapping("/")
	public Cliente alterar(@RequestBody Cliente cliente) {
		return clienteService.upDate(cliente);

	}
	
	@DeleteMapping("/{id_cliente}")
	public ResponseEntity<Void> excluir(@PathVariable Long id_cliente) {
		clienteService.delete(id_cliente);

		return ResponseEntity.ok().build();
	}
	

	}

