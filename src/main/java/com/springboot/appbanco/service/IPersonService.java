package com.springboot.appbanco.service;

import com.springboot.appbanco.model.Person;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IPersonService {

	public Flux<Person> findAll();

	public Mono<Person> findById(String id);

	public Mono<Person> create(Person perso);

	public Mono<Person> update(Person perso, String id);

	public Mono<Void> delete(String id);
}
