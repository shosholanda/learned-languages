import java.util.Scanner;

public class InformeAprobados {
  public static void main (String[] args) {
    Scanner teclado = new Scanner(System.in);

    int x, aprobados, reprobados;
    x = 1;
    aprobados = 0;
    reprobados = 0;
    float calificacion;

    System.out.println("Este programa calcula de un grupo de 10 alumnos cuantos aprobaron mayor a 7 de calificacion y cuantos no.");
    while ( x <= 10 ) {
      System.out.print("Ingrese la calificacion del estudiante " + x + " : ");
      calificacion = teclado.nextFloat();
      if (calificacion >= 7)
        aprobados = aprobados + 1;
      else
        reprobados = reprobados + 1;
      x = x + 1;
    }
    System.out.println("El numero de estudiantes mayor a 7 es de: " + aprobados);
    System.out.println("El numero de estudiantes menor a 7 es de : " + reprobados);
  }
}
