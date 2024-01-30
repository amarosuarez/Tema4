package boletin04;

public class Ejercicio08 {

	public static void main(String[] args) {

		// Array bidimensional
		int[][] matrizSimetrica = 
			{ 
				{ 1, 2, 3, 4 }, 
				{ 2, 5, 6, 7 }, 
				{ 3, 6, 8, 9 }, 
				{ 4, 7, 9, 10 } 
			};

		System.out.println((esSimetrica(matrizSimetrica) ? "Es " : "No es ") + "simétrica");

	}

	// Función que recibe un array bidimensional y devuelve un booleano que indica
	// si es simétrica o no
	static boolean esSimetrica(int[][] t) {
		// Variable donde se almacenará si es simétrica o no
		boolean simetrica = true;

		// Variable para contar las filas
		int filas = 0;

		// Variable para contar las columnas
		int columnas = 0;

		while (filas < t.length) {

			
			while (columnas < t[filas].length) {

				
				if (t[filas][columnas] != t[columnas][filas]) {
					simetrica = false;
					break;
				}
								
				columnas++;
			}
			
			columnas = 0;
			filas++;
		}

		// Bucle para recorrer las filas
		for (int i = 0; i < t.length; i++) {

			// Bucle para recorrer las columnas
			for (int j = 0; j < t[i].length; j++) {

				// Comparamos
				if (t[i][j] != t[j][i]) {
					simetrica = false;
					break;
				}

			}

		}

		// Devolvemos el boolean
		return simetrica;
	}
}
