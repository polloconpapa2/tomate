import Biblioteca.Matematicas;
public class Funcion2 {
    public static void main(String[] args) {
        int num1, num2;
        System.out.println("programa la suma de dos numeros enteros");
        System.out.println("ingrese el primer numero: ");
        num1 = Integer.parseInt(System.console().readLine());
        System.out.println("ingrese el segundo numero: ");
        num2 = Integer.parseInt(System.console().readLine());

        System.out.print("la suma es: " + Matematicas.miSuma(num1, num2));
        System.out.print("\nla resta es: " + Matematicas.miResta(num1, num2));
        System.out.print("\nla multiplicación es: " + Matematicas.miMultiplicacion(num1, num2));
        System.out.print("\nla división es: " + Matematicas.miDivision(num1, num2));
    }
    
    }
    

