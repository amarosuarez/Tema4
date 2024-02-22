package boletin05;

import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		// Variable donde se almacenará la frase
		String frase = "";
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario una frase
		System.out.println("Introduzca una frase");
		frase = sc.nextLine().toLowerCase();
		
		System.out.println(toCamelCase(frase));
		
		// Cerramos el Scanner
		sc.close();
	}
	
	/**
	 * Función que recibe una frase y la devuelve en la nomenclatura camelCase
	 * @param frase Cadena que contiene la frase
	 * @return Cadena en la nomenclatura camelCase
	 */
	static String toCamelCase(String frase) {
		// Variable donde se almacenará la cadena en CamelCase
		String camelCase = "";
		
		// Tabla donde se almacenará la cadena por partes
		String cadena[];
		
		// Variable donde se almacenará el primer caracter de cada subcadena
		String primerCar = "";
		
		// Variable donde se almacenará el resto de la subcadena
		String sub = "";
		
		// Separamos la cadena por espacios
		cadena = frase.split(" ");
		
		// Bucle para recorrer la tabla
		for (int i = 0; i < cadena.length; i++) {
			
			if (i != 0) {
				primerCar = cadena[i].substring(0,1).toUpperCase();
				sub = cadena[i].substring(1);
				camelCase += primerCar + sub;
			} else {
				camelCase += cadena[i];
			}
			
		}
				
		// Devolvemos la cadena formateada
		return camelCase;
	}
	
}
