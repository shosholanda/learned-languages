import java.util.Scanner;

public class Suma{

  private Scanner teclado;
  private int[] valores;

  public void cargar(){
    teclado = new Scanner(System.in);
    System.out.print("Ingrese la cantidad de valores que va a sumar: ");
    int cantidad = teclado.nextInt();
    valores = new int[cantidad];
    for ( int f = 0; f < valores.length; f++){
      System.out.print("Ingrese cantidad " + f + ": ");
      valores[f] = teclado.nextInt();
    }
  }

  public int suma(){
    int sum = 0;
    for (int f = 0; f < valores.length; f++){
      sum = sum + valores[f];
    } return sum;
  }

  public void imprimir(){
    System.out.print("La suma de los valores es: ");
    System.out.println(suma());
  }

  public static void main (String[] args){
    Suma test = new Suma();
    test.cargar();
    test.imprimir();
  }
}
