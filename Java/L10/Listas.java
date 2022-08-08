import java.util.Scanner;

public class Listas {
  public static void main (String[] args) {
    Scanner teclado = new Scanner(System.in);
    int x, totalLista1, totalLista2, lista1, lista2;
    x = 1;
    totalLista1 = 0;
    totalLista2 = 0;

    System.out.println("Este programa calcula si la suma de dos Listas es la misma, entonces las listas son iguales:");
    System.out.println("Ingrese los valores de la primera lista (15)");
    while (x <= 15) {
      System.out.print("El " + x + " valor: ");
      lista1 = teclado.nextInt();
      totalLista1 = totalLista1 + lista1;
      x = x + 1;
    }
    x = 1;
    System.out.println("Ingrese los valores de la segunda Lista (15)");
    while (x <= 15) {
      System.out.print("El " + x + " valor: ");
      lista2 = teclado.nextInt();
      totalLista2 = totalLista2 + lista2;
      x = x + 1;
    }
    if ( totalLista1 == totalLista2)
      System.out.println("Las listas son iguales: " + totalLista1 + " = " + totalLista2);
    else {
      if ( totalLista1 < totalLista2)
        System.out.println("La segunda lista es mayor: " + totalLista2 + ">" + totalLista1);
      else
        System.out.println("La primera lista es mayor: " + totalLista1 + "> + totalLista2");
    }
  }
}
