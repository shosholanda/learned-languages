import java.util.Scanner;

public class Palabras {

    private Scanner teclado;
    private String oracion;
    
    public Palabras(){
        System.out.print("Ingrese la oracion a separar en lineas: ");
        teclado = new Scanner(System.in);
        oracion = teclado.nextLine();
        System.out.println(separa());
        System.out.println(separaChafa());
    }
    
    public String separa(){
        String[] tokens = oracion.split(" ");
        String s = "";
        for (int i = 0; i < tokens.length; i++){
            s = s + tokens[i] + "\n";
        }
        return s;
    }
    
    public String separaChafa(){
        String s = "";
        for (int i = 0; i < oracion.length(); i++){
            s = s + oracion.charAt(i);
            if (oracion.charAt(i) == ' '){
                s = s + "\n";
            }
        }
        return s;
    }
    
    public static void main (String[] args){
        Palabras p = new Palabras();
    }
    
}
