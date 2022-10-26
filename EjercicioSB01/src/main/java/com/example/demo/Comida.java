package com.example.demo;

public class Comida {

	private String comida;
	
	public Comida() {
		this.comida = "Receta tortilla de patatas"
				+ "Ingredientes \r\n"
				+ "Huevos \r\n"
				+ "Patatas\r\n"
				+ "Cebolla\r\n"
				+ "Aceite\r\n"
				+ "Sal \r\n"
				+ "	\r\n"
				+ "Pasos a seguir\r\n"
				+ "1- Poner abundante aceite a calentar en una sartén\r\n"
				+ "2- Cortar las patatas en cuadrados pequeños e igual la cebolla\r\n"
				+ "3- Cuando el aceite esté caliente, freir las patatas y la cebolla\r\n"
				+ "4- Batir los huevos\r\n"
				+ "5- Cuando las patatas y la cebolla estén pochadas, añadirlas a los huevos\r\n"
				+ "6- Echar la mezcla a una sartén caliente y darle varias vueltas hasta llegar al punto que quieran\r\n";

	}

	@Override
	public String toString() {
		return "Comida: " + comida;
	}
	
	
}
