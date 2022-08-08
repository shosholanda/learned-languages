public class Empleado extends Persona {

    protected int sueldo;
    
    public void cargarSueldo(){
        System.out.print("Ingrese el sueldo: ");
        sueldo = teclado.nextInt();
    }

    public void imprimirSueldo(){
        System.out.println("Sueldo: " + sueldo);
    }
}
