import java.util.Scanner;

public class Arreglos1{

  private Scanner teclado;
  private int[] sueldos;

  public void cargar(){
    teclado = new Scanner(System.in);
    sueldos = new int[5];                                         //sin el for deberiamos hacer algo como:
    for (int f = 0; f < 5; f++){                                      //sueldos[0] = teclado.nextInt();
      System.out.print("Ingrese valor de la "+ f +" componente: ");   //sueldos[1] = teclado.nextInt(); ...
      sueldos[f] = teclado.nextInt();                                 //asi si queremos escribir menos codigo.
    }
  }

  public void imprimir(){
    for (int f = 0; f < 5; f++)
      System.out.println(sueldos[f]);
    System.out.println(sueldos[4]);                           // extra: lo que imprime la f cuando llega a <5
  }

  public static void main (String[] args) {
    Arreglos1 arreglo;
    arreglo = new Arreglos1();
    arreglo.cargar();
    arreglo.imprimir();
  }
}
