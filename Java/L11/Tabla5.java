public class Tabla5 {
  public static void main (String[] args) {
    int x, y, res;
    y = 0;

    System.out.println("Este programa calcula la tabla del 5 hasta el 50. (Contando al 0)");
    for (x = 1; x <= 51; x++) {
      res = 5 * y;
      System.out.println("5 x " + y + " = " + res);
      y = y+1;
    }
  }
}
