package boletin04;

public class Ejercicio09 {

	public static void main(String[] args) {

		// Tabla mágica
		int[][] t = 
			{ 
				{ 4, 9, 2 }, 
				{ 3, 5, 7 }, 
				{ 8, 1, 6 } 
			};
		
		// Llamamos a la función y lo imprimimos
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
		for (int j = 0; j < tabla[0].length; j++) {
			suma += tabla[0][j];
		}
		
		// Le damos a la variable sumaAnterior el valor de la suma total de la primera fila
		sumaAnterior = suma;
		
		// Reiniciamos el valor de la suma
		suma = 0;
		
		// Bucle para comprobar las sumas de las filas
		while (contadorFilas < tabla.length) {
			
			// Ejecutamos mientras no se llegue al final de la tabla
			while (contadorColumnas < tabla[contadorFilas].length) {
				// Sumamos los valores
				suma += tabla[contadorFilas][contadorColumnas];
				
				// Incrementamos el valor del contador
				contadorColumnas++;

			}
			
			// Comprobamos si la suma es diferente a la anterior
			if (suma != sumaAnterior) {
				// Colocamos false y salimos del bucle
				magica = false;
				break;
			}
			
			// Le damos a la variable sumaAnterior el valor de la suma total de la fila
			sumaAnterior = suma;
			
			// Aumentamos el contador de filas
			contadorFilas++;
			
			// Reiniciamos el contador de columnas y la suma
			contadorColumnas = 0;
			suma = 0;
			
		}
		
		// Reseteamos el contador de las filas
		contadorFilas = 0;
		
		// Bucle para comprobar la sumas de las columnas
		while (magica && contadorColumnas < tabla[0].length) {
		
			// Ejecutamos mientras no lleguemos al final de la fila
			while (contadorFilas < tabla.length) {
				
				// Sumamos los valores
				suma += tabla[contadorFilas][contadorColumnas];
				
				// Incrementamos el contador de las filas
				contadorFilas++;

			}
			
			// Comprobamos si la suma es diferente a la anterior
			if (suma != sumaAnterior) {
				// Colocamos en false y salimos del bucle
				magica = false;
				break;
			}
			
			// Le damos a la variable sumaAnterior el valor de la suma total de la fila
			sumaAnterior = suma;
			
			// Aumentamos el contador de las columnas
			contadorColumnas++;
			
			// Reiniciamos el contador de las filas y la suma
			contadorFilas = 0;
			suma = 0;
		}

		// Devolvemos el booleano
		return magica;
	}

}
