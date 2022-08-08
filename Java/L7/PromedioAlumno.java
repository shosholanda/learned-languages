import java.util.Scanner;

public class PromedioAlumno {

  public static void main(String[] args) {
    Scanner teclado = new Scanner (System.in);

    float calif1, calif2, calif3, promedio; //los valores de las calificiaciones y el promedio de las 3

    System.out.println("Este programa avisa si un alumno es promocionado a partir de 7 o más de promedio.");
    System.out.println("Dadas las 3 materias sacar el promedio.");
    System.out.println("");
    System.out.print("Ingrese la primera calificacion: ");
    calif1 = teclado.nextFloat();
    System.out.print("Ingrese la segunda calificacion: ");
    calif2 = teclado.nextFloat();
    System.out.print("Ingrese la tercera calificacion: ");
    calif3 = teclado.nextFloat();

    promedio = (calif1 + calif2 + calif3) / 3; //Se saca el promedio de las calificaciones

    System.out.println("Su promedio es: " +  promedio);
    if (promedio >= 7.0)
      System.out.println("Promocionado! :)");
    else
      System.out.println("No promocionado :( ");
  }
}
