import java.util.Scanner;

public class Key {

    private Scanner teclado;
    private String key;
    
    public Key (){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese la clave correcta: " );
        key = teclado.nextLine();
    }
    
    public void verificaClave(){
        if (key.equals("123abc")){
            System.out.println("Bienvenido");
        } else {
            System.out.println("Clave incorrecta!");
        }
    }
    
    public static void main (String [] args){
        Key k = new Key();
        k.verificaClave();
    }

}



