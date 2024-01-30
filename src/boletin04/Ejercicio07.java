package boletin04;

public class Ejercicio07 {

	public static void main(String[] args) {

		// Creamos un array bidimensional
		int[][] tabla = new int[4][4];

		// Array bidimensional transposicionado
		int[][] t = new int[4][4];

		// Le damos los valores
		tabla[0][0] = 1;
		tabla[0][1] = 2;
		tabla[0][2] = 3;
		tabla[0][3] = 4;

		tabla[1][0] = 5;
		tabla[1][1] = 6;
		tabla[1][2] = 7;
		tabla[1][3] = 8;

		tabla[2][0] = 9;
		tabla[2][1] = 10;
		tabla[2][2] = 11;
		tabla[2][3] = 12;

		tabla[3][0] = 13;
		tabla[3][1] = 14;
		tabla[3][2] = 15;
		tabla[3][3] = 16;

		// Llamamos a la funcion
		t = tablaTransposicionada(tabla);

		// Imprimimos por pantalla
		// Bucle para recorrer las filas
		for (int i = 0; i < tabla.length; i++) {

			// Bucle para recorrer las columnas
			for (int j = 0; j < tabla[i].length; j++) {

				// Mostramos el valor
				System.out.print(tabla[i][j] + "\t");

			}

			// Salto de línea
			System.out.println();

		}

		System.out.println();
		
		// Bucle para recorrer las filas
		for (int i = 0; i < t.length; i++) {

			// Bucle para recorrer las columnas
			for (int j = 0; j < t[i].length; j++) {

				// Mostramos el valor
				System.out.print(t[i][j] + "\t");

			}

			// Salto de línea
			System.out.println();

		}
	}

	// Función que recibe un array bidimensional y retorna su transposición
	static int[][] tablaTransposicionada(int[][] t) {
		// Array bidimensional donde se almacenará la nueva tabla
		int[][] tabla = new int[4][4];

		// Bucle para recorrer las filas
		for (int i = 0; i < t.length; i++) {

			// Bucle para recorrer las columnas
			for (int j = 0; j < t[i].length; j++) {

				// Asignamos el valor
				tabla[j][i] = t[i][j];
			}

		}

		// Devolvemos la tabla
		return tabla;
	}

}
