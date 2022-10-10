
public class Fila<T> {
	private ListaEncadeada lista;
	

	public Fila() {
		this.lista = new ListaEncadeada();
	}
	
	public void adicionar(Double valor) {
		this.lista.adicionarFim(valor);
	}
	
	public void remover() {
		this.lista.remover(this.get());
	}
	
	public Double get() {
		return (Double) this.lista.getPrimeiro().getValor();
	}
	
}
