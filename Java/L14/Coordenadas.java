import java.util.Scanner;

public class Coordenadas {

  private Scanner teclado;
  private int x, y;

  public void inicializar() {
    teclado = new Scanner (System.in);
    System.out.print("Ingrese coordenada x: ");
    x = teclado.nextInt();
    System.out.print("Ingrese coordenada y: ");
    y = teclado.nextInt();
  }

  public void imprimirCuadrante() {
    if (x>0 && y>0)
      System.out.println("La coordenada se encuentra en el primer cuadrante.");
    else if (x<0 && y>0)
      System.out.println("La coordenada se encuentra en el segundo cuadrante.");
    else if (x>0 && y<0)
      System.out.println("La coordenada se encuentra en el tercer cuadrante.");
    else if (x<0 && y<0)
      System.out.println("La coordenada se encuentra en el cuarto cuadrante.");
    else
      System.out.println("La coordenada no se encuentra en ningun cuadrante.");
  }

  public static void main (String[] args) {
    Coordenadas punto1;
    punto1 = new Coordenadas();                     // el objeto debe de llamarse como el archivo (clase)
    punto1.inicializar();
    punto1.imprimirCuadrante();
  }

}
