import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ejercicioaa7 {

	public static List<String> crearCiudad(URL url) throws IOException {

		String nombre = null;
		String tiempo = null;

		try {
			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			con.setRequestMethod("GET");
			con.connect();
			int tiempoRespuesta = con.getResponseCode();

			if (tiempoRespuesta != 200) {
				throw new RuntimeException("Respuesta de error: " + tiempoRespuesta);
			} else {

				StringBuilder informacionEnString = new StringBuilder();
				Scanner sc = new Scanner(url.openStream());
				while (sc.hasNext()) {
					informacionEnString.append(sc.nextLine());
				}
				// nombre
				String[] provincias = informacionEnString.toString().split("NOMBRE_PROVINCIA");
				String[] limitprov = provincias[1].toString().split("CODAUTON");
				nombre = String.valueOf(
						limitprov[0].toString().replace("\"", "").replace(":", "").replace(",", "").replace("}", ""));

				// Tiempo Mañana
				String[] texto = informacionEnString.toString().split("tomorrow");
				String[] limitTiempo = texto[1].toString().split("ciudades");
				tiempo = String.valueOf(limitTiempo[0].toString().replace(":", "").replace("{", "").replace("p", "")
						.replace(",", "").replace("}", "").replace("\"", ""));

				sc.close();
				System.out.println(nombre);
				System.out.println(tiempo);
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		List<String> lista = Arrays.asList(nombre, tiempo);
		return lista;
	}

	public static void main(String[] args) throws IOException {

		URL url = new URL("https://www.el-tiempo.net/api/json/v2/provincias/41");
		List<String> ciudad = crearCiudad(url);

		String codigoGroovy = "pipeline{ \n" + 
					 " "  + " " + " " + " " + "agent any \n" +
					 " "  + " " + " " + " "+ "stages{ \n" + 
					 " "  + " " + " " + " "+" "  + " " + " " + " "+ "stage('TiempoSevilla'){ \n"+
					 " "  + " " + " " + " "+" "  + " " + " " + " "+" "  + " " + " " + " "+ "steps{ \n"  + 
					 " " + " " + " " + " "  + " " + " " + " "+" "  + " " + " " + " "+" "  + " " + " " + " "+ "El tiempo en "+ciudad.get(0)+" para manana es: " + ciudad.get(1) +"\n"+
					 " "  + " " + " " + " "+" "  + " " + " " + " "+" "  + " " + " " + " "+"} \n"+
					 " "  + " " + " " + " "+" "  + " " + " " + " "+"} \n"+ 
					 " "  + " " + " " + " "+"} \n"+
					 "} \n";
		String nombreArchivo = "jenkinsFile.txt";
		try {

			Path archivo = Paths.get(nombreArchivo);
			Files.writeString(archivo, codigoGroovy, StandardCharsets.UTF_8);
		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}

	}

}
