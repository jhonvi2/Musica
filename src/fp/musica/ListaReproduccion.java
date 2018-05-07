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
	 * @return Devuelve true si todas las canciones de la lista de reproducci�n
	 *         son del artista especificado.
	 */
	Boolean esAntologia(String artista);

	/**
	 * @return Devuelve la duraci�n total de la lista de reproducci�n
	 */
	Duration getDuracion();

	/**
	 * @return Devuelve la duraci�n media de las canciones de la lista de
	 *         reproducci�n. Si la lista est� vac�a, devuelve null.
	 */
	Duration getDuracionMedia();

	/**
	 * @param artista
	 *            Nombre del artista
	 * @return Devuelve true si existe alguna canci�n en la lista de
	 *         reproducci�n del artista dado como par�metro.
	 */
	Boolean contieneArtista(String artista);

	/**
	 * @param artista
	 *            Nombre del artista
	 * @return Devuelve una nueva lista de reproducci�n que contenga todas las
	 *         canciones del artista dado como par�metro.
	 */
	ListaReproduccion getSublistaArtista(String artista);

	/**
	 * @param tituloCancion
	 *            Titulo de una canci�n.
	 * @return Devuelve la posici�n (�ndice) que ocupa en la lista de
	 *         reproducci�n la primera canci�n cuyo t�tulo se especifica. Si la
	 *         canci�n no est� en la lista de reproducci�n, devuelve -1.
	 * 
	 */
	int getPosicionCancion(String tituloCancion);

	/**
	 * @return Devuelve la canci�n con mayor duraci�n de la lista de
	 *         reproducci�n. Si no hay ninguna canci�n en la lista, devuelve
	 *         null.
	 */
	Cancion getCancionMasLarga();

	/**
	 * @return Devuelve la canci�n con menor duraci�n de la lista de
	 *         reproducci�n. Si no hay ninguna canci�n en la lista, devuelve
	 *         null.
	 */
	Cancion getCancionMasCorta();

	/**
	 * @return Devuelve el conjunto de artistas de la lista de reproducci�n.
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
	 *         artistas y el valor asociado a cada clave es el n�mero de
	 *         canciones interpretadas por dicho artista.
	 */
	Map<String, Long> getNumeroCancionesPorArtista();

	/**
	 * @return Devuelve un Map<String,Integer> en el que las claves son nombres
	 *         de artistas y el valor asociado a cada clave es el n�mero de
	 *         segundos de duraci�n total de las canciones interpretadas
	 *          por dicho artista.
	 */
	Map<String, Integer> getDuracionTotalPorArtista();
	
	/**
	 * 
	 * @param popularidad Popularidad umbral
	 * @return El n�mero de canciones que tienen una popularidad mayor al umbral
	 */
	Integer getNumCancionesPopularidadMayor(Integer popularidad);
	
	/**
	 * 
	 * @param artista El nombre de un artista.
	 * @return La popularidad media de las canciones de la lista que est�n interpretadas por dicho artista. Si no hay canciones de ese artista, lanza NoSuchElementException.
	 */
	Double getPopularidadMedia(String artista);
	
	/**
	 * 
	 * @param palabra Un texto a buscar en el t�tulo de las canciones.
	 * @return Una lista de reproducci�n con las canciones que contengan el texto buscado en su t�tulo.
	 */
	ListaReproduccion getSublistaPalabra(String palabra);
	
	/**
	 * 
	 * @return La canci�n con mayor popularidad. Si la lista est� vac�a, lanza NoSuchElementException. 
	 */
	Cancion getCancionMasPopular();
	
}