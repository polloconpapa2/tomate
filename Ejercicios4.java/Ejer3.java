import java.util.Random;

public class Ejer3 {
    public class MatrizConSumas {
    public static void main(String[] args) {
        final int FILAS = 4;
        final int COLUMNAS = 5;
        int[][] matriz = new int[FILAS][COLUMNAS];
        int[] sumaFilas = new int[FILAS];
        int[] sumaColumnas = new int[COLUMNAS];
        int sumaTotal = 0;

        Random rand = new Random();

        
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                matriz[i][j] = rand.nextInt(900) + 100; 
                sumaFilas[i] += matriz[i][j];
                sumaColumnas[j] += matriz[i][j];
                sumaTotal += matriz[i][j];
            }
        }

       
        System.out.println("Matriz con sumas parciales (tipo hoja de cálculo):");
        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                System.out.printf("%5d", matriz[i][j]);
            }
            System.out.printf(" | %5d\n", sumaFilas[i]); 
        }

        
        System.out.println("----------------------------------------");

        
        for (int j = 0; j < COLUMNAS; j++) {
            System.out.printf("%5d", sumaColumnas[j]);
        }
        System.out.printf(" | %5d\n", sumaTotal); 
    }
}
}
