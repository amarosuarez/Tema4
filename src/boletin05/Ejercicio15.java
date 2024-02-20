package boletin05;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		
		// Variable donde se almacanerá la frase
		String frase = "";
		
		// Variable donde se almacenará la frase transpuesta
		String fraseTransp = "";
		
		// Variable donde se almacenará la respuesta
		String respuesta = "";
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario la frase
		do {
			System.out.println("Introduce una frase jugador 1");
			frase = sc.nextLine();
		} while (frase.equals(""));
		
		do {
			// Reordenamos la frase
			fraseTransp = fraseRandom(frase);
			
			// Le mostramos al usuario la pista
			System.out.println("Jugador 2 tu pista es: " + fraseTransp + "\nAdivina");
			respuesta = sc.nextLine();
		} while (!respuesta.equals(frase));
		
		// Mostramos el mensaje de victoria
		System.out.println("¡Enhorabuena!");
		
		// Cerramos el Scanner
		sc.close();
	}
	
	/**
	 * Método que genera una cadena aleatoria a partir de otra
	 * @param frase Frase normal
	 * @return Frase transpuesta
	 */
	static String fraseRandom(String frase) {
		// Varible donde se almacenará la frase random
		String randFrase = "";
		
		// Tabla donde se almacenará los caracteres de la frase
		char[] tabla;
		
		// Tabla donde se almacenarán las letras ya puestas
		char[] letras;
		
		// Variable donde se almacenará el número random generado
		int random;
		
		// Creamos un Random
		Random rand = new Random();
		
		// Pasamos la frase a la tabla
		tabla = frase.toCharArray();
		
		// Le damos una longitud a la tabla posiciones
		letras = new char[tabla.length];
		
		// Ejecutamos mientras la frase random sea igual a la normal
		do {
			// Bucle para generar las posiciones aleatorias
			for (int i = 0; i < tabla.length; i++) {
				// Generamos un número aleatorio
				do {
					random = rand.nextInt(0, tabla.length);
				} while (letras[random] != 0);
				
				// Guardamos la letra en una posición random de la tabla
				letras[random] = tabla[i];
			}
			
			// Convertimos el array a cadena
			randFrase = String.valueOf(letras);
			
		} while (randFrase.equals(frase));
		
		
		// Devuelve la frase random
		return randFrase;
	}
	
}
