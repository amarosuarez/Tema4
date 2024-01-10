package boletin01;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		// Tabla donde se almacenarán los números aleatorios
		int[] tabla = new int[100];
		
		// Variable donde se almacenará el número del usuario
		int num;
		
		// Variable donde se almacenará si se ha encontrado al menos un número
		boolean found = false;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Bucle para recorrer la tabla y almacenar los números aleatorios
		for (int i=0; i<tabla.length; i++) {
			// Almacenamos el número aleatorio
			tabla[i] = (int) (1 + Math.random() * 10);
		}
		
		// Le pedimos al usuario un número y lo guardamos
		System.out.println("Introduzca un número");
		num = sc.nextInt();
		
		// Mostramos un mensaje por defecto
		System.out.println("El número " + num + " se encuentra en la posición/es");
		
		// Bucle para comprobar en que posiciones se encuentra el número proporcionado por el usuario
		for (int i=0; i<tabla.length; i++) {
			// Comprobamos si el número está en la posición actual
			if (tabla[i] == num) {
				System.out.println(i);
				found = true;
			}
		}
		
		// Si el número no se encuentra en ninguna posición de la tabla se muestra el siguiente mensaje
		if (!found) System.out.println("No se ha encontrado :(");
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
