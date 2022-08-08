import java.util.Scanner;

public class ForMultiplo {
  public static void main (String[] args) {
    Scanner teclado = new Scanner (System.in);
    int mult3, mult5, valor, x;
    mult3 = 0;
    mult5 = 0;

    System.out.println("Este programa calcula de 10 numeros dados cuantos son multiplos de 3 o de 5.");
    for ( x = 1; x <= 10; x++ ) {
      System.out.print("Ingrese el " + x + " valor: ");
      valor = teclado.nextInt();
      if ( valor%3 == 0)
        mult3 = mult3 + 1;
      if ( valor%5 == 0)
        mult5 = mult5 + 1;
    }
    System.out.println("El numero de numeros multiplos de 3 es de: " + mult3);
    System.out.println("El numero de numeros multiplos de 5 es de: " + mult5);
  }
}
