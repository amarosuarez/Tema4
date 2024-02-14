package boletin05;

import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Variable donde se almacnerá la cadena
		String cadena = "";
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos la cadena al usuario
		System.out.println("Introduzca la cadena");
		cadena = sc.nextLine();
		
		// Imprimimos la cadena invertida
		System.out.println(cadenaInversa(cadena));

		// Cerramos el scanner
		sc.close();
	}
	
	/**
	 * Función que devuelve la cadena invertida
	 * @param cadena Cadena de entrada que será invertida
	 * @return Cadena de entrada invertida
	 */
	static String cadenaInversa(String cadena) {
		// Variable donde se almacenará la cadena invertida
		String cadenaInvertida = "";
		
		// Bucle para invertir la cadena
		for (int i = cadena.length()-1; i >= 0; i--) {
			cadenaInvertida += cadena.charAt(i);
		}
		
		// Devolvemos la cadena invertida
		return cadenaInvertida;
	}
}
