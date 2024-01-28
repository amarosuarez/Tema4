package boletin04;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		// Tabla bidimensional
		int[][] tabla = new int[6][10];
		
		// Creamos el objeto Random
		Random rand = new Random();
		
		// Bucle para recorrer las filas
		for (int i = 0; i < tabla.length; i++) {
			
			// Bucle para recorrer las columnas
			for (int j = 0; j < tabla[i].length; j++) {
				// Generamos un número aleatorio y lo almacenamos
				tabla[i][j] = rand.nextInt(10001);
			}
			
		}
		
		// Llamamos a la función e imprimimos por pantalla
		System.out.println(Arrays.toString(tablaMinMax(tabla)));
		
	}
	
	// Función que recibe una tabla de dos dimensiones y devuelve una tabla de dos posiciones con el mínimo y el máximo
	static int[] tablaMinMax(int[][] t) {
		// Tabla donde se almacenará el mínimo y el máximo
		int tabla[] = new int[2];
		
		// Variable donde se almacenará el máximo
		int max;
		
		// Variable donde se almacenará el mínimo
		int min;
		
		// Le damos un valor inicial a ambas variables
		min = t[0][0];
		max = t[0][0];
		
		// Bucle para recorrer las filas
		for (int i = 0; i < t.length; i++) {
			
			// Bucle para recorrer las columnas
			for (int j = 0; j < t[i].length; j++) {
				
				// Comprobamos si el valor actual es menor o mayor que el anterior
				if (t[i][j] < min) min = t[i][j];
				if (t[i][j] > max) max = t[i][j];
				
			}
			
		}
		
		// Le asignamos los valores a la tabla
		tabla[0] = min;
		tabla[1] = max;
		
		// Devolvemos la tabla
		return tabla;
	}
}
