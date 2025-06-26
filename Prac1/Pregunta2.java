package Prac1;

import java.util.Scanner;

public class Pregunta2 {
  
public static void main(String[] args) {
        Scanner Teclado = new Scanner(System.in);

        int a;
        System.out.println("Ingrese un numero del 1 al 100: ");
        a= Teclado.nextInt();

           if (a >= 1 && a <= 100) {
            if (a % 3 == 0) {
            if (a % 5 == 0) {
                System.out.println("funf");
            } else {
                System.out.println("drei");
                }
            } else {
            if (a % 5 == 0) {
                System.out.println("funf");
                } else {
                System.out.println(a);
                }
            }
        } else {
            System.out.println("Error: número fuera de rango");
        }
    }
}

    

