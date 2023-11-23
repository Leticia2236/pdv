package br.com.pdv.entidades;


import java.io.Serializable;

import javax.swing.Spring;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="vendedor", schema = "pdv")
public class VendedorEntidade implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	private Long id;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Column(name = "nome")
	private Spring nome;
	public Spring getNome() {
		return nome;
	}
	public void setNome(Spring nome) {
		this.nome = nome;
	}
	
	
    }
