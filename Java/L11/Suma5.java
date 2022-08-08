import java.util.Scanner;

public class Suma5 {
  public static void main (String[] args) {
    Scanner teclado = new Scanner(System.in);
    int x, suma, valor;
    suma = 0;

    System.out.println("Este calcula la suma de los ultimos 5 numeros ingresados de 10 en total.");
    for ( x = 1; x <= 10; x++ ) {
      System.out.print("Ingrese el " + x + " valor: ");
      valor = teclado.nextInt();
      if (x > 5)
        suma = suma + valor;
    }
    System.out.println("La suma de los ultimos 5 digitos es de: " + suma);
  }
}
