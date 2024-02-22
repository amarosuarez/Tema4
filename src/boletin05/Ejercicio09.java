package boletin05;

import java.util.Scanner;

public class Ejercicio09 {

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
    	
        String dialecto1 = "Javalín, javalón";
        String dialecto2 = "javalén, len, len";
        String resultado = cadena;
        
        // Si empieza o acaba en algún dialecto, extraemos la subcadena
        if (cadena.startsWith(dialecto1)) {
            resultado = cadena.substring(dialecto1.length()).trim();
        } else if (cadena.endsWith(dialecto2)) {
            resultado = cadena.substring(0, cadena.length() - dialecto2.length()).trim();
        }

        // Devolvemos
        return resultado;
    }

}