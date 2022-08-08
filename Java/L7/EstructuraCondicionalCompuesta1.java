import java.util.Scanner;

public class EstructuraCondicionalCompuesta1 {

  public static void main (String [] args) {
    Scanner teclado = new Scanner(System.in);
    int num1, num2;
    System.out.println("Este programa calcula el mayor numero entre dos números");
    System.out.print("Ingrese el primer número: ");
    num1 = teclado.nextInt();
    System.out.print("Ingrese el segundo número: ");
    num2 = teclado.nextInt();

    if (num1 < num2)
      System.out.println("El numero mayor es: " + num2);
    else
      System.out.println("El numero mayor es: " +  num1);
  }
}
