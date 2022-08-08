import java.util.Scanner;

public class MayorMenor {             //metodos que regresan dato (return)

  public void cargarValores(){
    Scanner teclado = new Scanner(System.in);
    System.out.print("Ingrese el primer valor: ");
    int valor1 = teclado.nextInt();
    System.out.print("Ingrese el segundo valor: ");
    int valor2 = teclado.nextInt();
    System.out.print("Ingrese el tercer valor: ");
    int valor3 = teclado.nextInt();

    int mayor, menor;

    mayor = calculaMayor(valor1, valor2, valor3);             //mayor tendra valor hasta que haya completado
    menor = calculaMenor(valor1, valor2, valor3);             //el metodo

    System.out.println("El valor mayor de los tres es: " + mayor);
    System.out.println("El valor menor de los tres es: " + menor);
  }

  public int calculaMayor(int v1, int v2, int v3) {             // se tienen que decir que tipo seran
                                                                //los parametros pasados (int v)
    int m;                                                      //
    if ( v1 > v2 && v1 > v3)                                    //siempre en cada metodo si tiene parametros
      m = v1;                                                   //se tienen que definir de que tipo son
    else if (v2 > v3)                                           //
      m = v2;
    else
      m = v3;
    return m;
  }

  public int calculaMenor(int v1, int v2, int v3) {               //de 3 valores ingresados
                                                                  //solo regresamos una
    int m;                                                        //si regresamos los 3, deberiamos hacer;
    if ( v1 < v2 && v1 < v3)                                      //return calculaMenor(v1, v2, v3);
      m = v1;                                                           //creo)
    else if (v2 < v3)
      m = v2;
    else
      m = v3;
    return m;
  }

  public static void main (String[] args) {
    MayorMenor maymen = new MayorMenor();
    maymen.cargarValores();
  }
}
