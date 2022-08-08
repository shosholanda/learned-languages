import java.util.Scanner;

class HolaTu {
  public static void main (String[] args){

    Scanner nombre = new Scanner(System.in);

    System.out.println("¿Cual es su nombre?");

    String name = nombre.nextLine();

    System.out.println("Hola" + " " + name + "!!");

  }
}
