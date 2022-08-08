import java.util.Scanner;

class Factorial {
  public static void main ( String [] args) {
    Scanner numero = new Scanner(System.in);
    System.out.println("Este programa calcula el factorial de un número");
    System.out.println("Por favor escriba el número a calcular");

    int n = numero.nextInt();
    if (n <= 1){
      n = 1;
    } else {
      while (n > 1){
        n = (n * (n - 1));
      }
    }System.out.print("El" + " factorial" + " de " + n + " es:"); 
    System.out.print(n);
  }
}
