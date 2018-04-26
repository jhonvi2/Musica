package fp.musica;

import fp.utiles.Checkers;

public class ArtistaImpl implements Artista {
	// Propiedades
	private String id, nombre, genero, urlImagen;
	private Integer popularidad;
	private static final String R_ID = "La id debe tener 22 caracteres";
	private static final String R_POPULARIDAD = "La popularidad tiene que estar entre 1 y 100";
	private static final String R_URL = "La URL debe comenzar por http.";

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((genero == null) ? 0 : genero.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((popularidad == null) ? 0 : popularidad.hashCode());
		result = prime * result + ((urlImagen == null) ? 0 : urlImagen.hashCode());
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
		ArtistaImpl other = (ArtistaImpl) obj;
		if (genero == null) {
			if (other.genero != null)
				return false;
		} else if (!genero.equals(other.genero))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (popularidad == null) {
			if (other.popularidad != null)
				return false;
		} else if (!popularidad.equals(other.popularidad))
			return false;
		if (urlImagen == null) {
			if (other.urlImagen != null)
				return false;
		} else if (!urlImagen.equals(other.urlImagen))
			return false;
		return true;
	}

	// Constructor1
	public ArtistaImpl(String id, String nombre, Integer popularidad, String genero, String urlImagen) {
		// if (id.length() != 22) {
		// throw new IllegalArgumentException(R_ID);
		{
			// if (!(1 <= popularidad && popularidad<= 100)) {
			// throw new IllegalArgumentException(popularidad)

			// if(!(urlImagen.startsWith ("http")) {
			// throw new IllegalArgumentException(R_URL)

			// Checkers.check(R_ID, id.length() == 22);
			// Checkers.check(R_URL,
			Checkers.check(R_ID, restriccionId(id));
			Checkers.check(R_POPULARIDAD, restriccionPopularidad(popularidad));
			Checkers.check(R_URL, restriccionUrl(urlImagen));
			this.id = id;
			this.nombre = nombre;
			this.genero = genero;
			this.urlImagen = urlImagen;
			this.popularidad = popularidad;
		}
	}

	private Boolean restriccionId(String id) {
		return id.length() == 22;
	}

	private Boolean restriccionUrl(String urlImagen) {
		boolean res = true;
		if (!(urlImagen.startsWith("http"))) {
			res = false;
		}
		return res;
	}

	private Boolean restriccionPopularidad(Integer popularidad) {
		boolean res = true;
		if (!(1 <= popularidad && popularidad <= 100)) {
			res = false;

		}
		return res;
	}

	// constructor 2
	public ArtistaImpl(String s) {
		// List<Sring> trozos = Ficheros.procesaLineaCSV(s, "#");
		String[] trozos = s.split("#");
		if (trozos.length != 5) {
			throw new IllegalArgumentException("La linea debe tener 5 elementos");
		}

		String id = trozos[0].trim();
		Integer popularidad = new Integer(trozos[2].trim());
		String urlImagen = trozos[4].trim();
		String nombre = trozos[1].trim();
		String genero = trozos[3].trim();

		this.id = id;
		this.popularidad = popularidad;
		this.urlImagen = urlImagen;
		this.nombre = nombre;
		this.genero = genero;
	}

	public String getnombre() {
		return nombre;
	}

	public String getGenero() {
		return genero;
	}

	public String geturlImagen() {
		return urlImagen;
	}

	public Integer getPopularidad() {
		return popularidad;
	}

	public void setPopularidad(Integer popularidad) {
		Checkers.check(R_POPULARIDAD, restriccionPopularidad(popularidad));
		this.popularidad = popularidad;
	}

	@Override
	public int compareTo(Artista o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getURLImagen() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setURLImagen(String urlImagen) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "ArtistaImpl [id=" + id + ", nombre=" + nombre + ", genero=" + genero + ", urlImagen=" + urlImagen
				+ ", popularidad=" + popularidad + "]";
	}
}
