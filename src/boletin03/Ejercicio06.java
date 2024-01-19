package boletin03;

import java.util.Arrays;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Tabla con números enteros
		int tabla[] = {10, 1, 5, 8, 9, 2};
		
		// Imprimimos la tabla con las sumas
		System.out.println(Arrays.toString(suma(tabla, 3)));
		
	}
	
	
	// Función que crea y devuelve una tabla con la suma de los numElementos elementos consecutivos de t
	static int[] suma(int t[], int numElementos) {
		// Tabla donde se almacenará el resultado de las sumas
		int tabla[];
		
		// Tabla donde se copiarán las tablas
		int copia[] = new int[numElementos];
		
		// Variable donde se almacenerá el número de sumas que se debe hacer
		int numSumas;
		
		// Variable donde se almacenerá el resultado de la suma
		int suma = 0;
		
		// Dividimos la longitud de la tabla entre el numero de elementos y esa será la nueva longitud de la tabla
		numSumas = t.length - numElementos + 1;
		
		// Asignamos la longitud a la nueva tabla
		tabla = new int[numSumas];
		
		// Bucle para recorrer la tabla
		for (int i = 0; i < tabla.length; i++) {
			
			// Bucle para sumar los elementos de la nueva tabla
			for (int j = i; j < numElementos + i; j++) {
				suma += t[j];
			}
			
			// Almacenamos en la tabla
			tabla[i] = suma;
			
			// Reiniciamos el valor de la suma
			suma = 0;
		}
		
		// Devolvemos la tabla
		return tabla;
	}
}
