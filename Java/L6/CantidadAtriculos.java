import java.util.Scanner;

public class CantidadAtriculos {

  public static void main (String[] args){
    //Creamos un objeto Scanner que recibe la entrada estándar (por terminal)
    Scanner teclado = new Scanner(System.in);
    int cantidad;
    float precio, precioTotal;
    //Imprimir varias instrucciones. 
    System.out.print("Este programa calcula el precio por la cantidad que ");
    System.out.println("lleve del mismo artículo.");
    System.out.print("Ingrese el precio del artículo: ");

    /* print: la siguiente línea se imprime inmediatamente después del último caracter
     * println: La siguiente línea se imprime debajo de la actual.
     */
    precio = teclado.nextFloat();
    System.out.print("Ingrese la cantidad que se lleva del mismo artículo: ");
    cantidad = teclado.nextInt();
    precioTotal = cantidad * precio;
    System.out.print("El precio total a pagar es: ");
    System.out.println(precioTotal);
  }
}
