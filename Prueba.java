import java.util.Scanner;

public class Prueba
{
    public static void main(String[] args)
    {
        @SuppressWarnings("resource")
        Scanner scanner = new Scanner(System.in); //Se crea el lector

        System.out.println(" \nPor favor ingrese su nombre");//Se pide un dato al usuario

        String nombre = scanner.nextLine(); //Se lee el nombre con nextLine() que retorna un String con el dato

        System.out.println(" \n Bienvenido " + nombre + ". Por favor ingrese su edad");//Se pide otro dato al usuario

        int edad = scanner.nextInt(); //Se guarda la edad directamente con nextInt()

        //Nótese que ya no hubo necesidad de usar parseInt() pues nextInt nos retorna un entero derectamente

        System.out.println(" \nGracias " + nombre + " en 10 años usted tendrá " + (edad + 10) + " años."); //Operacion numerica con la edad
    }
}