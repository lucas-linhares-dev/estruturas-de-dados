
public class Aplicacao {

	public static void main(String[] args) {
		Fila fila = new Fila<Double>();
		
		fila.adicionar(2.0);
		fila.adicionar(3.0);
		fila.adicionar(4.0);
		
		Fila fila2 = fila.clonar();
		
		System.out.println(fila.get());
		fila2.remover();
		fila2.remover();
		fila2.adicionar(5.0);
		fila2.remover();
		System.out.println(fila2.get());

	}

}
