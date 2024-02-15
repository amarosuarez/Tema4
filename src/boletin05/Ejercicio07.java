package boletin05;

public class Ejercicio07 {

	public static void main(String[] args) {
		System.out.println("" + numVeces("pedro juan juan amaroamaro", "amaro"));
	}
	
	/**
	 * Función que devuelve cuantas veces aparece una palabra
	 * @param cadena Cadena donde se buscará la palabara
	 * @param palabra Palabra a buscar la cadena
	 * @return El número de veces que aparece
	 */
	static int numVeces(String cadena, String palabra) {
		// Variable donde se almacenará el número de veces que aparece la palabra
		int veces = 0;
		
		// Variable donde se almacenará la posición actual
		int pos = -1;
		
		// Comprobamos cuantas veces aparece para ello comprobamos en el rango posActual +1 hasta el fin
		while (cadena.indexOf(palabra, pos+1) != -1) {
			// Aumentamos el contador
			veces++;
			
			// Actualizamos la posición actual
			pos = cadena.indexOf(palabra, pos+1);
		}
		
		// Devolvemos el número de veces que aparece
		return veces;
	}
}
