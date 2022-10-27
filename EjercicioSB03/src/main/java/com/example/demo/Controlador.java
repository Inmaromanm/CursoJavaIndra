package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class Controlador {
	
	@GetMapping("index")
	public String index() {
		return "index";
	}
	
	@GetMapping("comidas")
	public String comidas() {
		return "comidas";
	}
	
	@RequestMapping("/recetasDeComida")
	public String generarRecetas(@RequestParam ("nombreIngred") String nombre) {

		if(nombre.equals("cebolla")) {
			Cebolla.generarTXT();
			//Devolvemos la vista
			return "cebolla";
		}else if(nombre.equals("comino")) {
			Comino.generarTXT();
			//Devolvemos la vista
			return "comino";
		}else if(nombre.equals("pasta")) {
			Pasta.generarTXT();
			//Devolvemos la vista
			return "pasta";
		}else if(nombre.equals("zanahoria")) {
			Zanahoria.generarTXT();
			//Devolvemos la vista
			return "zanahoria";
		}else {
			RecetaSana.generarTXT();
			//Devolvemos la vista
			return "recetaSana";
		}
		
	}
	
	

}
