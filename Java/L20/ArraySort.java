import java.util.Scanner;

public class ArraySort{

  private Scanner teclado;
  private int[] sueldos;

  public void cargar(){
    teclado = new Scanner(System.in);
    sueldos = new int[5];
    for (int f = 0; f < sueldos.length; f++){
      System.out.println("Ingrese sueldo: ");
      sueldos[f] = teclado.nextInt();
    }
  }

  public void ordenar(){
    for ( int k = 0; k < sueldos.length-1; k++){
      for (int f = 0; f < sueldos.length-1; f++){
        if (sueldos[f] > sueldos[f+1]){
          int aux = sueldos[f];
          sueldos[f] = sueldos[f+1];
          sueldos[f+1] = aux;
        }
      }
    }
  }

  public void imprimir(){
    System.out.println("Sueldos ordenados de menor a mayor: ");
    for (int f = 0; f < sueldos.length; f++){
      System.out.println(sueldos[f]);
    }
  }

  public static void main (String[] args){
    ArraySort a = new ArraySort();
    a.cargar();
    a.ordenar();
    a.imprimir();
  }
}
