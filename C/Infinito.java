import java.util.Scanner;


public class Infinito{

    public static void main (String[] args){
            Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese un número para llamar la función infinita: ");
        int a = teclado.nextInt();
        foo(a);
    }
    
    public static void foo(int a){
        int j = 0;
        for(int i = 0; i < a; i++){
            j = j + i;
            System.out.println(j);
        }
    }

}
