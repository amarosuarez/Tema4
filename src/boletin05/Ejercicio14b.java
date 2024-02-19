package boletin05;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14b {

	public static void main(String[] args) {

		// Variable donde se almacenará la frase
		String cadena = "";

		// Variable para contar las veces que aparecen las letras
		int contador;

		// Tabla donde se almacenarán las letras
		char[] tablaLetras;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);

		// Le pedimos una frase al usuario y la almacenamos
		System.out.println("Introduce una frase:");
		cadena = sc.nextLine().toLowerCase();

		// Pasamos la letra a una tabla quitándole los espacios previamente
		tablaLetras = cadena.replace(" ", "").toCharArray();

		// Ordenamos la tabla
		Arrays.sort(tablaLetras);
		
		// Bucle para recorrer la tabla
		for (int i = 0; i < tablaLetras.length; i++) {
			// Inicializamos el contador a 0
			contador = 0;
			
			// Bucle para recorrer la tabla nuevamente para comparar si las letras son iguales
			for (int j = i; j < tablaLetras.length; j++) {
				if (tablaLetras[i] == tablaLetras[j]) contador++;
			}
			
			// Comparamos la letra actual con la anterior para imprimir o no
			if (i > 0 && tablaLetras[i] == tablaLetras[i-1]) {
			} else {
				System.out.println(tablaLetras[i] + ": " + contador + (contador > 1 ? " veces" : " vez"));
			}
			
		}

		// Cerramos el Scanner
		sc.close();

	}

}