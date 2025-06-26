package Prac1;
import java.util.Scanner;

public class Pregunta1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un carácter: ");
        char caracter = scanner.next().toLowerCase().charAt(0);

        if (caracter == 'a' || caracter == 'e' || caracter == 'i' ||
                caracter == 'o' || caracter == 'u') {
            System.out.println("El carácter '" + caracter + "' es una vocal.");
        } else {
            System.out.println("El carácter '" + caracter + "' no es una vocal.");
        }

        scanner.close();
    }
}
