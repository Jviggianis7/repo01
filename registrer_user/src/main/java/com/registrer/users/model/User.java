package com.registrer.users.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "usuario"))

public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String usuario;
	private String password;

	@Column(name = "nombre")
	private String nombre;
	
	@ManyToMany(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
	@JoinTable(
			name = "users_rols",
			joinColumns=@JoinColumn(
					    name = "users_id", referencedColumnName ="id"),
			inverseJoinColumns =@JoinColumn(name="rol_id",referencedColumnName="id")
			)
	private Collection<miRol> misRoles;

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
	
	
	public User(int id, String usuario, String password, String nombre, Collection<miRol> misRoles) {
		super();
		this.id = id;
		this.usuario = usuario;
		this.password = password;
		this.nombre = nombre;
		this.misRoles = misRoles;
	}
	
	
	
	public User(String usuario, String password, String nombre, Collection<miRol> misRoles) {
		super();
		this.usuario = usuario;
		this.password = password;
		this.nombre = nombre;
		this.misRoles = misRoles;
	}

	public User() {
		super();
	}

}
