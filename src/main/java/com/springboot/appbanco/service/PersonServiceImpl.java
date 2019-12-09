package com.springboot.appbanco.service;

import java.awt.print.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.appbanco.model.Person;
import com.springboot.appbanco.repo.IPersonRepo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class PersonServiceImpl implements IPersonService {

	
	@Autowired
	IPersonRepo repo;
	
	
	@Override
	public Flux<Person> findAll() {
		return repo.findAll();
	}

	@Override
	public Mono<Person> findById(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id);
	}

	@Override
	public Mono<Person> create(Person perso) {
		return repo.save(perso);
	}

	
	@Override
	public Mono<Person> update(Person perso, String id) {
		// TODO Auto-generated method stub
		return repo.findById(id).flatMap(persoA ->{
			persoA.setNombres(perso.getNombres());
			persoA.setApellidos(perso.getApellidos());
			persoA.setTipoDocumento(perso.getTipoDocumento());
			persoA.setNroDocumento(perso.getNroDocumento());
			persoA.setEstado(perso.getEstado());
			return repo.save(persoA);
		});
	}

	@Override
	public Mono<Void> delete(String id) {
		// TODO Auto-generated method stub
		return repo.findById(id).flatMap(client -> repo.delete(client));
	}
	

}
