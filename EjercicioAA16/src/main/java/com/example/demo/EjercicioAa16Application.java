package com.example.demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EjercicioAa16Application {
	
	public static void main(String[] args) throws IOException {
		SpringApplication.run(EjercicioAa16Application.class, args);
		
		String tiempoActual = null;
		URL url = new URL("https://www.el-tiempo.net/api/json/v2/provincias/41");

		try {
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.connect();
			int tiempoRespuesta = con.getResponseCode();
			if (tiempoRespuesta != 200) {
				throw new RuntimeException("Respuesta de error: " + tiempoRespuesta);
			} else {
				StringBuilder informacionEnString = new StringBuilder();
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext()) {
					informacionEnString.append(sc.nextLine());
				}
				// Tiempo Actual
				String[] texto = informacionEnString.toString().split("today");
				String[] limitTiempoA = texto[1].toString().split("tomorrow");
				tiempoActual = String.valueOf(limitTiempoA[0].toString().replace(":", "").replace("{", "")
						.replace("p", "").replace(",", "").replace("}", "").replace("\"", ""));

			}
			System.out.println(tiempoActual);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		
	}

}
