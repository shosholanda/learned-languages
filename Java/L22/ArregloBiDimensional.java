import java.util.Scanner;

public class ArregloBiDimensional {
	
	private Scanner teclado;
	private int[][] arreglo;

	public void cargar(){
		teclado = new Scanner(System.in);
		arreglo = new int [3] [5];
		for (int f = 0; f < 3; f++){
			for (int g = 0; g < 5; g++){
				System.out.print("Ingrese componente: ");
				arreglo[f][g] = teclado.nextInt();
			}	
		}
	}

	public void imprimir(){
		for (int f = 0; f < 3; f++){
			for (int g = 0; g < 5; g++){
				System.out.print(arreglo[f][g] + ", ");
			}
		System.out.println("");
		}
	}

	public static void main (String [] args) {
		ArregloBiDimensional a = new ArregloBiDimensional();
		a.cargar();
		a.imprimir();
	}
}
