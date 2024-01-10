package boletin01;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Variable donde se almacenarán el número del usuario
		double num;
		
		// Variable donde se almacenará el resultado de la suma
		double suma = 0;
		
		// Variable donde se almacenará el máximo
		double max;
		
		// Variable donde se almacenará el mínimo
		double min;
		
		// Tabla donde se almacenarán los números del usuario
		double[] tabla = new double[10];
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Bucle para pedir los números al usuario
		for (int i=0; i<tabla.length; i++) {
			// Le pedimos el número al usuario y lo guardamos
			System.out.println("Introduzca un número");
			num = sc.nextDouble();
			
			// Lo almacenamos en la tabla
			tabla[i] = num;
		}
		
		// Inicializamos el max
		max = tabla[0];
		
		// Inicializamos el min
		min = tabla[0];
		
		// Bucle para sumar
		for (double numero : tabla) {
			// Calculamos la suma de todos los números
			suma += numero;
			
			// Comprobamos si el número actual es mayor al número almacenado anteriormente
			if (numero > max) max = numero;
			
			// Comprobamos si el número actual es menor al número almacenado anteriormente
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
