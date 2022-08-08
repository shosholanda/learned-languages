import java.util.Scanner;

public class Relacionados{

  private Scanner teclado;
  private String[] nombres;
  private int[] edades;

  public void cargar(){
    teclado = new Scanner(System.in);
    nombres = new String[5];
    edades = new int[5];
    for (int f = 0; f < nombres.length; f++){     //si el indice de un arreglo corresponde al de otro, se imprimien
      System.out.print("Ingrese nombre: ");       //con el mismo indice y estan relacionados por el indice, no
      nombres[f] = teclado.next();                //por otra cosa
      System.out.print("Ingrese edad: ");
      edades[f] = teclado.nextInt();
    }
  }

  public void mayorEdad(){
    System.out.println("Personas mayores de edad: ");
    for (int f = 0; f < nombres.length; f++){
      if (edades[f] > 18)
        System.out.println(nombres[f]);
    }
  }

  public static void main (String[] args){
    Relacionados fbi = new Relacionados();
    fbi.cargar();
    fbi.mayorEdad();
  }
}
