package boletin04;

public class Ejercicio09 {

	public static void main(String[] args) {
		
		// Tabla mágica
		int[][] t = {
				{1, 1, 1},
				{1, 2, 1},
				{1, 1, 1}
		};
		
		System.out.println(esMagica(t));
		
	}
	
	// Función que recibe una tabla bidimensional y devuelve si es matriz mágica o no
	static boolean esMagica(int tabla[][]) {
		// Variable donde se almacenará si es mágica
		boolean magica = true;
		
		// Variable donde se almacenará la suma de las filas
		int sumaFila = 0;
		
		// Variable donde se almacenará la suma de las columnas
		int sumaColumna = 0;
		
		// Variable donde se almacenará el resultado a conseguir
		int res = 0;
		
		// Bucle para recorrer las filas
		for (int i = 0; i < tabla.length; i++) {
			
			// Bucle para recorrer las columnas
			for (int j = 0; j < tabla[i].length; j++) {
	
				sumaFila+=tabla[i][j];
				sumaColumna+=tabla[j][i];
				
			}
			
			System.out.print("TF "+sumaFila+" - TC "+sumaColumna);
			
			System.out.println();
			
		}
		
		if (sumaFila != sumaColumna) {
			magica = false;
		}
		
		// Devolvemos el boolean
		return magica;
	}
	
}
