import java.util.Scanner;

public class Obrero{

	private Scanner teclado;
	private String nombre; 
	private float sueldo;
	
	public Obrero(){
		teclado = new Scanner(System.in);
		System.out.print("Cual es el nombre del obrero? ");
		this.nombre = teclado.next();
		System.out.print("Cual es el sueldo del obrero? ");
		this.sueldo = teclado.nextInt();
	}
	
	public void imprimir(){
		System.out.println("Nombre: "+ nombre + "\nSueldo: " + sueldo);
	}
	
	public void impuestos(){
		if (sueldo > 3000){
			System.out.println("El obrero " + nombre + ", debe pagar impuestos");	
		} else {
			System.out.println("El obrero " + nombre + ", no debe pagar impuestos");
		}
	}
	
	public static void main (String[] args){
		Obrero o = new Obrero();
		o.imprimir();
		o.impuestos();
	}
}
