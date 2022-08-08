public class JuegoDado{

    private Dado dado1, dado2, dado3;
    private boolean condición; 
    private int intentos;
    
    public JuegoDado(){
        dado1 = new Dado();
        dado2 = new Dado();
        dado3 = new Dado();
    }
    
    public void jugar(){
        dado1.tirar();
        dado2.tirar();
        dado3.tirar();
        dado1.imprimir();
        dado2.imprimir();
        dado3.imprimir();
        if (dado1.retornarValor() == dado2.retornarValor() && dado1.retornarValor() == dado3.retornarValor()){
            System.out.println("Campeón");
            condición = true;  
        } else {
            System.out.println("Perdió");
        }
        intentos += 1;
    }
    
    public static void main (String[] args){
        JuegoDado jd = new JuegoDado();
        while(!jd.condición){
            jd.jugar();
            System.out.println("-----------------------------------------------");
        }
        System.out.println("Intentos: " + jd.intentos); 
    }

}
