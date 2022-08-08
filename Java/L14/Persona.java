import java.util.Scanner;

public class Persona {
                                            //nos dice si una persona es mayor o no de edad.
  private Scanner teclado;
  private String nombre;                    // variables de la clase
  private int edad;

  public void inicializar() {
    teclado = new Scanner (System.in);
    System.out.print("Ingrese nombre: ");
    nombre = teclado.next();                      //método priemro
    System.out.print("Ingrese edad: ");
    edad = teclado.nextInt();

  }

  public void imprimir() {
    System.out.println("Nombre: " + nombre);
    System.out.println("Edad: " + edad);        // segundo metodo (o funciones)

  }

  public void esMayorEdad(){
    if (edad >= 18)
      System.out.println("La persona "+ nombre + " es mayor de edad.");
    else
      System.out.println("La persona "+ nombre + " es menor de edad.");   //tercero
  }

  public static void main (String[] args) {
    Persona persona1;             //persona 1 declaracion de un objeto de la clase persona
    persona1 = new Persona();     // creacion de una nuevo objeto de la clase persona
    persona1.inicializar();
    persona1.imprimir();              //se tienen que ejecutar  en el orden correcto
    persona1.esMayorEdad();
  }
}
