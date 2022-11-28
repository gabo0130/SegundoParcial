package com.example.demo.entities;

import java.io.Serial;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
@Getter
@Setter
@Table (name="resultado")
public class resultado {

	@Id
	@SequenceGenerator(name="seleccion_id_seq", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Serial id;
	
	@ManyToOne
	@JoinColumn (name="id" , referencedColumnName="id")
	private partido partido;
	
	@ManyToOne
	@JoinColumn (name="id" , referencedColumnName="id")
	private seleccion seleccion;
	
	@Column (name="goles")
	private String goles;
	
	@Column (name="amarillas")
	private String amarillas;
	
	@Column (name="rojas")
	private String rojas;

}
