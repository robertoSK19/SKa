package com.ska.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="software")
public class Software {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_software;
	private String serie;
	private Date fecha_licencia;
	private String nombre_paqueteria;
	
	
	public Long getId_software() {
		return id_software;
	}
	public void setId_software(Long id_software) {
		this.id_software = id_software;
	}
	public String getSerie() {
		return serie;
	}
	public void setSerie(String serie) {
		this.serie = serie;
	}
	public Date getFecha_licencia() {
		return fecha_licencia;
	}
	public void setFecha_licencia(Date fecha_licencia) {
		this.fecha_licencia = fecha_licencia;
	}
	public String getNombre_paqueteria() {
		return nombre_paqueteria;
	}
	public void setNombre_paqueteria(String nombre_paqueteria) {
		this.nombre_paqueteria = nombre_paqueteria;
	}
	
	
	
	
}
