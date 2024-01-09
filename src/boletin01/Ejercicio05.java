package boletin01;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Variable donde se almacenará los números del usuario
		int num;
		
		// Variable donde se almacenará el resultado de la suma
		int suma = 0;
		
		// Variable donde se almacenará el máximo
		int max;
		
		// Variable donde se almacenará el mínimo
		int min;
		
		// Tabla donde se almacenarán los números del usuario
		int[] tabla = new int[10];
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Bucle para pedir los números al usuario
		for (int i=0; i<tabla.length; i++) {
			// Le pedimos el número al usuario y lo guardamos
			System.out.println("Introduzca un número");
			num = sc.nextInt();
			
			// Lo almacenamos en la tabla
			tabla[i] = num;
		}
		
		// Inicializamos el max
		max = tabla[0];
		
		// Inicializamos el min
		min = tabla[0];
		
		// Bucle para sumar
		for (int numero : tabla) {
			suma += numero;
			
			if (numero > max) max = numero;
			
			if (numero < min) min = numero;
			
		}
		
		// Mostramos la suma
		System.out.println(suma);
		
		// Mostramos el máximo
		System.out.println("El máximo es: " + max);
		
		// Mostramos el mínimo
		System.out.println("El mínimo es: " + min);
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
