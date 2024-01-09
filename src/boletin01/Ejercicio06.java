package boletin01;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		
		// Variable donde se almacenarán el número del usuario
		int num;
		
		// Tabla donde se almacenarán los números del usuario
		int[] tabla = new int[8];
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Bucle para pedir y almacenar los números en la tabla
		for (int i=0; i<tabla.length; i++) {
			// Le pedimos al usuario un número y lo guardamos
			System.out.println("Introduzca un número");
			num = sc.nextInt();
			
			// Almacenamos el número en la tabla
			tabla[i] = num;
		}
		
		// Bucle para recorrer la tabla y mostrar el número junto a la palabra par o impar
		for (int numero : tabla) {
			// Mostramos el mensaje por pantalla
			System.out.println(numero + (numero%2==0 ? " Par" : " Impar"));
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
