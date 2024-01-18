package boletin03;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {

	public static void main(String[] args) {
		// Tabla de enteros
		int[] tabla = new int[20];
		
		// Variable donde se almacenará el valor a buscar
		int clave;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Rellenamos la tabla con aleatorios
		for (int i=0; i<tabla.length; i++) {
			// Guardamos el aleatorio en la tabla
			tabla[i] = (int) (Math.random() * tabla.length + 1);
		}

		// Le preguntamos al usuario que número quiere buscar y lo almacenamos
		System.out.println("¿Qué número deseas buscar?");
		clave = sc.nextInt();
		
		// Mostramos la tabla
		System.out.println(Arrays.toString(tabla));
		
		// Llamamos a la función
		System.out.println(buscar(tabla, clave));
		
		// Cerramos el Scanner
		sc.close();
	}
	
	// Función que busca un valor y devuelve el indice donde se encuentra
	static int buscar(int t[], int clave) {
		// Variable donde se almacenará el indice
		int indice = 0;
		
		// Bucle para buscar el valor
		while (indice<t.length && clave!=t[indice]) {
			indice++;
		}
		
		// Comprobamos si el indice es igual a la longitud, por lo tanto no lo ha encontrado
		if (indice==t.length) indice = -1;
		
		// Devolvemos el indice
		return indice;
	}
}
