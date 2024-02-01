package boletin04;

/**
 * Clase del Ejercicio10
 */
public class Ejercicio10 {
	
	/**
	 * Tabla a girar
	 */
	final static int[][] TABLA = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
	
	/**
	 * Método Main
	 * @param args
	 */
	public static void main(String[] args) {

		// Tabla donde se almcenará la tabla girada
		int[][] tablaGirada;

		// Llamamos a la función
		tablaGirada = gira90(TABLA);

		// Bucle para recorrer las filas
		for (int[] tabla : tablaGirada) {
			// Bucle para recorrer las columnas
			for (int valor : tabla) {
				System.out.print(valor + "\t");
			}
			
			// Salto de línea
			System.out.println();
		}

	}

	/**
	 * Función que recibe una tabla bidimensional y la devuelve girada 90º
	 * @param tablaInicio Tabla Bidimensional
	 * @return Devuelve la tabla recibida girada 90º
	 */
	static int[][] gira90(int tablaInicio[][]) {
		// Tabla donde se almcenará la tabla girada
		final int[][] tablaGirada = new int[tablaInicio.length][tablaInicio[0].length];

		// Bucle para recorrer las filas
		for (int i = 0; i < tablaInicio.length; i++) {

			// Bucle para recorrer las columnas
			for (int j = 0; j < tablaInicio[i].length; j++) {

				/* Almacenamos el valor, usando las columnas como fila 
				y la longitud menos uno menos las filas para las columnas */
				tablaGirada[j][tablaInicio.length-1-i] = tablaInicio[i][j];

			}

		}

		// Devolvemos la tabla
		return tablaGirada;
	}

}
