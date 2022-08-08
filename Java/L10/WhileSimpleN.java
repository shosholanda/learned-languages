import java.util.Scanner;

public class WhileSimpleN {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int x, n;
    x = 0;

    System.out.println("Este programa imprime la secuencia de los primeros 'n' numeros desde el 0");
    System.out.print("Ingrese el valor hasta donde quiere la secuencia (n): ");
    n = teclado.nextInt();

    if (n > 0) {
      System.out.println("La secuencia es positiva. (+)");
      while (x < n) {
        System.out.print(x + ", ");
        x = x +1;
      }
    } else {
      System.out.println("La secuencia es negativa. (-)");
      while (x > n) {
        System.out.print(x + ", ");
        x = x - 1;
      }
    } System.out.println(" ");
  }
}
