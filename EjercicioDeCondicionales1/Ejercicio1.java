package EjercicioDeCondicionales1;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el número de horas trabajadas durante la semana: ");
        double horas = scanner.nextDouble();
        
        double salario;
        if (horas <= 40) {
            salario = horas * 12; // 12 soles por hora normal
        } else {
            salario = 40 * 12 + (horas - 40) * 16; // 16 soles por hora extra
        }
        
        System.out.println("El sueldo semanal que le corresponde es de " + salario + " soles");
    }
    }
