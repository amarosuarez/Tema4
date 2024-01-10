package boletin02;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Tabla donde se almacenará la puntuación de los jugadores
		int puntuaciones[] = new int[8];
		
		// Variable donde se almacenará la puntuación
		int puntuacion;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Bucle para pedir las puntuaciones y almacenarlas en la tabla
		for (int i=0; i<puntuaciones.length; i++) {
			// Le pedimos al usuario la puntuación del jugador y lo guardamos
			do {
				System.out.println("¿Cuál ha sido la puntuación del jugador " + (i+1) + "? (1000 - 2800)");
				puntuacion = sc.nextInt();
			} while (puntuacion < 1000 || puntuacion > 2800);
			
			// Almacenamos la puntuación en la tabla
			puntuaciones[i] = puntuacion;
		}
		
		// Ordenamos la lista
		Arrays.sort(puntuaciones);
		
		// Bucle para mostrar la tabla de forma descendente
		for (int i=puntuaciones.length-1; i>=0; i--) {
			System.out.println(puntuaciones[i]);
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
