package boletin01;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// Variable donde se almacenará el número introducido por el usuario
		int num;
		
		// Tabla donde se almacenarán los números insertados por el usuario
		int tabla[] = new int[5];
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Bucle para pedir y almacenar los números del usuario
		for (int i=0; i<tabla.length; i++) {
			// Le pedimos al usuario un número
			System.out.println("Introduzca un número");
			
			// Almacenamos el número
			num = sc.nextInt();
			
			// Lo guardamos en la tabla
			tabla[i] = num;
		}
		
		// Bucle para mostrar la tabla por consola
		for (int numero : tabla) {
			System.out.println(numero);
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
