import java.util.Scanner;
//Esta es la clase padre. Estos métodos se van a implementar en subclases. 

public class Operacion {

    protected Scanner teclado;
    protected int valor1;
    protected int valor2;
    protected int resultado;
    
    
    public Operacion(){
        teclado = new Scanner(System.in);
    }

    public void cargar1(){
        System.out.println("Ingrese el primer valor: ");
        valor1 = teclado.nextInt();
    }

    public void cargar2(){
        System.out.println("Ingrese el segundo valor: ");
        valor2 = teclado.nextInt();
    }
    
    public void mostrarResultado(){
        System.out.println(resultado);
    }
}
