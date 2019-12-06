package com.springboot.appbanco.service;

import com.springboot.appbanco.model.Persona;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface IPersonaService {

	public Flux<Persona> findAll();

	public Mono<Persona> findById(String id);

	public Mono<Persona> create(Persona perso);

	public Mono<Persona> update(Persona perso, String id);

	public Mono<Void> delete(String id);
}
