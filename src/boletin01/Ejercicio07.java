package boletin01;

import java.util.Scanner;

public class Ejercicio07 {

	public static void main(String[] args) {
		// Variable donde se almacenará la temperatura media
		double temperatura;

		// Tabla donde se almacenará las temperaturas de cada mes
		double tabla[] = new double[12];

		// Variable donde se almacenará el nombre del mes
		String mes;

		// Varible donde se almacenará la temperatura más alta
		double max;
		
		// Varible donde se almacenará la temperatura más baja
		double min;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Bucle para pedir la temperatura y almacenarla en la tabla
		for (int i = 0; i < tabla.length; i++) {
			// Obtenemos el nombre del mes
			mes = nombreMes(i + 1);

			// Le pedimos la temperatura al usuario y la guardamos
			System.out.println("¿Cuál fue la temperatura media de " + mes + "?");
			temperatura = sc.nextDouble();

			// Guardamos la temperatura en la tabla
			tabla[i] = temperatura;
		}
		
		// Inicializamos el máximo
		max = tabla[0];
		
		// Inicializamos el mínimo
		min = tabla[0];
		
		// Bucle para obtener la temperatura más alta y baja
		for (double valor : tabla) {
			// Comprobamos si el valor actual es mayor que el anterior guardado
			if (valor > max) max = valor;
			
			// Comprobamos si el valor actual es menor que el anterior guardado
			if (valor < min) min = valor;
		}

		// Bucle para pintar el diagrama
		for (int i = 0; i < tabla.length; i++) {
			// Obtenemos el nombre del mes
			mes = nombreMes(i + 1).substring(0, 3);

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

	// Función que devuelve el nombre del mes
	static String nombreMes(int pos) {
		// Variable dondde se almacenará el nombre
		String nombre;

		nombre = switch (pos) {
		default -> "enero";
		case 2 -> "febrero";
		case 3 -> "marzo";
		case 4 -> "abril";
		case 5 -> "mayo";
		case 6 -> "junio";
		case 7 -> "julio";
		case 8 -> "agosto";
		case 9 -> "septiembre";
		case 10 -> "octubre";
		case 11 -> "noviembre";
		case 12 -> "diciembre";
		};

		// Devolvemos el nombre
		return nombre;
	}
}
