
public class Aplicacao {

	public static void main(String[] args) {
		
		ListaEncadeada<Double> lista = new ListaEncadeada<>();
		lista.adicionarFim((double) 20);
		lista.adicionarFim((double) 19);
		lista.adicionarFim((double) 21);
		lista.adicionarFim((double) 18);
		lista.adicionarFim((double) 23);
		lista.adicionarFim((double) 10);
		lista.adicionarFim((double) 10);
		System.out.println("Tamanho da lista: "+ lista.getTamanho());
		System.out.println("Primeiro: "+lista.getPrimeiro().getValor());
		System.out.println("Ultimo: "+lista.getUltimo().getValor());
		
		System.out.println(lista.quantidadeElemento(10));
		System.out.println();
		lista.removerRepetidos(lista);
		
		// IMPRIMINDO LISTA
		
		for(int i = 0 ; i < lista.getTamanho() ; i++) {
			System.out.println(lista.get(i).getValor());
		}
		
		
		System.out.println();
		
		// IMPRIMINDO LISTA AO CONTRARIO
		
		for(int i = lista.getTamanho()-1 ; i >= 0 ; i--) {
			System.out.println(lista.get(i).getValor());
		}
		
		System.out.println();
		
	}

}








//REMOVENDO REPETIDOS
		// for(int i = 0 ; i < lista.getTamanho() ; i++) {
		//	double valorElemento = lista.get(i).getValor();
		//	int qntdElemento = lista.quantidadeElemento(valorElemento);
		//	System.out.println(qntdElemento);
		//	if(qntdElemento > 1) {
		//		for(i = 0 ; i < qntdElemento ; i++) {
		//			lista.remover(lista.get(i).getValor());
		//			System.out.println("Removido");
		//		}
		//		lista.adicionarFim(valorElemento);
		//	} 
	//	}
