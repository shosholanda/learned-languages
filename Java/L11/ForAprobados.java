import java.util.Scanner;

public class ForAprobados {
  public static void main (String[] args) {
    Scanner teclado = new Scanner (System.in);
    int x, aprobados, reprobados, nota;
    aprobados = 0;
    reprobados = 0;
    System.out.println("Este programa calcula cuantos alumnos (10) aprueban mayor a 7, y cuantos reprueban menor a 7");
    for (x = 1; x <= 10; x++) {
      System.out.print("Ingrese la "+ x + " nota: ");
      nota = teclado.nextInt();
      if (nota >= 7)
        aprobados = aprobados + 1;
      else
        reprobados = reprobados + 1;
    }
    System.out.println("La cantidad de alumnos APROBADOS es de: " + aprobados);
    System.out.println("La cantidad de alumnos REPROBADOS es de: " + reprobados);
  }
}
