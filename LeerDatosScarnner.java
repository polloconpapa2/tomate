import java.util.Scanner;

public class LeerDatosScarnner {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
        //System.out.println("ingrese su nombre");
        //String nombre = s. nextLine();
        //System.out.println("ingrese su edad");
        //int edad = Integer.parseInt(s.nextLine());

        System.out.println("ingrese su nombre y edad por separados por un espacio: ");
        String nombre = s.next();
        int edad = s.nextInt();
        System.out.println("tu nombre es : " +nombre+ " tu edad es : " +edad);

    }
    
}
