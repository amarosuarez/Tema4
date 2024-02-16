package boletin05;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio13 {
	
	public static void main(String[] args) {
		// Variable donde se almacenará la primera cadena
		String cadena1 = "";
		
		// Variable donde se almacenará la segunda cadena
		String cadena2 = "";
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos la primera frase
		System.out.println("Introduzca una frase o palabra");
		cadena1 = sc.nextLine().toLowerCase();
		
		// Le pedimos la primera frase
		System.out.println("Introduzca otra");
		cadena2 = sc.nextLine().toLowerCase();
			
		// Llamamos a la función y mostramos el mensaje por pantalla
		System.out.println("La frase o palabra " + (esAnagrama(cadena1, cadena2) ? "es" : "no es") + " anagrama");
		
		// Cerramos el Scanner
		sc.close();
	}
	
	static boolean esAnagrama (String cadena1, String cadena2) {
		// Array de char donde se almacenará la cadena1
		char[] tabla1;
		
		// Array de char donde se almacenará la cadena2
		char[] tabla2;
		
		// Convertimos las cadenas al array y las ordenamos
		tabla1 = cadena1.replace(" ", "").toCharArray();
		tabla2 = cadena2.replace(" ", "").toCharArray();
		
		// Ordenamos las tablas
		Arrays.sort(tabla1);
		Arrays.sort(tabla2);
		
		// Devolvemos el boolean
		return Arrays.equals(tabla1, tabla2);
	}

}
