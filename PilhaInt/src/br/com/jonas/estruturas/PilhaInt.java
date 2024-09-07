package br.com.jonas.estruturas;

public class PilhaInt {
	
	No topo;
	
	public PilhaInt() {
		topo = null;
	}
	
	public boolean isEmpty() {
		if(topo == null) {
			return true;
		}
		return false;
	}
	
	public void push(int valor) {
		No elemento = new No();
		elemento.dado = valor;
		elemento.proximo = topo;
		topo = elemento;
	}
	
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		int valor = topo.dado;
		topo = topo.proximo;
		return valor;
	}
	
	public int top() throws Exception{
		if(isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		return topo.dado;
	}
	
	public int size(){
		int i = 0;
		
		if(!isEmpty()) {
			No aux = topo;
			
			while(aux.proximo != null) {
				i++;
				aux = aux.proximo;
			}
		}
		return i;
	}
	
	public int min() throws Exception{
		int min = 0;
		if(isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		try {
			No aux = topo;
			min = aux.dado;
			while(aux.proximo != null) {
				if(aux.dado < min) {
					min = aux.dado;
				}
				aux = aux.proximo;
			}
			
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return min;
	}
	
	public int max() throws Exception{
		int max = 0;
		if(isEmpty()) {
			throw new Exception("Pilha Vazia");
		}
		try {
			No aux = topo;
			max = aux.dado;
			while(aux.proximo != null) {
				if(aux.dado > max) {
					max = aux.dado;
				}
				aux = aux.proximo;
			}
			
		}catch (Exception e) {
			System.err.println(e.getMessage());
		}
		return max;
	}
}
