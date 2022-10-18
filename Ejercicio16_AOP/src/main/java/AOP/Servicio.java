package AOP;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import org.springframework.stereotype.Service;

@Service
public class Servicio {

	private LocalDate fecha;
	private LocalTime hora;

	public Servicio() {
		super();
	}

	public void operacion() throws IOException {
		System.out.println("El programa funcionó correctamente");

		fecha = LocalDate.now();
		hora = LocalTime.now();
		System.out.println(fecha + " " + hora);
		
		URL url = new URL("https://www.el-tiempo.net/api/json/v2/provincias/08");
		String nom = "";
		String tiempoActual = "";
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
				// Tiempo Actual
				String[] texto = informacionEnString.toString().split("today");
				String[] limitTiempoA = texto[1].toString().split("tomorrow");
				tiempoActual = String.valueOf(limitTiempoA[0].toString().replace("\"p\":", ""));
				
				String[] provincias = informacionEnString.toString().split("NOMBRE_PROVINCIA");
				String[] limitprov = provincias[1].toString().split("CODAUTON");
				nom = String.valueOf(
						limitprov[0].toString().replace("\"", "").replace(":", "").replace(",", "").replace("}", ""));	

			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		System.out.println("Ciudad: "+ nom +"\n"+ "Tiempo: "+ tiempoActual);
	}



}
