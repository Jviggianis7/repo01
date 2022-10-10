package com.registrer.users.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Mirol")
public class miRol {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int id;
	private String nombre;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public miRol(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	public miRol() {
		super();
	}

	public miRol(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	

}
