import java.util.Scanner;

public class SuperficieCuadrado {

  public static void main (String[] args) {
    Scanner teclado = new Scanner (System.in);
    int lado;
    int superficie;
    System.out.println("Ingrese el valor del lado del cuadrado:");
    lado = teclado.nextInt();
    superficie = lado * lado;
    System.out.println("La superficie del cuadrado es:");
    System.out.println(superficie);
  }
}
