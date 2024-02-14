package boletin05;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Variable donde se almacenará la cadena
		String cadena = "";
		
		// Variable donde se almacenará la cadena ordenada
		String[] cadenaOrdenada;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario una cadena
		System.out.println("Introduzca una cadena");
		cadena = sc.nextLine();
		
		// Llamamos a la funcion
		System.out.println(cadenaOrdenada(cadena));
		
		// Cerramos el Scanner
		sc.close();
	}
	
	/**
	 * Método que ordena una cadena alfabeticamente
	 * @param cadena Cadena de texto
	 * @return Cadena ordenada
	 */
	static String cadenaOrdenada(String cadena) {
		// Variable donde se almacenará la tabla ordenada
		String[] tablaOrdenada;
		
		// Variable donde se almacenará la cadena ordenada
		String cadenaOrdenada = "";
		
		// Separamos la cadena por espacios
		tablaOrdenada = cadena.split(" ");
		
		// Ordenamos la cadena
		Arrays.sort(tablaOrdenada);
		
		// Guardamos los valores ordenados en la tabla
		for (String cad : tablaOrdenada) {
			cadenaOrdenada += cad + " ";
		}
		
		// Devolvemos la cadena
		return cadenaOrdenada;
	}
	
}
