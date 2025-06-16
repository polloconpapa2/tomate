public class NumeroPositivo {
    public static void main(String[] args) {
        int numero;

        System.out.println("por favor, ingrese un numero entero");
        numero = Integer.parseInt(System.console().readLine());

        if (numero > 0) {
            System.out.println("el numero ingresado es positivo");
            
        } else {
            System.out.println("el numero ingresado es negativo");
            
        }
    }
    
}
