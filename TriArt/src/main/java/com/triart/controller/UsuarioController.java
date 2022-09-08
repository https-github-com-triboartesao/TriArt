package com.triart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.triart.model.Usuarios;
import com.triart.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuarios")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UsuarioController {

	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Usuarios>>getAll(){
		return ResponseEntity.ok(usuarioRepository.findAll());
	}
	
}