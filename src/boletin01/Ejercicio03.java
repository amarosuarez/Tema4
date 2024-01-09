package boletin01;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		
		// Variable donde se almacenará el número del usuario
		int num;
		
		// Tabla donde se almacenarán los números introducidos por el usuario
		int[] tabla = new int[10];
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Bucle para pedir y almacenar los números en la tabla
		for (int i=0; i<tabla.length; i++) {
			// Le pedimos un número al usuario y lo guardamos
			System.out.println("Introduzca un número");
			num = sc.nextInt();
			
			// Almacenamos el número en la tabla
			tabla[i] = num;
		}
		
		// Bucle para mostrar la tabla en orden inverso
		for (int i=tabla.length-1; i>=0; i--) {
			System.out.println(tabla[i]);
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
