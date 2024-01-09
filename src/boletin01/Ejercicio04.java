package boletin01;

public class Ejercicio04 {
	
	public static void main(String[] args) {
		// Tabla donde se almacenará los números
		int num[] = new int[12];
		
		// Damos los valores
		num[0] = 39;
		num[1] = -2;
		num[4] = 0;
		num[6] = 14;
		num[8] = 5;
		num[9] = 120;
		
		// Bucle para mostrar los números
		for (int numero : num) {
			System.out.println(numero);
		}
		
		// Los números no inicializados aparecen como 0
	}
	
}
