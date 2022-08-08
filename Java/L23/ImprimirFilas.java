import java.util.Scanner;

public class ImprimirFilas {

	private Scanner teclado;
	private int [][] matriz;

	public void cargar(){
		teclado = new Scanner(System.in);
		System.out.println("Cuantas filas tiene la matriz");
		int filas = teclado.nextInt();
		System.out.println("Cuantas columnas tiene la matriz");
		int columnas = teclado.nextInt();
		matriz = new int[filas][columnas];
		for (int f = 0; f < matriz.length; f++){
			for (int g = 0; g < matriz[f].length; g++){
				System.out.print("Ingrese componente: ");
				matriz[f][g] = teclado.nextInt();
			}		
		}
	}

	public void imprimir() {
		for (int f = 0; f < matriz.length; f++){				// el tamaño de la  matriz del primer valor
			for (int g = 0; g < matriz[f].length; g++){			// matriz = new matriz[2][3]
				System.out.print(matriz[f][g] + " ");			// matriz.length = 2;
			}
			System.out.println();		
		}
		System.out.println("matriz.length:");
		System.out.println(matriz.length);
		
		System.out.println("matriz[matriz.length-1]:");
		System.out.println(matriz[matriz.length-1]);
		
		System.out.println("matriz[matriz.length-1].length");
		System.out.println(matriz[matriz.length-1].length);
					
	}
	
	public void imprimirUltimaFila() {
		System.out.println("Ultima Fila");
		for (int i = 0; i < matriz[matriz.length -1].length; i++){		// el tamaño del segundo valor
			System.out.print(matriz[matriz.length-1][i] + " "); 		// matriz = new matriz[4][2];
		}									// matriz[matriz.length-1].length = 2;
	}

	public static void main (String [] args) {
		ImprimirFilas i = new ImprimirFilas();
		i.cargar();
		i.imprimir();
		i.imprimirUltimaFila();
	}

}

