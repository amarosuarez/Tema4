package boletin02;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		
		// Tabla auxiliar
		final String AUX[] = {"primer", "segundo", "tercer", "cuarto", "quinto", "sexto"};
		
		// Tabla que contendrá 6 números aleatorios
		int[] tablaAleatoria = new int[6];
		
		// Tabla que contendrá la combinación ganadora
		int[] tablaGanadora = new int[6];
		
		// Variable donde se almacenará el número del usuario
		int num;
		
		// Contador
		int contador = 0;
		
		// Variable donde se almacenará el número aleatorio
		int n;
		
		// Variable donde se almacenará el indice
		int indice;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Bucle para generar los números aleatorios
		for (int i=0; i<tablaAleatoria.length; i++) {
			// Generamos el número aleatorio
			n = (int) (Math.random() * 10 + 1);
			indice = 0;
			
			do {
				n = (int) (Math.random() * 10 +1);
				
				while (indice<tablaAleatoria.length && n != tablaAleatoria[indice]) {
					indice++;
				}
				
			} while (indice < tablaAleatoria.length);
			
			// Almacenamos el número aleatorio
			tablaAleatoria[i] = n;
		}
		
		// Ordenamos la tabla
		Arrays.sort(tablaAleatoria);
		
		// Mostramos la tabla aleatoria
		System.out.println("Tu combinación es: \n" + Arrays.toString(tablaAleatoria));
		
		// Bucle para pedirle al usuario la combinación ganadora
		for (int i=0; i<tablaGanadora.length; i++) {
			// Le pedimos los números al usuario y lo guardamos, comprobando que está en el rango
			do {
				System.out.println("¿Cuál es el " + AUX[i] + " número de la combinación ganadora?");
				num = sc.nextInt();
			} while (num < 1 || num > 49);
			
			// Almacenamos el número en la tabla
			tablaGanadora[i] = num;
		}
		
		// Mostramos la combinación ganadora
		System.out.println("La combinación ganadora es: \n" + Arrays.toString(tablaGanadora));
		
		// Bucle para buscar el número en la ganadora
		for (int numero : tablaGanadora) {
			if (Arrays.binarySearch(tablaAleatoria, numero) >= 0) contador++;
		}
		
		// Mostramos el número de aciertos
		if (contador == tablaGanadora.length) {
			System.out.println("Enhorabuena, has acertado todos los números");
		} else {
			System.out.println("Has acertado " + contador + " numero/s");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
