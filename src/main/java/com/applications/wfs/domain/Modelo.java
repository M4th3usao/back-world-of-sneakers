package com.applications.wfs.domain;

import java.io.Serializable;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Modelo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String cor;
	private String tamanho;
	private String marca;
	private String categoria;

	@ManyToOne
	@JoinColumn(name = "administrador_id")
	private Administrador administrador;
	
	@ManyToOne
	@JoinColumn(name = "funcionario_id")
	private Funcionario funcionario;

	public Modelo() {
		super();
	}

	public Modelo(Integer id, String nome, String cor, String tamanho, String marca, String categoria,
			Administrador administrador, Funcionario funcionario) {
		super();
		this.id = id;
		this.nome = nome;
		this.cor = cor;
		this.tamanho = tamanho;
		this.marca = marca;
		this.categoria = categoria;
		this.administrador = administrador;
		this.funcionario = funcionario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Administrador getAdministrador() {
		return administrador;
	}

	public void setAdministrador(Administrador administrador) {
		this.administrador = administrador;
	}
	
	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(administrador, categoria, cor, id, marca, nome, tamanho, funcionario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Modelo other = (Modelo) obj;
		return Objects.equals(administrador, other.administrador) && Objects.equals(categoria, other.categoria)
				&& Objects.equals(cor, other.cor) && Objects.equals(id, other.id) && Objects.equals(marca, other.marca)
				&& Objects.equals(nome, other.nome) && Objects.equals(tamanho, other.tamanho) && Objects.equals(funcionario, other.funcionario);
	}

	
}
