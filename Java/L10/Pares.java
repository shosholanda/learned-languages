import java.util.Scanner;

public class Pares {
  public static void main (String[] args) {
    Scanner teclado = new Scanner(System.in);
    int n, par, impar, x, y;      // n es la cantidad de números que se ingresará, y es el número ingresado
    par = 0;            //Cantidad pares
    impar = 0;          //Cantidad impares
    x = 1;              //Contador

    System.out.println("Este programa calcula dados 'n' números dice cuantos son pares y cuantos impares.");
    System.out.print("Ingrese la cantidad de números que quiere calcular: ");
    n = teclado.nextInt();
    while (x <= n) {
      System.out.print("Ingrese el " + x + " número: ");
      y = teclado.nextInt();
      if ( y % 2 == 0)
        par = par + 1;
      else
        impar = impar + 1;
      x = x + 1;
    }
    System.out.println("Hay " + par + " números pares.");
    System.out.println("Hay " + impar + " números impares.");
  }
}
