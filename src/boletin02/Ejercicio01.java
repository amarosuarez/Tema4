package boletin02;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Variable donde se almacenará la longitud de la tabla
		int longitud;
		
		// Variable donde se almacenará el número que contendrá la tabla
		double num;
		
		// Tabla donde se almacenarán los números
		double[] tabla;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario la longitud de la tabla
		System.out.println("Introduzca la longitud de la tabla");
		longitud = sc.nextInt();
		
		// Asignamos la longitud a la tabla
		tabla = new double[longitud];
		
		// Le pedimos al usuario el número que se almacenará en la tabla
		System.out.println("Introduzca un número");
		num = sc.nextDouble();
		
		// Añadimos el número a todas las posiciones de la tabla
		Arrays.fill(tabla, 0, longitud, num);
		
		// Mostramos la tabla
		System.out.println(Arrays.toString(tabla));
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
