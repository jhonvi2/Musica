package fp.utiles;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ficheros {

	/**
	 * @param path
	 *            Ruta del fichero a leer.
	 * @return Una lista de String en la que cada elemento se corresponde con una de las
	 *         l�neas del fichero leido. El ordinal de la l�nea, por tanto, est�
	 *         relacionado con la posici�n de la l�nea en la lista.
	 */
	public static List<String> leeFichero(String path) {
		List<String> res = null;
		try {
			res = Files.readAllLines(Paths.get(path),StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
			res = new ArrayList<String>();
		}
		return res;
	}

	/**
	 * @param path
	 * 		Ruta del fichero a leer.
	 * @param deString_a_T 
	 * 		Funci�n que permite convertir una cadena a un objeto de tipo T. 
	 *      La cadena se corresponde con una de las l�neas del fichero.
	 * @return Una lista de objetos tipo T creados con la informaci�n incluida en cada una de las
	 *      l�neas del fichero.
	 */
	public static <T> List<T> leeFichero(String path, Function<String, T> deString_a_T) {
		List<T> res = null;
		try {
			res = Files.lines(Paths.get(path),StandardCharsets.UTF_8)
					   .map(deString_a_T)
					   .collect(Collectors.toList());
		} catch (IOException e) {
			e.printStackTrace();
			res = new ArrayList<T>();
		}
		return res;
	}

	/**
	 * @param objetos Stream de objetos que se escriben en el fichero.
	 * @param funcion Funci�n que transforma el objeto en una cadena para escribirla en el fichero.
	 * @param nombreFichero Nombre del fichero en el que se escribe el Stream de objetos
	 * Como efecto lateral se crea un fichero con el nombre dado y la transformaci�n del objeto
	 * en cada linea.
	 */
	public static <T> void escribeFichero(Stream<T> objetos, Function<T, String> funcion, String nombreFichero) {
		List<String> cadenas = objetos
				.map(funcion)
				.collect(Collectors.toList());
		try {
			Files.write(Paths.get(nombreFichero), cadenas, StandardCharsets.UTF_8);
		} catch (IOException e) {
			System.out.println("Error en la escritura del fichero");
		}
	}

	/**
	 * @param objeto Objeto que se quiere escribir en un fichero
	 * @param nombreFichero Nombre y ruta del fichero en el que se va a escribir el objeto.
	 * Como efecto lateral se crea un fichero con la representaci�n como cadena del objeto.
	 */
	public static <T> void escribeFichero(T objeto, String nombreFichero) {
		escribeFichero(Stream.of(objeto), Object::toString, nombreFichero);
	}

	/**
	 * @param objetos Colecci�n de objetos a guardar en el fichero
	 * @param nombreFichero Nombre y ruta del fichero en el que se va a escribir el objeto.
	 * Como efecto lateral se crea un fichero con la representaci�n como cadena de los objetos
	 * de la colecci�n. Cada objeto est� asociado a una linea del fichero.
	 */
	public static <T> void escribeFichero(Collection<T> objetos, String nombreFichero) {
		escribeFichero(objetos.stream(), Object::toString, nombreFichero);
	}

	/**
	 * @param m Map 
	 * @param nombreFichero Nombre y ruta del fichero en el que se van a escribir la entradas de
	 *     la aplicaci�n m.
	 * Como efecto lateral se crea un fichero con la representaci�n como cadena de la clave seguido de 
	 * una flecha y la representaci�n como cadena del valor.
	 *     
	 */
	public static <K, V> void escribeFichero(Map<K, V> m, String nombreFichero) {
		escribeFichero(m.entrySet().stream(), 
				e -> e.getKey().toString() + "-> " + e.getValue().toString(),
				nombreFichero);
	}
	
	/**
	 * @param linea Linea de un fichero CSV, con los datos separados por comas 
	 * @return Una lista de cadenas con cada uno de los datos de la linea de entrada
	 *     
	 */
	public static List<String> procesaLineaCSV(String linea){
		return procesaLineaCSV(linea, ",");
	}
	
	/**
	 * @param linea Linea de un fichero CSV, con los datos separados por comas 
	 * @param sep Separador
	 * @return Una lista de cadenas con cada uno de los datos de la linea de entrada
	 *     
	 */
	public static List<String> procesaLineaCSV(String linea, String sep){
		return Stream.of(linea.split(sep))			// Divide por sep
			     .map(String::trim)
			     .map(s -> s.equals("null")?null:s)	// Transforma las cadenas "null" a valores null
			     .collect(Collectors.toList());		// Obtiene una lista con el resultado
	}
}
