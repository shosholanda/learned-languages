import java.util.Scanner;

public class SumaValores {
  public static void main (String[] args) {
    Scanner teclado = new Scanner(System.in);
    int valor, suma, contador;
    suma = 0;
    contador = 1;

    System.out.println("Este programa calcula la suma de 'n' numeros y finaliza el programa con el numero 9999");
    do {
      System.out.print("Ingrese el numero " +  contador + ": ");
      valor = teclado.nextInt();
      if (valor != 9999)
        suma = suma + valor;
      contador++;
    } while ( valor != 9999);

    System.out.println("La suma total de los valores es: " + suma);
    if (valor == 0)
      System.out.println("El valor es cero");
    else {
      if (valor < 0)
        System.out.println("El valor es negativo");
      else
        System.out.println("El valor es positivo");
    }
  }
}
