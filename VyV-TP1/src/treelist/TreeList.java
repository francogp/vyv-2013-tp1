package treelist;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

import ar.verificacion.validacion.IList;


/**
 * Implementacion del TAD Lista, usando una estructura dinámica, más
 * precisamente un árbol binario de búsqueda. Esta clase implementa los métodos
 * abstractos declarados en IList, y corresponde a una implementación
 * polimórfica.
 * 
 * @author Nazareno Aguirre, Valeria Bengolea & Renzo Degiovanni
 * @version 0.1 22/04/2013
 */
public class TreeList implements IList {

	private Node root; // tree that stores list' elements

	private int size; // number of elements in the list

	public boolean isEmpty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	/*--------------------------------------------------------------------*/
	/* removeAll(): removes all the items from the list */
	/* Precondition: None */
	/* Postcondition: all elements are removed from the list. */
	/*--------------------------------------------------------------------*/
	public void removeAll() {
		root = null;
	}

	/*--------------------------------------------------------------------*/
	/* add(int index, Object item ): adds item to the list in position */
	/* index */
	/*--------------------------------------------------------------------*/
	public void add(int index, Object item) throws RuntimeException,
			IndexOutOfBoundsException {
		if (item == null)
			throw new RuntimeException("attempting to insert null object");
		if (index < 0 || index > size)
			throw new IndexOutOfBoundsException(
					"index out of bounds in tree list");
		Node nodoNuevo = new Node(index, item);
		Boolean inserted = true;
		while (!inserted) {
			if (size == 0) {
				root = nodoNuevo;
			} else {
				if (root.getInfo().compareTo(nodoNuevo.getInfo()) > 0) {
					if (root.getLeft() == null) {

					}
				}
			}
		}
		size++;
		// TODO: Partially implemented routine;
	}

	/*--------------------------------------------------------------------*/
	/* remove(int index): removes item in the index position of the list */
	/*--------------------------------------------------------------------*/
	public void remove(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException(
					"index out of bounds in tree list");

		size--;
		// TODO: Partially implemented routine;
	}

	/*--------------------------------------------------------------------*/
	/* get(int index): returns the reference to the object in position */
	/* index */
	/*--------------------------------------------------------------------*/
	public Object get(int index) throws IndexOutOfBoundsException {
		if (index < 0 || index >= size)
			throw new IndexOutOfBoundsException(
					"index out of bounds in tree list");
		// TODO: Partially implemented routine;
		return null;
	}

	/**
	 * invariante de representación de la estructura.
	 * 
	 * @return true si y sólo si la estructura es internamente consistente
	 * @pre. true
	 * @post. Se retorna true si y sólo si root aloja un árbol binario de
	 *        búsqueda (respecto a index), todos los elementos del árbol son no
	 *        nulos (respecto a info), size se corresponde con el número de
	 *        nodos del árbol, y las claves del árbol son 0..size-1.
	 */

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public boolean repOK() {
		if (root.getInfo() == null) {
			return size == 0;
		} else {
			// chequeamos que no haya ciclos
			Set visited = new HashSet();
			visited.add(root);
			LinkedList workList = new LinkedList();
			workList.add(root);
			while (!workList.isEmpty()) {
				Node current = (Node) workList.removeFirst();
				if (current.getLeft() != null) {
					if (!visited.add(current.getLeft()))
						return false;

					workList.add(current.getLeft());
				}
				if (current.getRight() != null) {
					if (!visited.add(current.getRight()))
						return false;

					workList.add(current.getRight());
				}
			}

			// chequeamos que el tamaño sea consistente
			return (visited.size() == size);
			
			//TODO chequear que el arbol izq es menor que raiz... etc
		}
	}

	public String toString() {
		StringBuffer buf = new StringBuffer();
		buf.append("{");
		if (root != null)
			buf.append(root.toString());
		buf.append("}");
		return buf.toString();
	}

}
