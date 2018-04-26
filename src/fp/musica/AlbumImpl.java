package fp.musica;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import fp.utiles.Checkers;

public class AlbumImpl implements Album {
	// Propiedades
	private TipoAlbum tipo;
	private List<Cancion> canciones;
	private String id, nombre;
	private Integer añoPublicacion;
	private Integer population;
	// private Integer numeroCanciones;(no es una propiedad basica)
	// private List<Aritsta> interpretes;(no es propiedad basica)
	private Double precio;
	private String uRL;
	private static final String R_ID = "El id debe tener 22 caracteres";
	private static final String R_POPULARIDAD = "La popularidad debe estar entre 1 y 100";
	private static final String R_uRL = "La URL debe comenzar por http";
	private static final String R_PRECIO = "El precio no puede ser 0 euros";

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((añoPublicacion == null) ? 0 : añoPublicacion.hashCode());
		result = prime * result + ((canciones == null) ? 0 : canciones.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		AlbumImpl other = (AlbumImpl) obj;
		if (añoPublicacion == null) {
			if (other.añoPublicacion != null)
				return false;
		} else if (!añoPublicacion.equals(other.añoPublicacion))
			return false;
		if (canciones == null) {
			if (other.canciones != null)
				return false;
		} else if (!canciones.equals(other.canciones))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (tipo != other.tipo)
			return false;
		return true;
	}
	// Constructor 1

	public AlbumImpl(String id, String nombre, TipoAlbum tipo, Integer population, List<Cancion> canciones,
			Integer añoPublicacion, Double precio, String uRL) {
		this.id = id;
		this.nombre = nombre;
		this.tipo = tipo;
		this.population = population;
		this.canciones = canciones;
		this.añoPublicacion = añoPublicacion;
		this.precio = precio;
		this.uRL = uRL;
		Checkers.check(R_ID, id.length() == 22);
		Checkers.check(R_POPULARIDAD, 1 <= population && population <= 100);
		Checkers.check(R_PRECIO, precio >= 0);
		Checkers.check(R_uRL, uRL.startsWith("http"));
	}


	@Override
	public int compareTo(Album album) {
		int res = this.getId().compareTo(album.getId());

		return res;
	}

	@Override
	public TipoAlbum getTipo() {
		return tipo;
	}

	@Override
	public List<Artista> getInterpretes() {
		List<Artista> res = new ArrayList<>();
		for (Cancion c : getCanciones()) {
			res.add(c.getInterprete());
		}
		return res;
	}

	@Override
	public String toString() {
		return "AlbumImpl [tipo=" + tipo + ", canciones=" + canciones + ", id=" + id + ", nombre=" + nombre
				+ ", añoPublicacion=" + añoPublicacion + ", population=" + population + ", precio=" + precio + ", uRL="
				+ uRL + "]";
	}

	public Set<Artista> getInterpretesComoDeberiaSer() {
		Set<Artista> res = new HashSet<>();
		for (Cancion c : getCanciones()) {
			res.add(c.getInterprete());
		}

		return res;
	}

	@Override
	public List<String> getGeneros() {

		List<String> res = new ArrayList<>();
		for (Cancion c : getCanciones()) {
			res.add(c.getInterprete().getGenero());
		}
		return res;
	}

	public List<String> getGeneros2() {
		List<String> res = new ArrayList<>();
		int i;
		for (i = 0; i < res.size(); i++) {
			Cancion c = getCanciones().get(i);
			res.add(c.getInterprete().getGenero());

		}
		return res;
	}
//For clasico jose;
//	public List<String> getGeneros3() {
//		List<String> res = new ArrayList<>();
//		int i;
//		for (i = 0; i < res.size(); i++) {
//			Artista a = getInterpretes().get(i);
//			res.add(a.getGenero());

//		}
//		return res;
//	}

	@Override
	public String getNombre() {
		return this.nombre;
	}

	@Override
	public Integer getPopularidad() {
		return this.population;
	}

	@Override
	public String getId() {
		return this.id;
	}

	public Integer getAñoPublicacion() {

		return this.añoPublicacion;
	}

	@Override
	public Double getPrecio() {
		return this.precio;
	}

	@Override
	public List<Cancion> getCanciones() {
		return this.canciones;
	}

	@Override
	public Integer getNumeroCanciones() {

		return getCanciones().size();
	}

	@Override
	public String getURLImagen() {
		
		return this.uRL;
	}

}
