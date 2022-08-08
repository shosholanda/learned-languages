import java.util.Scanner;

public class TriangulosV2 {
  public static void main (String[] args) {
    Scanner teclado = new Scanner(System.in);
    int n, x, equilatero, escaleno, isoceles, menor;
    float lado1, lado2, lado3;
    equilatero = 0;
    escaleno = 0;
    isoceles = 0;

    System.out.println("Este programa calcula de 'n' triangulos cuantos son equilateros, isoceles o escalenos.");
    System.out.println("Y dice de que tipo es el menor triangulo dado. ");
    System.out.print("Ingrese la cantidad de triangulos que quiera calcular: ");
    n = teclado.nextInt();
    for ( x = 1; x <= n; x++) {
      System.out.println("Del triangulo " + x + ":");
      System.out.print("Ingrese el lado 1: ");
      lado1 = teclado.nextFloat();
      System.out.print("Ingrese el lado 2: ");
      lado2 = teclado.nextFloat();
      System.out.print("Ingrese el lado 3: ");
      lado3 = teclado.nextFloat();

      if ( lado1 == lado2 && lado2 == lado3)
        equilatero = equilatero + 1;
      else {
        if ( (lado1 != lado2 && lado2 == lado3) || (lado1 != lado3 && lado2 == lado1) || (lado2 != lado3 && lado1 == lado3))
          isoceles = isoceles + 1;
        else
          escaleno = escaleno + 1;
      }
    }
    System.out.println("El numero de triangulos de cada tipo es: ");
    System.out.println("Equilatero: " + equilatero);
    System.out.println("Isoceles  : " + isoceles);
    System.out.println("Escaleno  : " + escaleno);

    if ((equilatero < isoceles && isoceles < escaleno) || (equilatero < escaleno && escaleno < isoceles)) {
      menor = equilatero;
      System.out.println("El tipo de triangulo que tiene menos es el equilatero: " + menor);
    } else if ((escaleno < isoceles && isoceles < equilatero) || (escaleno < equilatero && equilatero < isoceles)){
      menor = escaleno;
      System.out.println("El tipo de triangulo que tiene menos es el escaleno: " + menor);
    } else {
      menor = isoceles;
      System.out.println("El tipo de triangulo que tiene menos es el isoceles: " + menor);
    }
  }
}
