public class Inicio {

    public static void main (String[] args){
        Persona p = new Persona();
        p.cargarNombre();
        p.cargarEdad();
        p.imprimirPersona();
        
        Empleado e = new Empleado();
        e.cargarNombre();
        e.cargarEdad();
        e.cargarSueldo();
        e.imprimirPersona();
        e.imprimirSueldo();
    }
    
}
