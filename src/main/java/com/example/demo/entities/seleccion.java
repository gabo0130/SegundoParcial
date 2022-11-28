package com.example.demo.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Entity
@Data
public class seleccion {
	@Id
	@SequenceGenerator(name="seleccion_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="categoria_id_seq")
	private Integer id;
	
	private String nombre;
	
	@ManyToOne
	@JoinColumn (name="id" , referencedColumnName="id")
	private continente continente;
	
	@JsonIgnore
	@OneToMany(mappedBy="resultado")
	private List<seleccion> seleccion;
	
}
