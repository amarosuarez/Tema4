package boletin05;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		// Variable donde se almacenará el titulo
		String titulo = "";
		
		// Variable donde se almacenará el contenido
		String contenido = "";
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario el titulo
		System.out.print("Introduzca el titulo de la web");
		titulo = sc.nextLine();
		
		// Le pedimos al usuario el contenido
		System.out.println("Introduzca el contenido");
		contenido = sc.nextLine();
		
		// Llamamos a la función
		System.out.println(web(titulo, contenido));
		
		// Cerramos el Scanner
		sc.close();
	}
	
	/**
	 * Función que recibe el titulo y el contenido de una web y devuelve el codigo html
	 * @param titulo Cadena que contiene el titulo
	 * @param contenido Cadena que contiene el contenido
	 * @return Cadena que contiene el código
	 */
	static String web(String titulo, String contenido) {
		// Variable donde se almacenará el codigo
		String web = "";
		
		// Devolvemos el codigo
		return web;
	}
	
}
