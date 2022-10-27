package com.example.demo;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjercicioSb02Application {

	public static void main(String[] args) throws IOException {
		SpringApplication.run(EjercicioSb02Application.class, args);
	
	
		
		
		Usuario usu = new Usuario();
		
		// Generar archivo
		String nombreArchivo = "loginUsuarios.txt";

		try {

			Path archivo = Paths.get(nombreArchivo);
			Files.write(archivo, usu.generar_Usuario(), StandardCharsets.UTF_8);

		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}
		
		System.out.println(Usuario.obtenerUsuariostxt("C:\\Users\\iromanm\\Documents\\workspace-spring-tool-suite-4-4.16.0.RELEASE\\EjercicioSB02\\loginUsuarios.txt"));
	}

}
