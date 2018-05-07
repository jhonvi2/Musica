package fp.musica;

import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.Set;


public interface ListaReproduccion{
	String getNombre();

	void setNombre(String nombre);

	Integer getNumeroCanciones();

	void aleatoriza();

	void incorpora(Cancion c);

	void incorpora(List<Cancion> canciones);

	void eliminaPrimera(Cancion c);

	void eliminaUltima(Cancion c);

	void eliminaTrozo(int primeraPosicion, int ultimaPosicion);

	void muestra();
	
	void reproduce();
	
	/**
	 * @param artista
	 *            Nombre del artista
	 * @return Devuelve true si todas las canciones de la lista de reproducción
	 *         son del artista especificado.
	 */
	Boolean esAntologia(String artista);

	/**
	 * @return Devuelve la duración total de la lista de reproducción
	 */
	Duration getDuracion();

	/**
	 * @return Devuelve la duración media de las canciones de la lista de
	 *         reproducción. Si la lista está vacía, devuelve null.
	 */
	Duration getDuracionMedia();

	/**
	 * @param artista
	 *            Nombre del artista
	 * @return Devuelve true si existe alguna canción en la lista de
	 *         reproducción del artista dado como parámetro.
	 */
	Boolean contieneArtista(String artista);

	/**
	 * @param artista
	 *            Nombre del artista
	 * @return Devuelve una nueva lista de reproducción que contenga todas las
	 *         canciones del artista dado como parámetro.
	 */
	ListaReproduccion getSublistaArtista(String artista);

	/**
	 * @param tituloCancion
	 *            Titulo de una canción.
	 * @return Devuelve la posición (índice) que ocupa en la lista de
	 *         reproducción la primera canción cuyo título se especifica. Si la
	 *         canción no está en la lista de reproducción, devuelve -1.
	 * 
	 */
	int getPosicionCancion(String tituloCancion);

	/**
	 * @return Devuelve la canción con mayor duración de la lista de
	 *         reproducción. Si no hay ninguna canción en la lista, devuelve
	 *         null.
	 */
	Cancion getCancionMasLarga();

	/**
	 * @return Devuelve la canción con menor duración de la lista de
	 *         reproducción. Si no hay ninguna canción en la lista, devuelve
	 *         null.
	 */
	Cancion getCancionMasCorta();

	/**
	 * @return Devuelve el conjunto de artistas de la lista de reproducción.
	 */
	Set<Artista> getArtistas();

	/**
	 * Muestra las fotos de los artistas que aparecen en la lista
	 */
	void muestraFotosArtistas();

	/**
		 * @return Devuelve un Map<String,List<Cancion>> en el que las claves son
		 *         nombres de artistas y el valor asociado son las canciones
		 *         interpretadas por dicho artista.
	 */
	Map<String, List<Cancion>> getCancionesPorArtista();

	/**
	 * @return Devuelve un Map<String,Long> en el que las claves son nombres de
	 *         artistas y el valor asociado a cada clave es el número de
	 *         canciones interpretadas por dicho artista.
	 */
	Map<String, Long> getNumeroCancionesPorArtista();

	/**
	 * @return Devuelve un Map<String,Integer> en el que las claves son nombres
	 *         de artistas y el valor asociado a cada clave es el número de
	 *         segundos de duración total de las canciones interpretadas
	 *          por dicho artista.
	 */
	Map<String, Integer> getDuracionTotalPorArtista();
	
	/**
	 * 
	 * @param popularidad Popularidad umbral
	 * @return El número de canciones que tienen una popularidad mayor al umbral
	 */
	Integer getNumCancionesPopularidadMayor(Integer popularidad);
	
	/**
	 * 
	 * @param artista El nombre de un artista.
	 * @return La popularidad media de las canciones de la lista que estén interpretadas por dicho artista. Si no hay canciones de ese artista, lanza NoSuchElementException.
	 */
	Double getPopularidadMedia(String artista);
	
	/**
	 * 
	 * @param palabra Un texto a buscar en el título de las canciones.
	 * @return Una lista de reproducción con las canciones que contengan el texto buscado en su título.
	 */
	ListaReproduccion getSublistaPalabra(String palabra);
	
	/**
	 * 
	 * @return La canción con mayor popularidad. Si la lista está vacía, lanza NoSuchElementException. 
	 */
	Cancion getCancionMasPopular();
	
}