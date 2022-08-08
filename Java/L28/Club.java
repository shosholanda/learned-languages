import java.util.Scanner;

public class Club{

    private Socio socio1, socio2, socio3;
    private Scanner teclado;
    
    public Club(){
        teclado = new Scanner(System.in);
        for (int i = 0; i < 3; i++){
            System.out.print("Ingrese el nombre del socio " + i + ": ");
            String nombre = teclado.nextLine();
            System.out.print("Ingrese la antiguedad del socio " + i + ": ");
            try {
                int antiguedad = teclado.nextInt();
                switch(i){
                    case 0:
                        socio1 = new Socio(nombre, antiguedad);
                        break;
                    case 1:
                        socio2 = new Socio(nombre, antiguedad);
                        break;
                    case 2: 
                        socio3 = new Socio(nombre, antiguedad);
                        break;
                }
            } catch (Exception e){
                System.out.println("El valor de la antiguedad no es válido, CTM");
                e.printStackTrace();
            }
        }
    }
    
    public void comparaSocios(){
        int mayor = Math.max(socio1.getAntiguedad(), socio2.getAntiguedad());
    }

}
