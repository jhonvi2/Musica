package fp.musica.test;

import fp.musica.Album;
import fp.musica.AlbumImpl;
import fp.musica.TipoAlbum;
import fp.utiles.Imagenes;

/* Este test �nicamente prueba la carga de las canciones del �lbum desde un fichero csv */

public class TestAlbum {

	private static final String cancionesCSV = "datos/album.csv";
	
	public static void main(String[] args) {
		System.out.println("Tests del tipo �lbum\n");
		
		test01();
		test02();
		test03();
		test04();
			
	}

	private static void test01() {		
		System.out.println("*********** Prueba 1");
		
		/* TODO: 
		 * 1. Crea un �lbum con las siguientes propiedades:
		 * id: 762310PdDnwsDxAQxzQkfX
		 * nombre: Muse & Radiohead Collection
		 * tipo: TipoAlbum.COMPILATION
		 * url de imagen: https://i.scdn.co/image/0b3c04473aa6a2db8235e5092ec3413f35752b8d
		 * popularidad: 68
		 * a�o de publicaci�n: 2017
		 * precio: 9.90
		 * canciones: las contenidas en el fichero cancionesCSV
		 * 
		 * 2. M�estralo en la consola.
		 * 
		 * 3. Muestra el n�mero de canciones que contiene el �lbum.
		 * 
		 * 4. Muestra la portada del �lbum, usando el m�todo Imagenes.show
		 * 
		 * 5. Muestre en la consola los nombres de los artistas que participan en el �lbum.
		 * 
		 * 6. Muestre en la consola los g�neros que aparecen en el �lbum.
		 */
	}
	
	private static void test02() {		
		System.out.println("*********** Prueba 2");
		
		/* TODO: 
		 * 1. Crea un �lbum con las siguientes propiedades:
		 * id: 7623
		 * nombre: Muse & Radiohead  Collection
		 * tipo: TipoAlbum.COMPILATION
		 * url de imagen: https://i.scdn.co/image/0b3c04473aa6a2db8235e5092ec3413f35752b8d
		 * popularidad: 68
		 * a�o de publicaci�n: 2017
		 * precio: 9.90
		 * canciones: las contenidas en el fichero cancionesCSV
		 * 
		 * 2. Si se crea correctamente, muestra un mensaje indicando que hay un error en la implementaci�n de la restricci�n sobre el id.
		 * 
		 * 3. Si se captura la excepci�n, muestra un mensaje indic�ndolo. 
		 */
		
		System.out.println();
	}
	
	private static void test03() {		
		System.out.println("*********** Prueba 3");
		
		/* TODO: 
		 * 1. Crea un �lbum con las siguientes propiedades:
		 * id: 762310PdDnwsDxAQxzQkfX
		 * nombre: Muse & Radiohead  Collection
		 * tipo: TipoAlbum.COMPILATION
		 * url de imagen: https://i.scdn.co/image/0b3c04473aa6a2db8235e5092ec3413f35752b8d
		 * popularidad: -8
		 * a�o de publicaci�n: 2017
		 * precio: 9.90
		 * canciones: las contenidas en el fichero cancionesCSV
		 * 
		 * 2. Si se crea correctamente, muestra un mensaje indicando que hay un error en la implementaci�n de la restricci�n sobre la popularidad.
		 * 
		 * 3. Si se captura la excepci�n, muestra un mensaje indic�ndolo. 
		 */
		try {
			Album a = new AlbumImpl("762310PdDnwsDxAQxzQkfX", "Muse & Radiohead Collection", TipoAlbum.COMPILATION, -8, 2017, 9.90, "https://i.scdn.co/image/0b3c04473aa6a2db8235e5092ec3413f35752b8d", CANCIONES_CSV);
			System.out.println("Hay un error en la implementaci�n de la restricci�n sobre la popularidad.");
		}
		catch(IllegalArgumentException e) {
			System.out.println("Capturada excepci�n: "+e.getMessage());
		}
		
		System.out.println();
	}
		
		
	
	
	
	private static void test04() {		
		System.out.println("*********** Prueba 4");
		
		/* TODO: 
		 * 1. Crea un �lbum con las siguientes propiedades:
		 * id: 762310PdDnwsDxAQxzQkfX
		 * nombre: Muse & Radiohead  Collection
		 * tipo: TipoAlbum.COMPILATION
		 * url de imagen: 13f35752b8d
		 * popularidad: 68
		 * a�o de publicaci�n: 2017
		 * precio: 9.90
		 * canciones: las contenidas en el fichero cancionesCSV
		 * 
		 * 2. Si se crea correctamente, muestra un mensaje indicando que hay un error en la implementaci�n de la restricci�n sobre la URL de imagen.
		 * 
		 * 3. Si se captura la excepci�n, muestra un mensaje indic�ndolo. 
		 */
		
		System.out.println();
	}
	
}