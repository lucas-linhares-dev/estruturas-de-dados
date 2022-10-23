
public class Aplicacao {

	public static void main(String[] args) {
		Pilha<Double> pilha = new Pilha<Double>();
		Fila<Double> fila = new Fila();
		
	
		pilha.adicionar((double) 3);
		pilha.adicionar((double) 1);
		pilha.adicionar((double) 2);
		pilha.adicionar((double) 4);
		
		fila.adicionar((double) 3);
		fila.adicionar((double) 1);
		fila.adicionar((double) 2);
		fila.adicionar((double) 4);
		
		
		System.out.println(fila.get());
		System.out.println(fila.getTamanho());
		fila.ordenar();
		fila.inverter();
		fila.remover();
		System.out.println(fila.get());
		System.out.println(fila.getTamanho());
		
		

		
	

	}

}
