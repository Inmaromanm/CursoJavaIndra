package com.example.demo;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Usuario implements Interfaz_Usuario {

	private String nombre;
	private String apellido;
	private String nombreUsu;
	private String email;
	private String localidad;
	private String fechaNac;

	public Usuario() {
		super();
	}

	public Usuario(String nombre, String apellido, String nombreUsu, String email, String localidad,
			String fechaNac) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.nombreUsu = nombreUsu;
		this.email = email;
		this.localidad = localidad;
		this.fechaNac = fechaNac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombreUsu() {
		return nombreUsu;
	}

	public void setNombreUsu(String nombreUsu) {
		this.nombreUsu = nombreUsu;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(String fechaNac) {
		this.fechaNac = fechaNac;
	}

	@Override
	public String toString() {
		return "Usuario " + nombre + ", apellido=" + apellido + ", nombreUsu=" + nombreUsu + ", email=" + email
				+ ", localidad=" + localidad + ", fechaNac=" + fechaNac;
	}


	@Override
	public List<String> generar_Usuario() {
		
		Usuario u1 = new Usuario("Juan", "Perez", "juanPer001", "juan21@gmail.com", "Ubeda", "04/03/1983");
		Usuario u2 = new Usuario("Pedro", "Fernandez", "pfernandez", "pedro.rm@gmail.com", "Sevilla", "13/02/1996");
		Usuario u3 = new Usuario("Ana", "Saez", "Anita_222", "ana23-ar@gmail.com", "Jaen", "27/08/1990");
		Usuario u4 = new Usuario("Laura", "Roman", "l_aura_r", "laur-a-rm-ee@gmail.com", "Madrid", "01/12/1999");

		
		List<Usuario> usu = Arrays.asList(u1,u2,u3,u4);
		List<String> lista = new ArrayList<>();
		
		lista.add("Nombre,Apellido,Email,Localidad,Fecha de Nacimiento");

		for(int i=0; i<usu.size(); i++) {
			lista.add(usu.get(i).getNombre()+ "," + usu.get(i).getApellido()+","+
			usu.get(i).getNombreUsu()+","+usu.get(i).getEmail()+","+usu.get(i).getLocalidad()+","+
			usu.get(i).getFechaNac());
		}
		return lista;
	}

	public static List<String> obtenerUsuariostxt(String fich) throws FileNotFoundException{
		
		List<String> listaResult = new ArrayList<>();
		List<String> lista = new ArrayList<>();
		Scanner obj = new Scanner(new File(fich),"UTF-8");
		
		while(obj.hasNextLine()) {
			lista.add(obj.nextLine());
		}
		
		for(int i=1; i<lista.size(); i++) {
			String[] res = lista.get(i).split(",");
			listaResult.add(res[0]);
		}
		
		return listaResult;
		
		
	}
}
