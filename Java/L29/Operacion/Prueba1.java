//Clase main
//

public class Prueba1 {
    
    public static void main (String[] args){
    
        //aquí suma1 tiene todos los atributos y metodos que se declararon antes. 
        //es decir que suma1 tiene los atributos de valor1 y 2, resutado y teclado. 
        //también tiene implementada la operación suma. 
        Suma suma1 = new Suma(); 
        suma1.cargar1();
        suma1.cargar2();
        suma1.operar();
        suma1.mostrarResultado();
        
        Resta resta1 = new Resta();
        resta1.cargar1();
        resta1.cargar2();
        resta1.operar();
        resta1.mostrarResultado();
        
    }
    
}
