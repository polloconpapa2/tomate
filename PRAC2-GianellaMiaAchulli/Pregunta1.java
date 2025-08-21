import java.util.Scanner;

public class Pregunta1 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Creamos un array grande para guardar los números (máximo 100)
        int[] numeros = new int[100];
        int cantidad = 0; // Contador de números válidos

        System.out.println("Introduce números (negativo para terminar):");

        // Entrada de datos
        while (true) {
            System.out.print("Número: ");
            int numero = scanner.nextInt();

            if (numero < 0) { // Si es negativo, cortamos
                break;
            }

            // Guardamos en el array
            numeros[cantidad] = numero;
            cantidad++;
        }

        // Variables para cálculos
        int sumaImpares = 0;
        int cantidadImpares = 0;
        int mayorPar = 0; // Lo iniciamos en 0
        int contadorPares = 0; // Para saber si hubo pares

        // Recorremos el array
        for (int i = 0; i < cantidad; i++) {
            int n = numeros[i];

            if (n % 2 == 0) { // PAR
                if (contadorPares == 0 || n > mayorPar) {
                    mayorPar = n;
                }
                contadorPares++;
            } else { // IMPAR
                sumaImpares += n;
                cantidadImpares++;
            }
        }

        // Salida de resultados
        System.out.println("\n--- RESULTADOS ---");
        System.out.println("Cantidad de números introducidos: " + cantidad);

        if (cantidadImpares > 0) {
            double mediaImpares = (double) sumaImpares / cantidadImpares;
            System.out.printf("Media de los números impares: %.2f%n", mediaImpares);
        } else {
            System.out.println("No se introdujeron números impares.");
        }

        if (contadorPares > 0) {
            System.out.println("Mayor de los números pares: " + mayorPar);
        } else {
            System.out.println("No se introdujeron números pares.");
        }

        scanner.close();
    }
}
    

