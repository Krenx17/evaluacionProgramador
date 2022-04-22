package com.carlosespana.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlosespana.bean.usuario;
import com.carlosespana.repository.usuarioRepository;

@Service
public class usuarioServiceImpl implements usuarioService{
	
	@Autowired
	usuarioRepository repository;
	
	public Iterable<usuario> getAllUsuarios() {
		return repository.findAll();
	}

}
