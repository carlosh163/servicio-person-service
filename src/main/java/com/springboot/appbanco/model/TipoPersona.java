package com.springboot.appbanco.model;

public class TipoPersona {

	int codTipoPersona;
	String descripcion; // Cliente o No es Cliente.
	char estado;
	
	
	public TipoPersona() {
		// TODO Auto-generated constructor stub
	}


	public int getCodTipoPersona() {
		return codTipoPersona;
	}


	public void setCodTipoPersona(int codTipoPersona) {
		this.codTipoPersona = codTipoPersona;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public char getEstado() {
		return estado;
	}


	public void setEstado(char estado) {
		this.estado = estado;
	}
	
	
	
}
