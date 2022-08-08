import java.util.Scanner;

public class MissingHW{

  public static void main (String [] args){

    Scanner teclado = new Scanner(System.in);
    int num1, num2, num3;

    System.out.println("Este programa calcula el mayor de 3 numeros dados y lo imprime.");

    System.out.print("Ingrese el primer numero: ");
    num1 = teclado.nextInt();
    System.out.print("Ingrese el segundo número: ");
    num2 = teclado.nextInt();
    System.out.print("Ingrese el tercer numero: ");
    num3 = teclado.nextInt();

    if ( num1 < num2) {
      if (num2 < num3)
      System.out.println("El numero mayor es el tercer número: " + num3);
    } else if (num2 < num1){
      if ( num3 < num1)
        System.out.println("En número mayor es el primer numero: " +  num1);
    } else
      System.out.println("El número mayor es el segundo numero: " + num2);
  }
}
