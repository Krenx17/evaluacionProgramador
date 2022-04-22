package com.carlosespana.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.carlosespana.bean.region;

@Repository
public interface regionRepository extends CrudRepository<region, Long>{

}
