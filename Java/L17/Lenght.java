import java.util.Scanner;

public class Lenght{

  private Scanner teclado;
  private int[] sueldos;

  public void cargar(){
    teclado = new Scanner(System.in);
    System.out.println("¿Cuántos sueldos cargará?");
    int cant = teclado.nextInt();
    sueldos = new int[cant];
    for (int f = 0; f < sueldos.length ; f++){
      System.out.print("Ingrese sueldo: ");
      sueldos[f] = teclado.nextInt();
    }
  }

  public void imprimir(){
    for (int f = 0; f < sueldos.length ; f++){
      System.out.println(sueldos[f]);
    }
  }

  public static void main (String[] args){
    Lenght prueba = new Lenght();
    prueba.cargar();
    prueba.imprimir();
  }
}
