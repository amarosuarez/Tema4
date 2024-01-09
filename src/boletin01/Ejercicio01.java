package boletin01;

import java.util.Random;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Tabla donde se almacenarán 10 números aleatorios
		int[] numeros = new int[10];
		
		// Variable donde se almacenará el número generado
		int numRam;
		
		// Método para generar números aleatorios
		Random rand = new Random();
		
		// Bucle para generar y almacenar números aleatorios
		for (int i=0; i<numeros.length; i++) {
			// Generamos el número random
			numRam = rand.nextInt(1, 101);
			
			// Almacenamos el número generado en la tabla
			numeros[i] = numRam;
		}
		
	}
	
}
