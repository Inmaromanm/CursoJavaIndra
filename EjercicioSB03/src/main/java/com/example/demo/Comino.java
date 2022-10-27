package com.example.demo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Comino extends Ingrediente implements Interfaz_generarTXT{

	private String color;
	private String sabor;
	private String precio;

	public Comino() {
		super();
	}

	public Comino(String nombre, String color, String sabor, String precio) {
		super(nombre);
		this.color = color;
		this.sabor = sabor;
		this.precio = precio;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Comino color=" + color + ", sabor=" + sabor + ", precio=" + precio;
	}


	public static void generarTXT() {
		String nombreArchivo = "recetaComino.txt";

		String cadena = "Le recomendamos tomar una Ensalada de Comino";
		
		try {

			Path archivo = Paths.get(nombreArchivo);
			Files.writeString(archivo, cadena, StandardCharsets.UTF_8);

		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		
	}

}
