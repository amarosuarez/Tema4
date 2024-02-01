package boletin04;

/**
 * Clase Ejercicio08
 */
public class Ejercicio08 {
	
	/**
	 * Constructor privado
	 */
	private Ejercicio08() {}

	/**
	 * Método Main
	 * @param args
	 */
	public static void main(String[] args) {

		// Array bidimensional
		final int[][] matrizSimetrica = 
			{ 
				{ 1, 2, 3, 4 }, 
				{ 2, 5, 6, 7 }, 
				{ 3, 6, 8, 9 }, 
				{ 4, 7, 9, 10 } 
			};

		System.out.println((esSimetrica(matrizSimetrica) ? "Es " : "No es ") + "simétrica");

	}

	/**
	 * Función que recibe un array bidimensional y devuelve un booleano que indica
	 * @param tabla Tabla bidimensional
	 * @return Devuelve si es simétrica o no
	 */
	static boolean esSimetrica(int[][] tabla) {
		// Variable donde se almacenará si es simétrica o no
		boolean simetrica = true;

		// Variable para contar las filas
		int filas = 0;

		// Variable para contar las columnas
		int columnas = 0;

		while (filas < tabla.length) {

			
			while (columnas < tabla[filas].length) {

				
				if (tabla[filas][columnas] != tabla[columnas][filas]) {
					simetrica = false;
					break;
				}
								
				columnas++;
			}
			
			columnas = 0;
			filas++;
		}

		// Bucle para recorrer las filas
		for (int i = 0; i < tabla.length; i++) {

			// Bucle para recorrer las columnas
			for (int j = 0; j < tabla[i].length; j++) {

				// Comparamos
				if (tabla[i][j] != tabla[j][i]) {
					simetrica = false;
					break;
				}

			}

		}

		// Devolvemos el boolean
		return simetrica;
	}
}
