package Ejercicios3;

import java.util.Scanner;

public class Ejercicio6 {
  
     public static void main(String[] args) {
        Scanner trian = new Scanner(System.in);
        double  base , altura , triangulo;
        System.out.println("ingresa el primer numero : ");
        base = trian.nextDouble();
        System.out.println("ingresa el primer numero : ");
        altura = trian.nextDouble();
        

        triangulo = ( base * altura )/2;
        System.out.println("el area del triangulo es : " +triangulo);
        
    }
    
}
    

