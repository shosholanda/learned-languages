import java.util.Scanner;

public class Ordenamiento1{

  private Scanner teclado;
  private String[] nombres;
  private float[] sueldos;

  public void cargar(){
    teclado = new Scanner(System.in);
    nombres = new String[5];
    sueldos = new float[5];
    for (int f = 0; f < nombres.length; f++){
      System.out.print("Ingrese nombre: ");
      nombres[f] = teclado.next();
      System.out.print("Ingrese sueldo: $");
      sueldos[f] = teclado.nextFloat();
    }
  }

  public void mayorSueldo(){
    float mayor;
    int pos;
    mayor = sueldos[0];
    pos = 0;
    for (int f = 0; f < nombres.length; f++){
      if (mayor < sueldos[f]){
        mayor = sueldos[f];
        pos = f;
      }
    }
    System.out.println("El empleado con mayor sueldo es: ");
    System.out.print(nombres[pos]);
    System.out.println(", $" + mayor);
  }

  public static void main (String[] args) {
    Ordenamiento1 boda = new Ordenamiento1();
    boda.cargar();
    boda.mayorSueldo();
  }
}
