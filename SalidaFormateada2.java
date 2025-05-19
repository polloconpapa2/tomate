public class SalidaFormateada2 {
    public static void main(String[] args) {
        System.out.println("articulo \tprecio    \tNº cajas");
        System.out.println("--------\t----------\t----------");
     System.out.printf("%-10s\t%8.2f\t%6d\n", "manzana",4.5,10);
      System.out.printf("%-10s\t%8.2f\t%6d\n", "brocolo",1.5,15);
       System.out.printf("%-10s\t%8.2f\t%6d\n", "mandarina",3.4,8);
        System.out.printf("%-10s\t%8.2f\t%6d\n", "cebolla",6.7,12);
         System.out.printf("%-10s\t%8.2f\t%6d\n", "pera",2.5,14);
         System.out.printf("%-10s\t%8.2f\t%6d\n", "naranja",3.6,19);
         System.out.printf("%-10s\t%8.2f\t%6d\n", "cebolla china",1.5,5);
        
    }
    
}
