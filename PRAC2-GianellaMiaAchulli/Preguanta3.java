import java.util.Random;

public class Preguanta3 {
    public static void main(String[] args) {
        Random random = new Random();

        // Creamos un array para guardar los números generados (máximo 200 por seguridad)
        int[] numeros = new int[200];
        int cantidad = 0;

        // Generar números hasta que salga el 24
        while (true) {
            // Generar número par entre 0 y 100
            int num = random.nextInt(51) * 2;

            // Guardamos en el array
            numeros[cantidad] = num;
            cantidad++;

            // Verificamos si salió el 24
            if (num == 24) {
                break;
            }
        }

        // Mostrar resultados
        System.out.println("=== NÚMEROS GENERADOS ===");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(numeros[i] + " ");
        }

        System.out.println("\nCantidad total de números generados: " + cantidad);
    }
}
    
    
