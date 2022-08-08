public class Socio {

    private String nombre;
    private int antiguedad;
    
    public Socio(String nombre, int antiguedad){
        this.nombre = nombre;
        this.antiguedad = antiguedad;
    }

    public int getAntiguedad(){
        return antiguedad;
    }
 
    public String getNombre(){
        return nombre;
    }
 
    public void imprimir(){
        System.out.println("El socio " + nombre + " tiene antiguedad de " + antiguedad);
    }
}
