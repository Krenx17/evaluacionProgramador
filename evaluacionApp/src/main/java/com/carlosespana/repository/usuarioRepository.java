package com.carlosespana.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.carlosespana.bean.usuario;

@Repository
public interface usuarioRepository extends CrudRepository<usuario, Long> {
	
}
