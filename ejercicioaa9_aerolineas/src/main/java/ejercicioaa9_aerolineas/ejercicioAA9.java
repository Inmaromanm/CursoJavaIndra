package ejercicioaa9_aerolineas;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * EJERCICIO AA9 INTEGRADOR:
Nos contrataron de la empresa aeronautica Iberia para poder estandarizar y sistematizar la información que tienen hoy en día almacenada en archivos planos. 
Cuentan con 4 TXTS para sus viajes principales. 
Ademas de la información que ya contienen los archivos, nos piden generar la siguiente:
- Ganancia neta = Cantidad de pasajes vendidos * 50 (50 euros, valor promedio del pasaje)
- Cantidad de pasajeros que asistieron al vuelo = Cantidad de pasajes vendidos / 2 
- Unificar la salida en un solo TXT llamado "resumenVentas_MesAño"
- Generar (expresado en euros) el TOTAL de ganancia, en la ultima linea del TXT. Ganancia TOTAL = Suma de la ganancia NETA. 
- Implementar controles a traves de AOP ANTES de ejecutar los metodos que generan la ganancia y la cantidad de pasajeros. (Con un simple WARNING alcanza)
- Implementar interfaces para generar el TOTAL de ganancia
- Implementar las siguientes clases: Aerolineas, Vuelos, Vuelos_Aerolineas 
- El archivo de salida FINAL se debe llamar "resumenVentas_MesAño"
- Subir al repositorio de Github
ENTREGABLES:
- Codigo del proyecto
- TXT de salida
 */
public class ejercicioAA9 {

	public static void main(String[] args) throws IOException {
		/*
		 * AnnotationConfigApplicationContext acA = new
		 * AnnotationConfigApplicationContext(configurador_AOP.class); ServicioVuelos
		 * serv = acA.getBean(ServicioVuelos.class); serv.operacion();
		 */

		// Leer archivo barcelona
		Scanner objBarcelona = new Scanner(new File(
				"C:\\Users\\iromanm\\git\\CursoJavaIndra\\ejercicioaa9_aerolineas\\Barcelona.txt"),
				"UTF-8");
		
		List<String> lineaBarcelona = new ArrayList<String>();

		while (objBarcelona.hasNextLine()) {
			lineaBarcelona.add(objBarcelona.nextLine());

		}

		String[] billetesBarcelona = lineaBarcelona.get(1).split(": ");
		String[] diaBarcelona = lineaBarcelona.get(2).split(": ");

		// System.out.println(lineaBarcelona);
		// System.out.println(billetesBarcelona[1]);
		// System.out.println(diaBarcelona[1]);

		Vuelos vBarcelona = new Vuelos(lineaBarcelona.get(0), Integer.valueOf(billetesBarcelona[1]), diaBarcelona[1]);
		System.out.println((vBarcelona));

		// Leer archivo Berlin
		Scanner objBerlin = new Scanner(
				new File(
						"C:\\Users\\iromanm\\git\\CursoJavaIndra\\ejercicioaa9_aerolineas\\Berlin.txt"),
				"UTF-8");

		List<String> lineaBerlin = new ArrayList<String>();

		while (objBerlin.hasNextLine()) {
			lineaBerlin.add(objBerlin.nextLine());

		}

		String[] billetesBerlin = lineaBerlin.get(1).split(": ");
		String[] diaBerlin = lineaBerlin.get(2).split(": ");

		Vuelos vBerlin = new Vuelos(lineaBerlin.get(0), Integer.valueOf(billetesBerlin[1]), diaBerlin[1]);
		System.out.println((vBerlin));
		// Leer archivo BuenosAires
		Scanner objBuenosAires = new Scanner(new File(
				"C:\\Users\\iromanm\\git\\CursoJavaIndra\\ejercicioaa9_aerolineas\\BuenosAires.txt"),
				"UTF-8");

		List<String> lineaBuenosAires = new ArrayList<String>();

		while (objBuenosAires.hasNextLine()) {
			lineaBuenosAires.add(objBuenosAires.nextLine());

		}

		String[] billetesBuenosAires = lineaBuenosAires.get(1).split(": ");
		String[] diaBuenosAires = lineaBuenosAires.get(2).split(": ");

		Vuelos vBuenosAires = new Vuelos(lineaBuenosAires.get(0), Integer.valueOf(billetesBuenosAires[1]),
				diaBuenosAires[1]);
		System.out.println((vBuenosAires));
		// Leer archivo Madrid
		Scanner objMadrid = new Scanner(
				new File(
						"C:\\Users\\iromanm\\git\\CursoJavaIndra\\ejercicioaa9_aerolineas\\Madrid.txt"),
				"UTF-8");

		List<String> lineaMadrid = new ArrayList<String>();

		while (objMadrid.hasNextLine()) {
			lineaMadrid.add(objMadrid.nextLine());

		}

		String[] billetesMadrid = lineaMadrid.get(1).split(": ");
		String[] diaMadrid = lineaMadrid.get(2).split(": ");

		Vuelos vMadrid = new Vuelos(lineaMadrid.get(0), Integer.valueOf(billetesMadrid[1]), diaMadrid[1]);
		System.out.println((vMadrid));
		// Vuelos
		List<Vuelos> vuelos = Arrays.asList(vBarcelona, vBerlin, vBuenosAires, vMadrid);

		Aerolineas aerol = new Aerolineas("Iberia", "Madrid", vuelos);

		List<Integer> ganancias = new ArrayList<Integer>();
		ganancias.add(vBarcelona.ganancia_Neta());
		ganancias.add(vBerlin.ganancia_Neta());
		ganancias.add(vBuenosAires.ganancia_Neta());
		ganancias.add(vMadrid.ganancia_Neta());

		int ganancia_TOTAL = vBarcelona.ganancia_total(ganancias);
		// System.out.println(ganancia_TOTAL);

		List<String> resultado = new ArrayList<String>();
		resultado.add("La aerolinea " + aerol.getNombre() + " con la oficina en " + aerol.getOficina());
		resultado.add("Vuelos para el 19 de Octubre de 2022:");

		for (int i = 0; i < vuelos.size(); i++) {
			resultado.add("Destino: " + vuelos.get(i).getDestino());
			resultado.add("Billetes vendidos: " + vuelos.get(i).getBilletes());
			resultado.add("Día de vuelo: " + vuelos.get(i).getCuando());
			resultado.add("Ganancia neta: " + vuelos.get(i).ganancia_Neta());
			resultado.add("Pasajeros que asistieron al vuelo: " + vuelos.get(i).pasajeros_vuelo() + "\n");

		}
		resultado.add("Total: " + ganancia_TOTAL + "euros");

		// Generar archivo infoPaises.txt
		String nombreArchivo = "resumenVentas_102022.txt";
		try {

			Path archivo = Paths.get(nombreArchivo);
			Files.write(archivo, resultado, StandardCharsets.UTF_8);

		} catch (IOException e) {
			System.out.println("Error");
			e.printStackTrace();
		}

	}

}
