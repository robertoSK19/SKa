package com.ska.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="dusuario")
public class DUsuario {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id_dusuario;
//Falta foreignkey
private Long roles_id_rol;
//Falta foreignkey
private Long MUsuario_id_usuario;



public Long getId_dusuario() {
	return id_dusuario;
}
public void setId_dusuario(Long id_dusuario) {
	this.id_dusuario = id_dusuario;
}
public Long getRoles_id_rol() {
	return roles_id_rol;
}
public void setRoles_id_rol(Long roles_id_rol) {
	this.roles_id_rol = roles_id_rol;
}
public Long getMUsuario_id_usuario() {
	return MUsuario_id_usuario;
}
public void setMUsuario_id_usuario(Long mUsuario_id_usuario) {
	MUsuario_id_usuario = mUsuario_id_usuario;
}


}
