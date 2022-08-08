import java.util.Scanner;

public class Busqueda {

	private Scanner teclado;
	private int [][] matriz;

	public void cargar(){
		teclado = new Scanner(System.in);
		System.out.println("Cuantas filas tiene la matriz?");
		int filas = teclado.nextInt();
		System.out.println("Cuantas columnas tiene la matriz?");
		int columnas = teclado.nextInt();
		matriz = new int[filas][columnas];
		for (int f = 0; f < matriz.length; f++){
			for (int g = 0; g < matriz[f].length; g++){
				System.out.print("Ingrese componente: ");
				matriz[f][g] = teclado.nextInt();
			}		
		}
	}

	public void buscaMayorElemento(){
		int mayor = matriz[0][0];
		int indiceFilas = 0;
		int indiceColumnas = 0;
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz[i].length; j++){
				if (mayor < matriz[i][j]){
					mayor = matriz[i][j];
					indiceFilas = i;
					indiceColumnas = j;
				}
			}
		}imprimir(mayor, indiceFilas, indiceColumnas, "mayor");
	}

	public void buscaMenorElemento(){
		int menor = matriz[0][0];
		int indiceFilas = 0;
		int indiceColumnas = 0;
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz[i].length; j++){
				if (menor > matriz[i][j]){
					menor = matriz[i][j];
					indiceFilas = i;
					indiceColumnas = j; 
				}
			}
		}
		imprimir(menor, indiceFilas, indiceColumnas, "menor");
	}

	public void imprimir(int m, int i, int j, String v){
		System.out.println("El elemento " + v + " es: " + m);
		System.out.println("Se encuentra en la posicion: ("
				  			 + i + ", " + j +")"); 
	}

	public void bonito(){
		System.out.println();
		for (int i = 0; i < matriz.length; i++){
			for (int j = 0; j < matriz[i].length; j++){
				System.out.print(matriz[i][j] + " - ");
			}
			System.out.println();
		}
		System.out.println();		
	}

	public static void main (String [] args){
		Busqueda b = new Busqueda();
		b.cargar();
		b.buscaMayorElemento();
		b.buscaMenorElemento();
		b.bonito();
	}

	
}
