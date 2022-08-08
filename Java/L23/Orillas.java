import java.util.Scanner;

public class Orillas{

    private int[][] matriz;
    private Scanner teclado;
    
    public void cargar(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cuantas filas tiene la matriz?");
        int largo = teclado.nextInt();
        System.out.println("Cuantas columas tiene la matriz");
        int alto = teclado.nextInt();
        matriz = new int[alto][largo];
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[i].length; j++){
                System.out.print("Ingrese componente: " );
                matriz[i][j] = teclado.nextInt();
            }
        }
    }
    
    public void bonito(){
		for (int f = 0; f < matriz.length; f++){
			for (int g = 0; g < matriz[matriz.length-1].length; g++){    
				System.out.print(" " + matriz[f][g] + " - ");
			}
			System.out.println();
		}
	}
	
	
	public void orillas(){
        System.out.println("Las orillas de la matriz son: ");
        System.out.print(matriz[0][0]);
        for (int i = 1; i < matriz.length-1; i++){
            System.out.print(" - ");
        }
        System.out.println(matriz[0][matriz.length-1]);
		for (int f = 1; f < matriz.length-1; f++){
			for (int g = 0; g < matriz[matriz.length-1].length; g++){
				System.out.print("- ");
			}
			System.out.println();
		}
        System.out.print(matriz[matriz.length-1][0]);
        for (int i = 1; i < matriz.length-1; i++){
            System.out.print(" - ");
        }
        System.out.println(matriz[matriz.length-1][matriz.length-1]);
	}
	
	public static void main (String args[]) {
        Orillas o = new Orillas();
        o.cargar();
        o.bonito();
        o.orillas();
	}

}
