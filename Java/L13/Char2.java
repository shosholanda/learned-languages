import java.util.Scanner;

public class Char2 {
  public static void main (String[] args) {
    Scanner teclado = new Scanner(System.in);
    String completo1, completo2;
    int edad1, edad2;

    System.out.println("Este programa nos dice entre dos personas quien es mayor.");
    System.out.print("Ingrese el nombre y apellido: ");
    completo1 = teclado.nextLine();
    System.out.print("Ingrese la edad: ");
    edad1 = teclado.nextInt();
    System.out.print("Ingrese el nombre y apellido de la segunda persona: ");
    teclado.nextLine();           //tenemos que resetear el int (se queda el valor de enter)
                                  //el primero es para quitar el enter que se quedo guardado cuando
                                  //hicimos el teclado.nextInt(); ---------- y lo regresamos como si no
            //hubiera pasado nada. (todo normal);   solo se hace despues de un nextInt, double o float
            //en escencia es como si la tecla "enter" le asignaramos una valiable == stupid
    completo2 = teclado.nextLine();
    System.out.print("Ingrese la edad: ");
    edad2 = teclado.nextInt();
    System.out.print("La persona con mayor edad es: ");
    if (edad1 < edad2)
      System.out.println(completo2);
    else
      System.out.println(completo1);
  }
}
