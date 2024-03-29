package boletin05;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// Tabla de char conjunto1
		char conjunto1[] = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'};
		
		// Tabla de char conjunto2
		char conjunto2[] = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};
		
		// Variable donde se almacenará la palabra
		String palabra = "";
		
		// Variable donde se almacenará el caracter
		char car = 0;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos la palabra al usuario
		System.out.println("Introduzca una palabra");
		palabra = sc.nextLine();
		
		// Bucle que llama a la función pasando cada carácter según la posición en la cadena
		for (int i = 0; i < palabra.length(); i++) {
			// Obtenemos el caracter en la posición i de la cadena
			car = palabra.charAt(i);
			
			// Llamamos a la función para mostrar el mensaje
			System.out.print(codifica(conjunto1, conjunto2, car));
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
	/**
	 * Método que obtiene dos tablas de char y un char y devuelve la codificación
	 * @param conjunto1 Tabla de char
	 * @param conjunto2 Tabla de codificación
	 * @param c Char a codificar
	 * @return Devuelve el char codificado
	 */
	static char codifica(char conjunto1[], char conjunto2[], char c) {
		// Variable donde se almacenará el char codificado
		// Lo inicializo a c ya que si no se encuentra en el conjunto debe retornar el mimso caracter
		char charCodificado = c;
		
		// Convertimos el char a String
		String charToString = String.valueOf(c);
		
		// Bucle para buscar el carácter en el primer conjunto y luego obtener el carácter codificado
		for (int i = 0; i < conjunto1.length; i++) {
			// Comprueba si el caracter es igual al de la posición
			if (charToString.equalsIgnoreCase(String.valueOf(conjunto1[i]))) {
				// Obtiene el caracter de la misma posición pero en el segundo conjunto
				charCodificado = conjunto2[i];
			}
		}
		
		// Devuelve el char codificado
		return charCodificado;
	}
	
}
