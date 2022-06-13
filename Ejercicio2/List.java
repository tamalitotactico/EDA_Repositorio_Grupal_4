public class List<E> {
	private Node<E> primero;
	private int numElem;

	public List() {
		primero = null;
		numElem = 0;
	}

	public void insertarPrimero(int elemento) {
		if (primero == null) {
			Node<E> nuevo = new Node<E>(elemento, null, null);
			primero = nuevo;
		} else {
			Node<E> nuevo = new Node<E>(elemento, primero, null);
			primero = nuevo;
		}
		Node<E> nuevo = new Node<E>(elemento, primero, null);
		numElem++;
		System.out.println("Se ha insertado al inicio " + elemento + ".");
	}

	public void insertarFinal(int elemento) {
		Node<E> nuevo = new Node<E>(elemento, null);
		if (primero == null) {
			primero = nuevo;
		} else {
			Node<E> actual = primero;
			while (actual.getSiguiente() != null) {
				actual = actual.getSiguiente();
			}
			nuevo.setAnterior(actual);
			actual.setSiguiente(nuevo);
			numElem++;
		}
		System.out.println("Se ha insertado al final " + elemento + ".");
	}

	public void borrar(int elem) {
		if (primero == null)
			System.out.println("Lista vacía");
		else if (primero.getData() == elem) {
			primero = primero.getSiguiente();
			numElem--;
		} else {
			Node<E> actual = primero;
			while (actual.getSiguiente() != null && actual.getSiguiente().getData() != elem)
				actual = actual.getSiguiente();
			if (actual.getSiguiente() == null)
				System.out.println("Elemento " + elem + " no esta en la lista, por lo tanto no se puede borrar.");
			else {
				actual.setSiguiente(actual.getSiguiente().getSiguiente());
				numElem--;
				System.out.println("Se ha borrado " + elem + ".");
			}
		}
	}

	public int getNumElem() {
		return numElem;

	}

	public void listar() {

		Node actual = primero;
		while (actual.getSiguiente() != null) {
			System.out.println(actual.getData());
			actual = actual.getSiguiente();

		}
		System.out.println(actual.getData());
	}

	public Node<E> get(int indice) {
		Node<E> aux = primero;
		for (int i = 0; i < indice; i++)
			aux = aux.getSiguiente();
		return aux;
	}
}