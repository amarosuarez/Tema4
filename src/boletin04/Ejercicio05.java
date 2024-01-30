package boletin04;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio05 {

	public static void main(String[] args) {

		// Tabla que hará la función de hoja de calculo
		int[][] hoja = new int[5][6];

		// Variable donde se almacenará la suma horizontal
		int sumaHor = 0;

		// Variable donde se almacenará la suma vertical
		int sumaVer = 0;

		// Vamos a sumar las filas
		// Bucle para recorrer las filas
		for (int i = 0; i < hoja.length; i++) {

			// Bucle para recorrer las columnas
			for (int j = 0; j < hoja[i].length; j++) {

				/* Mientras que no llegue a la última posición del indice, colocamos el valor de la tabla generada
				y los sumamos */
				if (i < hojaCalculo().length && j < hojaCalculo()[i].length) {

					hoja[i][j] = hojaCalculo()[i][j];

					sumaHor += hoja[i][j];

				} else {
					// Colocamos la suma en la última posición horizontal
					hoja[i][j] = sumaHor;
				}

			}
			
			// Reiniciamos el valor de las sumas horizontales
			sumaHor = 0;
			
		}

		// Vamos a sumar las columnas
		// Bucle para recorrer las filas
		for (int i = 0; i < hoja[0].length; i++) {

			// Bucle para recorrer las columnas
			for (int j = 0; j < hoja.length; j++) {

				// Sumamos los valores
				sumaVer += hoja[j][i];
				
				// Si llega a la última posición de la tabla, realizamos la suma de los totales y la colocamos
				if (i==hoja[0].length-1 && j==hoja.length-1) {
					hoja[j][i] = sumaVer;
				} else if (j==hoja.length-1) {
					// Realizamos las sumas verticales
					hoja[j][i] = sumaVer;
				}

			}

			// Reiniciamos el valor de las sumas verticales
			sumaVer = 0;
		}

		// Imprimimos la tablas
		// Bucle para recorrer las filas
		for (int i = 0; i < hoja.length; i++) {

			// Bucle para recorrer las columnas
			for (int j = 0; j < hoja[i].length; j++) {
				System.out.print(hoja[i][j] + "\t");
			}

			// Salto de línea
			System.out.println();

		}

	}

	// Función que genera 20 números aleatorios y los almacena en una tabla bidimensional
	static int[][] hojaCalculo() {
		// Creamos la tabla donde se almacenarán los datos
		int[][] t = new int[4][5];

		// Creamos el objeto random
		Random rand = new Random();

		// Variable donde se almacenará el número aleatorio
		int numAle;

		// Bucle para recorrer las filas
		for (int i = 0; i < t.length; i++) {

			// Bucle para recorrer las columnas
			for (int j = 0; j < t[i].length; j++) {

				// Generamos el número aleatorio
				numAle = rand.nextInt(100, 1000);

				// Almacenamos el número aleatorio
				t[i][j] = numAle;

			}

		}

		// Devolvemos la tabla
		return t;
	}

}