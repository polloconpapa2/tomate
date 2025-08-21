import java.util.Random;

public class Pregunta4 {

public class ArrayParesImpares {
    public static void main(String[] args) {
        int[] numeros = new int[20];
        int[] pares = new int[20];
        int[] impares = new int[20];
        int contadorPares = 0;
        int contadorImpares = 0;

        Random rand = new Random();

        // Generar números aleatorios y guardarlos
        System.out.println("Números generados:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = rand.nextInt(101); // de 0 a 100
            System.out.print(numeros[i] + " ");

            // Clasificar en pares e impares
            if (numeros[i] % 2 == 0) {
                pares[contadorPares++] = numeros[i];
            } else {
                impares[contadorImpares++] = numeros[i];
            }
        }

        // Reorganizar el array original: primero pares, luego impares
        for (int i = 0; i < contadorPares; i++) {
            numeros[i] = pares[i];
        }
        for (int i = 0; i < contadorImpares; i++) {
            numeros[contadorPares + i] = impares[i];
        }

        // Mostrar resultado
        System.out.println("\n\nArray reorganizado (pares primero, impares después):");
        for (int num : numeros) {
            System.out.print(num + " ");
        }
    }
}

    }

