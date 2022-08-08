import java.util.Scanner;

public class Persona {

    protected Scanner teclado;
    protected String nombre;
    protected int edad;
    
    public Persona(){
        teclado = new Scanner(System.in);
    }
    
    public void cargarNombre(){
        System.out.print("Ingrese el nombre de la persona: ");
        nombre = teclado.nextLine();
    }
    
    public void cargarEdad(){
        System.out.print("Ingrese la edad de la persona: ");
        edad = teclado.nextInt();
    }
    
    public void imprimirPersona(){
        System.out.println("Nombre: "+ nombre + "\nEdad: "+ edad);
    }

}
