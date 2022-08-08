import java.util.Scanner;

public class Telefonos{

  private Scanner teclado;
  private String[] telefono;

  public void cargar(){
    int n;
    teclado = new Scanner(System.in);
    System.out.print("Ingrese cantidad de telefonos que desea ordenar: ");
    n = teclado.nextInt();
    telefono = new String[n];
    for (int f = 0; f < n; f++){
      System.out.print("Ingrese el "+f+" telefono: ");
      telefono[f] = teclado.next();
    }
  }

  public void ordenarMenoraMayor(){
    for (int f = 0; f < telefono.length -1; f++){
      for (int g = 0; g < telefono.length -1; g++){
        if (telefono[f].compareTo(telefono[f+1]) > 0){
          String aux = telefono[f];
          telefono[f] = telefono[f+1];
          telefono[f+1] = aux;
        }
      }
    }
  }

  public void ordenaMayoraMenor(){
    for (int f = 0; f < telefono.length -1; f++){
      for (int g = 0; g < telefono.length -1; g++){
        if (telefono[f].compareTo(telefono[f+1]) < 0){
          String aux = telefono[f];
          telefono[f] = telefono[f+1];
          telefono[f+1] = aux;
        }
      }
    }
  }

  public void imprimir(){
    for (int f = 0; f < telefono.length; f++){
      System.out.println(telefono[f] + " ");
    }
  }

  public static void main (String[] args) {
    Telefonos t = new Telefonos();
    t.cargar();
    t.ordenarMenoraMayor();
    System.out.println("Los elementos ordenados de menor a mayor son: ");
    t.imprimir();
    t.ordenaMayoraMenor();
    System.out.println("Los elementos ordenados de mayor a menor son: ");
    t.imprimir();
  }
}
