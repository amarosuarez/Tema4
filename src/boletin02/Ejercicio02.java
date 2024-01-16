package boletin02;

import java.util.Arrays;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Tabla donde se almacenarán los números
		int[] tabla;
		
		// Variable donde se almacenará el contador de dígitos que contendrá la tabla
		int contador = 0;
		
		// Variable donde se almacenará la primera posición del índice
		int primero = 0;
		
		// Variable donde se almacenará la última posición del índice
		int ultimo = 0;
		
		// Bucle para conocer la longitud de la tabla
		for (int i=1; i<=10; i++) {
			// Bucle para incrementar el contador
			for (int p=1; p<=i; p++) {
				contador++;
			}
		}
		
		// Una vez conocemos la longitud, se la aplicamos a la tabla
		tabla = new int[contador];
		
		// Bucle para colocar los números en la tabla
		for (int i=1; i<=10; i++) {
			
			/*
			 * La fórmula usada es la siguiente:
			 * primero = UPR + nº iteración - 1
			 * ultimo = UPR + nº iteración
			 * 
			 * UPR = Última posición registrada
			 */
			
			// La primera posición del índice debe ser el número - 1 
			primero+=i-1;
			
			// La última posición debe ser la posición inicial más el número
			ultimo+=i;
			
			// Colocamos los números en la tabla
			Arrays.fill(tabla, primero, ultimo, i);
		}
		
		// Mostramos la tabla
		System.out.println(Arrays.toString(tabla));
	}
	
}
