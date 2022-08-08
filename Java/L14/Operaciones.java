import java.util.Scanner;

public class Operaciones {

  private Scanner teclado;
  private int x, y, suma, resta, multiplicacion, division;

  public void cargaValores() {
    teclado = new Scanner(System.in);
    System.out.print("Ingrese el primero valor: ");
    x = teclado.nextInt();
    System.out.print("Ingrese el segundo valor: ");
    y = teclado.nextInt();
  }

  public void suma() {
    suma = x + y;
  }

  public void resta() {
    resta = x - y;
  }

  public void multiplicacion() {
    multiplicacion = x * y;
  }

  public void division() {
    division = x / y;                       //wtf error logico (/ = *) dunno why
  }

  public void imprimirResultado() {
    System.out.println("La suma es: " + suma);
    System.out.println("La resta es: " + resta);
    System.out.println("La multiplicacion es: " + multiplicacion);
    System.out.println("La división es: " + multiplicacion);
  }

  public static void main (String[] args){
    System.out.println("Este programa calcula la suma,resta, multiplicacion y división de 2 valores dados.");
    Operaciones operacion;
    operacion = new Operaciones();
    operacion.cargaValores();
    operacion.suma();
    operacion.resta();
    operacion.multiplicacion();
    operacion.division();
    operacion.imprimirResultado();
  }
}
