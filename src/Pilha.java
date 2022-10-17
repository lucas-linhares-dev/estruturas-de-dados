
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
		if(!this.isEmpty()) {
			this.lista.remover(this.get());
		}
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
}

