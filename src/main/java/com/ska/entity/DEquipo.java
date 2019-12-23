package com.ska.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dequipo")
public class DEquipo {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id_dequipo;
private Date fecha_actualizacion_estatusDate;
private int disco_duro_solido;
private String comentarios;
//Falta foreignkey
private Long MEquipo_id_equipo;
//Falta foreignkey
private Long Software_id_software;
//Falta foreignkey
private Long estatusRecurso_id_estatus;




public Long getId_dequipo() {
	return id_dequipo;
}
public void setId_dequipo(Long id_dequipo) {
	this.id_dequipo = id_dequipo;
}
public Date getFecha_actualizacion_estatusDate() {
	return fecha_actualizacion_estatusDate;
}
public void setFecha_actualizacion_estatusDate(Date fecha_actualizacion_estatusDate) {
	this.fecha_actualizacion_estatusDate = fecha_actualizacion_estatusDate;
}
public int getDisco_duro_solido() {
	return disco_duro_solido;
}
public void setDisco_duro_solido(int disco_duro_solido) {
	this.disco_duro_solido = disco_duro_solido;
}
public String getComentarios() {
	return comentarios;
}
public void setComentarios(String comentarios) {
	this.comentarios = comentarios;
}
public Long getMEquipo_id_equipo() {
	return MEquipo_id_equipo;
}
public void setMEquipo_id_equipo(Long mEquipo_id_equipo) {
	MEquipo_id_equipo = mEquipo_id_equipo;
}
public Long getSoftware_id_software() {
	return Software_id_software;
}
public void setSoftware_id_software(Long software_id_software) {
	Software_id_software = software_id_software;
}
public Long getEstatusRecurso_id_estatus() {
	return estatusRecurso_id_estatus;
}
public void setEstatusRecurso_id_estatus(Long estatusRecurso_id_estatus) {
	this.estatusRecurso_id_estatus = estatusRecurso_id_estatus;
}


}
