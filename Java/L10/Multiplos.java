public class Multiplos {
  public static void main (String[] args) {
    System.out.println("Este programa calcula los primeros 25 terminos de la sucesion:");
    System.out.println("[ 11, 22, 33, 44, 55, 66, 77 ... etc]");
    System.out.println(" ");
    int x, n;
    x = 1;
    n = 11;
    System.out.print("[ ");
    while ( x <= 25) {
      System.out.print(n * x + ", ");
      x = x+1;
    }
    System.out.print("]");
    System.out.println("  ");
  }
}
