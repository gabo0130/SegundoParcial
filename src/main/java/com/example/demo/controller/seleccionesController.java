package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.seleccion;

@RestController
@RequestMapping("/selecciones")
@CrossOrigin("*")
public class seleccionesController {
	

	@GetMapping("/listarSelecciones")
	private seleccion listaSeleccionByContinente(){
		
		
		return null;
		
	}
}
