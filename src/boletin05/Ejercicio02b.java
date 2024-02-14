package boletin05;

import java.util.Scanner;

public class Ejercicio02b {

	public static void main(String[] args) {
		
		// Variable donde se almacenará la contraseña
		String password = "";
		
		// Variable donde se almacenará la respuesta
		String resp = "";
		
		// Variable dodne se almacenará el resultado
		String resultado = "";
		
		// Variable donde se almacenar el caracter
		char caracter;
		
		// Variable donde se almacenará el número de posiciones
		int numPos;
		
		// Creamos el Scanner
		Scanner sc = new Scanner(System.in);
		
		// Le pedimos la contraseña al usuario
		System.out.println("Bienvenido al juego 'Acierta la contraseña'\nIntroduzca la contraseña:");
		password = sc.next();
		
		// Le pedimos la contraseña al usuario hasta que la encuentre
		do {
			resultado = "";
			System.out.println("Escriba el intento");
			resp = sc.next();
			
			while (resp.length() != password.length()) {
				System.out.println("La longitud de la contraseña es: " + password.length());
				System.out.println("Vuelve a intentarlo:");
				resp = sc.next();
			}
			
			for (int i=0; i<password.length(); i++) {
				caracter = password.charAt(i);
				if (caracter == resp.charAt(i)) {
					resultado += caracter;
				} else {
					resultado += "*";
				}
			}
			
			System.out.println(resultado);
			
		} while (!password.equals(resp));
		
		// Mostramos el mensaje de victoria
		System.out.println("¡Enhorabuena! Adivinaste la contraseña");
		
		// Cerramos el Scanner
		sc.close();
	}
	
}
