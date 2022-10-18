
public class Ciudad {
	
	private String nombre;
	private String tiempoManana;
	public Ciudad() {
		super();
	}
	public Ciudad(String nombre, String tiempoManana) {
		super();
		this.nombre = nombre;
		this.tiempoManana = tiempoManana;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTiempoManana() {
		return tiempoManana;
	}
	public void setTiempoManana(String tiempoManana) {
		this.tiempoManana = tiempoManana;
	}
	@Override
	public String toString() {
		return "Ciudad" + nombre + ", tiempoMañana=" + tiempoManana;
	}
	
	

}
