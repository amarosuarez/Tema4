package boletin02;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {
	
	// Creamos el Scanner
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		// Tabla donde se almacenarán los 10 primeros números
		int[] tablaPrin = new int[10];

		// Tabla donde se almacenarán los 10 últimos números
		int[] tablaFin = new int[10];

		// Pedimos y almacenamos los números en cada tabla
		tablaPrin = saveNumber(tablaPrin);
		tablaFin = saveNumber(tablaFin);
		
		// Comparamos las tablas y mostramos el mensaje
		System.out.println(Arrays.equals(tablaPrin, tablaFin) ? "Son iguales" : "Son diferentes");

		// Cerramos el Scanner
		sc.close();
	}

	// Función para pedir el número al usuario y almacenarlo en la tabla
	static int[] saveNumber(int[] tabla) {
		// Variable donde se almacenará el número
		int num;
		
		// Bucle para pedir al usuario los números
		for (int i = 0; i < tabla.length; i++) {
			// Le pedimos el número al usuario y lo guardamos
			System.out.println("Introduzca un número");
			num = sc.nextInt();

			// Almacenamos el número en la tabla
			tabla[i] = num;
		}
		
		// Devolvemos la tabla con los valores almacenados
		return tabla;
	}

}
