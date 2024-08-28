import java.util.Scanner;
/**
 * Problema: Hallar la superficie de un cuadrado conociendo el valor de un lado.
 */
public class SuperficieCuadrado {

  public static void main (String[] args) {
    //Creamos un objeto Scanner que recibe la entrada estándar (por terminal)
    Scanner teclado = new Scanner (System.in);
    int lado;
    int superficie;
    //Pedir valores.
    System.out.println("Ingrese el valor del lado del cuadrado:");
    lado = teclado.nextInt(); //Recibir los valores
    superficie = lado * lado;
    //Imprimir resultados
    System.out.println("La superficie del cuadrado es:");
    System.out.println(superficie);
  }
}
