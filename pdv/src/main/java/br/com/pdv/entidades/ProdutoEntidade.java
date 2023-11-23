package br.com.pdv.entidades;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="produto", schema = "pdv")
public class ProdutoEntidade implements Serializable {

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
	private String nome;
	
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

