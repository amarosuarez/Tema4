package boletin05;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {
        
        //Creamos una variable para recoger la frase introducida
        String frase = "";
        
        //Creamos una variable para contar las letras
        int contador;
        
        boolean encontrado = true;
        
        //Creamos una variable tabla para recoger las letras
        char[] letras;
        
        // Tabla donde se almacenarán las letras ya contadas
        String letrasContadas = "";
        
        //Creamos un nuevo Scanner
        Scanner sc = new Scanner ( System.in);
        
        //Solicitamos la frase al usuario
        System.out.println("Introduzca la frase que desea analizar:");
        
        //Leemos la frase del teclado
        frase = sc.nextLine().toLowerCase();
        
        letras = frase.replace(" ", "").toCharArray();
        
        for ( int i = 0; i < letras.length; i ++) {
            contador = 0;
                        
            for ( int j = i; j < letras.length; j ++) {
            	
            	if (letras[i] == letras[j]) {
            		contador++;
            	}
            	
            }
            
            if (!letrasContadas.contains(String.valueOf(letras[i]))) {            	
            	letrasContadas += letras[i];
            	
            	System.out.println(letras[i] + ": " + contador + " veces");
            }
            
        }
        
        //Cerramos el Scanner
        sc.close();

    }

}