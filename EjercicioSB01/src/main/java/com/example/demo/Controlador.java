package com.example.demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controlador {

	@GetMapping("/index")
	public String index() {
		
		return "index";
	}
	
	@GetMapping("/comida")
	public String comida() {
		
		return "comida";
	}
	
	@GetMapping("/clima")
	public String clima() {
		
		return "clima";
	}
	@GetMapping("/deportes")
	public String deportes() {
		
		return "deportes";
	}
	@GetMapping("/economia")
	public String economia() {
		
		return "economia";
	}
	
	@GetMapping("/noticias")
	public String noticias() {
		
		return "noticias";
	}
	
	@GetMapping("/tecnologia")
	public String tecnologia() {
		
		return "tecnologia";
	}
	
	@GetMapping("/usuario")
	public String usuario() {
		
		return "usuario";
	}
/*	
	@GetMapping(value="/clima", params="tiempo")
	public String clima(@RequestParam String tiempo) throws IOException {
		tiempo = obtenerTiempo();
		return tiempo;
	}
/*	
	public String obtenerTiempo() throws IOException {

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

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return tiempoActual;
	}*/
}
