import java.util.Scanner;

public class Piramide{

    private Scanner teclado;
    private int[][] mat;
    
    public void cargar(){
        teclado = new Scanner(System.in);
        mat = new int[5][];
        for (int i = 0; i < mat.length; i++){
            mat[i] = new int [i+1];
            for (int j = 0; j < mat[i].length; j++){
                mat[i][j] = i + j;
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
    
    public static void main (String [] args){
        Piramide p = new Piramide();
        p.cargar();
        p.imprimir();
    }

}
