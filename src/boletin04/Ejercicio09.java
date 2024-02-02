package boletin04;

public class Ejercicio09 {

	public static void main(String[] args) {

		// Tabla mágica
		int[][] t = 
			{ 
				{ 1, 1, 1 }, 
				{ 1, 1, 1 }, 
				{ 1, 1, 1 } 
			};

		System.out.println(esMagica(t));

	}

	// Función que recibe una tabla bidimensional y devuelve si es matriz mágica o
	// no
	static boolean esMagica(int tabla[][]) {
		// Variable donde se almacenará si es mágica
		boolean magica = true;

		// Variable donde se almacenará la suma anterior
		int sumaAnterior = 0;

		// Variable donde se almacenará la suma
		int suma = 0;

		// Contador filas
		int contadorFilas = 0;

		// Contador columnas
		int contadorColumnas = 0;

		// Bucle para obtener el valor de la primera suma de la primera fila
		for (int i = 0; i < 1; i++) {
			
			for (int j = 0; j < tabla[i].length; j++) {
				suma += tabla[i][j];
			}
			
			
			sumaAnterior = suma;
			suma = 0;
		}
		
		// Bucle para comprobar las sumas de las filas
		while (contadorFilas < tabla.length) {
			
			while (contadorColumnas < tabla[contadorFilas].length) {

				suma += tabla[contadorFilas][contadorColumnas];
				contadorColumnas++;

			}
			
			if (suma != sumaAnterior) {
				magica = false;
				break;
			}
			
			sumaAnterior = suma;
			
			contadorFilas++;
			contadorColumnas = 0;
			suma = 0;
			
		}
		
		// Reseteamos el contador de las filas
		contadorFilas = 0;
		
		// Bucle para comprobar la sumas de las columnas
		while (magica && contadorColumnas < tabla[0].length) {
			
			while (contadorFilas < tabla.length) {

				suma += tabla[contadorFilas][contadorColumnas];
				contadorFilas++;

			}
			
			if (suma != sumaAnterior) {
				magica = false;
				break;
			}
			
			sumaAnterior = suma;
			
			contadorColumnas++;
			contadorFilas = 0;
			suma = 0;
		}

		// Devolvemos el booleano
		return magica;
	}

}
