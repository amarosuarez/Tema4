package boletin04;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Tabla a girar
		int[][] tabla = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

		// Tabla donde se almcenará la tabla girada
		int[][] tablaGirada;

		// Llamamos a la función
		tablaGirada = gira90(tabla);

		// Bucle para recorrer las filas
		for (int i = 0; i < tablaGirada.length; i++) {

			// Bucle para recorrer las columnas
			for (int j = 0; j < tablaGirada[i].length; j++) {
				// Imprimimos el valor
				System.out.print(tablaGirada[i][j] + "\t");
			}

			// Salto de línea
			System.out.println();
		}

	}

	// Función que recibe una tabla bidimensional y la devuelve girada 90º
	static int[][] gira90(int tablaInicio[][]) {
		// Tabla donde se almcenará la tabla girada
		int[][] tablaGirada = new int[tablaInicio.length][tablaInicio[0].length];

		// Bucle para recorrer las filas
		for (int i = 0; i < tablaInicio.length; i++) {

			// Bucle para recorrer las columnas
			for (int j = 0; j < tablaInicio[i].length; j++) {

				tablaGirada[j][tablaInicio.length-1-i] = tablaInicio[i][j];

			}

		}

		// Devolvemos la tabla
		return tablaGirada;
	}

}
