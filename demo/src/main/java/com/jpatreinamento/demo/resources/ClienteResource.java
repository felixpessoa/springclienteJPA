package com.jpatreinamento.demo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jpatreinamento.demo.domain.Cliente;
import com.jpatreinamento.demo.services.ClienteService;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;
	
	@GetMapping(value = "/{id}")
	private ResponseEntity<Cliente> findById(@pathVariable ("id") Integer id){
		Cliente cli = Cliente(service.findById(id));
		return ResponseEntity.ok().body(cli);
	}
	
	

}
