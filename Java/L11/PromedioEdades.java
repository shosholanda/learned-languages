import java.util.Scanner;

public class PromedioEdades {
  public static void main (String[] args) {
    Scanner teclado = new Scanner (System.in);
    int edadManana, edadTarde, edadNoche, promedioManana, promedioTarde, promedioNoche;
    int f, valor, totalM, totalT, totalN;
    edadManana = 0;
    edadTarde = 0;
    edadNoche = 0;
    totalM = 0;
    totalN = 0;
    totalT = 0;

    System.out.print("Este programa calcula el promedio de las edades de estudiantes del ");
    System.out.print("turno de la mañana (50), de la tarde (60) y de la noche (110)");
    System.out.println(" y nos dice en que turno el promedio de edad es el mayor.");

        //Turno de la mañana
    System.out.println("Del turno de la mañana ingrese las edades de: ");
    for ( f = 1; f <= 5; f++) {
      System.out.print("Estudiante " + f + " : ");
      valor = teclado.nextInt();
      edadManana = edadManana + valor;
      totalM++;
    }

        //Turno de la tarde (60)
    System.out.println("Del turno de la tarde: ");
    for ( f = 1; f <= 6; f++) {
      System.out.print("Estudiante " + f + " : ");
      valor = teclado.nextInt();
      edadTarde = edadTarde + valor;
      totalT++;
    }

        //Turno de la noche (110)
    System.out.println("Del turno de la noche: ");
    for (f = 1; f <= 11; f++) {
      System.out.print("Estudiante " + f + " : ");
      valor = teclado.nextInt();
      edadNoche = edadNoche + valor;
      totalN++;
    }

        //Se sacan los promedios de las edades, el total puede ser el valor entero de alumnos.
    promedioManana  = edadManana/ totalM;
    promedioTarde   = edadTarde / totalT;
    promedioNoche   = edadNoche / totalN;

        //Se imprimen los promedios
    System.out.println("El promedio de edad de estudiantes en la mañana es de: " + promedioManana);
    System.out.println("El promedio de edad de estudiantes en la tarde es de : " + promedioTarde);
    System.out.println("El promedio de edad de estudiantes en la noche es de : " + promedioNoche);

        //se dice cual es el mayor promedio:
    if ( (promedioManana < promedioTarde && promedioManana < promedioNoche ) || (promedioManana < promedioNoche && promedioManana < promedioTarde))
        System.out.println("El menor promedio de edades es de la mañana. " + promedioManana);
    else if (promedioTarde < promedioManana || promedioTarde < promedioNoche)
      System.out.println("El menor promedio es de la tarde. " + promedioTarde);
    else
      System.out.println("El promedio menor es de la noche. " + promedioNoche);

  }
}
