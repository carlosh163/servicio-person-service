package com.springboot.appbanco.repo;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.appbanco.model.Persona;

@Repository
public interface IPersonaRepo extends ReactiveMongoRepository<Persona,String>{

}
