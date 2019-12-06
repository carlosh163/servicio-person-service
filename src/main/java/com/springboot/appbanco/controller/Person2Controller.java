package com.springboot.appbanco.controller;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.appbanco.model.Persona;

import reactor.core.publisher.Mono;


@RestController
@RequestMapping("api/persona2")
public class Person2Controller {

	/*
	@GetMapping("/{id}")
	public Mono<Persona> findById(@PathVariable String id){
		return service.findById(id);
	}
	*/
	
	
	@GetMapping("/prueba/{id}")
	public String create2(@PathVariable String id){
		return id;
	}
}
