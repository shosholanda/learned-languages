import java.util.Scanner;

public class ForSuma {
  public static void main (String[] args) {
    Scanner teclado = new Scanner(System.in);
    int x, suma, valor, promedio;
    suma = 0;

    System.out.println("Este programa calcula el promedio de 10 valores ingresados.");
    for (x = 1; x <= 10; x++) {
      System.out.print("Ingrese el " + x +" valor: ");
      valor = teclado.nextInt();
      suma = suma + valor;
    }
    System.out.println("La suma de los números es: " + suma);
    promedio = suma /10;
    System.out.println("El promedio es de: " + promedio);
  }
}
