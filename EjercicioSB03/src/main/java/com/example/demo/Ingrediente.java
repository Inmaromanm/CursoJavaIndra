package com.example.demo;

public class Ingrediente {
	
	private String nombre;
	
	public Ingrediente() {
		
	}
	
	public Ingrediente(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Ingrediente " + nombre;
	}
	
	

}
