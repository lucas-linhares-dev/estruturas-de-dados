
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
	
	public Fila<T> clonar() {
		Fila novaFila = new Fila<T>();
		for(int i = 0 ; i < lista.getTamanho() ; i++) {
			novaFila.adicionar(this.get());
			this.adicionar(this.get());
			this.remover();
		}
		return novaFila;
	}
	
	public void inverter() {
		
	}
}
