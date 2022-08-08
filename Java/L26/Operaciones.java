import java.util.Scanner;

public class Operaciones{
	
	private int x;
	private int y;
	private Scanner teclado;
	
	public Operaciones(){
		teclado = new Scanner(System.in);
		System.out.print("Ingrese el primer valor: ");
		x = teclado.nextInt();
		System.out.print("Ingrese el segundo valor: ");
		y = teclado.nextInt();
	}	
	
	public void suma(){
		int suma = x+y;
		System.out.println(x + " + " + y + " = " + suma);
	}
	
	public void multiplicar(){
		int mult = x*y;
		System.out.println(x + " x " + y + " = " + mult);
	}
	
	public void dividir(){
		int div = x / y;
		System.out.println(x + " / " + y + " = " + div);
	}
	
	public void resta(){
		int resta = x -y;
		System.out.println(x + " - " + y + " = " + resta);
	}
	
	public static void main (String [] args){
		Operaciones o = new Operaciones();
		o.suma();
		o.multiplicar();
		o.dividir();
		o.resta();
	}
}
