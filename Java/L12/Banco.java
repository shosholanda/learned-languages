import java.util.Scanner;

public class Banco {
  public static void main (String[] args) {
    Scanner teclado = new Scanner (System.in);
    int cuenta;
    float saldo, sumaAcreedores;
    sumaAcreedores = 0;

    System.out.println("Este programa si una cuenta es acreedor, deudor o nulo. -(no.cuenta) para finalizar la carga.");
    do {
      System.out.print("Ingrese el no. de cuenta: ");
      cuenta = teclado.nextInt();
      if (cuenta >= 0) {
        System.out.print("De la cuenta: " + cuenta + "; ingrese el saldo: $");
        saldo = teclado.nextFloat();
        System.out.println("No. Cuenta  : " + cuenta);
        System.out.println("Saldo actual: $" + saldo);
        if (saldo == 0)
          System.out.println("Estado de cuenta: NULO");
        else {
          if ( saldo < 0)
            System.out.println("Estado de cuenta: DEUDOR");
          else
            System.out.println("Estado de cuenta: ACREEDOR");
            sumaAcreedores = sumaAcreedores + saldo;
        }
      }
    } while (cuenta >= 0);
    System.out.println("La suma total de los acreedores es de: $" + sumaAcreedores);
  }
}
