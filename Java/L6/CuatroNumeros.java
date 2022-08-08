import java.util.Scanner;

public class CuatroNumeros {

  public static void main (String[] args) {
    Scanner teclado = new Scanner (System.in);
    int num1, num2, num3, num4, suma, producto;
    System.out.print("Este programa calcula la suma de los primeros dos numeros");
    System.out.println(" y calcula el producto de los dos ultimos. ");
    System.out.print("Ingrese el valor del primer numero: ");
    num1 = teclado.nextInt();
    System.out.print("Ingrese el valor del segundo numero: ");
    num2 = teclado.nextInt();
    System.out.print("Ingrese el valor del tercer numero: ");
    num3 = teclado.nextInt();
    System.out.print("Ingrese el valor del cuarto numero: ");
    num4 = teclado.nextInt();
    suma = num1 + num2;
    producto = num3 * num4;
    System.out.print("La suma de los primeros dos numeros es: ");
    System.out.println(suma);
    System.out.print("El producto de los ultimos dos numeros es: ");
    System.out.println(producto);
  }
}
