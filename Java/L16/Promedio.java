import java.util.Scanner;

public class Promedio {

  private Scanner teclado;
  private int[] cursoA, cursoB;
  private float promedio, a, b;

  public void bienvenida(){
    System.out.print("Este programa calcula el promedio mas alto entre el curso 'A' y  el curso 'B' con ");
    System.out.println("5 alumnos cada curso.");
  }

  public void cargar() {
    teclado = new Scanner(System.in);
    cursoA = new int[5];
    cursoB = new int[5];
    System.out.print("Ingrese las notas del curso A: ");
    for (int f = 0; f < 5; f++){
      System.out.print("Alumno " + f + ": ");
      cursoA[f] = teclado.nextInt();
    }
    System.out.print("Ingrese las notas del curso B: ");
    for (int f = 0; f < 5; f++){
      System.out.print("Alumno " + f + ": ");
      cursoB[f] = teclado.nextInt();
    }
  }

  public float prom(int[] a){
    int suma, cantidad;
    suma = 0;
    cantidad = 0;
    for (int f = 0; f < 5; f++){
      suma = a[f] + suma;
      cantidad++;
    }
    promedio = suma / cantidad;
    return promedio;
  }

  public void imprime(){
    a = prom(cursoA);                     //los arreglos se pasan sin los corchetes "viktor"
    b = prom(cursoB);
    System.out.println("El promedio del curso A es: " + a);
    System.out.println("El promedio del curso B es: " + b);
    if (a >= b)
      System.out.println("El curso con mayor promedio es el 'A'.");
    else
      System.out.println("El curso con mayor promedio es el 'B'.");
  }

  public static void main (String[] args){
    Promedio alumnos = new Promedio();
    alumnos.bienvenida();
    alumnos.cargar();
    alumnos.imprime();
  }
}
