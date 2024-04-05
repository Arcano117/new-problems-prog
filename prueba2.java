
import java.util.Scanner;

public class prueba2 {
    
    public static void main(String[] args){

        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in);

        int suma;

        System.out.println(" \n Cual es el primer numero ");
        int num = scanner.nextInt();

        System.out.println(" \n Cual es el segundo numero ");
        int num2 = scanner.nextInt();

        suma = num + num2;

        System.out.println(" \n El resultado es " + suma);
    }

}