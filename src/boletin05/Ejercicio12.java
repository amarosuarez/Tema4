package boletin05;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// Variable donde se almacenará la frase
		String cadena = "";
		
		// Variable donde se almacenará la palabra más larga
		String palabra = "";
		
		// Tabla donde se almacenarán las palabras de la frase
		String[] tabla;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos la frase y la almacenamos
		System.out.println("Introduzca una frase");
		cadena = sc.nextLine();
		
		// Dividamos la frase por espacios
		tabla = cadena.split(" ");
		
		// Le asignamos la primera palabra
		palabra = tabla[0];
		
		// Bucle para recorrer la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Comprobamos la longitud de la palabra actual con la longitud de la palabra almacenada
			if (tabla[i].length() > palabra.length()) {
				// Actualizamos la palabra
				palabra = tabla[i];
			}
		}
		
		// Mostramos la palabra más larga
		System.out.println("La palabra más larga es: " + palabra);
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
