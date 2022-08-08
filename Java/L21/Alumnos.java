import java.util.Scanner;

public class Alumnos{

  private Scanner teclado;
  private String[] nombres;
  private int[] notas;

  public void cargar(){
    teclado = new Scanner(System.in);
    nombres = new String[5];
    notas = new int[5];
    System.out.println("Carga de nombres y notas:");
    for (int f = 0; f < nombres.length; f++){
      System.out.print("Ingrese el nombre del alumno: ");
      nombres[f] = teclado.next();
      System.out.print("Ingrese la nota del alumno: ");
      notas[f] = teclado.nextInt();
    }
  }

  public void ordenarPorNotas(){
    for (int f = 0; f < notas.length -1; f++){
      for (int g = 0; g < notas.length -1; g++){
        if (notas[f] > notas[f+1]){
          int aux = notas[f+1];
          notas[f+1] = notas[f];
          notas[f] = aux;
          String saux = nombres[f+1];
          nombres[f+1] = nombres[f];
          nombres[f] = saux;
        }
      }
    }
  }

  public void ordenarPorNombre(){
    for (int f = 0; f < nombres.length -1; f++){
      for (int g = 0; g < nombres.length -1; g++){
        if (nombres[f].compareTo(nombres[f+1]) > 0){
          int aux = notas[f+1];
          notas[f+1] = notas[f];
          notas[f] = aux;
          String saux = nombres[f+1];
          nombres[f+1] = nombres[f];
          nombres[f] = saux;
        }
      }
    }
  }

  public void imprimir(){
    System.out.println("Nombres de alumnos:");
    for (int f = 0; f < nombres.length; f++){
      System.out.println(nombres[f]);
    }
  }

  public void imprimirNotas(){
    System.out.println("Notas de alumnos:");
    for (int f = 0; f < notas.length; f++){
      System.out.print(notas[f]);
    }
  }

  public static void main (String[] args){
    Alumnos a = new Alumnos();
    a.cargar();
    a.imprimir();
    a.imprimirNotas();
    a.ordenarPorNotas();
    a.imprimirNotas();
    a.ordenarPorNombre();
    a.imprimir();
  }
}
