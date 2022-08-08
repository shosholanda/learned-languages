import java.util.Scanner;

public class Paises{

  private Scanner teclado;
  private String[] paises;
  private int[] habitantes;

  public void cargar(){
    teclado = new Scanner(System.in);
    System.out.print("Ingrese de cuantos países quiere ordenar: ");
    int n = teclado.nextInt();
    paises = new String[n];
    habitantes = new int[n];
    for(int f = 0; f < n; f++){
      System.out.print("Ingrese país: ");
      paises[f] = teclado.next();
      System.out.print("Ingrese habitantes: ");
      habitantes[f] = teclado.nextInt();
    }
  }

  public void ordenarPorNombre(){
    for (int f = 0 ; f < paises.length-1; f++){
      for (int g = 0; g < paises.length-1; g++){
        if (paises[f].compareTo(paises[f+1]) > 0){
          String s = paises[f];
          paises[f] = paises[f+1];
          paises[f+1] = s;
          int i = habitantes[f];
          habitantes[f] = habitantes[f+1];
          habitantes[f+1] = i;
        }
      }
    }
  }

  public void ordenarPorHabitantes(){
    for (int f = 0 ; f < habitantes.length-1; f++){
      for (int g = 0; g < habitantes.length-1; g++){
        if (habitantes[f] > habitantes[f+1]){
          String s = paises[f];
          paises[f] = paises[f+1];
          paises[f+1] = s;
          int i = habitantes[f];
          habitantes[f] = habitantes[f+1];
          habitantes[f+1] = i;
        }
      }
    }
  }

  public void imprimir(){
    System.out.println("País:" + "\t" + "Habitantes:");
    for (int f = 0; f < paises.length; f++){
      System.out.println(paises[f]+ "\t" + "-" + "\t" + habitantes[f]);
    }
    System.out.println("");
  }

  public static void main (String[] args){
    Paises p = new Paises();
    p.cargar();
    System.out.println("\n");
    System.out.println("Lista de países recibida: ");
    p.imprimir();
    p.ordenarPorNombre();
    System.out.println("Lista de países ordenada por nombre:");
    p.imprimir();
    p.ordenarPorHabitantes();
    System.out.println("Lista de países ordenada por habitantes:");
    p.imprimir();
  }
}
