import java.util.Scanner;

public class Arreglos3 {

  private Scanner teclado;
  private float[] turnoMatutino;
  private float[] turnoVersperino;

  public void cargar(){
    teclado = new Scanner(System.in);
    turnoMatutino = new float[4];                   //debemos crear los objetos de scanner y Arreglos
    turnoVersperino = new float[4];
    System.out.println("Sueldos de empleados del turno de la mañana. ");
    for (int f = 0; f < 4; f++ ) {
      System.out.print("Ingrese sueldo: ");
      turnoMatutino[f] = teclado.nextFloat();
    }
    System.out.println("Sueldo de empleados del turno de la tarde. ");
    for (int f = 0; f < 4; f++) {
      System.out.print("Ingrese sueldo: ");
      turnoVersperino[f] = teclado.nextFloat();
    }
  }

  public void calcularGastos() {
    float matutino = 0;
    float verspertino = 0;
    for (int f = 0; f < 4; f++) {
      matutino = matutino + turnoMatutino[f];
      verspertino = verspertino + turnoVersperino[f];
    }
    System.out.println("Total de gastos del turno de la mañana: " + matutino);
    System.out.println("Total de gastos del turno de la tarde: " + verspertino);
  }

  public static void main (String[] args) {
    Arreglos3 gastos = new Arreglos3();
    gastos.cargar();
    gastos.calcularGastos();
  }
}
