package Ejercicios3;

import java.util.Scanner;

public class Ejercicio5 {
     public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
        System.out.println("ingresa 2 numeros (con decimales) separados por un espacio");
        double largo = nombre.nextDouble();
        double ancho = nombre.nextDouble();
        

        double promedio = ( largo * ancho );
        System.out.println("el promedio de 2 numeros es : " +promedio);
        
    }
    
}

    
