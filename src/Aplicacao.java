
public class Aplicacao {

	public static void main(String[] args) {
		Fila fila = new Fila();
		
		fila.adicionar((double) 1);
		fila.adicionar((double) 2);
		fila.adicionar((double) 3);
		System.out.println("Primeiro da fila: "+ fila.get());
		fila.remover();
		System.out.println("Primeiro da fila: "+ fila.get());
		
		
		
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
