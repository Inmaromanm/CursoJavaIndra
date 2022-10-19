package ejercicioaa9_aerolineas;

import java.util.List;

public class Aerolineas {
	//Iberia
	private String nombre;
	private String oficina;
	private List<Vuelos> listaVuelos;

	public Aerolineas() {
		super();
	}

	public Aerolineas(String nombre, String oficina, List<Vuelos> listaVuelos) {
		super();
		this.nombre = nombre;
		this.oficina = oficina;
		this.listaVuelos = listaVuelos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOficina() {
		return oficina;
	}

	public void setOficina(String oficina) {
		this.oficina = oficina;
	}

	public List<Vuelos> getListaVuelos() {
		return this.listaVuelos;
	}


	@Override
	public String toString() {
		return "Aerolineas" + nombre + ", oficina=" + oficina;
	}


	
	
	
	
}
