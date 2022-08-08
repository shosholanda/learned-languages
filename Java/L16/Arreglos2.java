import java.util.Scanner;

public class Arreglos2{

  private Scanner teclado;
  private float[] alturas;                                //[] para indicar que esta variable seera un arreglo
  private float promedio;                                 //y tendra mas valores dentro de esta.

  public void cargar() {
    teclado = new Scanner(System.in);
    alturas = new float[5];
    for (int f = 0; f < 5; f++){
      System.out.print("Ingrese la altura de la persona "+ f +": ");
      alturas[f] = teclado.nextFloat();                       //recorremos el arreglo y almacenamos valores
    }
  }

  public void calcularPromedio(){
    float suma;
    suma = 0;
    for (int f = 0; f < 5; f++)                             //recorremos el arreglo con el for
      suma = suma + alturas[f];                             //todos los valores se almacenan en 1 sola variable
    promedio = suma/5;                                      //recorremos el arreglo y sumamos los valores
    System.out.println("Promedio de alturas: " + promedio);
  }

  public void mayoresMenores(){
    int may, men;
    may = 0;
    men = 0;
    for (int f = 0; f < 5; f++){
      if (alturas[f] > promedio)                             //recorremos el arreglo y vemos cuales son may o men
        may++;
      else
        men++;
    }
    System.out.println("Cantidad de personas mayores al promedio: " + may);
    System.out.println("Cantidad de personas menores al promedio: " + men);
  }

  public static void main (String[] args){                //ventaja: podemos cargar 1 vez un valor y utilizarlo
    Arreglos2 edades;                                       //cuando lo necesitemos las veces que queramos.
    edades = new Arreglos2();                               //no hay necesidad de volver a cargar valores,
    edades.cargar();                                        //si fuera por variables, deberiamos de.
    edades.calcularPromedio();
    edades.mayoresMenores();
  }
}
