import java.util.Scanner;

public class Diagonal {
	
	private Scanner teclado;
	private int[][] arreglo;

	public void cargar(){
		teclado = new Scanner(System.in);
		arreglo = new int [5] [5];
		for (int f = 0; f < 5; f++){
			for (int g = 0; g < 5; g++){
				System.out.print("Ingrese componente: ");
				arreglo[f][g] = teclado.nextInt();
			}	
		}
	}

	public void imprimir(){
		for (int f = 0; f < 5; f++){
			for (int g = 0; g < 5; g++){
				if (f == g){
					System.out.print(arreglo[f][g] + " ");					
				}
				System.out.print(" - ");
			}
		System.out.println("");
		}
	}

	public static void main (String [] args) {
		Diagonal a = new Diagonal();
		a.cargar();
		a.imprimir();
	}
}
