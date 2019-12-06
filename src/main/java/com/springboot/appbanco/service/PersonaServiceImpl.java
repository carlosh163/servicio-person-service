package com.springboot.appbanco.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.appbanco.model.Persona;
import com.springboot.appbanco.repo.IPersonaRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonaServiceImpl implements IPersonaService {

	
	@Autowired
	IPersonaRepo repo;
	
	
	@Override
	public Flux<Persona> findAll() {
		return repo.findAll();
	}

	@Override
	public Mono<Persona> findById(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public Mono<Persona> create(Persona perso) {
		return repo.save(perso);
	}

	@Override
	public Mono<Persona> update(Persona perso, String id) {
		// TODO Auto-generated method stub
		return repo.findById(id).flatMap(client ->{
			client.setNombre(perso.getNombre());
			return repo.save(client);
		});
	}

	@Override
	public Mono<Void> delete(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id).flatMap(client -> repo.delete(client));
	}
	

}
