import java.util.Scanner;

public class Navidad {
  public static void main (String[] args){

    Scanner teclado = new Scanner(System.in);
    int dia, mes, año;

    System.out.println("Este programa nos dice si es navidad el dia de hoy :)");
    System.out.print("¿Qué día es hoy? (Ingrese día): ");
    dia = teclado.nextInt();
    System.out.print("¿A qué mes estamos? (Ingrese mes): ");
    mes = teclado.nextInt();
    System.out.print("¿Qué año es? (Ingrese año): ");
    año = teclado.nextInt();

    if ( dia == 25 && mes == 12)
      System.out.println("¡Es navidad! :D " + dia + "/ " + mes + "/ " + año);
    else
      System.out.println("No es navidad todavía :( ");
  }
}
