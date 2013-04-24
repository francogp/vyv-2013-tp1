package treelist;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

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
                       
    private int  size; // number of elements in the list
                       
    /**
     * --------------------------------------------------------------------
     * add(int index, Object item ): adds item to the list in position index
     * --------------------------------------------------------------------
     */
    @Override
    public void add(int index, Object item) throws RuntimeException,
            IndexOutOfBoundsException {
        if (item == null) {
            throw new RuntimeException("attempting to insert null object");
        }
        if ((index < 0) || (index > size)) {
            throw new IndexOutOfBoundsException(
                    "index out of bounds in tree list");
        }
        increaseIndexNodes(getRoot(), index); // incrementa el indice de todos
                                              // los
        // nodos que tiene indice mayor o
        // igual al indice dado
        Node aux = new Node(index, item);
        add2(getRoot(), aux);
        size++;
    }
    
    /*
     * -------------------------------------------------------------------- add2
     * (Node root, Node aux): inserta el nodo aux al arbol partiendo del nodo
     * root y dependiendo del indice de la lsta.
     * --------------------------------------------------------------------
     */
    private void add2(Node root, Node aux) {
        if (root.getIndex() > aux.getIndex()) {
            if (root.getLeft() == null) {
                root.setLeft(aux);
            } else {
                add2(root.getLeft(), aux);
            }
        } else { // si el indice de root es menor que el de aux
            if (root.getRight() == null) {
                root.setRight(aux);
            } else {
                add2(root.getRight(), aux);
            }
        }
        
    }
    
    /**
     * -------------------------------------------------------------------
     * get(int index): returns the reference to the object in position index
     * --------------------------------------------------------------------
     */
    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        if ((index < 0) || (index >= size)) {
            throw new IndexOutOfBoundsException(
                    "index out of bounds in tree list");
        }
        return search(getRoot(), index);
    }
    
    /**
     * @return root, para testing solamente. Utilizable si se instancia un
     *         objeto tipo TreeList sin utilizar la interfaz IList
     */
    public Node getRoot() {
        return root;
    }
    
    /*
     * -------------------------------------------------------------------- int
     * increaseIndex (int index): incrementa index en 1.
     * --------------------------------------------------------------------
     */
    private int increaseIndex(int index) {
        return index++;
    }
    
    /*
     * --------------------------------------------------------------------
     * increaseIndexNodes (Node root, int index): incrementa el indice de todos
     * los nodos si su indice es mayor o igual a index.
     * --------------------------------------------------------------------
     */
    private void increaseIndexNodes(Node root, int index) {
        if (root.getIndex() >= index) {
            root.setIndex(increaseIndex(root.getIndex()));
        }
        if (root.getLeft() != null) {
            increaseIndexNodes(root.getLeft(), index);
        }
        if (root.getRight() != null) {
            increaseIndexNodes(root.getRight(), index);
        }
    }
    
    /**
     * -------------------------------------------------------------------
     * isEmpty(): if haven`t element in the list return true.
     * --------------------------------------------------------------------
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    /**
     * -------------------------------------------------------------------
     * remove(int index): removes item in the index position of the list
     * --------------------------------------------------------------------
     */
    @Override
    public void remove(int index) throws IndexOutOfBoundsException {
        if ((index < 0) || (index >= size)) {
            throw new IndexOutOfBoundsException(
                    "index out of bounds in tree list");
        }
        
        size--;
        // TODO: Partially implemented routine;
    }
    
    /**
     * -------------------------------------------------------------------
     * removeAll(): removes all the items from the list Precondition: None
     * Postcondition: all elements are removed from the list.
     * --------------------------------------------------------------------
     */
    @Override
    public void removeAll() {
        setRoot(null);
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
        if (getRoot() == null) {
            return size == 0;
        } else {
            // primero revisamos que no sea un grafo con ciclos.
            Set visited = new HashSet();
            Node current = getRoot();
            Node lastSortedNode = null;
            Stack parentStack = new Stack();
            while (!parentStack.isEmpty() || (current != null)) {
                if (!visited.add(current)) {
                    return false;
                }
                if (current != null) {
                    parentStack.push(current);
                    current = current.getLeft();
                } else {
                    current = (Node) parentStack.pop();
                    // mientras revisamos los ciclos, trabajamos el nodo
                    // visitado,
                    // revisando que este ordenado de forma correcta
                    if ((lastSortedNode != null)
                            && (current.getIndex() <= lastSortedNode.getIndex())) {
                        return false;
                    }
                    // continuamos el recorrido de la estructura
                    current = current.getRight();
                }
            }
            
            // revisamos que el tamaño sea consistente
            return (visited.size() == size);
        }
    }
    
    /*
     * --------------------------------------------------------------------
     * Object search (Node root, int index): compara el indice de root con
     * index, si es igual retorna el info de root. En caso de que el index es
     * menor al indice de root busca por hijo izquierdo, sino buscar por el hijo
     * derecho.
     * --------------------------------------------------------------------
     */
    private Object search(Node root, int index) {
        if (root.getIndex() == index) {
            return root.getInfo();
        } else {
            if (root.getIndex() < index) {
                return search(root.getRight(), index);
            } else {
                return search(root.getLeft(), index);
            }
        }
    }
    
    /**
     * @param root
     *            el root a cambiar, para testing solamente. Utilizable si se
     *            instancia un objeto tipo TreeList sin utilizar la interfaz
     *            IList
     */
    public void setRoot(Node root) {
        this.root = root;
    }
    
    /**
     * -------------------------------------------------------------------
     * size(): return size of the list.
     * --------------------------------------------------------------------
     */
    @Override
    public int size() {
        return size;
    }
    
    @Override
    public String toString() {
        StringBuffer buf = new StringBuffer();
        buf.append("{");
        if (getRoot() != null) {
            buf.append(getRoot().toString());
        }
        buf.append("}");
        return buf.toString();
    }
    
}
