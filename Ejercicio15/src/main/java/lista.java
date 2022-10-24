import java.util.Set;

public class lista {
	
	Set<Pelicula> peliculas;	
	
	public lista() {
		super();
	}

	public lista(Set<Pelicula> peliculas) {
		super();
		this.peliculas = peliculas;
	}

	public Set<Pelicula> getPeliculas() {
		return this.peliculas;
	}

	@Override
	public String toString() {
		return "lista \n" + peliculas ;
	}

	
	

}
