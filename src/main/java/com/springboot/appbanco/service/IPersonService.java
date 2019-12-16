package com.springboot.appbanco.service;

import com.springboot.appbanco.model.Account;
import com.springboot.appbanco.model.PersonAuthorized;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IPersonService {

	public Flux<PersonAuthorized> findAll();

	public Mono<PersonAuthorized> findById(String id);

	public Flux<PersonAuthorized> create(Account account);

	public Mono<PersonAuthorized> update(PersonAuthorized perso, String id);

	public Mono<Void> delete(String id);
}
