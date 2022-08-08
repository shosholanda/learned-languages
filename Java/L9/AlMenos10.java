import java.util.Scanner;

public class AlMenos10 {
  public static void main (String[] args) {
    Scanner teclado = new Scanner(System.in);
    int num1, num2, num3;

    System.out.println("Este programa calcula si 3 numeros son menores a 10");
    System.out.print("Ingrese el primer numero: ");
    num1 = teclado.nextInt();
    System.out.print("Ingrese el segundo numero: ");
    num2 = teclado.nextInt();
    System.out.print("Ingrese el tercer numero: ");
    num3 = teclado.nextInt();

    if (num1 < 10 || num2 < 10 || num3 < 10)
      System.out.println("Alguno de los valores es menor a 10: " + num1 + ", " + num2 + ", " + num3 + " ");
    else
      System.out.println("Los numeros no son menores a 10.");
  }
}
