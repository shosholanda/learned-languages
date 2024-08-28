import java.util.Scanner;

//No importa que no le entiendas nada, lo harás eventualmente :) 


public class SueldoOperario {

  public static void main (String[] ar) {
    //Creamos un objeto Scanner que recibe la entrada estándar (por terminal)
    Scanner teclado = new Scanner (System.in);
    int horasTrabajadas;  //Las horas trabajadas del empleado
    float costoHora;      //El sueldo por hora del empleado
    float sueldo;         //El sueldo total que se debe pagar al día
    System.out.println("Ingrese la cantidad de horas trabajadas por el empleado:");
    horasTrabajadas = teclado.nextInt(); //Recibir el número por la terminal
    System.out.println("Ingrese el valor de la hora:");
    costoHora = teclado.nextFloat();
    sueldo = horasTrabajadas * costoHora; //Operación aritmética
    //Imprimir salida.
    System.out.println("El empleado debe de cobrar:");
    System.out.print(sueldo);
  }
}
