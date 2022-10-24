package com.example.demo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjercicioAA15Application {

	public static void main(String[] args) {
		SpringApplication.run(EjercicioAA15Application.class, args);

		Usuario usu = new Usuario();
		
		// Generar archivo
		String nombreArchivo = "Usuarios.txt";

		try {

			Path archivo = Paths.get(nombreArchivo);
			Files.write(archivo, usu.generar_Usuario(), StandardCharsets.UTF_8);

		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}

	}

}
