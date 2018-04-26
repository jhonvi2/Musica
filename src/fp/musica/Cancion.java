package fp.musica;

import java.time.Duration;

//BLOQUE 2

public interface Cancion extends Comparable<Cancion> {
	/**
	 * @return Una cadena que se usar� como identificador �nico de una canci�n.
	 *         La cadena est� formada por 22 car�cteres en base 62.
	 */
	String getId();

	/**
	 * @return El artista que interpreta la canci�n.
	 */
	Artista getInterprete();

	/**
	 * @return La duraci�n de la canci�n. Debe ser mayor que cero.
	 */
	Duration getDuracion();

	/**
	 * @return La duraci�n de la canci�n, en formato mm:ss. 
	 */
	String getDuracionString();
	
	/**
	 * @return El nombre de la canci�n.
	 */
	String getNombre();

	/**
	 * @return Un n�mero entero entre 1 y 100 que representa la popularidad de
	 *         la canci�n.
	 */
	Integer getPopularidad();

	/**
	 * @param popularidad
	 *            Nueva popularidad de la canci�n. Debe estar entre 1 y 100.
	 * @throws IllegalArgumentException,
	 *             si el par�metro popularidad no est� entre 1 y 100.
	 */
	void setPopularidad(Integer popularidad);

	/**
	 * @return Direcci�n web en formato URL para poder hacer una preescucha de
	 *         la canci�n. Comienza por http.
	 */
	String getURLPreescucha();
	
	/**
	 * Devuelve un resumen en texto de la canci�n, formado por el t�tulo, el nombre del artista y la duraci�n en formato mm:ss. 
	 * Por ejemplo: "Dressed In Black - Depeche Mode (04:09)"
	 * @return Un resumen en texto de la canci�n
	 */
	String getResumenCancion();
}
