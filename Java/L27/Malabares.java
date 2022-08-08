import java.util.Scanner;

public class Malabares {
    
    private Scanner teclado;
    private String cadena, reversa;
    
    public Malabares(){
        teclado = new Scanner(System.in);
        System.out.print("Ingrese la cadena a hacer malabares: " );
        cadena = teclado.nextLine();
    }
    
    public void mitad(){
        String subCadena = cadena.substring(0, cadena.length()/2);
        System.out.println("La primera mitad de " + cadena + " es: " + subCadena);
    }
    
    public void ultimoCaracter(){
        System.out.println("El ultimo caracter de " + cadena + " es: " + cadena.charAt(cadena.length()-1));
    }
    
    public void reversa(){
        reversa = "";
        for (int i = cadena.length()-1; i >= 0; i--){
            reversa = reversa + cadena.charAt(i);
        }
        System.out.println("La reversa de " + cadena + " es: " + reversa);
    }
    
    public void separa(){
        String guion = "";
        for (int i = 0; i < cadena.length(); i++){
            guion = guion + cadena.charAt(i) + "-";
        }
        System.out.println("La separacion de " + cadena + " con guiones es: " + guion);
    }

    public void vocales(){
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0; 
        int u = 0;
        String temp = cadena.toLowerCase();
        for (int j = 0; j < temp.length(); j ++){
            char c = temp.charAt(j);
            switch(c){
                case 'a':
                    a++;
                    break;
                case 'e':
                    e++;
                    break;
                case 'i':
                    i++;
                    break;
                case 'o':
                    o++;
                    break;
                case 'u':
                    u++;
                    break;
                default:
                    break;
            }
        }
        System.out.println("El total de vocales es: " + (a + e + i + +o + u));
        System.out.println("Repeticiones de: " + 
            "\na: " + a +
            "\ne: " + e +
            "\ni: " + i + 
            "\no: " + o +
            "\nu: " + u);
    }
    
    public void palindromo(){
        if (cadena.equalsIgnoreCase(reversa)){
            System.out.println("La palabra es palindromo!" + 
                "\nnormal: \t" + cadena + "\nreversa: \t" + reversa);
        } else {
            System.out.println("La palabra no es palindromo!" + 
                "\nnormal: \t" + cadena + "\nreversa: \t" + reversa);
        }
    }

    public static void main (String[] args){
        Malabares m = new Malabares();
        m.mitad();
        m.ultimoCaracter();
        m.reversa();
        m.separa();
        m.vocales();
        m.palindromo();
    }
}
