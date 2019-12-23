package com.ska.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "aaccesorio")
public class AAccesorio {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id_aaccesorio;

//falta foreign key
@ManyToOne
@JoinColumn(name="id_accesorio",nullable = false)
@JsonIgnore
private Accesorio accesorio;


public Long getId_aaccesorio() {
	return id_aaccesorio;
}

public void setId_aaccesorio(Long id_aaccesorio) {
	this.id_aaccesorio = id_aaccesorio;
}

public Accesorio getAccesorio() {
	return accesorio;
}

public void setAccesorio(Accesorio accesorio) {
	this.accesorio = accesorio;
}






}
