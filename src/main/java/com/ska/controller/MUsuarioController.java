package com.ska.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ska.entity.MUsuario;
import com.ska.service.MUsuarioDao;

@RestController
@RequestMapping("usuarios")
public class MUsuarioController {
	@Autowired
	private MUsuarioDao usuario;

	@GetMapping
	public ResponseEntity<List<MUsuario>> VerUsuarios() {
		List<MUsuario> Usuario = usuario.findAll();
		return ResponseEntity.ok(Usuario);
	}
	@RequestMapping(value="{id}")
	public ResponseEntity<MUsuario> UsuarioId(@PathVariable("id") Long id){
		Optional<MUsuario> idUsuario = usuario.findById(id);
		if(idUsuario.isPresent()) {
			return ResponseEntity.ok(idUsuario.get());
		}else {
			return ResponseEntity.noContent().build();
		}
	}
	
	@PostMapping
	public ResponseEntity<MUsuario> CrearUsuario(@RequestBody MUsuario Usuario){
			MUsuario nuevoUsuario = usuario.save(Usuario) ;
			return ResponseEntity.ok(nuevoUsuario);
	}
	
	@DeleteMapping(value="{id}")
	public ResponseEntity<MUsuario> EliminarUsuario(@PathVariable("id")Long id){
		usuario.deleteById(id);
		return ResponseEntity.ok(null);
	}
	
	@PutMapping
	public ResponseEntity<MUsuario> EditarUsuario(@RequestBody MUsuario Usuario){
		
		Optional<MUsuario> optionalUsuario = usuario.findById(Usuario.getId_usuario());
		if(optionalUsuario.isPresent()) {
			MUsuario updateUser = optionalUsuario.get();
			updateUser.setNombres(Usuario.getNombres());
			updateUser.setApellido_p(Usuario.getApellido_p());
			updateUser.setApellido_m(Usuario.getApellido_m());
			updateUser.setCorreo(Usuario.getCorreo());
			updateUser.setContraseña(Usuario.getContraseña());
			updateUser.setFecha_creacion(Usuario.getFecha_creacion());
			usuario.save(updateUser);
			return ResponseEntity.ok(updateUser);
			
		}else {
			return ResponseEntity.noContent().build();
		}
		
	}
	
}
