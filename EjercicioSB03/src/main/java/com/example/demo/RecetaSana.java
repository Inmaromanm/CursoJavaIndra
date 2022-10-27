package com.example.demo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class RecetaSana implements Interfaz_generarTXT{


	public static void generarTXT() {
		String nombreArchivo = "recetaSana.txt";

		String cadena = "Le recomendamos tomar una Ensalada de Zanahoria, Comino, Cebolla y palta";
		
		try {

			Path archivo = Paths.get(nombreArchivo);
			Files.writeString(archivo, cadena, StandardCharsets.UTF_8);

		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		
	}

}
