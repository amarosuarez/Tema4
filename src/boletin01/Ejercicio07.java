package boletin01;

import java.util.Scanner;

public class Ejercicio07 {
	
	public static void main(String[] args) {
		
		// Tabla constante con el nombre de los meses
		final String MESES[] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
				"Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
		
		// Variable donde se almacenará la temperatura media
		double temperatura;

		// Tabla donde se almacenará las temperaturas de cada mes
		double tabla[] = new double[MESES.length];

		// Variable donde se almacenará el nombre del mes
		String mes;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Bucle para pedir la temperatura y almacenarla en la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Obtenemos el nombre del mes
			mes = MESES[i];

			// Le pedimos la temperatura al usuario y la guardamos
			System.out.println("¿Cuál fue la temperatura media de " + mes + "?");
			temperatura = sc.nextDouble();

			// Guardamos la temperatura en la tabla
			tabla[i] = temperatura;
		}
		// Bucle para pintar el diagrama
		for (int i = 0; i < tabla.length; i++) {
			// Obtenemos el nombre del mes
			mes = MESES[i].substring(0, 3);

			// Colocamos el nombre del mes
			System.out.print(mes + " |");

			// Trazamos la línea según la cantidad
			for (int t = 0; t < tabla[i]; t++) {
				System.out.print("-");
			}

			// Pintamos un salto de línea
			System.out.println();
		}

		// Cerramos el Scanner
		sc.close();
	}
}
