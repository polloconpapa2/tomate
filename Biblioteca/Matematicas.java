package Biblioteca;

public class Matematicas {
    
    public static int miSuma (int x, int y) {
        return x + y;
        }

        public static int miResta (int x, int y) {
        return x - y;
        }

        public static int miMultiplicacion (int x, int y) {
        return x * y;
        }
        
       public static double miDivision(int x, int y) {
        if (y == 0) {
            return -1;
        } else {
            return (double)(x / y);
        }

        
     }   
}
