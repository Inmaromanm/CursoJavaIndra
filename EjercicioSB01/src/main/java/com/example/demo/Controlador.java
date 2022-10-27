package com.example.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

	@GetMapping("index")
	public String index() {
		
		return "index";
	}
	
	@GetMapping("comida")
	public String comida(Model model) {
		
		model.addAttribute("comida", Comida.obtenerComida());
		return "comida";
	}
	
	@GetMapping("clima")
	public String clima(Model model) throws IOException {
		
		model.addAttribute("clima", Clima.obtenerClimaSevilla());		
		return "clima";
	}
	@GetMapping("deportes")
	public String deportes(Model model) {
		
		model.addAttribute("deportes", Deportes.obtenerDeportes());
		return "deportes";
	}
	@GetMapping("economia")
	public String economia(Model model) {
		
		model.addAttribute("economia", Economia.obtenerEconomia());
		return "economia";
	}
	
	@GetMapping("noticias")
	public String noticias(Model model) {
		
		model.addAttribute("noticias", Noticias.obtenerNoticias());
		return "noticias";
	}
	
	@GetMapping("tecnologia")
	public String tecnologia(Model model) {
		
		model.addAttribute("tecnologia", Tecnologia.obtenerTecnologia());
		return "tecnologia";
	}
	
	@GetMapping("/usuario")
	public String usuario(Model model) throws FileNotFoundException {
		List<String> listaUsuarios = Usuario.obtenerUsuariostxt("C:\\Users\\iromanm\\Documents\\workspace-spring-tool-suite-4-4.16.0.RELEASE\\EjercicioSB01\\loginUsuarios.txt");
		model.addAttribute(listaUsuarios);	
		return "usuario";
	}

}
