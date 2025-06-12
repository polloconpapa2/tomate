package Ejercicios3;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
        double soles , euros;
         System.out.println("ingrese la cantidad de soles a covertir : ");
         soles = teclado.nextDouble();
         euros = soles /4.20;
         System.out.println("la cantidad de euros seria de : " + euros);
    }
    
}
