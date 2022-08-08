import java.util.Scanner;

public class FierroPariente {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int n, x, cantidad;
    float largo;

    x = 1;
    cantidad = 0;

    System.out.println("Este programa calcula la cantidad de piezas aptas para un lote de varilla.");
    System.out.println("Las varillas tienen que tener una medida entre 1.20 y 1.30 cm de largo, si no estas son desechadas. ");
    System.out.print("Ingrese el número total del lote de varillas: ");
    n = teclado.nextInt();
    while (x <= n) {
      System.out.print("Ingrese la longitud del " + x + " varilla/s: ");
      largo = teclado.nextFloat();
      if (largo <= 1.30 && largo >= 1.20)
        cantidad = cantidad + 1;
      x = x+1;
    } System.out.println("La cantidad de varillas aptas es de: " + cantidad);
  }
}
