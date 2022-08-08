import java.util.Scanner;

public class TriSueldos{

    private Scanner teclado;
    private String[] empleados;
    private int[][] sueldos;
    private int[] sueldosTot;
    
    public void cargar(){
        teclado = new Scanner(System.in);
        empleados = new String[4];
        sueldos = new int[4][3];
        for (int i = 0; i < empleados.length; i++){
            System.out.print("Ingrese el nombre del empleado: ");
            empleados[i] = teclado.next();
            for (int c = 0; c < sueldos[i].length; c++){
                System.out.println("Ingrese sueldo: ");
                sueldos[i][c] = teclado.nextInt();
            }
        }
    }
    
    public void calcularSumaSueldos(){
        sueldosTot = new int[4];
        for (int f = 0; f < sueldos.length; f++){
            int suma = 0;
            for (int c = 0;c < sueldos[f].length; c++){
                suma += sueldos[f][c];
            }
            sueldosTot[f] = suma;
        }
    }
    
    public void imprimirTotalPagado(){
        System.out.println("Total de sueldos pagados por empleado: ");
        for (int i = 0; i < sueldosTot.length; i++){
            System.out.println(empleados[i] + ": " + sueldosTot[i]);
        }
    }
    
    public void empleadoMayorSueldo(){
        int may = sueldosTot[0];
        String nomb = empleados[0];
        for (int i = 0; i < sueldosTot.length; i++){
            if (sueldosTot[i] > may){
                may = sueldosTot[i];
            }
        }
        System.out.println("El empleado con mayor sueldo es: " + empleados[may] + " - " + sueldosTot[may]);
    }
    
    public static void main (String [] args){
        TriSueldos t = new TriSueldos();
        t.cargar();
        t.calcularSumaSueldos();
        t.imprimirTotalPagado();
        t.empleadoMayorSueldo();
    }

}
