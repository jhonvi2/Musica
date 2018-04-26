package fp.musica;


//BLOQUE 2

public interface Artista extends Comparable<Artista>{
	/**
	 * @return El id del artista. Es una cadena de 22 car�cteres en base 62
	 */
	String getId();
	
	/**
	 * @return El nombre del artista.
	 */
	String getNombre(); 
	
	/**
	 * @return G�nero musical del artisa.
	 */
	String getGenero(); 
	
	/**
	 * @return La popularidad del artista como un entero entre 1 y 100.
	 */
	Integer getPopularidad();
	
	/**
	 * @return URL de una imagen del artista.
	 */
	String getURLImagen(); 
	
	/**
	 * @param urlImagenes Nueva URL de una im�genes del artista. Debe comenzar por http.
	 * @throws IllegalArgumentException Si la url no comienza por http
	 */
	void setURLImagen(String urlImagen);
	
	/**
	 * @param popularidad
	 *            Nueva popularidad del artista. Debe estar entre 1 y 100.
	 * @throws IllegalArgumentException
	 *             si el par�metro popularidad no est� entre 1 y 100.
	 */
	void setPopularidad(Integer popularidad);
}
