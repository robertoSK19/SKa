package com.ska.entity;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="asignacion")
public class Asignacion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_asignacion;
	//Falta foreignkey
	private String id_consultor;
	private Date fecha_asignacion;
	private float costo;
	private String letra;
	private String hecho_en;
	private String serie;
	//Falta foreignkey
	private Long AAccesorio_id_aaccesorio;
	//Falta foreignkey
	private Long DUsuario_id_dusuario;
	//Falta foreignkey
	private Long DEquipo_id_dequipo;
	//Falta foreignkey
	private Long EstatusRecurso_id_estatus;
	
	
	
	public Long getId_asignacion() {
		return id_asignacion;
	}
	public void setId_asignacion(Long id_asignacion) {
		this.id_asignacion = id_asignacion;
	}
	public String getId_consultor() {
		return id_consultor;
	}
	public void setId_consultor(String id_consultor) {
		this.id_consultor = id_consultor;
	}
	public Date getFecha_asignacion() {
		return fecha_asignacion;
	}
	public void setFecha_asignacion(Date fecha_asignacion) {
		this.fecha_asignacion = fecha_asignacion;
	}
	public float getCosto() {
		return costo;
	}
	public void setCosto(float costo) {
		this.costo = costo;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
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
	public Long getAAccesorio_id_aaccesorio() {
		return AAccesorio_id_aaccesorio;
	}
	public void setAAccesorio_id_aaccesorio(Long aAccesorio_id_aaccesorio) {
		AAccesorio_id_aaccesorio = aAccesorio_id_aaccesorio;
	}
	public Long getDUsuario_id_dusuario() {
		return DUsuario_id_dusuario;
	}
	public void setDUsuario_id_dusuario(Long dUsuario_id_dusuario) {
		DUsuario_id_dusuario = dUsuario_id_dusuario;
	}
	public Long getDEquipo_id_dequipo() {
		return DEquipo_id_dequipo;
	}
	public void setDEquipo_id_dequipo(Long dEquipo_id_dequipo) {
		DEquipo_id_dequipo = dEquipo_id_dequipo;
	}
	public Long getEstatusRecurso_id_estatus() {
		return EstatusRecurso_id_estatus;
	}
	public void setEstatusRecurso_id_estatus(Long estatusRecurso_id_estatus) {
		EstatusRecurso_id_estatus = estatusRecurso_id_estatus;
	}
	
	
	
}
