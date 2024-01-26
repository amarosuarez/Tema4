package boletin04;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Tabla bidimensional donde se almacenarán las notas de los alumnos
		double[][] notas = new double[4][5];

		// Variable donde se almacenará la nota máxima
		double max;

		// Variable donde se almacenará la nota mínima
		double min;

		// Variable donde se almacenará la nota media
		double media = 0;

		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Bucle para recorrer las filas
		for (int i = 0; i < notas.length; i++) {

			// Bucle para recorrer las columnas
			for (int j = 0; j < notas[i].length; j++) {

				// Le pedimos la nota al usuario y la almacenamos
				System.out.println("¿Cuál es la nota del Alumno " + (i + 1) + " en la asignatura " + (j + 1) + "?");
				notas[i][j] = sc.nextDouble();

			}

		}
		
		// Le asignamos un valor por defecto a la nota mínima y máxima
		min = notas[0][0];
		max = notas[0][0];

		// Bucle para recorrer las filas
		for (int i = 0; i < notas.length; i++) {

			// Bucle para recorrer las columnas
			for (int j = 0; j < notas[i].length; j++) {

				// Comprobamos la nota minima y maxima
				if (notas[i][j] < min) min = notas[i][j];
				if (notas[i][j] > max) max = notas[i][j];
				
				// Sumamos todas las notas en la media
				media += notas[i][j];

			}
			
			// Calculamos la media
			media /= notas[0].length;

			// Mostramos las notas de cada alumno
			System.out.println("Las notas del alumno " + (i+1) + " son");
			System.out.println("Mínima: " + min);
			System.out.println("Máxima: " + max);
			System.out.println("Media: " + media);
		}

		// Cerramos el Scanner
		sc.close();
	}

}
