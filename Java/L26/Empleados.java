import java.util.Scanner;

public class Empleados{

	private Scanner teclado;
	private int[] sueldos;
	
	public Empleados(){
		teclado = new Scanner(System.in);
		sueldos = new int[5];
		for (int f = 0; f < 5; f++){
			System.out.print("Ingrese valor de la componente.");
			sueldos[f] = teclado.nextInt();
		}
	}
	
	public void imprimir(){
		for (int f = 0; f < 5; f++){
			System.out.println(sueldos[f]);
		}
	}
	
	public static void main (String[] args){
		Empleados e = new Empleados();
		e.imprimir();
	}

}
