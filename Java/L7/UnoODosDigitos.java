import java.util.Scanner;

public class UnoODosDigitos {

  public static void main (String[] args) {
    Scanner teclado = new Scanner(System.in);

    int num1;

    System.out.println("Este programa calcula si un numero tiene 1 0 2  dígitos (0 - 99)");
    System.out.print("Ingrese el número a calcular: ");
    num1 = teclado.nextInt();
    System.out.println("");

    if (num1 >= 10){
      System.out.println("Este número tiene 2 dígitos. " +  num1);
    } else
    System.out.println("Este número tiene un sólo dígito. " + num1);
  }
}
