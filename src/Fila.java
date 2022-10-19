
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
	
	public boolean isEmpty() {
		if(this.lista.getTamanho() <= 0) {
			return true;
		}
		return false;
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
	
	public void ordenar() {
		Fila filaAux = new Fila<T>();
		Fila filaAux2 = new Fila<T>();
		double menor = this.get();
		while(!this.isEmpty()) { // Achar o menor
			double elemento = this.get();
			if(elemento < menor) {
				menor = elemento;
			}
			filaAux.adicionar(this.get());
			this.remover();
		}
		
		
		while(!filaAux.isEmpty()) { // Devolvi e zerei a auxiliar
			this.adicionar(filaAux.get());
			filaAux.remover();
		}
		
		
		
	}
}
