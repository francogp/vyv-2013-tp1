package ar.verificacion.validacion.treelistimplementation;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import korat.finitization.IClassDomain;
import korat.finitization.IFinitization;
import korat.finitization.IIntSet;
import korat.finitization.IObjSet;
import korat.finitization.impl.FinitizationFactory;
import randoop.CheckRep;
import ar.verificacion.validacion.List;

/**
 * Implementacion del TAD Lista, usando una estructura dinámica, más
 * precisamente un árbol binario de búsqueda. Esta clase implementa los métodos
 * abstractos declarados en List, y corresponde a una implementación
 * polimórfica.
 *  
 * @author Nazareno Aguirre, Valeria Bengolea & Renzo Degiovanni, Sung Pei Jung,
 *         Pellegrini Franco
 * @version 1.0 7/5/2013
 */
public class TreeList implements List, Serializable {
    
    private static final long serialVersionUID = -4560660258689490061L;
    
    public static IFinitization finTreeList(int nodesNum, int maxInfo) {
        IFinitization f = FinitizationFactory.create(TreeList.class);
        IObjSet nodes = f.createObjSet(Node.class, nodesNum, true);
        f.set(TreeList.class, "root", nodes);
        f.set(Node.class, "left", nodes);
        f.set(Node.class, "right", nodes);
        
        IObjSet elementosIntegers = f.createObjSet(Integer.class);
        IClassDomain integersClassDomain = f.createClassDomain(Integer.class);
        integersClassDomain.includeInIsomorphismCheck(false);
        for (int i = 0; i <= maxInfo; i++) {
            integersClassDomain.addObject(new Integer(i));
        }
        elementosIntegers.addClassDomain(integersClassDomain);
        elementosIntegers.setNullAllowed(true); // null se incluye en el dominio
        f.set(Node.class, "info", elementosIntegers);
        
        IIntSet intSet = f.createIntSet(0, nodesNum);
        f.set(TreeList.class, "size", intSet);
        f.set(Node.class, "index", intSet);
        
        return f;
    }
    
    protected Node root; // tree that stores list' elements
                         
    protected int  size; // number of elements in the list
                         
    public TreeList() {
        root = null;
        size = 0;
    }
    
    /**
     * add(int index, Object item ): adds item to the list in position index
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
        if (root == null) {
            root = new Node(index, item);
        } else {
            Node aux = new Node(index, item);
            increaseIndexNodes(root, index);
            // incrementa el indice de todos los nodos que tiene indice
            // mayor o igual al indice dado
            add2(root, aux);
        }
        size++;
    }
    
    /*
     * add2(Node root, Node aux): inserta el nodo aux al arbol partiendo del
     * nodo root y dependiendo del indice de la lsta.
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
    
    /*
     * decreaseIndexNodes (Node root, int index): decrementa el indice de todos
     * los nodos si su indice es mayor a index.
     */
    private void decreaseIndexNodes(Node root, int index) {
        if (root != null) {
            if (root.getIndex() > index) {
                root.setIndex(root.getIndex() - 1);
                if (root.getLeft() != null) {
                    if (root.getLeft().getIndex() > index) {
                        decreaseIndexNodes(root.getLeft(), index);
                    } else {
                        if ((root.getLeft().getRight() != null)
                                && (root.getLeft().getRight().getIndex() > index)) {
                            decreaseIndexNodes(root.getLeft().getRight(), index);
                        }
                    }
                }
                if (root.getRight() != null) {
                    decreaseIndexNodes(root.getRight(), index);
                }
            } else {
                decreaseIndexNodes(root.getRight(), index);
            }
        }
    }
    
    /**
     * get(int index): returns the reference to the object in position index
     */
    @Override
    public Object get(int index) throws IndexOutOfBoundsException {
        if ((index < 0) || (index >= size)) {
            throw new IndexOutOfBoundsException(
                    "index out of bounds in tree list");
        }
        return search(root, index);
    }
    
    /*
     * increaseIndexNodes (Node root, int index): incrementa el indice de todos
     * los nodos si su indice es mayor o igual a index.
     */
    private void increaseIndexNodes(Node root, int index) {
        if (root.getIndex() >= index) {
            root.setIndex(root.getIndex() + 1);
        }
        if (root.getLeft() != null) {
            increaseIndexNodes(root.getLeft(), index);
        }
        if (root.getRight() != null) {
            increaseIndexNodes(root.getRight(), index);
        }
    }
    
    /**
     * isEmpty(): if haven`t element in the list return true.
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    
    /**
     * remove(int index): removes item in the index position of the list
     */
    @Override
    public void remove(int index) throws IndexOutOfBoundsException {
        if ((index < 0) || (index >= size)) {
            throw new IndexOutOfBoundsException(
                    "index out of bounds in tree list");
        }
        remove2(root, index);
        decreaseIndexNodes(root, index);
        size--;
    }
    
    /*
     * remove2(Node root, int index): busca el item a borrar partiendo de root y
     * luego invoca metodos para borrar el info de index.
     */
    private void remove2(Node root, int index) {
        if (this.root.getIndex() == index) { // si el elemento a borrar es la
                                             // raiz
            if (size == 1) {// caso base, el elemento a borrar es la raiz
                            // y no hay mas elemento en el arbol.
                this.root = null;
            } else { // el elemento a borrar es la raiz y hay mas elementos
                     // en el arbol
                if ((this.root.getLeft() != null)
                        && (this.root.getRight() == null)) {
                    // si la raiz solo tiene el hijo izquierdo
                    removeNodeChildLeft(root);
                } else if ((this.root.getLeft() == null)
                        && (this.root.getRight() != null)) {
                    // si la raiz solo tiene el hijo derecho
                    removeNodeChildRight(root);
                } else if ((this.root.getLeft() != null)
                        && (this.root.getRight() != null)) {
                    // si la raiz tiene los 2 hijos
                    removeNodeTwoChild(root);
                }
            }
        } else { // el elemento a borrar no es la raiz
            if ((root.getIndex() > index)
                    && (root.getLeft().getIndex() != index)) {
                // Caso 1: el indice de elemento a borrar es menor al nodo
                // actual y el hijo izquierdo no es el elemento a borrar
                remove2(root.getLeft(), index);
            } else if ((root.getIndex() > index)
                    && (root.getLeft().getIndex() == index)) {
                // Caso 2: el indice de elemento a borrar es menor al nodo
                // actual y el hijo izquierdo es el elemento a borrar
                if ((root.getLeft().getLeft() == null)
                        && (root.getLeft().getRight() == null)) {
                    // Caso 2.1: si el hijo izquiero no tiene hijos
                    root.setLeft(null);
                } else if ((root.getLeft().getLeft() != null)
                        && (root.getLeft().getRight() == null)) {
                    // Caso 2.2: si el hijo izquiero solo tiene el hijo
                    // izquierdo
                    removeNodeChildLeft(root.getLeft());
                } else if ((root.getLeft().getLeft() == null)
                        && (root.getLeft().getRight() != null)) {
                    // Caso 2.3: si el hijo izquierdo solo tiene el hijo derecho
                    removeNodeChildRight(root.getLeft());
                } else if ((root.getLeft().getLeft() != null)
                        && (root.getLeft().getRight() != null)) {
                    // Caso 2.4: si el hijo izquierdo tiene los 2 hijos
                    removeNodeTwoChild(root.getLeft());
                }
            } else if ((root.getIndex() < index)
                    && (root.getRight().getIndex() != index)) {
                // Caso 3: el indice de elemento a borrar es mayor al nodo
                // actual y el hijo derecho no es el elemento a borrar
                remove2(root.getRight(), index);
            } else if ((root.getIndex() < index)
            // Caso 4: el indice de elemento a borrar es mayor al nodo actual y
            // el hijo derecho es el elemento a borrar
                    && (root.getRight().getIndex() == index)) {
                if ((root.getRight().getLeft() == null)
                        && (root.getRight().getRight() == null)) {
                    // Caso 4.1: si el hijo derecho no tiene hijos
                    root.setRight(null);
                } else if ((root.getRight().getLeft() != null)
                        && (root.getRight().getRight() == null)) {
                    // Caso 4.2: si el hijo derecho solo tiene el hijo izquierdo
                    removeNodeChildLeft(root.getRight());
                } else if ((root.getRight().getLeft() == null)
                        && (root.getRight().getRight() != null)) {
                    // Caso 4.3: si el hijo derecho solo tiene el hijo derecho
                    removeNodeChildRight(root.getRight());
                } else if ((root.getRight().getLeft() != null)
                        && (root.getRight().getRight() != null)) {
                    // Caso 4.4: si el hijo derecho tiene los 2 hijos
                    removeNodeTwoChild(root.getRight());
                }
            }
        }
    }
    
    /**
     * removeAll(): removes all the items from the list Precondition: None
     * Postcondition: all elements are removed from the list.
     */
    @Override
    public void removeAll() {
        root = null;
        size = 0;
    }
    
    /*
     * removeNodeChildLeft(Node root): remover un nodo que solo tiene el hijo
     * izquierdo
     */
    private void removeNodeChildLeft(Node root) {
        root.setIndex(root.getLeft().getIndex());
        root.setInfo(root.getLeft().getInfo());
        root.setRight(root.getLeft().getRight());
        root.setLeft(root.getLeft().getLeft());
    }
    
    /*
     * removeNodeChildRight(Node root): remover un nodo que solo tiene el hijo
     * derecho
     */
    private void removeNodeChildRight(Node root) {
        root.setInfo(root.getRight().getInfo());
        root.setLeft(root.getRight().getLeft());
        root.setRight(root.getRight().getRight());
    }
    
    /*
     * removeNodeTwoChild(Node root): remover un nodo que tiene ambos hijos.
     */
    private void removeNodeTwoChild(Node root) {
        if (root.getLeft().getRight() == null) {
            // si el hijo izquierdo no tiene hijo derecho
            root.setInfo(root.getLeft().getInfo());
            root.setIndex(root.getLeft().getIndex());
            root.setLeft(root.getLeft().getLeft());
        } else { // el hijo izquierdo tiene hijo derecho
            Node aux = root.getLeft();
            while (aux.getRight().getRight() != null) {
                aux = aux.getRight();
            }
            root.setInfo(aux.getRight().getInfo());
            aux.setRight(aux.getRight().getLeft());
        }
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
    
    @CheckRep
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public boolean repOK() {
        if (root == null) {
            return size == 0;
        } else {
            Set visited = new HashSet(); // para revisar si el grafo es ciclico
            Node current = root; // nodo actual en el recorrido
            Node lastSortedNode = null; // ultimo nodo recorrido en forma
                                        // ordenada
            Stack parentStack = new Stack(); // pila utilizada para el recorrido
                                             // In-Order
            
            // utilizamos un algoritmo In-order iterativo para recorrer la
            // estructura revisando que no sea ciclica y que los elementos
            // esten en el orden correcto
            while (!parentStack.isEmpty() || (current != null)) {
                // si el nodo ya fue visitado, el grafo es ciclico y no es un
                // arbol binario
                if ((current != null) && !visited.add(current)) {
                    return false;
                }
                if (current != null) {
                    // si no es una hoja null, seguimos recorriendo
                    parentStack.push(current);
                    current = current.getLeft();
                } else {
                    // si estamos volviendo del lado izq, tratamos el nodo y su
                    // lado derecho
                    current = (Node) parentStack.pop();
                    
                    // mientras revisamos los ciclos, verificamos el nodo
                    if (((lastSortedNode != null) && !(current.getIndex() == (lastSortedNode
                            .getIndex() + 1)))// revisando que este
                                              // ordenado de forma correcta
                            || !((current.getIndex() >= 0) && (current
                                    .getIndex() <= (size - 1))) // las claves
                                                                // del
                                                                // árbol son
                                                                // 0..size-1
                            
                            || (current.getInfo() == null) // todos los
                                                           // elementos del
                                                           // árbol son no
                                                           // nulos
                                                           // (respecto a info)
                            
                    ) {
                        return false;
                    }
                    lastSortedNode = current;
                    
                    // continuamos el recorrido de la estructura por el lado
                    // derecho
                    current = current.getRight();
                }
            }
            
            // revisamos que el tamaño sea consistente
            return (visited.size() == size);
        }
    }
    
    /*
     * Object search (Node root, int index): compara el indice de root con
     * index, si es igual retorna el info de root. En caso de que el index es
     * menor al indice de root busca por hijo izquierdo, sino buscar por el hijo
     * derecho.
     */
    private Object search(Node root, int index) {
        if (root.getIndex() == index) {
            return root.getInfo();
        } else if (root.getIndex() < index) {
            return search(root.getRight(), index);
        } else {
            return search(root.getLeft(), index);
        }
    }
    
    /**
     * size(): return size of the list.
     */
    @Override
    public int size() {
        return size;
    }
    
    @Override
    public String toString() {
        StringBuffer buf = new StringBuffer();
        buf.append("{");
        if (root != null) {
            buf.append(root.toString());
        }
        buf.append("}");
        return buf.toString();
    }
    
}
