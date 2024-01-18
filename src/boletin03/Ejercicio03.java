package boletin03;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio03 {

	public static void main(String[] args) {
		// Variable donde se almacenará la longitud especificada por el usuario
		int longitud;
		
		// Variable donde se almacenará el número límite para el aleatorio
		int fin;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario la longitud
		System.out.println("Ingrese la longitud de la tabla");
		longitud = sc.nextInt();
		
		// Le pedimos al usuario el límite del aleatorio
		System.out.println("Ingrese el número límite para el aleatorio");
		fin = sc.nextInt();
		
		// Imprimimos la tabla
		System.out.println(Arrays.toString(rellenaTabla(longitud, fin)));
		
		// Cerramos el Scanner
		sc.close();
	}
	
	// Función que devuelve una tabla ordenada rellena de números aleatorios pares
	static int[] rellenaTabla(int longitud, int fin) {
		// Creamos la tabla con la longitud definida
		int tabla[] = new int[longitud];
		
		// Variable donde se almacenará el aleatorio
		int aleatorio;
		
		// Contador donde se almacenará el indice de la tabla
		int contador = 0;
		
		// Creamos el Random
		Random rand = new Random();
		
		// Bucle que incrementa el indice si el aleatorio es par
		while (contador<longitud) {
			// Generamos el aleatorio par
			aleatorio = rand.nextInt(2, fin+1);

			if (aleatorio%2==0) {
				// Almacenamos el aleatorio par en la tabla
				tabla[contador] = aleatorio;
				
				// Aumentamos el contador
				contador++;
			}
		}
		
		// Ordenamos la tabla
		Arrays.sort(tabla);
		
		// Devolvemos la tabla
		return tabla;
	}
	
}
