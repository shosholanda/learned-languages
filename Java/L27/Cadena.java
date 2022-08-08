import java.util.Scanner;

public class Cadena {

	public static void main (String [] args){
	
		Scanner teclado = new Scanner(System.in);
		String cad1;
		String cad2;
		
		System.out.print("Ingrese la primer cadena: ");
		cad1 = teclado.nextLine();
		System.out.print("Ingrese la segunda cadena: ");
		cad2 = teclado.nextLine();
		if (cad1.equals(cad2) == true){
			System.out.println(cad1 + " es exactamente igual a " + cad2);
		} else {
			System.out.println(cad1 + " no es exactamente igual a " + cad2);
		}
		if (cad1.equalsIgnoreCase(cad2) == true){
			System.out.println(cad1 + " es igual a " + cad2 + " sin tener en cuenta las mayusculas. ");
		} else {
			System.out.println(cad1 + " no es igual a " + cad2 + " sin tener en cuenta las mayusculas. ");
		}
		if (cad1.compareTo(cad2) == 0){
			System.out.println(cad1 + " es exactamente igual a " + cad2);
		} else {
			if (cad1.compareTo(cad2) < 0){
				System.out.println(cad1 + " es mayor alfabeticamente que " + cad2);
			} else {
				System.out.println(cad1 + " es menor alfabeticamente que " + cad2);
			}
		}
		char caracter = cad1.charAt(0);
		System.out.println("El primer caracter de " + cad1 + " es: " + caracter);
		int largo = cad1.length();
		System.out.println("La longitud de " + cad1 + " es: " + largo);
		String cad3 = cad1.substring(0,3);
		System.out.println("Los 3 primeros caracteres de : " + cad1 + " son: " + cad3);
		int pos = cad1.indexOf(cad2);
		if (pos == -1 ){
			System.out.println("La " + cad2 + " no está contenida dentro de : " + cad1);
		} else {
			System.out.println("La " + cad2 + " esta contenido dentro del " + cad1 + " desde la posicion " + pos);
		}
		System.out.println(cad1 + " convertido a mayusculas es: " + cad1.toUpperCase());
		System.out.println(cad1 + " convertido a minusculas es: " + cad1.toLowerCase());
	
	}

}
