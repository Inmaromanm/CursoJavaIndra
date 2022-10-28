import java.time.LocalDate;
import java.time.Period;

public class Persona implements Interfaz_edad{
	
	private String nombre;
	private LocalDate fechaNac;
	
	public Persona() {
		
	}

	public Persona(String nombre, LocalDate fechaNac) {
		super();
		this.nombre = nombre;
		this.fechaNac = fechaNac;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFechaNac() {
		return fechaNac;
	}

	public void setFechaNac(LocalDate fechaNac) {
		this.fechaNac = fechaNac;
	}

	@Override
	public String toString() {
		return "Persona " + nombre + ", fechaNac=" + fechaNac;
	}

	public Integer calcularEdad() {
			LocalDate hoy = LocalDate.now();
			Period period = Period.between(fechaNac, hoy);
			return period.getYears();
		}	
	

}
