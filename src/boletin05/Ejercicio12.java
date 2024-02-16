package boletin05;

import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		// Variable donde se almacenará la frase
		String cadena = "";
		
		// Tabla donde se almacenarán las palabras de la frase
		String[] tabla;
		
		// Variable donde se almacanerá la longitud de la palabra
		int size;
		
		// Variable donde se almacenará la posición de la palabra en la tabla
		int pos = 0;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos la frase y la almacenamos
		System.out.println("Introduzca una frase");
		cadena = sc.nextLine();
		
		// Dividamos la frase por espacios
		tabla = cadena.split(" ");
		
		// Le asignamos el tamaño de la primera palabra
		size = tabla[0].length();
		
		// Bucle para recorrer la tabla
		for (int i = 0; i < tabla.length; i++) {
			
			// Comprobamos la longitud de la palabra actual con la longitud almacenada
			if (tabla[i].length() > size) {
				// Actualizamos la longitud
				size = tabla[i].length();
				// Actualizamos la posición
				pos = i;
			}
			
		}
		
		// Mostramos la palabra más larga
		System.out.println("La palabra más larga es: " + tabla[pos]);
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
