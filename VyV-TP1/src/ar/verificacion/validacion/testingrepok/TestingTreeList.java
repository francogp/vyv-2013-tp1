package ar.verificacion.validacion.testingrepok;

import ar.verificacion.validacion.treelistimplementation.Node;
import ar.verificacion.validacion.treelistimplementation.TreeList;

/**
 * Esta clase es solo util para TESTING. Utilizada para poder acceder a la
 * implementacion del arbol, sin exponer los metodos de forma publica
 * (respentando asi la interfaz), y a su vez permitiendo crear casos de test
 * especificos para verificar ReoOk de la clase TreeList
 * 
 * @author Pellegrini Franco
 * 
 */
public class TestingTreeList extends TreeList {
    
    /**
     * 
     */
    private static final long serialVersionUID = 6354840739338482473L;
    
    /**
     * @return root
     */
    public Node getRoot() {
        return root;
    }
    
    /**
     * @param root
     *            el root a cambiar
     */
    public void setRoot(Node root) {
        this.root = root;
    }
    
    /**
     * @param size
     *            el tamaño a cambiar
     */
    public void setSize(int size) {
        this.size = size;
    }
}
