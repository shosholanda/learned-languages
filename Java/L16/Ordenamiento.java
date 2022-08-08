import java.util.Scanner;

public class Ordenamiento{

  private Scanner teclado;
  private int[] arreglo;
  private boolean b = true;

  public void bienvenida(){
    System.out.print("Este programa recibe 10 valores y nos dice si estan ordenados ");
    System.out.println("de menor a mayor.");
  }

  public void cargar(){
    teclado = new Scanner(System.in);
    arreglo = new int[10];
    for (int f = 0; f < 10; f++){
      System.out.print("Ingrese el valor " + f + ": ");
      arreglo[f] = teclado.nextInt();
    }
  }

  public boolean ordenamiento(){
    for (int f = 0; f < 9; f++){
      if ( arreglo[f] > arreglo[f+1]){
        b = false;
      }
    }
    return b;
  }

  public void imprimir(){
    b = ordenamiento();
    if ( b == true )
      System.out.println("Los valores estan ordenados de mayor a menor");
    else
      System.out.println("Los valores no están ordenados.")
  }

  public static void main (String[] args){
    Ordenamiento desorden = new Ordenamiento();
    desorden.bienvenida();
    desorden.cargar();
    desorden.imprimir();
  }
}
