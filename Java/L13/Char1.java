import java.util.Scanner;

public class Char1 {
  public static void main (String[] args){
    Scanner teclado = new Scanner (System.in);

    System.out.println("Este programa calcula de dos personas quien es mas grande.");

    String nombre1, nombre2;
    int edad1, edad2;

    System.out.print("Ingrese el nombre de la primera persona: ");
    nombre1 = teclado.next();     //solamente 1 nombre (sin espacios)
    System.out.print("Ingrese la edad de la primera persona: ");
    edad1 = teclado.nextInt();
    System.out.print("Ingrese el nombre de la segunda persona: ");
    nombre2 = teclado.next();
    System.out.print("Ingrese la edad de la segunda persona: ");
    edad2 = teclado.nextInt();
    System.out.print("La persona de mayor edad es: ");
    if (edad1 > edad2)
      System.out.println(nombre1);
    else
      System.out.println(nombre2);
  }
}
