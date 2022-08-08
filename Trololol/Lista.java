import java.util.Scanner;

public class Lista{

  private Scanner teclado;
  private String[] nombres;
  private int[] cantidad1;
  private double[] cantidad2;
  private int total;

  public void bienvenida(){
    System.out.print("Hola! en este programa puedes almacenar una lista de cosas. ");
    System.out.print("Puedes almacenar 1 lista de nombres y 2 listas numericas ");
    System.out.print("(por ejemplo: la despensa, cuantos articulos y el precio)");
    System.out.println("Empezemos por lo primero.\n");
  }

  public void cargar(){
    System.out.print("¿Cuántos articulos va a necesitar? ");
    total = teclado.nextInt();
    nombres = new String[total];
    cantidad1 = new int[total];
    cantidad2 = new double[total];
    for (int f = 0; f < total; f++){
      System.out.print("Ingrese nombre " + f + ": ");
      nombres[f] = teclado.nextLine();
      System.out.print("Ingrese valores enteros " + f + ": ");
      cantidad1[f] = teclado.nextInt();
      System.out.print("Ingrese valores decimales " + f + ": ");
      cantidad2[f] = teclado.nextDouble();
    }
  }

  public void suma(){
    String junta = "";
    int sum1 = 0;
    double sum2 = 0;
    for (int f = 0; f < total; f++){
      junta = junta + ", " + nombres[f];
      sum1 = sum1 + cantidad1[f];
      sum2 = sum2 + cantidad2[f];
    }
    System.out.println("El total de nombres es: " + junta + ".");
    System.out.println("Cantidad total de enteros: " + sum1);
    System.out.println("Cantidad total decimales: " + sum2);
  }
}
