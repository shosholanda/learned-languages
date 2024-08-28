import java.util.Scanner;
/**
 * Problema: Realizar la carga de dos números enteros por teclado e imprimir su suma
 * y su producto.
 */
public class SumaProductoNumeros {

  public static void main (String[] args){
    //Creamos un objeto Scanner que recibe la entrada estándar (por terminal)
    Scanner teclado = new Scanner (System.in);
    int num1, num2, suma, producto;
    System.out.println("Ingrese el primer número:");
    num1 = teclado.nextInt();
    System.out.println("Ingrese el segundo número:");
    num2 = teclado.nextInt();
    suma = num1 + num2;
    producto = num1 * num2;
    System.out.println("La suma de los números es:");
    System.out.println(suma);
    System.out.println("El producto de los números es:");
    System.out.println(producto);

  }
}
