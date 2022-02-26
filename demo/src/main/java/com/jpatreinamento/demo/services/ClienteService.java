package com.jpatreinamento.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpatreinamento.demo.repository.ClienteRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;

	public Object findById(Integer id) {
		Optional<Cliente> obj = repository.(id)
		return obj.;
	}

}
