package TestingTreeList.testingrepok;

import treelist.Node;
import treelist.TreeList;

/**
 * Esta clase es solo util para TESTING. Utilizada para poder acceder
 * a la implementacion del arbol, sin exponer los metodos de forma
 * publica (respentando asi la interfaz), y a su vez permitiendo
 * crear casos de test especificos para verificar ReoOk de la clase
 * TreeList
 * 
 * @author Pellegrini Franco
 *
 */
public class TestingTreeList extends TreeList{
    /**
     * @param root el root a cambiar
     */
    public void setRoot(Node root) {
        this.root = root;
    }
    
    /**
     * @param size el tamaño a cambiar
     */
    public void setSize(int size) {
        this.size = size;
    }
}
