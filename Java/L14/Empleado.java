import java.util.Scanner;

public class Empleado {

  private Scanner teclado;
  private String nombre;
  private float sueldo;

  public void carga() {
    teclado = new Scanner (System.in);
    System.out.print("Ingrese el nombre del empleado: ");
    nombre = teclado.next();
    System.out.print("Ingrese el sueldo que reciebe: ");
    sueldo = teclado.nextFloat();
  }

  public void imprimirDatos() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Sueldo: " + sueldo);
  }

  public void impuestos() {
    if (sueldo > 3000)
      System.out.println("El empleado debe impuestos.");
    else
      System.out.println("El empleado no debe impuestos.");
  }

  public static void main (String[] args) {
    Empleado empleado1;
    empleado1 = new Empleado();
    System.out.println("Este programa calcula si una persona debe o no impuestos.");
    empleado1.carga();
    empleado1.imprimirDatos();
    empleado1.impuestos();
  }
}
