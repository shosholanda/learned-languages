import java.util.Scanner;

public class PlanoCartesiano {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    int x, y;

    System.out.println("Este programa calcula en que cuadrante se encuentra una coordenada (x,y).");
    System.out.print("Ingrese el valor de x: ");
    x = teclado.nextInt();
    System.out.print("Ingrese el valor de y: ");
    y = teclado.nextInt();

    if (x > 0 && y > 0)
      System.out.println("La coordenada se encuentra en el primer cuadrante "  + "(" + x + "," + y +")");
    else {
      if (x < 0 && y > 0)
        System.out.println("La coordenada se encuentra en el segundo cuadrante " + "(" + x + "," + y + ")");
      else {
        if ( x > 0 && y < 0)
          System.out.println("La coordenada se encuentra en el tercer cuadrante " + "(" + x + "," + y + ")");
        else {
          if ( x < 0 && y < 0)
            System.out.println("La coordenada se encuentra en el cuarto cuadrante " + "(" + x + "," + y + ")");
          else
            System.out.println("La coordenada no se encuentra en ningun cuadrante (0, 0)");
        }
      }
    }
  }
}
