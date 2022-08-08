import java.util.Scanner;

public class MuchaInfo {
  public static void main (String [] args) {
    Scanner teclado = new Scanner(System.in);
    int f, valor, negativos, positivos, multiplo15, pares, cantidadpar;
    negativos = 0;
    positivos = 0;
    multiplo15 = 0;
    pares = 0;
    cantidadpar = 0;

    System.out.println("Este programa calcula dados 10 números si es negativo, positivo, o multiplo de 15 y si hay pares muestra el resultado de la suma entre ellos.");
    for ( f = 1; f <=  10; f++) {
      System.out.print("Ingrese el " + f + " número: ");
      valor = teclado.nextInt();
      if ( valor >= 0 )
        positivos = positivos + 1;
      else
        negativos = negativos + 1;
      if ( valor%2 == 0) {
        pares = pares + 1;
        cantidadpar = cantidadpar + valor;
      }
      if ( valor%15 == 0)
        multiplo15 = multiplo15 + 1;
    }
    System.out.println("La cantidad de números negativos es de: " + negativos);
    System.out.println("La cantidad de números positivos es de: " + positivos);
    System.out.println("La cantidad de numeros múltiplos de 15 es de: " + multiplo15);
    System.out.println("La cantidad de números pares es de: " + pares);
    System.out.println("La suma de los numeros pares es de: " + cantidadpar);
  }
}
