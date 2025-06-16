package Ejemplo1;

public class Aprobados {
    public static void main(String[] args) {
        double nota;
        System.out.println("ingrese la nota del estudiante");
        nota = Integer.parseInt(System.console().readLine());

        if (nota >= 10.5) {
            System.out.println("apueba");
            
        } else {
            System.out.println("desaprueba");
            
        }
            
        

    }
    
}
