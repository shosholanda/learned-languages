import java.util.Scanner;

public class StringSort{

  private Scanner teclado;
  private String[] paises;

  public void cargar(){
    teclado = new Scanner(System.in);
    paises = new String[5];
    for (int f = 0; f < paises.length; f++){
      System.out.print("Ingrese el país: ");
      paises[f] = teclado.next();
    }
  }

  public void ordenar(){
    for (int k = 0; k < paises.length -1; k++){
      for (int f = 0; f < paises.length -1; f++){	//compareTo()
        if (paises[f].compareTo(paises[f+1]) > 0){ 	//1 si a es mayor alfabeticamente que b
          String aux = paises[f];			//0 si a es igual a b
          paises[f] = paises[f+1];			//-1 si a es menor alfabeticamente que b
          paises[f+1] = aux;
        }
      }
    }
  }

  public void imprimir() {
    System.out.println("Los paises ordenados es:");
    for (int f = 0; f < paises.length; f++){
      System.out.print(paises[f] + " ");
    }
    System.out.println("");
  }

  public static void main (String[] args){
    StringSort s = new StringSort();
    s.cargar();
    s.ordenar();
    s.imprimir();
  }
}
