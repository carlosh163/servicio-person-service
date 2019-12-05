package com.springboot.appbanco.model;

public class TipoDocumento {
	int codTipoDocumento;
	String descripcion;
	char estado;
	
	public TipoDocumento() {
		// TODO Auto-generated constructor stub
	}

	public int getCodTipoDocumento() {
		return codTipoDocumento;
	}

	public void setCodTipoDocumento(int codTipoDocumento) {
		this.codTipoDocumento = codTipoDocumento;
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
