import java.util.Scanner;

public class MatrizIrregular{

    private Scanner teclado;
    private int[][] mat;
    
    public void cargar(){
        teclado = new Scanner(System.in);
        System.out.print("Cuantas filas tiene la matriz? ");
        int filas = teclado.nextInt();
        mat = new int[filas][];
        for (int i = 0; i < filas; i++){
            System.out.print("Cuantos elementos tiene la fila? ");
            int elementos = teclado.nextInt();
            mat[i] = new int[elementos];
            for (int f = 0; f < elementos; f++){
                System.out.print("Ingrese el elemento: ");
                mat[i][f] = teclado.nextInt();
            }
        }
    }
    
    public void imprimir(){
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String [] args){
        MatrizIrregular m = new MatrizIrregular();
        m.cargar();
        m.imprimir();
    }

}

