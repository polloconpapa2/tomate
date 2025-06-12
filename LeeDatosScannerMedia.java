import java.util.Scanner;

public class LeeDatosScannerMedia {
    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);
        System.out.println("ingresa 3 numeros (con decimales) separados por un espacio");
        double num1 = nombre.nextDouble();
        double num2 = nombre.nextDouble();
        double num3 = nombre.nextDouble();

        double promedio = ( num1 + num2 + num3)/3;
        System.out.println("el promedio de 3 numeros es : " +promedio);
        
    }
    
}
