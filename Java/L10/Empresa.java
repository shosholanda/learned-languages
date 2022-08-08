import java.util.Scanner;

public class Empresa {
  public static void main ( String[] args) {
    Scanner teclado = new Scanner (System.in);
    int n, x, pobres, ricos;
    float ingreso, presupuesto;
    x = 1;
    pobres = 0;
    ricos = 0;
    presupuesto = 0;

    System.out.println("Este programa calcula a cuantos empleados se les paga entre 100 y 300 pesos.");
    System.out.print("Ingrese la cantidad total de empleados: ");
    n = teclado.nextInt();

    if (n <= 0)
      System.out.println("ERROR: No existen personas negativas");
    else {
      while (x <= n) {
        System.out.print("Ingrese el sueldo del empleado " + x + " : ");
        ingreso = teclado.nextFloat();
        if ( ingreso >= 300)
          ricos = ricos +1;
        else if (ingreso >= 100)
          pobres = pobres + 1;
        presupuesto = presupuesto + ingreso;
        x = x + 1;
      }
      System.out.println("La cantidad de personas pagadas entre $100 y $300 es de: " + pobres);
      System.out.println("La cantidad de personas pagadas mayor a $300 es de: " + ricos);
      System.out.println("El presupuesto que le genera a la empresa es de: $" + presupuesto);
    }
  }
}
