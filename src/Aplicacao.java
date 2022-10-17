
public class Aplicacao {

	public static void main(String[] args) {
		Pilha pilha = new Pilha<Double>();
		
		pilha.adicionar(2.0);
		pilha.adicionar(3.0);
		pilha.adicionar(4.0);
		
		pilha.remover();
		
		System.out.println(pilha.get());

	}

}
