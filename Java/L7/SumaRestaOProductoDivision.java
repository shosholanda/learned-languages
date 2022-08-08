import java.util.Scanner;

public class SumaRestaOProductoDivision {

  public static void main (String[] args) {
    Scanner teclado = new Scanner(System.in);

    float div, num1, num2, suma, dif, mult;

    System.out.println("Este programa calcula una de dos cosas:");
    System.out.println("1. Si el primero numero es mayor al segundo, da su suma y diferencia entre ellos.");
    System.out.println("2. Si el segundo numero es mayor al primero, da su multiplicacion y su division.");
    System.out.println("");
    System.out.print("Ingrese el valor del primero número: ");
    num1 = teclado.nextFloat();
    System.out.print("Ingrese el valor del segundo número: ");
    num2 = teclado.nextFloat();

    if (num1 > num2) {
      suma = num1 + num2;
      dif = num1 - num2;
      System.out.println("Sucede el primero caso.");
      System.out.println("La suma de los número es: " + suma);
      System.out.println("La diferencia de los números es: " + dif);
    } else {
      mult = num1 * num2;
      div = num1 / num2;
      System.out.println("Sucede el segundo caso.");
      System.out.println("La multiplicacion de los números es: " +  mult);
      System.out.println("La división de los números es: " + div);
    }
  }
}
