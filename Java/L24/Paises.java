import java.util.Scanner;

public class Paises{

    private String[] paises;
    private int[][] datos;
    private int[] media;
    private Scanner teclado;
    
    public void cargar(){
        teclado = new Scanner(System.in);
        System.out.print("Cuantos países va a evaluar? ");
        int total = teclado.nextInt();
        paises = new String[total];
        datos = new int[total][3];
        media = new int[total];
        for (int i = 0; i < total; i++){
            System.out.print("Qué país quiere? ");
            paises[i] = teclado.next();
            for (int f = 0; f < datos[i].length; f++){
                System.out.print("Ingrese temp" + (f+1) + " (" + (f+1) + "/3): ");
                datos[i][f] = teclado.nextInt();
            }
        }
    }
    
    public void promedio(){
        for(int i = 0; i < datos.length; i++){
            int sum = 0;
            for(int j = 0; j < datos[i].length; j++){
                sum += datos[i][j];
            }
            media[i] = sum/datos[i].length;
        }
    }
    
    public void imprimirPais(){
        for (int i = 0; i < paises.length; i++){
            System.out.println(paises[i] + ": " +  media[i] + "°C");
        }
    }
    
    public void imprimirMayor(){
        int may = 0;
        int indice = 0;
        for (int i = 0; i < media.length; i++){
            if (media[i] > may){
                may = media[i];
                indice = i;
            }
        }
        System.out.println("El país con mayor temperatura es: "+paises[indice] + ", con una temperatura de: "+ media[indice]);
    }
    
    public static void main (String[] args){
        Paises p = new Paises();
        p.cargar();
        p.promedio();
        p.imprimirPais();
        p.imprimirMayor();
    }


}
