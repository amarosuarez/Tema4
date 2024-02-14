package boletin05;

import java.util.Scanner;

public class Ejercicio01 {
	
	public static void main(String[] args) {
		// Variable donde se almacenará la primera cadena
		String cadena1 = "";
		
		// Variable donde se almacenará la segunda cadena
		String cadena2 = "";
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos la cadena al usuario
		System.out.println("Introduce la primera cadena");
		cadena1 = sc.nextLine();
		
		// Le pedimos la cadena al usuario
		System.out.println("Introduce la segunda cadena");
		cadena2 = sc.nextLine();
		
		// Comprobamos cual tiene menos caracteres
		if (cadena1.length() == cadena2.length()) {
			System.out.println("Ambas cadenas son igual de largas");
		} else {
			System.out.println(
					"La cadena:\n\"" + 
					(cadena1.length() < cadena2.length() ? cadena1 : cadena2) + 
					"\"\nes más corta");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
