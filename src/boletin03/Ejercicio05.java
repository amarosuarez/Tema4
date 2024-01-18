package boletin03;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio05 {

	public static void main(String[] args) {
		// Tabla de enteros
		int tabla[] = {1, 2, 5, 1, 88, 23, 45, 1, 20, 1, 38};
		
		// Variable donde se almacenará el número a buscar
		int num;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos el número al usuario y lo almacanemos
		System.out.println("¿Qué número quieres buscar?");
		num = sc.nextInt();
		
		// Llamamos a la función
		System.out.println(Arrays.toString(buscarTodos(tabla, num)));
		
		// Cerramos el Scanner
		sc.close();
	}
	
	// Función que busca un valor y devuelve los indices donde se encuentra
	static int[] buscarTodos(int t[], int valor) {
		// Tabla donde se almacenarán los indices
		int tabla[];
		
		// Contador donde se almacenará la longitud
		int longitud=0;
		
		// Bucle para conocer la longitud
		for (int num : t) {
			if (num == valor) longitud++;
		}
		
//		// Le damos la longitud a la tabla
		tabla = new int[0];
		
		// Bucle para conocer los indices donde se encuentra el número
//		for (int i=0; i<t.length; i++) {
//			if (valor == t[i]) tabla[i] = i;
//		}
		
		
		for (int i=0; i<t.length; i++) {
			if (t[i] == valor) {
				
				tabla = Arrays.copyOfRange(tabla, 0, i+1);
				
				System.err.println(Arrays.toString(tabla));
			}
		}
		
		// Devolvemos la tabla
		return tabla;
	}
	
}
