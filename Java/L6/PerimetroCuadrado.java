import java.util.Scanner;

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
