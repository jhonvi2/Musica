package fp.test;

/** Pruebas sobre el tipo MiembroStaff.
 */
public class TestMiembroStaff {

	public static void main(String[] args) {
		System.out.println("Tests del tipo MiembroStaff\n");
		test01();
		test02();
		test03("1245;Scarlett Johansson;1984-11-22;null;New York City, New York, USA;Scarlett");		
		// N�mero incorrecto de campos, debe lanzar excepci�n
		test03("1245;Scarlett Johansson;1984-11-22;Scarlett");		
		// Fecha de defunci�n incorrecta, debe lanzar excepci�n
		test03("1245;Scarlett Johansson;1984-11-22;1954-11-22;New York City, New York, USA;Scarlett");
		test04();
		test05();
	}

	private static void test01() {		
		System.out.println("*********** Prueba 1");
		
		/* TODO: 
		 * 1. Crea un objeto de tipo MiembroStaff con estos valores en sus propiedades:
		 * id: 1245
		 * nombre: Scarlett Johansson
		 * fecha de nacimiento: 1984-11-22
		 * fecha de defunci�n: null
		 * lugar de nacimiento: New York City, New York, USA
		 * alias: Scarlett
		 * 
		 * 2. M�estralo en la consola.
		 * 
		 * 3. Muestra la edad del miembro del staff en la consola.
		 */
		
		System.out.println();
	}

	private static void test02() {		
		System.out.println("*********** Prueba 2");
		
		/* TODO: 
		 * 1. Crea un objeto de tipo MiembroStaff con estos valores en sus propiedades:
		 * id: 1245
		 * nombre: Scarlett Johansson
		 * fecha de nacimiento: 1984-11-22
		 * fecha de defunci�n: 1954-11-22
		 * lugar de nacimiento: New York City, New York, USA
		 * alias: Scarlett
		 * 
		 * 2. Si se crea correctamente, muestra un mensaje indicando que hay un error en la implementaci�n de la restricci�n sobre la fecha de defunci�n.
		 * 
		 * 3. Si se captura la excepci�n, muestra un mensaje indic�ndolo. 
		 */
		
		System.out.println();
	}
	
	
	private static void test03(String lineaCSV) {		
		System.out.println("*********** Prueba 3");
		
		/* TODO: 
		 * 1. Crea un objeto de tipo MiembroStaff a partir de la l�nea en formato CSV recibida como par�metro
		 * 
		 * 2. Si se crea correctamente, muestra el objeto que se ha creado.
		 * 
		 * 3. Si se captura una excepci�n, muestra un mensaje indic�ndolo. 
		 */
		
		System.out.println();
	}
	
	private static void test04() {		
		System.out.println("*********** Prueba 4");
		
		/* TODO: 
		 * 1. Crea un objeto de tipo MiembroStaff con estos valores en sus propiedades:
		 * id: 1245
		 * nombre: Scarlett Johansson
		 * fecha de nacimiento: 1984-11-22
		 * fecha de defunci�n: null
		 * lugar de nacimiento: New York City, New York, USA
		 * alias: Scarlett
		 * 
		 * 2. Mu�stralo en pantalla.
		 * 
		 * 3. Modifica las siguientes propiedades con los m�todos de modificaci�n:
		 * nombre: nombre_cambiado
		 * fecha de nacimiento: 2000-11-22
		 * fecha de defunci�n: 2010-11-22
		 * lugar de nacimiento: Sevilla, Espa�a
		 * alias: alias_cambiado
		 * 
		 * 4. Vuelve a mostrarlo en pantalla indicando previamente que se han cambiado los valores de las propiedades.
		 */
		
		System.out.println();
	}
	
	private static void test05() {		
		System.out.println("*********** Prueba 5");
		
		/* TODO: 
		 * 1. Crea un objeto de tipo MiembroStaff con estos valores en sus propiedades:
		 * id: 1245
		 * nombre: Scarlett Johansson
		 * fecha de nacimiento: 1984-11-22
		 * fecha de defunci�n: null
		 * lugar de nacimiento: New York City, New York, USA
		 * alias: Scarlett
		 * 
		 * 2. Mu�stralo en pantalla.
		 * 
		 * 3. Modifica la propiedad fecha de defunci�n para que ahora valga 1954-11-22.
		 * 
		 * 4. Si no se captura una excepci�n, muestra un mensaje indicando que hay un error en la implementaci�n de la restricci�n sobre la fecha de defunci�n.
		 * 
		 * 5. Si se captura la excepci�n, muestra un mensaje indic�ndolo. 
		 */
		
		System.out.println();
	}
}
