package boletin04;

import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Creamos la tabla bidimensional donde se almacenarán las tablas de multiplicar
		int[][] tabla = new int[10][10];
		
		// Llamamos a la función
		tabla = tablasMultiplicar();
		
		// Imprimimos las tablas
		// For each para recorrer las filas
		for (int[] filas : tabla) {
			
			// For each para recorrer las columnas
			for (int valor : filas) {
				System.out.print(valor+"\t");
			}
			
			// Salto de línea
			System.out.println();
		}
	}
	
	// Función que devuelve las tablas de multiplicar del 1 al 10
	static int[][] tablasMultiplicar() {
		// Creamos la tabla bidimensional
		int[][] t = new int[10][10];
		
		// Bucle para recorrer las filas
		for (int i = 0; i < t.length; i++) {
			
			// Bucle para recorrer las filas
			for (int j = 0; j < t[i].length; j++) {
				
				// Almacenamos el valor
				t[i][j] = (i+1)*(j+1);
				
			}
			
		}
		
		// Devolvemos la tabla
		return t;
	}
	
}
