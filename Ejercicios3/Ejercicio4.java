package Ejercicios3;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
        System.out.println("ingresa 2 numeros (con decimales) separados por un espacio");
        double num1 = nombre.nextDouble();
        double num2 = nombre.nextDouble();
       

       
        double suma = ( num1 + num2 );
        double resta = ( num1 - num2 );
        double multiplicacion = ( num1 * num2 );
        double division = ( num1 / num2 );
     
        System.out.println("suma : "+suma );
        System.out.println("resta : "+resta);
        System.out.println("multiplicacion : "+multiplicacion);
         System.out.println("division : "+division );
        
    }
    
}
