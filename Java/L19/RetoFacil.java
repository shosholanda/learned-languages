import java.util.Scanner;

public class RetoFacil {

  private Scanner teclado;
  private int[] vec;
  private int menor;

  public void cargar() {
    teclado = new Scanner(System.in);
    System.out.println("Cuántos elementos desea cargar?: ");
    int n = teclado.nextInt();
    vec = new int[n];
    for (int f = 0; f < vec.length; f++){
      System.out.print("Ingrese elemento: ");
      vec[f] = teclado.nextInt();
    }
  }

  public void menorElemento(){
    menor = vec[0];
    for (int f = 0; f < vec.length; f++){
      if (vec[f] < menor){
        menor = vec[f];
      }
    }
    System.out.println("El elemento menor es: " + menor);
  }

  public void repiteMenor(){
    int cant = 0;
    for (int f = 0; f < vec.length; f++){
      if (vec[f] == menor)
        cant++;
    }
    if (cant == 0)
      System.out.println("No se repite ningun elemento");
    else
      System.out.println("El elemento se repite " + cant + " veces");
  }

  public static void main (String[] args){
    RetoFacil v = new RetoFacil();
    v.cargar();
    v.menorElemento();
    v.repiteMenor();
  }
}
