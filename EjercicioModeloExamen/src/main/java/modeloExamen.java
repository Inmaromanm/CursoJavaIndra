import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class modeloExamen {

	public static void main(String[] args) throws IOException {

		// Leemos el archivo
		Scanner obj = new Scanner(
				new File("C:\\Users\\iromanm\\Documents\\EjerciciosJava\\ModeloExamen\\informacionPacientes.txt"),
				"UTF-8");
		List<String> info = new ArrayList<>();
		List<String> cadena = new ArrayList<>();

		while (obj.hasNextLine()) {
			if (!info.contains(obj.nextLine())) {
				info.add(obj.nextLine());
			}
		}

		int i = 0;
		System.out.println(info.size());
		while (i < info.size()) {
			String[] nombre = info.get(i).split(",");
			LocalDate fN = LocalDate.parse(nombre[1].replace("/", "-"), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
			Paciente p = new Paciente(nombre[0].replace("@", "").replace("!", ""), fN, 0, nombre[2], nombre[3],
					Integer.parseInt(nombre[4]), nombre[5]);

			cadena.add(p.toString());

			System.out.println(p);
			i++;
		}

		// Generar archivo
		String nombreArchivo = "pacientesEstado.txt";

		try {

			Path archivo = Paths.get(nombreArchivo);
			Files.write(archivo, cadena, StandardCharsets.UTF_8);

		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}

	}

}
