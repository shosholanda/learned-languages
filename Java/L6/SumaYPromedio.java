import java.util.Scanner;

public class SumaYPromedio {

  public static void main (String[] args) {
    Scanner teclado = new Scanner (System.in);
    double num1, num2, num3, num4, promedio;
    System.out.println("Este programa calcula el promedio de cuatro numeros. ");
    System.out.print("Ingrese el valor del primer numero: ");
    num1 = teclado.nextDouble();
    System.out.print("Ingrese el valor del segundo numero: ");
    num2 = teclado.nextDouble();
    System.out.print("Ingrese el valor del tercer numero: ");
    num3 = teclado.nextDouble();
    System.out.print("Ingrese el valor del cuarto numero: ");
    num4 = teclado.nextDouble();
    promedio = (num1 + num2 + num3 + num4) / 4;
    System.out.print("El promedio de los cuatro numeros es: ");
    System.out.println(promedio);
  }
}
