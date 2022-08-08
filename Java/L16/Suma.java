import java.util.Scanner;

public class Suma {

  private int[] arreglo1, arreglo2, arreglo3;
  private Scanner teclado;

  public void carga(){
    teclado = new Scanner(System.in);
    arreglo1 = new int[4];
    arreglo2 = new int[4];
    System.out.println("Este programa calcula la suma de cada valor con su pareja.");
    System.out.println("La primera parte: ");
    for (int f = 0; f < 4; f++ ){
      System.out.print("Ingrese el valor " + f + ": ");
      arreglo1[f] = teclado.nextInt();
    }
    System.out.println("de la segunda parte: ");
    for (int f = 0; f < 4; f++){
      System.out.print("Ingrese el valor " + f + ": ");
      arreglo2[f] = teclado.nextInt();
    }
  }

  public void suma() {
    arreglo3 = new int[4];
    for (int f = 0; f < 4; f++){
      arreglo3[f] = arreglo1[f] + arreglo2[f];
    }
  }

  public void imprimir() {
    for (int f = 0; f < 4; f++){
      System.out.println("La pareja " + f + " suma: " + arreglo3[f]);
    }
  }


  public static void main (String[] args){
    Suma ejercicio = new Suma();
    ejercicio.carga();
    ejercicio.suma();
    ejercicio.imprimir();

  }
}
