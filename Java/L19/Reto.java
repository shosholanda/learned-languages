import java.util.Scanner;

public class Reto{

  private Scanner teclado;
  private int menor;
  private int[] elementos;

  public void cargar(){
    int cantidad;
    teclado = new Scanner(System.in);
    System.out.println("¿Cuántos elementos desea analizar?");
    cantidad = teclado.nextInt();
    elementos = new int[cantidad];
    if (cantidad >= 1){
      for (int f = 0; f < elementos.length; f++){
        System.out.print("Ingrese elementos (" + f + "): ");
        elementos[f] = teclado.nextInt();
      }
    } else {
      exit();
    }
  }

  public void menorIgual(){
    int pos = 0;
    int cant = 0;
    menor = elementos[0];
    for (int f = 0; f < elementos.length; f++){
      if (elementos[f] < menor){
        menor = elementos[f];
      }
    }
    for (int f = 0; f < elementos.length; f++){
      if (elementos[f] == menor){
        pos = f;
        for (int g = pos+1; g < elementos.length; g++){
          if (elementos[g] == menor){
	          cant++;
	        }
        }
      }
    }
    if (cant >= 1){
      System.out.println("El menor elemento (" + menor + ") se repite en la lista " + cant + " veces.");
    }
    System.out.println("El numero menor es: " + menor);
  }

  public void exit(){
    System.out.println("Numero incorrecto de elementos, ingrese otra cantidad.");
  }

  public static void main (String[] args) {
    Reto ez = new Reto();
    ez.cargar();
    ez.menorIgual();
  }
}
