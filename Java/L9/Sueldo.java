import java.util.Scanner;

public class Sueldo {
  public static void main (String [] args){

    Scanner teclado = new Scanner (System.in);
    int tiempo;
    double sueldo, total;

    System.out.println("Este programa calcula el pago que se le debe de dar a un empleado.");
    System.out.println("Si el sueldo es menor a 500 y tiene antiguedad de 10 o más años se da un bono del 20% adicional.");
    System.out.println("Si el sueldo es menor a 500 y tiene antiguedad menor a 10 años se da un bono del 5% adicional");
    System.out.println("Si el sueldo es mayor a 500 no se dan bonos extras.");
    System.out.print("Ingrese los años de antiguedad: ");
    tiempo = teclado.nextInt();
    System.out.print("Ingrese el sueldo actual: ");
    sueldo = teclado.nextInt();

    if ( sueldo < 500 && tiempo > 10) {
      total = sueldo * 1.20;
      System.out.println("Usted tiene un bono del 20%. El sueldo total es de : " + total);
    } else if (tiempo < 10) {
      total = sueldo * 1.05;
      System.out.println("Usted tiene un bono del 5%. El sueldo total es de: " +  total);
    } else
        System.out.println("Usted no recibe ningun tipo de bono extra. ");
  }
}
