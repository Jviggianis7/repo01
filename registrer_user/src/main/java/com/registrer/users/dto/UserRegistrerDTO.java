package com.registrer.users.dto;

public class UserRegistrerDTO {

	private int id;
	private String usuario;
	private String password;
	private String nombre;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public UserRegistrerDTO(int id, String usuario, String password, String nombre) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.nombre = nombre;
	}

	public UserRegistrerDTO(String usuario, String password, String nombre) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.nombre = nombre;
	}

	public UserRegistrerDTO(String usuario) {
		super();
		this.usuario = usuario;
	}
	
	public UserRegistrerDTO() {
	}
	
	
	
	

}
