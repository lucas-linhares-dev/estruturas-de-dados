
public class ListaEncadeada<TIPO> {
	private Elemento<TIPO> primeiro;
	private Elemento<TIPO> ultimo;
	private int tamanho;
	
	public ListaEncadeada(){
		this.tamanho = 0;
	}
	
	public Elemento<TIPO> getPrimeiro() {
		return primeiro;
	}
	public void setPrimeiro(Elemento<TIPO> primeiro) {
		this.primeiro = primeiro;
	}
	public Elemento<TIPO> getUltimo() {
		return ultimo;
	}
	public void setUltimo(Elemento<TIPO> ultimo) {
		this.ultimo = ultimo;
	}
	public int getTamanho() {
		return tamanho;
	}
	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	public void adicionarFim(Double valor) {
		Elemento<TIPO> novoElemento = (Elemento<TIPO>) new Elemento<Double>(valor);
		if(this.primeiro == null && this.ultimo == null){
			this.primeiro = novoElemento;
			this.ultimo = novoElemento;
		}
		else {
			this.ultimo.setProximo(novoElemento);
			this.ultimo = novoElemento;
		}
		tamanho++;
	}
	
	public void adicionarInicio(Double valor) {
		Elemento<TIPO> novoElemento = (Elemento<TIPO>) new Elemento<Double>(valor);
		if(this.primeiro == null && this.ultimo == null){
			this.primeiro = novoElemento;
			this.ultimo = novoElemento;
		}
		else {
			novoElemento.setProximo(this.primeiro);
			this.primeiro = novoElemento;
		}
		tamanho++;
	}
	
	public void remover(TIPO valor) {
		Elemento<TIPO> atual = this.primeiro;
		Elemento<TIPO> anterior = null;
		for(int i = 0 ; i < this.tamanho ; i++) {
			if(atual.getValor().equals(valor)) {
				if(this.tamanho == 1) {
					this.primeiro = null;
					this.ultimo = null;
				}
				else if(atual == primeiro){
					this.primeiro = atual.getProximo();
				}
				else if(atual == ultimo) {
					this.ultimo = anterior;
					anterior.setProximo(null);
				}
				else {
					anterior.setProximo(atual.getProximo());
					atual = null;
				}
				this.tamanho--;
				break;
			}
			anterior = atual;
			atual = atual.getProximo();
		}
	}
	
	public Elemento<TIPO> get(int posicao) {
		Elemento<TIPO> atual = this.primeiro;
		for(int i = 0 ; i < posicao ; i++) {
			if(atual.getProximo() != null) {
				atual = atual.getProximo();
			}
		}
		return atual;
	}
	
	
	public void ordenarMenorParaMaior() {
		Elemento<Double> atual = (Elemento<Double>) this.primeiro;
		for(int i = 0 ; i < this.tamanho-1 ; i++) {
			for(int j = 0 ; j < this.tamanho-1 ; j++) {
				if(atual.getValor() > atual.getProximo().getValor()) {
					double aux = atual.getValor(); 
					atual.setValor(atual.getProximo().getValor());
					atual.getProximo().setValor(aux);
				}
				
				atual = atual.getProximo();
			}
			atual = (Elemento<Double>) this.primeiro;
		}
	}
	
	public void ordenarMaiorParaMenor() {
		Elemento<Double> atual = (Elemento<Double>) this.primeiro;
		for(int i = 0 ; i < this.tamanho-1 ; i++) {
			for(int j = 0 ; j < this.tamanho-1 ; j++) {
				if(atual.getValor() < atual.getProximo().getValor()) {
					double aux = atual.getValor(); 
					atual.setValor(atual.getProximo().getValor());
					atual.getProximo().setValor(aux);
				}
				
				atual = atual.getProximo();
			}
			atual = (Elemento<Double>) this.primeiro;
		}
	}
	
	
	public int quantidadeElemento(double valor) {
		Elemento<Double> atual = (Elemento<Double>) this.primeiro;
		int contador = 0;
		for(int i = 0 ; i < this.tamanho ; i++) {
			if(atual.getValor() == valor) {
				contador++;
			}
			atual = atual.getProximo();
		}
		return contador;
	}
	
	public void removerRepetidos(ListaEncadeada lista) {
		for(int i = 0 ; i < lista.tamanho ; i++) {
			double valorElemento = (double) lista.get(i).getValor();
			int qntdElemento = lista.quantidadeElemento(valorElemento);
			System.out.println(qntdElemento);
			if(qntdElemento > 1) {
				for(i = 0 ; i < qntdElemento ; i++) {
					this.remover(this.get(i).getValor());
					System.out.println(valorElemento+" Removido");
				}
				lista.adicionarFim(valorElemento);
			}
			
		}
	}
	
}
