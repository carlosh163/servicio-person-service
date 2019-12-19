package com.springboot.appbanco.repo;


import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.appbanco.model.PersonAuthorized;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Repository
public interface IPersonRepo extends ReactiveMongoRepository<PersonAuthorized,String>{
	Mono<PersonAuthorized> findBydocumentNumber (String numberdoc);
	
	@Query("{'accountList.accountNumber' : ?0}")
	Flux<PersonAuthorized> findByPersonByAccountNumber(Integer accountNumber);
}
