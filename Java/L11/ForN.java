import java.util.Scanner;

public class ForN {
  public static void main (String[] args) {
    Scanner teclado = new Scanner(System.in);
    int n, cantidad, x, valor;
    cantidad = 0;

    System.out.println("Este programa calcula de 'n' numeros dados cuales son mayores a 1000.");
    System.out.print("Ingrese la cantidad de numeros que quiera calcular: ");
    n = teclado.nextInt();
    for ( x = 1; x <= n; x++ ) {
      System.out.print("Ingrese el " + x + " numero: ");
      valor = teclado.nextInt();
      if (valor >= 1000)
        cantidad = cantidad + 1;
    }
    System.out.println("La cantidad de numeros mayores a 1000 es de: " + cantidad);
  }
}
