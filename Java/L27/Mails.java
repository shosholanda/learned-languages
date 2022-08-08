import java.util.Scanner;
import java.util.Arrays;

public class Mails {

    private Scanner teclado;
    private String[] nombres;
    private String[] correos;
    
    public Mails(){
        nombres = new String[5];
        correos = new String[5];
        teclado = new Scanner(System.in);
        for (int i = 0; i < nombres.length; i++){
            System.out.print("Ingrese el nombre: ");
            nombres[i] = teclado.nextLine();
            System.out.print("Ingrese el correo: ");
            correos[i] = teclado.nextLine();
        }
    }
    
    public void buscaNombre(){
        System.out.print("Ingrese el nombre a buscar: ");
        String nomb = teclado.nextLine();
        for (int i = 0; i < nombres.length; i++){
            if (nomb.equals(nombres[i])){
                System.out.println("El correo de " + nomb + " es: " + correos[i]);
                return;
            }
        }
        System.out.println("El nombre no se encontro en la base de datos.");
    }
    
    public void buscaArroba(){
        for (int i = 0; i < nombres.length; i++){
            if (correos[i].indexOf("@") < 0){
                System.out.println("No se encontró @ en el correo " + correos[i]);
            } else {
                System.out.println("El correo " + correos[i] + " tiene el caracter @");
            }
        }
    }
    
    public static void main (String [] args){
        Mails m = new Mails();
        m.buscaNombre();
        m.buscaArroba();
    }

}
