import java.util.Scanner;

public class Pregunta2 {
    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

        // Pedimos la altura de la U
        System.out.print("Introduzca la altura de la U: ");
        int altura = scanner.nextInt();

        // Creamos un array de strings para guardar cada línea de la U
        String[] dibujo = new String[altura];

        // Construimos la U línea por línea
        for (int i = 0; i < altura; i++) {
            String linea = "";

            if (i < altura - 1) {
                // Parte vertical: asterisco al inicio y al final
                for (int j = 0; j < altura; j++) {
                    if (j == 0 || j == altura - 1) {
                        linea += "*";
                    } else {
                        linea += " ";
                    }
                }
            } else {
                // Última línea (la base con dos asteriscos menos y ajustada a la altura)
                for (int j = 0; j < altura; j++) {
                    if (j > 0 && j < altura - 1) {
                        linea += "*";
                    } else {
                        linea += " ";
                    }
                }
            }

            // Guardamos la línea en el array
            dibujo[i] = linea;
        }

        // Imprimir el dibujo final
        for (int i = 0; i < altura; i++) {
            System.out.println(dibujo[i]);
        }

        scanner.close();
    }
}
    
