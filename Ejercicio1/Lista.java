package Ejercicios;

public class Lista<E> {
	private Nodo<E> primero;
	private int numElem;
	
	public Lista() {
		primero=null;
		numElem=0;
	}
	public void insertarPrimero(int elemento) {
		Nodo<E>nuevo=new Nodo<E>(elemento, primero);
		primero=nuevo;
		numElem++;
		System.out.println ("Se ha insertado al inicio "+elemento+".");
	}
	public void insertarFinal (int elemento){ 
	    Nodo<E> nuevo = new Nodo<E>(elemento, null);
	    if (primero == null){
	    primero = nuevo;
	    }
	    else {
	        Nodo<E>actual = primero;
	        while (actual.getSiguiente()!= null){
	            actual = actual.getSiguiente();   
	        }
	        actual.setSiguiente(nuevo);
	        numElem++;
	    }
	    System.out.println ("Se ha insertado al final "+elemento+".");
	}
	public void borrar(int elem){
	    if (primero == null) 
	        System.out.println("Lista vacía");
	    else
	        if (primero.getElemento()== elem){
	        primero = primero.getSiguiente();
	        numElem--;
	        }
	        else {
	            Nodo<E>actual = primero;
	            while (actual.getSiguiente()!=null && actual.getSiguiente().getElemento() != elem)
	                actual = actual.getSiguiente();
	                if (actual.getSiguiente()== null )
	                    System.out.println ("Elemento "+elem+" no esta en la lista, por lo tanto no se puede borrar.");
	                else{
	                    actual.setSiguiente(actual.getSiguiente().getSiguiente());
	                    numElem--;
	                    System.out.println ("Se ha borrado "+elem+".");
	                }
	        }
	}
	
	public int getNumElem() {
		return numElem;
		
	}
	public void listar(){
	    
	    Nodo actual = primero;
	    while (actual.getSiguiente()!= null){
	        System.out.println(actual.getElemento());
	        actual = actual.getSiguiente();
	    
	    }
	    System.out.println(actual.getElemento());
	}
	public Nodo<E> get(int indice) {
	    Nodo<E> aux=primero;
	    for(int i=0;i<indice;i++)
	        aux=aux.getSiguiente();
	    return aux;
	}
}
