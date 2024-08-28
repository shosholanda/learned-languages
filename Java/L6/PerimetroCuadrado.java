import java.util.Scanner;
/**
 * Problema Realizar la carga del lado de un cuadrado, mostrar por pantalla el 
 * perímetro del mismo (el perímetro de un cuadrado se calcula multiplicando el valor del lado por 4)
 */
public class PerimetroCuadrado {

  public static void main (String[] args) {
    Scanner teclado = new Scanner (System.in);
    int perimetro,lado;
    System.out.print("Este programa calcula el perímetro de un cuadrado");
    System.out.print(". Ingrese la longitud de un lado: ");
    lado = teclado.nextInt();
    perimetro = 4 * lado;
    System.out.print("El perímetro del cuadrado es: ");
    System.out.println(perimetro);
  }
}
