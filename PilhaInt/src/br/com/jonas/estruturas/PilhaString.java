package br.com.jonas.estruturas;

public class PilhaString {
NoS topo;
	
	public PilhaString() {
		topo = null;
	}
	
	public boolean isEmpty() {
		if(topo == null) {
			return true;
		}
		return false;
	}
	
	public void push(String valor) {
		NoS elemento = new NoS();
		elemento.dado = valor;
		elemento.proximo = topo;
		topo = elemento;
	}
	
	public String pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		String valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	public String top() throws Exception{
		if(isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		return topo.dado;
	}
	
	public int size(){
		int i = 0;
		
		if(!isEmpty()) {
			NoS aux = topo;
			
			while(aux.proximo != null) {
				i++;
				aux = aux.proximo;
			}
		}
		return i;
	}
}
