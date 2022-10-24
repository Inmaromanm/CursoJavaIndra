package com.example.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Usuario implements Interfaz_Usuario {

	private String nombre;
	private String email;
	private String password;

	public Usuario() {
		super();
	}

	public Usuario(String nombre, String email, String password) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.password = password;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario " + nombre + ", email=" + email + ", password=" + password;
	}

	@Override
	public List<String> generar_Usuario() {
		
		Usuario u1 = new Usuario("Juan", "juan21@gmail.com", "123456");
		Usuario u2 = new Usuario("Pedro", "pedro.rm@gmail.com", "Jumsjni");
		Usuario u3 = new Usuario("Ana", "ana23-ar@gmail.com", "ffffff");
		Usuario u4 = new Usuario("Laura", "laur-a-rm-ee@gmail.com", "ee444445t");
		Usuario u5 = new Usuario("Fran", "f_risco988@gmail.com", "hhhhhhhh");
		
		List<Usuario> usu = Arrays.asList(u1,u2,u3,u4,u5);
		List<String> lista = new ArrayList<>();
		
		for(int i=0; i<usu.size(); i++) {
			lista.add("Usuario -> "+ i);
			lista.add(usu.get(i).getNombre());
			lista.add(usu.get(i).getEmail());
		}
		return lista;
	}

}
