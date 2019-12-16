package com.springboot.appbanco.repo;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.appbanco.model.PersonAuthorized;

@Repository
public interface IPersonRepo extends ReactiveMongoRepository<PersonAuthorized,String>{

}
