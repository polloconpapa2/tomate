import java.util.Random;

public class Ejer4 {
     public static void main(String[] args) throws InterruptedException {
        final int FILAS = 4;
        final int COLUMNAS = 5;

        int[][] matriz = new int[FILAS][COLUMNAS];
        int[] sumaFilas = new int[FILAS];
        int[] sumaColumnas = new int[COLUMNAS];
        int sumaTotal = 0;

          Random random = new Random();

       
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                int numero = random.nextInt(101); 
                matriz[i][j] = numero;
                sumaFilas[i] += numero;
                sumaColumnas[j] += numero;
                sumaTotal += numero;
            }
        }

       
        System.out.println("Matriz con sumas parciales (tipo hoja de cálculo):");

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.printf("%5d", matriz[i][j]);
            }

            
            Thread.sleep(1000);
            System.out.printf(" | %5d\n", sumaFilas[i]);
        }

        
        System.out.println("------------------------------");

        
        Thread.sleep(1000);
        for (int j = 0; j < COLUMNAS; j++) {
            System.out.printf("%5d", sumaColumnas[j]);
        }

        
        Thread.sleep(1000);
        System.out.printf(" | %5d\n", sumaTotal);
    }
}

