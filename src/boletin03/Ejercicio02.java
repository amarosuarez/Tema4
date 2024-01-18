package boletin03;

public class Ejercicio02 {

	public static void main(String[] args) {
		// Tabla de enteros
		int tabla[] = { 1, 222, 4, 35, 22, 9, 189, 2};
		
		// Llamamos a la función
		System.out.println(maximo(tabla));
	}
	
	// Función que devuelve el máximo de una tabla
	static int maximo(int t[]) {
		// Variable donde se almacenará el máximo, le damos el primer valor de la tabla
		int max = t[0];
		
		// For each para obtener el máximo
		for (int num : t) {
			if (num > max) max = num;
		}
		
		// Devolvemos el máximo
		return max;
	}
	
}
