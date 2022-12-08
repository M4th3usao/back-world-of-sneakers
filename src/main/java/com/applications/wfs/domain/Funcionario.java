package com.applications.wfs.domain;

import java.util.ArrayList;
import java.util.List;

import com.applications.wfs.domain.enums.Perfil;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Funcionario extends Pessoa {
	private static final long serialVersionUID = 1L;
	
	@OneToMany(mappedBy = "funcionario")
	private List<Modelo> modelos = new ArrayList<>();

	public Funcionario() {
		super();
		addPerfil(Perfil.FUNCIONARIO);
	}

	public Funcionario(Integer id, String nome, String cpf, String email, String senha) {
		super(id, nome, cpf, email, senha);
	}

	public List<Modelo> getModelos() {
		return modelos;
	}

	public void setModelos(List<Modelo> modelos) {
		this.modelos = modelos;
	}
	
	
}
