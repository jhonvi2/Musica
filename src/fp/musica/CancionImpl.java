package fp.musica;

import java.time.Duration;

import fp.utiles.Checkers;

public class CancionImpl implements Cancion {
	// Propiedades
	private String id, url, nombre;
	private Integer popularidad;
	private Artista interprete;
	private Duration duracion;
	private static final String R_ID = "La id debe tener 22 caracteres";
	private static final String R_POPULARIDAD = "La popularidad tiene que estar entre 1 y 100";
	private static final String R_URL = "La URL debe comenzar por http.";
	private static final String R_DURACION = "La duracion debe ser positiva";

	// Constructor1
	public CancionImpl(String id, String nombre, String url, Integer popularidad, Artista Interprete, Duration duracion,
			Artista interprete) {

		Checkers.check(R_ID, restriccionId(id));
		Checkers.check(R_POPULARIDAD, restriccionPopularidad(popularidad));
		Checkers.check(R_URL, restriccionURL(url));
		Checkers.check(R_DURACION, restriccionDuracion(duracion));
		this.id = id;
		this.duracion = duracion;
		this.url = url;
		this.popularidad = popularidad;
		this.interprete = interprete;
		this.nombre = nombre;
	}

	private Boolean restriccionId(String id) {
		return id.length() == 22;
	}

	private Boolean restriccionURL(String urlImagen) {
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

	private Boolean restriccionDuracion(Duration duracion) {
		boolean res = true;
		if (!(duracion.getNano() > 0)) {
			res = false;
		}
		return res;
	}

	// Constructor2
	public CancionImpl(String s) {
		String[] trozos = s.split(";");
		if (trozos.length != 6)
			throw new IllegalArgumentException("La linea debe contener 7 elementos");

		String id = trozos[0].trim();
		Integer popularidad = new Integer(trozos[2].trim());
		String urlImagen = trozos[4].trim();
		String nombre = trozos[1].trim();
		Artista interprete = new ArtistaImpl(trozos[3].trim());
		Duration duracion = Duration.ofSeconds(new Integer(trozos[5].trim()));

		Checkers.check(R_ID, restriccionId(id));
		Checkers.check(R_POPULARIDAD, restriccionPopularidad(popularidad));
		Checkers.check(R_URL, restriccionURL(urlImagen));

		this.id = id;
		this.duracion = duracion;
		this.url = urlImagen;
		this.popularidad = popularidad;
		this.interprete = interprete;
		this.nombre = nombre;

	}

	public String getId() {
		return this.id;
	}

	public String getNombre() {
		return this.nombre;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		CancionImpl other = (CancionImpl) obj;

		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Artista getInterprete() {
		return this.interprete;
	}

	public Duration getDuracion() {
		return this.duracion;
	}

	public String getDuracionString() {
		long segundos = getDuracion().getSeconds();
		String res = String.format("&02d:%02d", segundos / 6, segundos % 60);
		return res;
	}

	public String getResumenCancion() {
		String res = this.getNombre() + " - " + this.getInterprete().getNombre() + " (" + this.getDuracionString()
				+ ")";
		return res;
	}

	public int compareTo(Cancion c) {
		return this.getId().compareTo(c.getId());
	}


	@Override
	public Integer getPopularidad() {
		return this.popularidad;
	}

	@Override
	public void setPopularidad(Integer popularidad) {
			Checkers.checkNoNull(popularidad);
			Checkers.check("La popularidad tiene que estar entre 1 y 100", restriccionPopularidad(popularidad));
			this.popularidad = popularidad;
		}

	  

	@Override
	public String getURLPreescucha() {
		return this.url;
	}
	
}

