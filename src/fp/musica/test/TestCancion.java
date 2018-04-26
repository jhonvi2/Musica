package fp.musica.test;

import java.time.Duration;

import fp.musica.Artista;
import fp.musica.ArtistaImpl;
import fp.musica.Cancion;
import fp.musica.CancionImpl;

public class TestCancion {

	public static void main(String[] args) {
		System.out.println("Tests del tipo Canci�n\n");
		Artista a = new ArtistaImpl("762310PdDnwsDxAQxzQkfX", "Depeche Mode", "dance rock", 72, "https://i.scdn.co/image/2ec1d1c7a48df4244f0ba708eafd28b7afa6166b");
		test01(a);
		test02(a);
		test03(a);
		test04(a);
		test05(a);
		test06("4DKQUNX2Il67QVncT1ELcv ; 762310PdDnwsDxAQxzQkfX#Depeche Mode#72#dance rock#https://i.scdn.co/image/2ec1d1c7a48df4244f0ba708eafd28b7afa6166b; 249 ; Dressed In Black - Live In Barcelona ; 7 ; 26 ; https://p.scdn.co/mp3-preview/7d0570b64c3428a0092d1541005ee8f5daa65e4e?cid=null");		
		// ID incorrecto, debe lanzar excepci�n
		test06("4DKQU ; 762310PdDnwsDxAQxzQkfX#Depeche Mode#72#dance rock#https://i.scdn.co/image/2ec1d1c7a48df4244f0ba708eafd28b7afa6166b; 249 ; Dressed In Black - Live In Barcelona ; 7 ; 26 ; https://p.scdn.co/mp3-preview/7d0570b64c3428a0092d1541005ee8f5daa65e4e?cid=null");
		// Popularidad incorrecta, debe lanzar excepci�n
		test06("4DKQUNX2Il67QVncT1ELcv ; 762310PdDnwsDxAQxzQkfX#Depeche Mode#72#dance rock#https://i.scdn.co/image/2ec1d1c7a48df4244f0ba708eafd28b7afa6166b; 249 ; Dressed In Black - Live In Barcelona ; 7 ; 216 ; https://p.scdn.co/mp3-preview/7d0570b64c3428a0092d1541005ee8f5daa65e4e?cid=null");
		// URL de preescucha incorrecta, debe lanzar excepci�n
		test06("4DKQUNX2Il67QVncT1ELcv ; 762310PdDnwsDxAQxzQkfX#Depeche Mode#72#dance rock#https://i.scdn.co/image/2ec1d1c7a48df4244f0ba708eafd28b7afa6166b; 249 ; Dressed In Black - Live In Barcelona ; 7 ; 26 ; p.scdn.co/mp3-preview/7d0570b64c3428a0092d1541005ee8f5daa65e4e?cid=null");
		// Duraci�n incorrecta, debe lanzar excepci�n
		test06("4DKQUNX2Il67QVncT1ELcv ; 762310PdDnwsDxAQxzQkfX#Depeche Mode#72#dance rock#https://i.scdn.co/image/2ec1d1c7a48df4244f0ba708eafd28b7afa6166b; -10 ; Dressed In Black - Live In Barcelona ; 7 ; 26 ; p.scdn.co/mp3-preview/7d0570b64c3428a0092d1541005ee8f5daa65e4e?cid=null");
		test07(a);
		test08(a);
	}

	private static void test01(Artista a) {		
		System.out.println("*********** Prueba 1");
		
		/* TODO: 
		 * 1. Crea un objeto de tipo Canci�n con estos valores en sus propiedades:
		 * id: 762310PdDnwsDxAQxzQkfX
		 * nombre: Dressed In Black - Live In Barcelona
		 * popularidad: 26
		 * duraci�n: 249 segundos
		 * url de preescucha: https://p.scdn.co/mp3-preview/7d0570b64c3428a0092d1541005ee8f5daa65e4e?cid=null
		 * artista: el recibido por par�metro
		 * 
		 * 2. M�estralo en la consola.
		 * 
		 * 3. Muestra la duraci�n en segundos.
		 * 
		 * 4. Muestra en la consola el resumen en texto de la canci�n.
		 */		
		
		System.out.println();
	}
	
	private static void test02(Artista a) {		
		System.out.println("*********** Prueba 2");
		
		/* TODO: 
		 * 1. Crea un objeto de tipo Canci�n con estos valores en sus propiedades:
		 * id: 762310Pd
		 * nombre: Dressed In Black - Live In Barcelona
		 * popularidad: 26
		 * duraci�n: 249 segundos
		 * url de preescucha: https://p.scdn.co/mp3-preview/7d0570b64c3428a0092d1541005ee8f5daa65e4e?cid=null
		 * artista: el recibido por par�metro
		 * 
		 * 2. Si se crea correctamente, muestra un mensaje indicando que hay un error en la implementaci�n de la restricci�n sobre el id.
		 * 
		 * 3. Si se captura la excepci�n, muestra un mensaje indic�ndolo. 
		 */
		
		System.out.println();
	}
	
	private static void test03(Artista a) {		
		System.out.println("*********** Prueba 3");
		
		/* TODO: 
		 * 1. Crea un objeto de tipo Canci�n con estos valores en sus propiedades:
		 * id: 762310PdDnwsDxAQxzQkfX
		 * nombre: Dressed In Black - Live In Barcelona
		 * popularidad: 26
		 * duraci�n: -12 segundos
		 * url de preescucha: https://p.scdn.co/mp3-preview/7d0570b64c3428a0092d1541005ee8f5daa65e4e?cid=null
		 * artista: el recibido por par�metro
		 * 
		 * 2. Si se crea correctamente, muestra un mensaje indicando que hay un error en la implementaci�n de la restricci�n sobre la duraci�n.
		 * 
		 * 3. Si se captura la excepci�n, muestra un mensaje indic�ndolo. 
		 */
		
		System.out.println();
	}
	
	private static void test04(Artista a) {		
		System.out.println("*********** Prueba 4");
		
		/* TODO: 
		 * 1. Crea un objeto de tipo Canci�n con estos valores en sus propiedades:
		 * id: 762310PdDnwsDxAQxzQkfX
		 * nombre: Dressed In Black - Live In Barcelona
		 * popularidad: 216
		 * duraci�n: 249 segundos
		 * url de preescucha: https://p.scdn.co/mp3-preview/7d0570b64c3428a0092d1541005ee8f5daa65e4e?cid=null
		 * artista: el recibido por par�metro
		 * 
		 * 2. Si se crea correctamente, muestra un mensaje indicando que hay un error en la implementaci�n de la restricci�n sobre la popularidad.
		 * 
		 * 3. Si se captura la excepci�n, muestra un mensaje indic�ndolo. 
		 */
		
		System.out.println();
	}
	
	private static void test05(Artista a) {		
		System.out.println("*********** Prueba 5");
		
		/* TODO: 
		 * 1. Crea un objeto de tipo Canci�n con estos valores en sus propiedades:
		 * id: 762310PdDnwsDxAQxzQkfX
		 * nombre: Dressed In Black - Live In Barcelona
		 * popularidad: 26
		 * duraci�n: 249 segundos
		 * url de preescucha: mp3-preview/7d0570b64c3428a0092d1541005ee8f5daa65e4e?cid=null
		 * artista: el recibido por par�metro
		 * 
		 * 2. Si se crea correctamente, muestra un mensaje indicando que hay un error en la implementaci�n de la restricci�n sobre la URL de preescucha.
		 * 
		 * 3. Si se captura la excepci�n, muestra un mensaje indic�ndolo. 
		 */
		
		System.out.println();
	}
	
	
	private static void test06(String lineaCSV) {		
		System.out.println("*********** Prueba 6");
		
		/* TODO: 
		 * 1. Crea un objeto de tipo Canci�n a partir de la l�nea en formato CSV recibida como par�metro
		 * 
		 * 2. Si se crea correctamente, muestra el objeto que se ha creado.
		 * 
		 * 3. Si se captura una excepci�n, muestra un mensaje indic�ndolo. 
		 */		
		
		System.out.println();
	}
	
	private static void test07(Artista a) {		
		System.out.println("*********** Prueba 7");
		
		/* TODO: 
		 * 1. Crea un objeto de tipo Canci�n con estos valores en sus propiedades:
		 * id: 762310PdDnwsDxAQxzQkfX
		 * nombre: Dressed In Black - Live In Barcelona
		 * popularidad: 26
		 * duraci�n: 249 segundos
		 * url de preescucha: https://p.scdn.co/mp3-preview/7d0570b64c3428a0092d1541005ee8f5daa65e4e?cid=null
		 * artista: el recibido por par�metro
		 * 
		 * 2. Mu�stralo en pantalla.
		 * 
		 * 3. Modifica la propiedad popularidad para que ahora valga 50.
		 * 
		 * 4. Vuelve a mostrarlo en pantalla indicando previamente que se ha cambiado el valor de popularidad.
		 */
		
		System.out.println();
	}
	
	private static void test08(Artista a) {		
		System.out.println("*********** Prueba 8");
		
		/* TODO: 
		 * 1. Crea un objeto de tipo Canci�n con estos valores en sus propiedades:
		 * id: 762310PdDnwsDxAQxzQkfX
		 * nombre: Dressed In Black - Live In Barcelona
		 * popularidad: 26
		 * duraci�n: 249 segundos
		 * url de preescucha: https://p.scdn.co/mp3-preview/7d0570b64c3428a0092d1541005ee8f5daa65e4e?cid=null
		 * artista: el recibido por par�metro
		 * 
		 * 2. Mu�stralo en pantalla.
		 * 
		 * 3. Modifica la propiedad popularidad para que ahora valga -10.
		 * 
		 * 4. Si no se captura una excepci�n, muestra un mensaje indicando que hay un error en la implementaci�n de la restricci�n sobre la popularidad.
		 * 
		 * 5. Si se captura la excepci�n, muestra un mensaje indic�ndolo. 
		 */
		
		System.out.println();
	}
	
}