package com.example.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
	
	@GetMapping("usuario")
	public String usuario(Model model) throws FileNotFoundException {
		
		List<String> listaUsuarios = Usuario.obtenerUsuariostxt("C:\\Users\\iromanm\\Documents\\workspace-spring-tool-suite-4-4.16.0.RELEASE\\EjercicioSB02\\loginUsuarios.txt");
		model.addAttribute(listaUsuarios);	
		System.out.println(listaUsuarios);
		
		return "usuario";
	}
	
	@RequestMapping("/comprobarUsuario")
    public String procesarUsuario(@RequestParam("nombreU") String nombre, Model model) throws FileNotFoundException {
		
		List<String> listaUsuarios = Usuario.obtenerUsuariostxt("C:\\Users\\iromanm\\Documents\\workspace-spring-tool-suite-4-4.16.0.RELEASE\\EjercicioSB02\\loginUsuarios.txt");
		
		if(listaUsuarios.contains(nombre)) {
			model.addAttribute("comprobar", "El usuario existe");
		}else {
			model.addAttribute("comprobar", "El usuario es nuevo");

		}
		
		return "comprobarUsuario";
		
	}

}
