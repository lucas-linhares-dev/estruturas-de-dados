
public class Pilha<T> {
	private ListaEncadeada lista;
	
	public Pilha() {
		this.lista = new ListaEncadeada<>();
	}
	
	public Double get() {
		return (Double) this.lista.getPrimeiro().getValor();
	}
	
	public void adicionar(Double valor) {
		this.lista.adicionarInicio(valor);
	}
	
	public void remover() {
		this.lista.remover(this.get());
	}
}

