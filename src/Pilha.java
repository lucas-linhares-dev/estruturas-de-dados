
public class Pilha<T> {
	private ListaEncadeada lista;
	private int tamanho;
	
	public Pilha() {
		this.lista = new ListaEncadeada<>();
	}
	
	public Double get() {
		return (Double) this.lista.getPrimeiro().getValor();
	}
	
	public int getTamanho() {
		return this.lista.getTamanho();
	}
	
	public void adicionar(Double valor) {
		this.lista.adicionarInicio(valor);
	}
	
	public void remover() {
		this.lista.remover(this.get());
	}
	
	public boolean isEmpty() {
		if(this.lista.getTamanho() <= 0) {
			return true;
		}
		return false;
	}
	
	public Pilha clonar() {
		Pilha pilhaAuxiliar = new Pilha<Double>();
		Pilha pilhaAuxiliar2 = new Pilha<Double>();
		
		while(!this.isEmpty()) {
			pilhaAuxiliar.adicionar(this.get());
			this.remover();
		}
		while(!pilhaAuxiliar.isEmpty()) {
			pilhaAuxiliar2.adicionar(pilhaAuxiliar.get());
			this.adicionar(pilhaAuxiliar.get());
			pilhaAuxiliar.remover();
		}
		return pilhaAuxiliar2;
	}
	
	public void inverter() {
		Pilha pilhaAuxiliar = new Pilha<Double>();
		Pilha pilhaAuxiliar2 = new Pilha<Double>();
		
		while(!this.isEmpty()) {
			pilhaAuxiliar.adicionar(this.get());
			this.remover();
		}
		while(!pilhaAuxiliar.isEmpty()){
			pilhaAuxiliar2.adicionar(pilhaAuxiliar.get());
			pilhaAuxiliar.remover();
		}
		while(!pilhaAuxiliar2.isEmpty()) {
			this.adicionar(pilhaAuxiliar2.get());
			pilhaAuxiliar2.remover();
		}
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
		this.inverter();
		return menor;
	}
	
	
	public boolean eoMenor(double valor) {
		if(valor == this.encontrarMenor()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public void ordenar() {
		Fila filaAux = new Fila<T>();
		
		while(!this.isEmpty()) { 
			filaAux.adicionar(this.get());
			this.remover();
		}	
		
		while(!filaAux.isEmpty()) {
			double elemento = filaAux.get();
			if(filaAux.eoMenor(elemento)) {
				this.adicionar(elemento);
				filaAux.remover();
			}
			else {
				filaAux.adicionar(filaAux.get());
				filaAux.remover();
			}
		}
		this.inverter();
	}
	
}

