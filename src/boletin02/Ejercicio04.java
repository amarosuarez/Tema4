package boletin02;

import java.util.Arrays;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Tabla donde se almacenarán los números
		int tabla[] = new int[30];
		
		// Bucle para almacenar los números aleatorios en la tabla
		for (int i=0; i<tabla.length; i++) {
			// Almacenamos el número aleatorio
			tabla[i] = (int) (Math.random() * 10);
		}
		
		// Ordenamos la lista
		Arrays.sort(tabla);
		
		// Mostramos la lista por pantalla
		System.out.println(Arrays.toString(tabla));
	}
	
}
