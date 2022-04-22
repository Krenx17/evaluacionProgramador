package com.carlosespana.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carlosespana.bean.region;
import com.carlosespana.repository.regionRepository;

@Service
public class regionServiceImpl {

	@Autowired
	regionRepository repository;
	
	public Iterable<region> getAllRegiones() {
		return repository.findAll();
	}
}
