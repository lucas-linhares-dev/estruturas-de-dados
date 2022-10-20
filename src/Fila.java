
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
	
	public double encontrarMenor() {
		Fila filaAux = new Fila<T>();
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
		return menor;
	}
	
	public boolean eoMenor(double elemento) {
		Fila filaAux = new Fila<T>();
		double menor = elemento;
		while(!this.isEmpty()) {
			double elementoAtual = this.get();
			if(elementoAtual < menor) {
				return false;
			}
			filaAux.adicionar(this.get());
			this.remover();
		}
		while(!filaAux.isEmpty()) { // Devolvi e zerei a auxiliar
			this.adicionar(filaAux.get());
			filaAux.remover();
		}
		return true;
	}
	
	public void ordenar() {
		Fila filaAux = new Fila<T>();
		while(!this.isEmpty()) {
			double elemento = this.get();
			if(this.eoMenor(elemento)) {
				filaAux.adicionar(elemento);
				this.remover();
			}
		}
		while(!filaAux.isEmpty()) { // Devolvi e zerei a auxiliar
			this.adicionar(filaAux.get());
			filaAux.remover();
		}	
		
	}
	
}
