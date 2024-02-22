package boletin05;

import java.util.Scanner;

public class Ejercicio09 {
	
	// Constante donde se almacena el primer dialecto
	static String DIALECTO1 = "Javalín, javalón";
	
	// Constante donde se almacena el segundo dialecto
	static String DIALECTO2 = "javalén, len, len";

    public static void main(String[] args) {
        // Variable donde se almacenará la cadena
    	String cadena = "";
    	
        // Creamos el Scanner
        Scanner sc = new Scanner(System.in);

        // Le pedimos el mensaje
        System.out.println("Introduzca el mensaje:");
        cadena = sc.nextLine();

        // Comprobamos que esté en idioma de Javalandia
        if (esIdiomaJavalandia(cadena)) {
            System.out.println("Traducción: " + traducir(cadena));
        } else {
            System.out.println("La frase no está en el idioma de Javalandia.");
        }
        
        // Cerramos el Scanner
        sc.close();
    }

    /**
     * Función que comprueba si la cadena está en idioma de Javalandia
     * @param cadena Cadena inicial
     * @return True o False si está en el idioma de Javalandia o no
     */
    public static boolean esIdiomaJavalandia(String cadena) {
        return cadena.startsWith("Javalín, javalón") || cadena.endsWith("javalén, len, len");
    }

    /**
     * Función que traduce la cadena desde el idioma de Javalandia
     * @param cadena Cadena en idioma de Javalandia
     * @return Cadena traducida
     */
    public static String traducir(String cadena) {
    	// Cadena donde se almacenará el resultado
        String resultado = cadena;
        
        // Si empieza o acaba en algún dialecto, extraemos la subcadena
        if (cadena.startsWith(DIALECTO1)) {
            resultado = cadena.substring(DIALECTO1.length()).trim();
        } else if (cadena.endsWith(DIALECTO2)) {
            resultado = cadena.substring(0, cadena.length() - DIALECTO2.length()).trim();
        }

        // Devolvemos el resultado
        return resultado;
    }

}