package boletin05;

import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Variable donde se almacenará el número de espacios
		int num;
		
		// Variable donde se almacenará la cadena
		String cadena = "";
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario una cadena
		System.out.println("Introduzca una cadena");
		cadena = sc.nextLine();
		
		// Llamamos a la función
		num = numEspacios(cadena);
		
		// Mostramos el mensaje
		System.out.println("La cadena:\n" + cadena + "\nTiene " + num + " espacios");
		
		// Cerramos el Scanner
		sc.close();
	}
	
	
	/**
	 * Función que recibe una cadena y devuelve el número de espacios
	 * @param cadena Cadena de texto
	 * @return Número de espacios en la cadena
	 */
	static int numEspacios(String cadena) {
		// Variable donde se almacenará el número de espacios
		int num;
		
		// Separamos la cadena en partes
		String[] palabras = cadena.split(" ");
		
		// El número de espacios será igual a la longitud de la tabla menos 1
		num = palabras.length - 1;
		
		// Devolvemos el número de espacios
		return num;
	}
	
}
