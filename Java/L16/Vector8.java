import java.util.Scanner;

public class Vector8 {

  private Scanner teclado;
  private int[] vector1;
  private int a, b, c, suma;

  public void cargar(){
    teclado = new Scanner(System.in);
    vector1 = new int[8];
    System.out.print("Este programa calcula la suma de 8 elementos, la suma de los valores mayores a 36 y las");
    System.out.println(" cantidades mayores a 50");
    for (int f = 0; f < 8; f++){
      System.out.print("Ingrese elemento: ");
      vector1[f] = teclado.nextInt();
    }
  }

  public void asignacion(){
    b = mayorA(36);
    c = cantidadMayorA(50);
  }

  public void sumaVector() {
    suma = 0;                                 //Como se utiliza en varias partes del programa, se define variable
    for (int f = 0; f < 8; f++)               //como variable de clase. Las variables definidas dentro de los metodos
      suma = vector1[f] + suma;               //no pueden ser utilizadas fuera del metodo.
  }

  public int mayorA(int a){
    int m = 0;
    for (int f = 0; f < 8; f++) {
      if (vector1[f]  > a)
        m = m + vector1[f];
    }
    return m;
  }

  public int cantidadMayorA(int a) {
    int m = 0;
    for (int f = 0; f < 8; f++){
      if (vector1[f] >= a)
        m++;
    }
    return m;
  }

  public void imprimir(){
    System.out.println("La suma de los valores es de: " + suma);
    System.out.println("La suma de los valores mayores a 36 es: " + b);
    System.out.println("La cantidad de los valores mayores a 50 es: " + c);
  }

  public static void main (String[] args) {
    Vector8 arreglo = new Vector8();
    arreglo.cargar();
    arreglo.sumaVector();
    arreglo.asignacion();
    arreglo.imprimir();
  }
}
