import java.util.Scanner;

public class CondicionalCompuesta1 {
  public static void main (String[] args){

    Scanner teclado = new Scanner(System.in);
    int num1, num2, num3;

    System.out.println("Este programa calcula de 3 numeros dados el mayor y lo imprime en pantalla. ");
    System.out.print("Ingrese el primer numero: ");
    num1 = teclado.nextInt();
    System.out.print("Ingresee el segundo numero: ");
    num2 = teclado.nextInt();
    System.out.print("Ingrese el tercer numero: ");
    num3 = teclado.nextInt();

    if ((num1 < num2) && (num3 < num2))
      System.out.println("En mayor numero es el segundo: " + num2);
    else if ( num3 > num1)
      System.out.println("El mayor numero es el tercero: " +  num3);
    else
      System.out.println("El mayor numero es el primero: " + num1);      
  }
}
