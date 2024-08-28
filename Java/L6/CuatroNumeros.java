import java.util.Scanner;
/**
 * Problema: Escribir un programa en el cual se ingresen cuatro números, calcular e informar la suma de 
 * los dos primeros y el producto del tercer y el cuarto.
 */
public class CuatroNumeros {

  public static void main (String[] args) {
    //Creamos un objeto Scanner que recibe la entrada estándar (por terminal)
    Scanner teclado = new Scanner (System.in);
    int num1, num2, num3, num4, suma, producto;

    //Instrucciones
    System.out.print("Este programa calcula la suma de los primeros dos numeros");
    System.out.println(" y calcula el producto de los dos ultimos. ");

    //Indicación de ingresar valor
    System.out.print("Ingrese el valor del primer numero: ");
    //Guardar el valor.
    num1 = teclado.nextInt();

    System.out.print("Ingrese el valor del segundo numero: ");
    num2 = teclado.nextInt();

    System.out.print("Ingrese el valor del tercer numero: ");
    num3 = teclado.nextInt();

    System.out.print("Ingrese el valor del cuarto numero: ");
    num4 = teclado.nextInt();

    //Hacer las operaciones aritméticas.
    suma = num1 + num2;
    producto = num3 * num4;

    //Mostrar los resultados.
    System.out.print("La suma de los primeros dos numeros es: ");
    System.out.println(suma);
    System.out.print("El producto de los ultimos dos numeros es: ");
    System.out.println(producto);
  }
}
