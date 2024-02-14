package boletin05;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		
		// Variable donde se almacenará la contraseña
		String password = "";
		
		// Variable donde se almacenará la respuesta
		String resp = "";
		
		// Variable donde se almacenará el número de posiciones
		int numPos;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos la contraseña al usuario
		System.out.println("Bienvenido al juego 'Acierta la contraseña'\nIntroduzca la contraseña:");
		password = sc.nextLine();
		
		do {
			
			// Le preguntamos al usuario
			System.out.println("¿Cuál crees que es la contraseña?");
			resp = sc.nextLine();
			
			// Comparamos las cadenas
			numPos = password.compareTo(resp);			
			
			// Comprobamos que el numPos sea diferente de 0
			while (numPos != 0) {
				System.out.println("La contraseña es " + (numPos > 0 ? "mayor" : "menor") + " alfabéticamente\nVuelve a intentarlo:");
				resp = sc.nextLine();
				numPos = password.compareTo(resp);	
			}
			
			
		} while (numPos != 0);
		
		// Mostramos el mensaje de victoria
		System.out.println("¡Enhorabuena! Adivinaste la contraseña");
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
