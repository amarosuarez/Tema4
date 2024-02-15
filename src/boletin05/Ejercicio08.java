package boletin05;

import java.util.Scanner;

public class Ejercicio08 {

	public static void main(String[] args) {
		
		// Variable donde se almacanerá la cadena
		String cadena = "";
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos la cadena al usuario y la guardamos
		System.out.println("Introduzca una cadena sin tildes");
		cadena = sc.nextLine();
		
		// Llamamos a la función sin espacios
		System.out.println(
				"La frase " + (esPalindroma(cadena.replace(" ", "")) ? "es" : "no es") + " palíndroma"
		);
		
		// Cerramos el Scanner
		sc.close();
	}
	
	/**
	 * Función que recibe una cadena y devuelve si es palindroma o no
	 * @param cadena Cadena que se comprobará si es palíndroma
	 * @return Devuelve si la cadena es palindroma
	 */
	static boolean esPalindroma (String cadena) {
		// Variable donde se almacanerá si es palindroma
		boolean palindroma = false;
		
		// Variable donde se almacenará la cadena inversa
		String cadenaInvertida = "";
		
		// Voy a reutilizar la función del ejercicio 5
		cadenaInvertida = Ejercicio05.cadenaInversa(cadena);
		
		// Comprobamos si son iguales
		if (cadenaInvertida.equalsIgnoreCase(cadena)) palindroma = true;
		
		// Devolvemos el resultado
		return palindroma;
	}
	
}
