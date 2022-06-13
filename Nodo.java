package Ejercicios;

public class Nodo<T> {
	private int elemento;
	private Nodo<T> siguiente;
	public Nodo(int elem) {
		elemento=elem;
		siguiente=null;
	}
	public Nodo (int elem,Nodo<T> sig) {
		elemento=elem;
		siguiente=sig;
	}
	public int getElemento() {
		return elemento;
	}
	public Nodo getSiguiente() {
		return siguiente;
	}
	public void setElemento(int elem) {
		elemento=elem;
	}
	public void setSiguiente(Nodo sig) {
		siguiente=sig;
	}
	public String toString() {
		return elemento+"";
	}
}
