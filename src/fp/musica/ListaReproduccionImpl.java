package fp.musica;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import fp.utiles.Checkers;
import fp.utiles.Ficheros;
import fp.utiles.Musica;

public class ListaReproduccionImpl implements ListaReproduccion {

	private String nombre;
	private List<Cancion> canciones;
	private static final String R_NOMBRE = "El nombre no puede ser una cadena";

	// C1
	public ListaReproduccionImpl(String nombre) {
		Checkers.check(R_NOMBRE, RestriccionNombre(nombre));
		this.nombre = nombre;
		this.canciones = new ArrayList<>();
	}

	// C2
	public ListaReproduccionImpl(Album a) {
		String nombre = a.getNombre();
		Checkers.check(R_NOMBRE, RestriccionNombre(nombre));
		this.nombre = a.getNombre();
		this.canciones = a.getCanciones();

	}

	// C3
	public ListaReproduccionImpl(String nombre, String fichero) {
		Checkers.check(R_NOMBRE, RestriccionNombre(nombre));
		this.nombre = nombre;
		this.canciones = Ficheros.leeFichero(fichero, CancionImpl::new);// No sabemos hacerlo
	}

	// Restriccion
	private static Boolean RestriccionNombre(String nombre) {
		Boolean res = !nombre.isEmpty();
		return res;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		Checkers.check(R_NOMBRE, RestriccionNombre(nombre));
		this.nombre = nombre;
	}

	public Integer getNumeroCanciones() {
		Integer res = canciones.size();
		return res;
	}

	@Override
	public String toString() {
		return "ListaReproduccionImpl [nombre=" + nombre + ", getNumeroCanciones()=" + getNumeroCanciones() + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((canciones == null) ? 0 : canciones.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ListaReproduccionImpl other = (ListaReproduccionImpl) obj;
		if (canciones == null) {
			if (other.canciones != null)
				return false;
		} else if (!canciones.equals(other.canciones))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	@Override
	public void aleatoriza() {
		Collections.shuffle(canciones);

	}

	@Override
	public void incorpora(Cancion c) {
		canciones.add(c);

	}

	@Override
	public void incorpora(List<Cancion> canciones) {
		this.canciones.addAll(canciones);

	}

	@Override
	public void eliminaPrimera(Cancion c) {
		if (!canciones.contains(c)) {
			throw new IllegalArgumentException();
		}
		canciones.remove(c);

	}

	@Override
	public void eliminaUltima(Cancion c) {
		Checkers.check("La cancion no está en la lista", canciones.contains(c));
		canciones.remove(canciones.lastIndexOf(c));

	}

	@Override
	public void eliminaTrozo(int primeraPosicion, int ultimaPosicion) {
		Checkers.check("Los indices no son validos",
				primeraPosicion >= 0 && ultimaPosicion < getNumeroCanciones() && primeraPosicion <= ultimaPosicion);
		canciones.subList(primeraPosicion, ultimaPosicion + 1).clear();

	}

	@Override
	public void muestra() {
		for (Cancion cancion : canciones) {
			System.out.println(cancion.getNombre() + " - " + cancion.getInterprete().getNombre() + "("
					+ cancion.getDuracionString() + ")");
		}

	}

	@Override
	public void reproduce() {
		for (Cancion cancion : canciones) {
			Musica.reproduceMP3(cancion.getURLPreescucha());

		}

	}

	@Override
	public Boolean esAntologia(String artista) {
		Boolean res = true;
		int i;
		for (i = 0; i < canciones.size(); i++) {
			if (canciones.get(i).getInterprete().getNombre() != artista) {
				res = false;
				break;
			}
		}

		return res;
	}

	@Override
	public Duration getDuracion() {
		Duration duracion = Duration.ZERO;
		for (Cancion cancion : canciones) {
			duracion = duracion.plus(cancion.getDuracion());
		}
		return duracion;

	}

	@Override
	public Duration getDuracionMedia() {
		return null;

	}

	@Override
	public Boolean contieneArtista(String artista) {
		Boolean res = false;
		for (Cancion cancion : canciones) {
			if (cancion.getInterprete().getNombre().equals(artista)) {
				res = true;
				break;
			}
		}
		return res;
	}

	@Override
	public ListaReproduccion getSublistaArtista(String artista) {
		ListaReproduccion subListaArtista = new ListaReproduccionImpl(artista);
		for (Cancion cancion : canciones) {
			if (cancion.getInterprete().getNombre().equals(artista)) {
				subListaArtista.incorpora(cancion);
			}
		}
		return subListaArtista;
	}

	@Override
	public int getPosicionCancion(String tituloCancion) {
		int res = -1;
		for (int i = 0; i < canciones.size(); i++) {
			if (canciones.get(i).getNombre().equals(tituloCancion)) {
				res = i;
				break;
			}
		}
		return res;
	}

	@Override
	public Cancion getCancionMasLarga() {
		Cancion res = null;
		for (Cancion cancion : canciones) {
			if (res == null || cancion.getDuracion().compareTo(res.getDuracion()) > 0) {
				res = cancion;
			}
		}
		return res;
	}

	@Override
	public Cancion getCancionMasCorta() {
		Cancion res = null;
		for (Cancion cancion : canciones) {
			if (res == null || cancion.getDuracion().compareTo(res.getDuracion()) < 0) {
				res = cancion;
			}
		}
		return res;
	}

	@Override
	public Set<Artista> getArtistas() {
		Set<Artista> artistas = new HashSet<>();
		for (Cancion cancion : canciones) {
			artistas.add(cancion.getInterprete());
		}
		return artistas;
	}

	@Override
	public void muestraFotosArtistas() {
		// TODO Auto-generated method stub

	}

	@Override
	public Map<String, List<Cancion>> getCancionesPorArtista() {

		Map<String, List<Cancion>> res = new HashMap<>();
		for (Cancion c : canciones) {
			String nombre = c.getInterprete().getNombre();
			if (!res.containsKey(nombre)) {
				List<Cancion> cancionesTio = new LinkedList<>();
				cancionesTio.add(c);

				res.put(nombre, cancionesTio);
			} else {
				List<Cancion> cancionesTio2 = res.get(nombre);
				cancionesTio2.add(c);
				res.put(nombre, cancionesTio2);

			}
		}
		return res;
	}

	@Override
	public Map<String, Long> getNumeroCancionesPorArtista() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Map<String, Integer> getDuracionTotalPorArtista() {

		Map<String, Integer> res = new HashMap<>();
		for (Cancion c : canciones) {
			String nombre = c.getInterprete().getNombre();
			if (!res.containsKey(nombre)) {
				res.put(nombre, (int) c.getDuracion().getSeconds());
			} else {

				Integer seg = res.get(nombre);
				res.put(nombre, seg + (int) c.getDuracion().getSeconds());
			}
		}
		return res;
	}

	@Override
	public Integer getNumCancionesPopularidadMayor(Integer popularidad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getPopularidadMedia(String artista) {
		Double res = 0.0;
		int i;
		List<Cancion> canciones = getCancionesPorArtista().get(artista);
		for (i = 0; i < canciones.size(); i++) {
			Cancion cancion = canciones.get(i);
			res = res + cancion.getPopularidad();
		}
		return res / canciones.size();
	}

	@Override
	public ListaReproduccion getSublistaPalabra(String palabra) {
		ListaReproduccion res = new ListaReproduccionImpl(palabra);
		for (Cancion cancion : canciones) {
			if (cancion.getNombre().contains(palabra)) {
				res.incorpora(cancion);
			}
		}
		return res;
	}

	@Override
	public Cancion getCancionMasPopular() {
		Cancion res = null;
		if (canciones.isEmpty()) {
			throw new NoSuchElementException();
		}
		for (Cancion cancion : canciones) {
			if (res == null || cancion.getPopularidad().compareTo(res.getPopularidad()) > 0) {
				res = cancion;
			}
		}
		return res;
	}

}