import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

/*
 * EJERCICIO 15
	ENUNCIADO: 
	Desarrollar un programa que genere un archivo de salida (.txt) en formato JSON de la siguiente información: 
	Top 10 de peliculas historicas y su recaudación
	LINK con la info: https://www.boxofficemojo.com/chart/ww_top_lifetime_gross/?area=XWW&ref_=bo_cso_ac
	(!) Tomar todas las columnas menos las porcentuales. (!)
	OPCIONAL:
	- Generar un txt de input que tenga la información de las peliculas
	ESTRUCTURA DEL PROGRAMA:
	- Utilizar composición para la clase Pelicula con sus atributos y luego aplicarla en otra clase
	  para que sea parte del formato del TXT de salida.
	- El archivo de salida se debe llamar "informaciónPeliculas"
	- Subir el codigo del proyecto y el txt generado al repositorio de Github (rama de Desarrollo)
 */
public class ejercicio15 {

	public static List<String> generarArchivo(JSONObject obj) {

		List<String> lista = new ArrayList<String>();

		lista.add(obj.toString());

		return lista;

	}

	public static void main(String[] args) {

		Pelicula p1 = new Pelicula(1, "Avatar", "$2,920,357,254", "$784,744,482", "$2,135,612,772", 2009);
		Pelicula p2 = new Pelicula(2, "Avengers: Endgame", "$2,797,501,328", "$858,373,000", "$1,939,128,328", 2019);
		Pelicula p3 = new Pelicula(3, "Titanic", "$2,201,647,264", "$659,363,944", "$1,542,283,320", 1997);
		Pelicula p4 = new Pelicula(4, "Star Wars: Episode VII - The Force Awakens", "$2,069,521,700", "$936,662,225",
				"$1,132,859,475", 2015);
		Pelicula p5 = new Pelicula(5, "Avengers: Infinity War", "$2,048,359,754", "$678,815,482", "$1,369,544,272",
				2018);
		Pelicula p6 = new Pelicula(6, "Spider-Man: No Way Home", "$1,916,050,911", "$814,115,070", "$1,101,935,841",
				2021);
		Pelicula p7 = new Pelicula(7, "Jurassic World", "$1,671,537,444", "$653,406,625", "$1,018,130,819", 2015);
		Pelicula p8 = new Pelicula(8, "The Lion King", "$1,663,250,487", "$543,638,043", "$1,119,612,444", 2019);
		Pelicula p9 = new Pelicula(9, "The Avengers", "$1,518,815,515", "$623,357,910", "$895,457,605", 2012);
		Pelicula p10 = new Pelicula(10, "Furious 7", "$1,515,341,399", "$353,007,020", "$1,162,334,379", 2015);

		Set<Pelicula> peliculas = new HashSet<Pelicula>();
		peliculas.add(p1);
		peliculas.add(p2);
		peliculas.add(p3);
		peliculas.add(p4);
		peliculas.add(p5);
		peliculas.add(p6);
		peliculas.add(p7);
		peliculas.add(p8);
		peliculas.add(p9);
		peliculas.add(p10);

		lista lis = new lista(peliculas);

		System.out.println(lis);

		JSONObject obj = new JSONObject(peliculas);
		obj.put("Peliculas", peliculas);
		// JSONArray info = obj.getJSONArray("");

		System.out.println(obj.toString());

		// Generar archivo
		String nombreArchivo = "informacionPeliculas.txt";

		try {

			Path archivo = Paths.get(nombreArchivo);
			Files.write(archivo, generarArchivo(obj), StandardCharsets.UTF_8);

		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}

	}

}
