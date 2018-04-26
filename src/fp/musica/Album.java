package fp.musica;

import java.util.List;

// BLOQUE 3

public interface Album extends Comparable<Album> {
	/**
	 * @return El tipo de album: ALBUM, SINGLE o COMPILATION
	 */
	TipoAlbum getTipo();

	
	/**
	 * @return Una lista con los int�rpretes de las canciones del �lbum.
	 */
	List<Artista> getInterpretes();

	
	/**
	 * @return Una lista con los g�neros de lso artistas que participan en el �lbum.
	 */
	List<String> getGeneros();

	/**
	 * @return El nombre del album.
	 */
	String getNombre();

	/**
	 * @return Un entero entre 1 y 100 que representa la popularidad del album. 
	 */
	Integer getPopularidad();

	/**
	 * @return Una cadena de 22 caracteres que sirve para identificar de forma �nica al �lbum.
	 */
	String getId();

	/**
	 * @return El a�o en el que se public� el �lbum.
	 */
	Integer getA�oPublicacion();
	
	/**
	 * @return El precio del �lbum en el momento en que se a�adi� a esta base de datos.
	 */
	Double getPrecio();

	/**
	 * @return La lista con las canciones que est�n incluidas en el �lbum.
	 */
	List<Cancion> getCanciones();

	/**
	 * @return El n�mero de canciones que contiene el �lbum.
	 */
	Integer getNumeroCanciones();
	
	
	/**
	 * @return URL de im�gen del �lbum. Debe comenzar por http
	 */
	String getURLImagen();
}
