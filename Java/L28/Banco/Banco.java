public class Banco{
	
	private Cliente c1, c2, c3;
	
	public Banco(){
		c1 = new Cliente("Juan");
		c2 = new Cliente("Ana");
		c3 = new Cliente("Pedro");
	}
	
	public void operar(){
		c1.depositar(100);
		c2.depositar(150);
		c3.depositar(200);
		c3.extraer(150);
	}
	
	public void depositosTotales(){
		int i = c1.retornarMonto() + c2.retornarMonto() + c3.retornarMonto();
		System.out.println("El total de dinero en el banco es de: $" + i);
		c1.imprimir();
		c2.imprimir();
		c3.imprimir();
	}
	
	public static void main (String[] args){
		Banco banco1 = new Banco();
		banco1.operar();
		banco1.depositosTotales();
	}
}
