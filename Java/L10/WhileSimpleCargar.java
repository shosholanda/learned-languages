import java.util.Scanner;

public class WhileSimpleCargar {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int x;
    float valor, suma, promedio;
    suma = 0;
    x = 0;

    System.out.println("Este programa calcula el promedio de 10 numeros y muestra su suma total.");
    while (x < 10) {
      x = x + 1;
      System.out.println("Ingrese valor " + x + ": ");
      valor = teclado.nextFloat();
      suma = suma + valor;
    }
    promedio = suma/10;
    System.out.println("La suma de todos los valores es: " + suma);
    System.out.println("El promedio de todos los valores es: " + promedio);
  }
}
