import java.util.Scanner;

public class TablaN {
  public static void main (String[] args) {
    Scanner teclado = new Scanner(System.in);
    int n, x, y, resultado;
    y = 0;

    System.out.println("Este programa calcula la tabla de multiplicar de un numero entre 1  - 10 (hasta x12)");
    System.out.print("Ingrese el numero de cual quiere sacar la tabla de multiplicar: ");
    n = teclado.nextInt();
    if ( n < 1 ||  n > 10)
      System.out.println("El numero no esta dentro del rango 1 - 10");
    else {
      for ( x = 1; x <= 13; x++){
        resultado = n * y;
        System.out.println(n + " x " + y + " = " + resultado);
        y = y +1;
      }
    }
  }
}
