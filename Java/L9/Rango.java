import java.util.Scanner;

public class Rango {
  public static void main (String [] args) {

    Scanner teclado = new Scanner(System.in);
    int num1, num2, num3, rango;

    System.out.println("Este programa calcula la diferencia entre 3 numeros diferentes.");

    System.out.print("Ingrese el primer numero: ");
    num1 = teclado.nextInt();
    System.out.print("Ingrese el segundo numero: ");
    num2 = teclado.nextInt();
    System.out.print("Ingrese el tercer numero: ");
    num3 = teclado.nextInt();

    if (num1 != num2 && num2 != num3 && num1 != num3) {
      if (num1 < num2 && num3 < num2){
        System.out.println("El numero mayor es el segundo: " +  num2);
        if (num3 < num1) {
          System.out.println("El numero menor es el tercero: "+ num3);
          rango = num2 - num3;
          System.out.println("El rango entre los numeros menor y mayor es de : " +  rango);
        } else {
          System.out.println("El numero menor es el primero: " + num1);
          rango = num2 - num1;
          System.out.println("El rango entre el menor y el mayor numero es de: " + rango);
        }
      } if (num2 < num1 && num3 < num1) {
        System.out.println("El numero mayor es el primero: " +  num1);
        if (num2 < num3) {
          System.out.println("El numero menor es el segundo. " + num2);
          rango = num1 - num2;
          System.out.println("El rango entre " + num2 + " y " + num1 + " es de: " + rango);
      } else {
          System.out.println("El numero menor es el tercero " + num3);
          rango = num1 - num3;
          System.out.println("El rango entre " + num3 + " y " +  num1 + " es de: " +  rango);
        }
      } if ( num3 > num1 && num3 > num2) {
        System.out.println("El numero mayor es el tercero: " + num3);
        if (num2 < num1){
          System.out.println("El numero menor es el segundo: " + num2);
          rango = num3 - num2;
          System.out.println("El rango entre " + num2 + " y " + num3 + " es de: " + rango);
        } else {
          System.out.println("El numero menor es el primero: " + num1);
          rango = num3 - num1;
          System.out.println("El rango entre " + num1 + " y " + num3 + " es de: " + rango);
        }
      }
    } else
      System.out.println("Los numeros no son diferentes.");
  }
}
