package com.springboot.appbanco.repo;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.appbanco.model.Person;

@Repository
public interface IPersonRepo extends ReactiveMongoRepository<Person,String>{

}
