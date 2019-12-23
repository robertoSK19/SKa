package com.ska.entity;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="accesorio")
public class Accesorio {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id_accesorio;
private String nombre_accesorio;
private String marca;
private String modelo;
private String producto;
private String hecho_en;
private String serie;
//Falta foreign key
private Long EstatusRecurso_id_estatus;

@OneToMany(mappedBy = "id_accesorio")
@JsonIgnore
private List<Accesorio>accesorios;

public Long getId_accesorio() {
	return id_accesorio;
}
public void setId_accesorio(Long id_accesorio) {
	this.id_accesorio = id_accesorio;
}
public String getNombre_accesorio() {
	return nombre_accesorio;
}
public void setNombre_accesorio(String nombre_accesorio) {
	this.nombre_accesorio = nombre_accesorio;
}
public String getMarca() {
	return marca;
}
public void setMarca(String marca) {
	this.marca = marca;
}
public String getModelo() {
	return modelo;
}
public void setModelo(String modelo) {
	this.modelo = modelo;
}
public String getProducto() {
	return producto;
}
public void setProducto(String producto) {
	this.producto = producto;
}
public String getHecho_en() {
	return hecho_en;
}
public void setHecho_en(String hecho_en) {
	this.hecho_en = hecho_en;
}
public String getSerie() {
	return serie;
}
public void setSerie(String serie) {
	this.serie = serie;
}
public Long getEstatusRecurso_id_estatus() {
	return EstatusRecurso_id_estatus;
}
public void setEstatusRecurso_id_estatus(Long estatusRecurso_id_estatus) {
	EstatusRecurso_id_estatus = estatusRecurso_id_estatus;
}


}
