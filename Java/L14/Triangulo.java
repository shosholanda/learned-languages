import java.util.Scanner;

public class Triangulo {            //calcular los lados de un triagulo y decir cual es el mayor lado
                                    //y si son los lados iguales decir que es equilatero.
  private Scanner teclado;
  private int lado1, lado2, lado3;

  public void inicializar() {
    teclado = new Scanner(System.in);
    System.out.print("Ingrese la medida del lado1: ");
    lado1 = teclado.nextInt();
    System.out.print("Ingrese la medida del lado2: ");
    lado2 = teclado.nextInt();
    System.out.print("Ingrese la medida del lado3: ");
    lado3 = teclado.nextInt();
  }

  public void ladoMayor() {
    System.out.print("Lado mayor: ");
    if (lado1 > lado2 && lado1 > lado3)
      System.out.println(lado1);
    else if (lado2 > lado3)
        System.out.println(lado2);
        else
          System.out.println(lado3);
  }

  public void esEquilatero () {
    if (lado1 == lado2 && lado1 == lado3)
      System.out.println("Es un triángulo equilatero.");
    else
      System.out.println("No es un triangulo equilatero.");
  }

  public static void main(String[] args){
    Triangulo triangulo1 = new Triangulo();
    triangulo1.inicializar();
    triangulo1.ladoMayor();
    triangulo1.esEquilatero();
  }
}
