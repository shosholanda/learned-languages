import java.util.Scanner;

public class Coordenada {
  public static void main (String[] args){
    Scanner teclado = new Scanner(System.in);
    int a, b, c, d, f, n, x, y;         //(x,y) la coordenada a ingresar y f es el contador
    a = 0;    //a = cuadrante 1 (x,y)
    b = 0;    //b = cuadrante 2 (-x, y)
    c = 0;    //c = cuadrante 3 (x, -y)
    d = 0;    //d = cuadrante 4 (-x, -y)

    System.out.println("Este programa calcula en qué cuadrante se encuentra cada coordenada dada.");
    System.out.println("Dependiendo de la coordenada, nos dirá en qué cuadrante está (1-4)");
    System.out.println("         |        ");
    System.out.println("    2    |   1    ");
    System.out.println("  (-x,y) |  (x,y) ");
    System.out.println("------------------");
    System.out.println("         |        ");
    System.out.println("    4    |    3   ");
    System.out.println(" (-x,-y) |  (x,-y)");
    System.out.println(" ");
    System.out.print("Ingrese la cantidad de coordenadas que desea calcular: ");
    n = teclado.nextInt();
    for (f = 1; f <= n; f++){
      System.out.println("De la coordenada " + f + ":");
      System.out.print("Ingrese el valor en x: ");
      x = teclado.nextInt();
      System.out.print("Ingrese el valor en y: ");
      y = teclado.nextInt();
      System.out.println("La coordenada es: " + "(" + x + "," + y +")");
      if (x > 0 && y > 0)
        a = a + 1;
      else if ( x < 0 && y > 0)
        b = b + 1;
      else if ( x > 0 && y < 0)
        c = c + 1;
      else
        d = d + 1;
    }
    System.out.println("La cantidad de coordenadas en cada cuadrante es: ");
    System.out.println("Cuadrante 1 (x,y)  : " + a);
    System.out.println("Cuadrante 2 (-x,y) : " + b);
    System.out.println("Cuadrante 3 (x,-y) : " + c);
    System.out.println("Cuadrante 4 (-x,-y): " + d);
  }
}
