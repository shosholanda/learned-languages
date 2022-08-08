import java.util.Scanner;

public class Triangulos {
  public static void main (String[] args) {
    Scanner teclado = new Scanner (System.in);
    int x, n, triangulo;
    float base, altura, area;
    triangulo = 0;

    System.out.println("Este programa calcula el area de 'n' triangulos y dice cuantos triangulos tienen un area mayor a 12.");
    System.out.print("Ingrese la cantidad de triangulos que quiere calcular: ");
    n = teclado.nextInt();
    for (x = 1; x <= n; x++) {
      System.out.print("Ingrese la base del triángulo " + x +" : ");
      base = teclado.nextFloat();
      System.out.print("Ingrese la altura del triángulo " + x + " : ");
      altura = teclado.nextFloat();
      area = base * altura;
      if (area > 12)
        triangulo = triangulo + 1;
      System.out.println("El area del triángulo " + x + " es de: " + area);
    }
    System.out.println("La cantidad de areas mayor a 12 es de: " + triangulo);
  }
}
