package boletin03;

public class Ejercicio01 {

	public static void main(String[] args) {
		// Tabla de enteros
		int tabla[] = {1, 22, 56, 10, 7, 26, 15};
		
		// Llamamos a la funcion
		System.out.println(suma(tabla));
	}
	
	// Función que recibe una tabla de enteros y devuelve la suma de todos los valores
	static int suma(int[] tabla) {
		// Variabla donde se almacenará el resultadao de la suma
		int res = 0;
		
		// For each para obtener cada valor
		for (int num : tabla) {
			res += num;
		}
		
		// Devolvemos el resultado de la suma
		return res;
	}
}
