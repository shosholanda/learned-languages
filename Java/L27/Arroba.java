import java.util.Scanner;

public class Arroba {

    private Scanner teclado;
    private String cadena;

    public Arroba(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese la cadena a verificar el arroba: ");
        cadena = teclado.nextLine();
    }
    
    public void contieneArroba(){
        int indice = cadena.indexOf("@");
        if (indice > 0){
            System.out.println("La cadena contiene a @ en : " + indice);
        } else {
            System.out.println("La cadena no contiene a @");
        }
    }
    
    public static void main (String[] args){
        Arroba a = new Arroba();
        a.contieneArroba();
    }

}
