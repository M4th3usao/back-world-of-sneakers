package com.applications.wfs.domain;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Administrador extends Pessoa{
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "administrador")
	private List<Modelo> modelos = new ArrayList<>();

	public Administrador() {
		super();
	}

	public Administrador(Integer id, String nome, String cpf, String email, String senha) {
		super(id, nome, cpf, email, senha);
	}

	public List<Modelo> getModelos() {
		return modelos;
	}

	public void setModelos(List<Modelo> modelos) {
		this.modelos = modelos;
	}
	
	
	
}
