
public class Aplicacao {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
	
		fila.adicionar(4.0);
		fila.adicionar(3.0);
		fila.adicionar(2.0);
		fila.adicionar(1.0);
		
		
		System.out.println(fila.get());
		fila.ordenar();
		System.out.println(fila.get());
		

		
	

	}

}
