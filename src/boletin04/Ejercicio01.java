package boletin04;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		// Tabla bidimensional de 3x6
		int[][] num = new int[3][6];
		
		// Asignamos los números
		num[0][0] = 0;
		num[0][1] = 30;
		num[0][2] = 2;
		num[0][5] = 5;
		num[1][0] = 75;
		num[1][4] = 0;
		num[2][2] = -2;
		num[2][3] = 9;
		num[2][5] = 11;
		
		// Bucle para recorrer las filas
		for (int i = 0; i < num.length; i++) {
			
			// Bucle para recorrer las columnas
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "\t");
			}
			
			// Salto de línea
			System.out.println();
		}
		
	}
	
}
