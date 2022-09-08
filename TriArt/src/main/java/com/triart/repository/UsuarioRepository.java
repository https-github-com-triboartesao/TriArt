package com.triart.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.triart.model.Usuarios;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuarios, Long>{

	public List<Usuarios> findAllByUsuarioContaingIgnoreCase(String usuario);
	
}
