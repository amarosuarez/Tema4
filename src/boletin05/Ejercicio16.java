package boletin05;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio16 {

	public static void main(String[] args) {
		
		// Variable donde se almacanerá la frase
		String frase = "";
		
		// Variable donde se almacenará la frase transpuesta
		String fraseTransp = "";
		
		// Variable donde se almacenará la respuesta
		String respuesta = "";
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos al usuario la frase
		do {
			System.out.println("Introduce una frase jugador 1");
			frase = sc.nextLine();
		} while (frase.equals(""));
		
		do {
			// Reordenamos la frase
			fraseTransp = Ejercicio15.fraseRandom(frase);
			
			// Le mostramos al usuario la pista
			System.out.println("Jugador 2 tu pista es: " + fraseTransp + "\nAdivina");
			respuesta = sc.nextLine();
			
			System.out.println("Has acertado " + coinciden(frase, respuesta) + " letras");
			
		} while (!respuesta.equals(frase));
		
		// Mostramos el mensaje de victoria
		System.out.println("¡Enhorabuena!");
		
		// Cerramos el Scanner
		sc.close();
	}
	
	/**
	 * Método que cuenta cuantas palabras coinciden en la misma posición
	 * @param frase Frase base
	 * @param resp Respuesta del usuario
	 * @return Número de aciertos
	 */
	static int coinciden(String frase, String resp) {
		// Variable donde se almacenará el número de letras acertadas
		int num = 0;
		
		// Tabla donde se almacenará la frase
		char[] tabla = frase.toCharArray();
		
		// Tabla donde se almacenará la respuesta
		char[] tablaResp = resp.toCharArray();
		
		for (int i = 0; i < tablaResp.length; i++) {
			if (tablaResp[i] == tabla[i]) 
				num++;
		}
		
		// Devolvemos el número de letras acertadas
		return num;
	}
}
