public class Node<E> {
	private int data;
	private Node<E> nextNode;
	private Node<E> previousNode;

	public String toString() {
		return data+"";
	}
	
	
    public Node (int data) {
        this.data = data ;
        this.nextNode = null ;
        this.previousNode = null ;
    }

    public Node (int data, Node<E> nextNode ) {
        this.data = data ;
        this.nextNode = nextNode ;
        this.previousNode = null ;
    }

    public Node (int data, Node<E> nextNode, Node<E> previousNode ) {
        this.data = data ;
        this.nextNode = nextNode ;
        this.previousNode = previousNode ;
    }
    
	public int getData() {
		return data;
	}
	public Node getSiguiente() {
		return nextNode;
	}
	public Node getAnterior() {
		return previousNode;
	}
	public void setElemento(int elem) {
		data=elem;
	}
	public void setSiguiente(Node sig) {
		nextNode=sig;
	}
	public void setAnterior(Node ant) {
		previousNode=ant;
	}
	
}