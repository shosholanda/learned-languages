import java.util.Scanner;

public class IntercambiaFilas {

	private Scanner teclado;
	private int[][] matriz;
	private int fila;
	private int columna;

	public void carga(){
		Scanner teclado = new Scanner(System.in);
		System.out.print("Cuantas filas tendra? ");
		fila = teclado.nextInt();
		System.out.print("Cuántas columnas tendra? ");
		columna = teclado.nextInt();
		matriz = new int[fila][columna];
		for (int f = 0; f < matriz.length; f++){
			for (int g = 0; g < matriz[f].length; g++){
				System.out.println("Ingrese componente ");
				matriz[f][g] = teclado.nextInt();
			}
		}
	}

	public boolean esVacio(){
		return matriz.length == 0 && matriz[matriz.length].length <= 0;
	}

	public void bonito(){
		for (int f = 0; f < matriz.length; f++){
			for (int g = 0; g < matriz[matriz.length-1].length; g++){
				System.out.print(" " + matriz[f][g] + " - ");
			}
			System.out.println();
		}
	}

	public static void main (String [] args){
		IntercambiaFilas fi = new IntercambiaFilas();
		//int fila = parseInt(args[0]);
		fi.carga();
		fi.bonito();
		//System.out.println(valueOf(esVacio()));
		fi.intercambiaFilas(0,1);
		System.out.println("Filas Swipeadas");
		fi.bonito();
	}
	
	public void intercambiaFilas(int fila1, int fila2){
        System.out.println("Se intercambiara la fila " + fila1 + " Scon la fila " + fila2);
		for (int i = 0; i < matriz.length; i++){
			swap(i, fila1, fila2);
		}
	}

	public void swap(int i,int fila1, int fila2){
		int temp = matriz[fila1][i];
		matriz[fila1][i] = matriz[fila2][i];
		matriz[fila2][i] = temp;
	}

}
