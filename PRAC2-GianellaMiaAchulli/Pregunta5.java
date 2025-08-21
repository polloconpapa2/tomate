import java.util.Random;

public class Pregunta5 {
      public static void main(String[] args) {
        int[][] matriz = new int[10][10];
        Random rand = new Random();

        // Llenar matriz con números aleatorios entre 200 y 300
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = 200 + rand.nextInt(101); // [200,300]
            }
        }

        // Mostrar la matriz completa
        System.out.println("Matriz 10x10:");
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        // Procesar la diagonal principal
        int suma = 0;
        int max = matriz[0][0];
        int min = matriz[0][0];

        System.out.println("\nDiagonal principal:");
        for (int i = 0; i < 10; i++) {
            int valor = matriz[i][i];
            System.out.print(valor + " ");
            suma += valor;

            if (valor > max) {
                max = valor;
            } else if (valor < min) {
                min = valor;
            }
        }

        double media = (double) suma / 10;

        // Resultados
        System.out.println("\n\nResultados:");
        System.out.println("Máximo: " + max);
        System.out.println("Mínimo: " + min);
        System.out.println("Media: " + media);
    }
}

