package boletin05;

import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Variable donde se almacenará la palabra
		String palabra = "";
		
		// Variable donde se almacenará la cadena
		String cadena = "";		
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos la palabra al usuario
		System.out.println("Introduzca una palabra");
		palabra = sc.next();
		
		// Comprobamos que no haya introducido fin
		while (!palabra.equalsIgnoreCase("fin")) {
			// Limpiamos el Scanner
			sc.nextLine();
			
			// Añadimos la palabra a la cadena
			cadena += palabra + " ";
			
			// Le pedimos la palabra al usuario
			System.out.println("Introduzca otra palabra");
			palabra = sc.next();
		}
		
		// Mostramos la cadena
		System.out.println(cadena);
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
