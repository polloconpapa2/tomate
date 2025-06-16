package Ejemplo1;

import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         double prac, exp, inv, exa, act;
         System.out.println("ingrese las 5 notas separadas por un espacio");
         prac = s.nextDouble();
         exp = s.nextDouble();
         inv = s.nextDouble();
         exa = s.nextDouble();
         act = s.nextDouble();

         double  promedio = (prac+exp+inv+exa+act)/5;
         if (promedio >= 10.5) {
            System.out.println("aprobado con "+promedio);
            
         } else {
            System.out.println("desaprobado con "+promedio);
            
         }
    }
    
}
