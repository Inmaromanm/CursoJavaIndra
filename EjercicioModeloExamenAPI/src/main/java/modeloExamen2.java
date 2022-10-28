import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class modeloExamen2 {

	public static void main(String[] args) throws IOException {

		URL url = new URL("https://rickandmortyapi.com/api/character");
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
			sc.close();
			String[] info = informacionEnString.toString().split("id");
			List<String> cadena = new ArrayList<String>();
			for (int i = 1; i < info.length; i++) {
				String[] personajes = info[i].split("\"");				
				cadena.add("ID: " + i+" Nombre: "+ personajes[4]+" Status: "+ personajes[8]+
						" Species "+ personajes[12]+ " Type: "+personajes[16] + " Gander "+personajes[20]+
						" origin-> Name "+ personajes[26]+ 
						" origin -> URL " + personajes[30]);
			}

			// Generar archivo
			String nombreArchivo = "personajes_Rick&Morty.txt";

			try {

				Path archivo = Paths.get(nombreArchivo);
				Files.write(archivo, cadena, StandardCharsets.UTF_8);
			} catch (IOException e) {
				System.out.println("Error");
				e.printStackTrace();
			}

		}
	}
}
