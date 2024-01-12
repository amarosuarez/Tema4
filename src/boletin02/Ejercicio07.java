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
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Bucle para generar los números aleatorios
		for (int i=0; i<tablaAleatoria.length; i++) {
			// Almacenamos el número aleatorio
			tablaAleatoria[i] = (int) (Math.random() * 50);
		}
		
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
		
		// Comprobamos si las tablas son iguales
		if (Arrays.equals(tablaAleatoria, tablaGanadora)) {
			// Mostramos el mensaje ganador
			System.out.println("¡Enhorabuena! Has acertado todos los números");
		} else {
			// Comprobamos cuantos números ha acertado
			System.out.println("Ha acertado " + numAciertos(tablaGanadora, tablaAleatoria) + " número/s");
		}
		
		// Cerramos el Scanner
		sc.close();
	}
	
	// Función que devuelve el número de aciertos
	static int numAciertos(int[] tablaGanadora, int[] tablaAleatoria) {
		// Variable que almacena el número de aciertos
		int num = 0;
		
		// Bucle para comprobar cuantos números ha acertado
		for (int i=0; i<tablaGanadora.length; i++) {
			// Comprobamos si los números coinciden y en caso afirmativo, aumentamos el contador
			if (tablaGanadora[i] == tablaAleatoria[i]) {
				num++;
			}
		}
		
		// Devolvemos el números de aciertos
		return num;
	}
	
}
