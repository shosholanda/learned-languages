import java.util.Scanner;

public class Char3 {
  public static void main (String[] args) {
    Scanner teclado = new Scanner(System.in);
    String apellido1, apellido2;

    System.out.println("Este programa nos dice si dos apellidos son iguales (estrictamente)");
    System.out.print("Ingrese el primer apellido: ");
    apellido1 = teclado.next();
        //si ponemos "a a", entonces la segunda "a" es recuperada por el espacio en blanco
        //en el siguiente next(); y es asignada a la otra variable

    System.out.print("Ingrese el segundo apellido: ");
    apellido2 = teclado.next();
    if (apellido1.equals(apellido2))          //La forma de comparar cadenas (a.equals(b))
                                              //lo que queremos comparar lo pasamos como parametro
                                              //equals es de forma estricta (mayus != minusculas)

      System.out.println("Los apellidos son iguales.");
    else
      System.out.println("Los apellidos son distintos");
  }
}
    //en caso de que queramos consideras las mayusculas y minusculas iguales (M = m)
    //ya que para el metodo equals no es lo mismo. ( M != m)
    //Utilizamos otro metodo que ignora las mayusculas de minusculas llamado:
    // (a.equalsIgnoreCase(b))    ( M = m)
