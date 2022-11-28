package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Data
@Getter
@Setter
@Table (name="continente")
public class continente {

	@Id
	@Column (name="id")
	private Integer id;
	
	@Column (name="nombre")
	private String nombre;
}
