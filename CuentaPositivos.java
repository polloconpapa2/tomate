public class CuentaPositivos {
    public static void main(String[] args) {
        System.out.println("ingrese numero y pulse INTRO");
        System.out.println("para terminar ingrese un numero negativo");
        int cuentaNumero = 0;
        int numeroIngresado =0;
        int suma = 0;
        
        while (numeroIngresado >= 0) {
            numeroIngresado = Integer.parseInt(System.console().readLine());
            cuentaNumero++;
            suma = suma + numeroIngresado;

            
        }
        System.out.println("has ingresado "+ (cuentaNumero - 1)+ "numeros positivos ");
        System.out.println("la suma total de ellos es" + (suma + numeroIngresado));
    }
    
}
