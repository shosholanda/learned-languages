public class Congruencias {

    public static void main (String args[]){
        int limite = Integer.parseInt(args[0]);
        for (int i = -limite; i < limite; i++){
            for (int j = -limite; j < limite; j++){
                for (int k = -limite; k < limite; k++){
                    if ((15*i) == (17*j+3)  && (15*i)==(16*k+10)){
                        imprime(i,j,k);
                    }
                }
            }
        }
    }
    
    public static void imprime(int i, int j, int k){
        System.out.println("El resultado es: " +i*15 + ", i: " + i + " | j: " + j + " | k: " + k + ", donde i es multiplo de 15, j de 17 y k de 16");
    }

}
