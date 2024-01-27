package boletin04;

import java.util.Arrays;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Creamos la tabla bidimensional
		int[][] tabla = new int[4][5];
		
		// Llamamos a la función
		modificarTabla(tabla);
		
		// Imprimimos la tabla
		System.out.println(Arrays.deepToString(tabla));
		
	}
	
	// Función que recibe un array bidimensional y la modifica
	static void modificarTabla(int[][] t) {
		
		// Bucle para recorrer las filas
		for (int i = 0; i < t.length; i++) {
			
			// Bucle para recorrer las columnas
			for (int j = 0; j < t[i].length; j++) {
				
				// Cambiamos el valor de la tabla
				t[i][j] = 10 * (i + j);
				
			}
			
		}
		
	}
}
