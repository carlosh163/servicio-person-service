package com.springboot.appbanco.model;

public class Persona {

	int codPersona;
	String nombre;
	String apellidos;
	TipoPersona tPersona;
	TipoDocumento tTipoDocumento;
	String nroDocumento;
	char estado;
	
	public Persona() {
		// TODO Auto-generated constructor stub
	}

	public int getCodPersona() {
		return codPersona;
	}

	public void setCodPersona(int codPersona) {
		this.codPersona = codPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public TipoPersona gettPersona() {
		return tPersona;
	}

	public void settPersona(TipoPersona tPersona) {
		this.tPersona = tPersona;
	}

	public TipoDocumento gettTipoDocumento() {
		return tTipoDocumento;
	}

	public void settTipoDocumento(TipoDocumento tTipoDocumento) {
		this.tTipoDocumento = tTipoDocumento;
	}

	public String getNroDocumento() {
		return nroDocumento;
	}

	public void setNroDocumento(String nroDocumento) {
		this.nroDocumento = nroDocumento;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}
	
	
	
}
