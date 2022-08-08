import java.util.Scanner;

public class Alturas {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int n, x;
    float altura, total, promedio;
    x = 1;
    total = 0;

    System.out.println("Este calcula el promedio de estatura de n personas.");
    System.out.print("Ingrese la cantidad de personas que va a sacar promedio: ");
    n = teclado.nextInt();
    if ( n <= 0)
      System.out.println("ERROR. No existen personas negativas");
    else {
      while (x <= n) {
        System.out.print("Ingrese la altura de la persona " + x + " : ");
        altura = teclado.nextFloat();
        total = total + altura;
        x = x + 1;
      }
      promedio = (total/n);
      System.out.println("El promedio de las personas es de: " + promedio);
    }
  }
}
