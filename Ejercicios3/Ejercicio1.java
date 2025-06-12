package Ejercicios3;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
       Scanner nombre = new Scanner(System.in);
        System.out.println("ingresa 2 numeros (con decimales) separados por un espacio");
        double num1 = nombre.nextDouble();
        double num2 = nombre.nextDouble();
        

        double promedio = ( num1 * num2 );
        System.out.println("el promedio de 2 numeros es : " +promedio);
        
    }
    
}
