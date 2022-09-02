package com.triart.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_usuarios")
public class Usuarios {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@NotBlank
	@Size(min=6, max=20)
	private String usuario;
	
	@NotBlank
	@Size(min=6, max=20)
	private String senha;
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String email;
	

}
