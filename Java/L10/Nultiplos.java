public class Nultiplos {
  public static void main (String[] args) {
    System.out.println("Este programa calcula la suma de la sucesion hasta 500: ");
    System.out.println("[ 8, 16, 24, ... etc ] ");
    System.out.println(" ");
    int x, suma, n;
    x = 1;
    n = 8;
    suma = 0;

    System.out.print("[ ");
    while ( x <= 500) {
      System.out.print(n * x + ", ");
      suma = (n * x) + suma;
      x = x + 1;
    }
    System.out.println("]");
    System.out.println("La suma de los números anteriores es de: " + suma);
  }
}
