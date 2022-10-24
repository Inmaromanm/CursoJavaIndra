package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controlador {

	@GetMapping("index")
	public String index() {
		return "index";
	}
	@GetMapping("noticias")
	public String noticias() {
		return "noticias";
	}
	@GetMapping("tecnologia")
	public String tecnologia() {
		return "tecnologia";
	}
	@GetMapping("comida")
	public String comida() {
		return "comida";
	}
	@GetMapping("farandula")
	public String farandula() {
		return "farandula";
	}
	@GetMapping("deportes")
	public String deportes() {
		return "deportes";
	}
	@GetMapping("gamming")
	public String gamming() {
		return "gamming";
	}
	@GetMapping("influencers")
	public String influencers() {
		return "influencers";
	}
	@GetMapping("musica")
	public String musica() {
		return "musica";
	}
	
}
