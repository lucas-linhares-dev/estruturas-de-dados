
public class Aplicacao {

	public static void main(String[] args) {
		Pilha pilha = new Pilha<Double>();
		
		pilha.adicionar(2.0);
		pilha.adicionar(3.0);
		pilha.adicionar(4.0);
		pilha.adicionar(5.0);


		Pilha pilha2 = pilha.clonar();
		
		pilha.remover();
		pilha2.remover();
		pilha2.remover();
		
		System.out.println(pilha.get());
		System.out.println(pilha2.get());

	}

}
