import java.util.Scanner;

public class TablaMultiplicar {                   //paso de parametros

  public void cargarValor(){
    Scanner teclado = new Scanner(System.in);
    int valor;
    do {
      System.out.print("Ingrese valor: ");
      valor = teclado.nextInt();
      if (valor != -1)
        calcular(valor);
    } while (valor != -1);
  }

  public void calcular(int v){                // como es llamado el metodo calcular(valor),
    for (int f = v; f <= v*12; f = f + v)     //entonces la v se inicializa con el valor dado antes en calcular(valor)
      System.out.println(f + ".");            //y la f tambien tiene el mismo valor que v, solo que no contamos hasta 10
      System.out.println("------ ");
  }                                           //como for (i = 0; i <= 10; i++)
                                              //pero aqui v es un valor, y se tiene que incrementarcon ella misma.
  public static void main (String[] args) {   //como: v = 12; v"* 10  = 120. (v1 = 12, v2 = 24, v3 = 36... v10 = 120)
    TablaMultiplicar tabla;
    tabla = new TablaMultiplicar();
    tabla.cargarValor();
  }
}
