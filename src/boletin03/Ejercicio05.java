package boletin03;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Tabla de enteros
		int tabla[] = {1, 2, 5, 1, 88, 23, 45, 1, 20, 1, 38};
		
		// Variable donde se almacenará el número a buscar
		int num;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos el número al usuario y lo almacanemos
		System.out.println("¿Qué número quieres buscar?");
		num = sc.nextInt();
		
		// Llamamos a la función
		System.out.println(Arrays.toString(buscarTodos(tabla, num)));
		
		// Cerramos el Scanner
		sc.close();
	}
	
	// Función que busca un valor y devuelve los indices donde se encuentra
	static int[] buscarTodos(int t[], int valor) {
		// Tabla donde se almacenarán los indices
		int tabla[];
		
		// Le damos la longitud a la tabla
		tabla = new int[0];
		
		
		// Bucle para almacenar la posición en la tabla
		for (int i=0; i<t.length; i++) {
			if (t[i] == valor) {
				// Copiamos la tabla anterior con una posición más
				tabla = Arrays.copyOfRange(tabla, 0, tabla.length+1);
				
				// Añadimos el valor en la nueva posición
				tabla[tabla.length-1] = i;
			}
		}
		
		// Devolvemos la tabla
		return tabla;
	}
	
}
