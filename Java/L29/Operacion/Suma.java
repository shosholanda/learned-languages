//Esta es la subclase, que aunque no tenga escrito los metodos y atributos 
//de operación, están aquí y los podemos utilizar aunque estén invisibles. 

public class Suma extends Operacion {


    //operar no está definido en operación, pero resultado sí al igual que valor1 y 2. 
    //y los podemos utilizar como si estuvieran privados. 
    public void operar(){
        resultado = valor1 + valor2;
    }

}
