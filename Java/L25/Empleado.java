import java.util.Scanner;

public class Empleado{

    private Scanner teclado;
    private String[] nombres;
    private int[][] dias;
    
    public void cargar(){
        teclado = new Scanner(System.in);
        System.out.print("Cuántos empleados va a checar? ");
        int total = teclado.nextInt();
        nombres = new String[total];
        dias = new int[total][];
        for (int i = 0; i < nombres.length; i++){
            System.out.print("Ingrese el nombre "+ i +": ");
            nombres[i] = teclado.next();
            System.out.print("Cuántos días falto? ");
            int faltas = teclado.nextInt();
            dias[i] = new int[faltas];
            for (int j = 0; j < dias[i].length; j++){
                dias[i][j] = j;
            }
        }
    }
    
    public void imprimir(){
        for (int f = 0; f < nombres.length; f++){
            System.out.print("Nombre del empleado: " + nombres[f]+"\n");
            System.out.println("Total de inasistencias: " + inasistencias(f) + "\n");
        }
    }
    
    public int inasistencias(int fila){
        return dias[fila].length;
    }
    
    public int empleadoDelMes(){
        int i = inasistencias(0);
        for (int j = 0; j < dias.length; j++){
            if (inasistencias(j) < i){
                i = inasistencias(j);
            }
        }
        System.out.println("El empleado que falto menos es: " + nombres[i] + ", con un total de " + inasistencias(i) + " faltas.");
        return i;
    }
    
    public static void main(String[] args){
        Empleado e = new Empleado();
        e.cargar();
        e.imprimir();
        int i = e.empleadoDelMes();
    }

}
