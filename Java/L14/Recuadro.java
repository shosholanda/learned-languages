import java.util.Scanner;

public class Recuadro {

  private Scanner teclado;
  private int lado;                 //se definen las variables de clase si se utilizan en todos los metodos
                                    //si no, podemos solamente ponerlo en el metodo corresponte
  public void inicializar() {       //Estas pueden acceder a todos los metodos de la clase
    teclado = new Scanner(System.in);
    System.out.print("Ingrese el valor del lado: ");
    lado = teclado.nextInt();
  }

  public void imprimirPerimetro() {
    int perimetro;                  //aqui declaramos una nueva variable, que viene de lado (no es necesaria
    perimetro = lado*4;              // la variable perimetro para toda la clase, solamente aqui,
    System.out.println("El perímetro del cuadrado es: " + perimetro);
  }

  public void imprimirSuperficie() {
    int superficie;                             //Estas variables dentro de los metodos solo son accesibles
    superficie = lado * lado;                    //desde dentro del método (mientras se ejecuta)
    System.out.println("El area es de: " + superficie);
  }

  public static void main (String[] args) {
    Recuadro cuadrado1;
    cuadrado1 = new Recuadro();
    cuadrado1.inicializar();
    cuadrado1.imprimirPerimetro();
    cuadrado1.imprimirSuperficie();
  }
}
