package boletin02;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03b {

	public static void main(String[] args) {
		// Tabla donde se almacenarán los 20 números introducidos por el usuario
		int[] tabla = new int[20];
		
		// Tabla donde se almacenarán los 10 primeros números números
		int primeros[] = new int[10];
		
		// Tabla donde se almacenarán los 10 últimos números
		int[] ultimos = new int[10];
		
		// Variable donde se almacenará un número
		int num;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Bucle para pedirle a los usuarios los 20 números
		for (int i=0; i<tabla.length; i++) {
			// Le pedimos el número al usuario y lo guardamos
			System.out.println("Introduzca un número");
			num = sc.nextInt();
			
			// Lo almacenamos en la tabla
			tabla[i] = num;
		}
		
		// Copiamos los 10 primeros
		primeros = Arrays.copyOfRange(tabla, 0, 10);
		
		// Copiamos los 10 últimos
		ultimos = Arrays.copyOfRange(tabla, 10, 20);
		
		// Comparamos las tablas y mostramos el mensaje
		System.out.println(Arrays.equals(primeros, ultimos) ? "Son iguales" : "Son diferentes");
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
