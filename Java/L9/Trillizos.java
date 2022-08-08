import java.util.Scanner;

public class Trillizos {
  public static void main (String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num1, num2, num3, suma, mult;

    System.out.println("Este programa calcula si 3 numeros son iguales y suma los primeros 2 y al resultado lo multiplica por el ultimo. ");
    System.out.print("Ingrese el primer numero: ");
    num1 = teclado.nextInt();
    System.out.print("Ingrese el segundo numero: ");
    num2 = teclado.nextInt();
    System.out.print("Ingrese el tercer numero: ");
    num3 = teclado.nextInt();

    if (num1 == num2 && num2 == num3) {
      suma = num1 + num2;
      mult = suma * num3;
      System.out.println("Los tres numeros son iguales. El resultado es: " +  mult);
    } else
      System.out.println("Los números no son iguales.");
  }
}
