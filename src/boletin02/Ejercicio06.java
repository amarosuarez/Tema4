package boletin02;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio06 {

	public static void main(String[] args) {
		// Variable donde se almacenará el número del usuario
		int num;
		
		// Tabla donde se almacenarán los números
		int[] tabla = new int[1000];
		
		// Variable donde se almacenará la cantidad de veces que aparece
		int cantidad = 0;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Bucle para almacenar los números aleatorios en la tabla
		for (int i=0; i<tabla.length; i++) {
			tabla[i] = (int) (Math.random() * 100);
		}
		
		// Le pedimos al usuario un númeor entre 0 y 99
		do {
			System.out.println("Introduzca un número entre 0 y 99");
			num = sc.nextInt();
		} while (num < 0 || num > 99);
		
		// Ordenamos la tabla
		Arrays.sort(tabla);
		
		// Bucle para buscar el número y contar cuantas veces aparece
		for (int i=0; i<tabla.length; i++) {
			// Comprobamos si el número es el mismo que el de la casilla
			if (num == tabla[i]) cantidad++;
		}
		
		// Mostramos el mensaje por pantalla
		System.out.println(cantidad > 0 
				? "El número " + num + " aparece " + cantidad + " veces"
				: "No se ha encontrado el número " + num);
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
