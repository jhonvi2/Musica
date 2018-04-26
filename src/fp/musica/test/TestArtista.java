package fp.musica.test;

import fp.musica.Artista;
import fp.musica.ArtistaImpl;

public class TestArtista {

	public static void main(String[] args) {
		System.out.println("Tests del tipo Artista\n");
		test01();
		test02();
		test03();
		test04();
		test05("762310PdDnwsDxAQxzQkfX#Depeche Mode#72#dance rock#https://i.scdn.co/image/2ec1d1c7a48df4244f0ba708eafd28b7afa6166b");
		// ID incorrecto, debe lanzar excepci�n
		test05("76231X#Depeche Mode#72#dance rock#https://i.scdn.co/image/2ec1d1c7a48df4244f0ba708eafd28b7afa6166b");
		// Popularidad incorrecta, debe lanzar excepci�n
		test05("762310PdDnwsDxAQxzQkfX#Depeche Mode#720#dance rock#https://i.scdn.co/image/2ec1d1c7a48df4244f0ba708eafd28b7afa6166b");
		// URL de imagen incorrecta, debe lanzar excepci�n
		test05("762310PdDnwsDxAQxzQkfX#Depeche Mode#72#dance rock#i.scdn.co/image/2ec1d1c7a48df4244f0ba708eafd28b7afa6166b");
		test06();
		test07();
		test08();
		test09();
	}

	private static void test01() {
		System.out.println("*********** Prueba 1");

		/*
		 * TODO: 1. Crea un objeto de tipo Artista con estos valores en sus propiedades:
		 * id: 762310PdDnwsDxAQxzQkfX nombre: Depeche Mode popularidad: 72 g�nero: dance
		 * rock url de imagen:
		 * https://i.scdn.co/image/2ec1d1c7a48df4244f0ba708eafd28b7afa6166b
		 * 
		 * 2. M�estralo en la consola.
		 * 
		 * 
		 */

		{

			Artista a = new ArtistaImpl("762310PdDnwsDxAQxzQkfX", "Depeche Mode", 72, " dance rock",
					"https://i.scdn.co/image/2ec1d1c7a48df4244f0ba708eafd28b7afa6166b");
			System.out.println(a);
		}
	}

	private static void test02() {
		System.out.println("*********** Prueba 2");

		/*
		 * TODO: 1. Crea un objeto de tipo Artista con estos valores en sus propiedades:
		 * id: 7623 nombre: Depeche Mode popularidad: 72 g�nero: dance rock url de
		 * imagen: https://i.scdn.co/image/2ec1d1c7a48df4244f0ba708eafd28b7afa6166b
		 * 
		 * 2. Si se crea correctamente, muestra un mensaje indicando que hay un error en
		 * la implementaci�n de la restricci�n sobre el id.
		 * 
		 * 3. Si se captura la excepci�n, muestra un mensaje indic�ndolo.
		 */
		Artista a = null;
		try {
			a = new ArtistaImpl("7623", "Depeche Mode",72,"dance rock","https://i.scdn.co/image/2ec1d1c7a48df4244f0ba708eafd28b7afa6166b");
		} catch (Exception e) {
			System.out.println("Se ha capturado una excepcion" + e.getMessage());
		}
		System.out.println(a);
		System.out.println();

	}

	private static void test03() {
		System.out.println("*********** Prueba 3");

		/*
		 * TODO: 1. Crea un objeto de tipo Artista con estos valores en sus propiedades:
		 * id: 762310PdDnwsDxAQxzQkfX nombre: Depeche Mode popularidad: 134 g�nero:
		 * dance rock url de imagen:
		 * https://i.scdn.co/image/2ec1d1c7a48df4244f0ba708eafd28b7afa6166b
		 * 
		 * 2. Si se crea correctamente, muestra un mensaje indicando que hay un error en
		 * la implementaci�n de la restricci�n sobre la popularidad.
		 * 
		 * 3. Si se captura la excepci�n, muestra un mensaje indic�ndolo.
		 */
		Artista a = null;
		try {
		 a = new ArtistaImpl("762310PdDnwsDxAQxzQkfX", "Depeche mode",134, "dance rock",
				"https://i.scdn.co/image/2ec1d1c7a48df4244f0ba708eafd28b7afa6166b");}
		catch(Exception e) {
			System.out.println("Se ha capturado una excepcion");
		}
		System.out.println(a);
	}

	private static void test04() {
		System.out.println("*********** Prueba 4");

		/*
		 * TODO: 1. Crea un objeto de tipo Artista con estos valores en sus propiedades:
		 * id: 762310PdDnwsDxAQxzQkfX nombre: Depeche Mode popularidad: 72 g�nero: dance
		 * rock url de imagen: i.scdn.co/image/2ec1d1c7a48df4244f0ba708eafd28b7afa6166b
		 * 
		 * 2. Si se crea correctamente, muestra un mensaje indicando que hay un error en
		 * la implementaci�n de la restricci�n sobre la URL de imagen.
		 * 
		 * 3. Si se captura la excepci�n, muestra un mensaje indic�ndolo.
		 */

		System.out.println();
	}

	private static void test05(String lineaCSV) {
		System.out.println("*********** Prueba 5");

		/*
		 * TODO: 1. Crea un objeto de tipo Artista a partir de la l�nea en formato CSV
		 * recibida como par�metro
		 * 
		 * 2. Si se crea correctamente, muestra el objeto que se ha creado.
		 * 
		 * 3. Si se captura una excepci�n, muestra un mensaje indic�ndolo.
		 */

		System.out.println();
	}

	private static void test06() {
		System.out.println("*********** Prueba 6");

		/*
		 * TODO: 1. Crea un objeto de tipo Artista con estos valores en sus propiedades:
		 * id: 762310PdDnwsDxAQxzQkfX nombre: Depeche Mode popularidad: 72 g�nero: dance
		 * rock url de imagen:
		 * https://i.scdn.co/image/2ec1d1c7a48df4244f0ba708eafd28b7afa6166b
		 * 
		 * 2. Mu�stralo en pantalla.
		 * 
		 * 3. Modifica la propiedad popularidad para que ahora valga 50.
		 * 
		 * 4. Vuelve a mostrarlo en pantalla indicando previamente que se ha cambiado el
		 * valor de popularidad.
		 */

		System.out.println();
	}

	private static void test07() {
		System.out.println("*********** Prueba 7");

		/*
		 * TODO: 1. Crea un objeto de tipo Artista con estos valores en sus propiedades:
		 * id: 762310PdDnwsDxAQxzQkfX nombre: Depeche Mode popularidad: 72 g�nero: dance
		 * rock url de imagen:
		 * https://i.scdn.co/image/2ec1d1c7a48df4244f0ba708eafd28b7afa6166b
		 * 
		 * 2. Mu�stralo en pantalla.
		 * 
		 * 3. Modifica la propiedad popularidad para que ahora valga -10.
		 * 
		 * 4. Si no se captura una excepci�n, muestra un mensaje indicando que hay un
		 * error en la implementaci�n de la restricci�n sobre la popularidad.
		 * 
		 * 5. Si se captura la excepci�n, muestra un mensaje indic�ndolo.
		 */

		System.out.println();
	}

	private static void test08() {
		System.out.println("*********** Prueba 8");

		/*
		 * TODO: 1. Crea un objeto de tipo Artista con estos valores en sus propiedades:
		 * id: 762310PdDnwsDxAQxzQkfX nombre: Depeche Mode popularidad: 72 g�nero: dance
		 * rock url de imagen:
		 * https://i.scdn.co/image/2ec1d1c7a48df4244f0ba708eafd28b7afa6166b
		 * 
		 * 2. Mu�stralo en pantalla.
		 * 
		 * 3. Modifica la propiedad url de imagen para que ahora valga
		 * "http://urlcambiada".
		 * 
		 * 4. Vuelve a mostrarlo en pantalla indicando previamente que se ha cambiado el
		 * valor de popularidad.
		 */

		System.out.println();
	}

	private static void test09() {
		System.out.println("*********** Prueba 9");

		/*
		 * TODO: 1. Crea un objeto de tipo Artista con estos valores en sus propiedades:
		 * id: 762310PdDnwsDxAQxzQkfX nombre: Depeche Mode popularidad: 72 g�nero: dance
		 * rock url de imagen:
		 * https://i.scdn.co/image/2ec1d1c7a48df4244f0ba708eafd28b7afa6166b
		 * 
		 * 2. Mu�stralo en pantalla.
		 * 
		 * 3. Modifica la propiedad url de imagen para que ahora valga "url incorrecta".
		 * 
		 * 4. Si no se captura una excepci�n, muestra un mensaje indicando que hay un
		 * error en la implementaci�n de la restricci�n sobre la URL de imagen.
		 * 
		 * 5. Si se captura la excepci�n, muestra un mensaje indic�ndolo.
		 */

		System.out.println();
	}
}
