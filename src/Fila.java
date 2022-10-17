
public class Fila<T> {
	private ListaEncadeada lista;
	private int tamanho;
	

	public Fila() {
		this.lista = new ListaEncadeada();
		tamanho = 0;
	}
	
	public void adicionar(Double valor) {
		this.lista.adicionarFim(valor);
		tamanho++;
	}
	
	public void remover() {
		this.lista.remover(this.get());
		tamanho--;
	}
	
	public Double get() {
		return (Double) this.lista.getPrimeiro().getValor();
	}
	
	public Fila<T> clonar() {
		Fila novaFila = new Fila<T>();
		for(int i = 0 ; i < tamanho ; i++) {
			novaFila.adicionar(this.get());
			this.adicionar(this.get());
			this.remover();
		}
		return novaFila;
	}
}
