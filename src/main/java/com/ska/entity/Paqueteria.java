package com.ska.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="musuario")
public class Paqueteria {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private Long id_paqueteria;
//Falta foreignkey
private Long software_id_software;



public Long getId_paqueteria() {
	return id_paqueteria;
}
public void setId_paqueteria(Long id_paqueteria) {
	this.id_paqueteria = id_paqueteria;
}
public Long getSoftware_id_software() {
	return software_id_software;
}
public void setSoftware_id_software(Long software_id_software) {
	this.software_id_software = software_id_software;
}



}
