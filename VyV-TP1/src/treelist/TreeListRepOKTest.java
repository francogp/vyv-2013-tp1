/**
 * 
 */
package treelist;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Testing obligatorio a mano, ya que estos metodos deben funcionar bien si o si
 * 
 * @author franco pellegrini
 */
public class TreeListRepOKTest {
    
    /**
     * Test method for {@link treelist.TreeList#repOK()}. Ciclic "Tree"
     */
    @Test
    public void testRepOKCiclicBinTree() {
        TreeList tree = new TreeList();
        Node nodo1 = new Node(1, "nodo numero 1");
        Node nodo2 = new Node(2, "nodo numero 2");
        Node nodo3 = new Node(3, "nodo numero 3");
        Node nodo4 = new Node(4, "nodo numero 4");
        Node nodo5 = new Node(5, "nodo numero 5");
        Node nodo6 = new Node(6, "nodo numero 6");
        tree.setRoot(nodo6);
        nodo6.setIndex(6);
        nodo6.setLeft(nodo4);
        nodo4.setIndex(4);
        nodo4.setLeft(nodo2);
        nodo4.setRight(nodo5);
        nodo2.setIndex(2);
        nodo5.setIndex(5);
        nodo2.setLeft(nodo1);
        nodo2.setRight(nodo3);
        nodo1.setIndex(1);
        nodo3.setIndex(3);
        tree.setSize(6);
        
        // cicliclo
        nodo5.setLeft(nodo2);
        
        assertFalse(tree.repOK());
    }
    
    /**
     * Test method for {@link treelist.TreeList#repOK()}. Good Bin Tree.
     */
    @Test
    public void testRepOKGoodBinTree() {
        TreeList tree = new TreeList();
        Node nodo1 = new Node(1, "nodo numero 1");
        Node nodo2 = new Node(2, "nodo numero 2");
        Node nodo3 = new Node(3, "nodo numero 3");
        Node nodo4 = new Node(4, "nodo numero 4");
        Node nodo5 = new Node(5, "nodo numero 5");
        Node nodo6 = new Node(6, "nodo numero 6");
        tree.setRoot(nodo6);
        nodo6.setIndex(6);
        nodo6.setLeft(nodo4);
        nodo4.setIndex(4);
        nodo4.setLeft(nodo2);
        nodo4.setRight(nodo5);
        nodo2.setIndex(2);
        nodo5.setIndex(5);
        nodo2.setLeft(nodo1);
        nodo2.setRight(nodo3);
        nodo1.setIndex(1);
        nodo3.setIndex(3);
        tree.setSize(6);
        
        assertTrue(tree.repOK());
    }
    
    /**
     * Test method for {@link treelist.TreeList#repOK()}. Not Sorted Index
     */
    @Test
    public void testRepOKnotSortedIndexBinTree() {
        TreeList tree = new TreeList();
        Node nodo1 = new Node(1, "nodo numero 1");
        Node nodo2 = new Node(2, "nodo numero 2");
        Node nodo3 = new Node(3, "nodo numero 3");
        Node nodo4 = new Node(4, "nodo numero 4");
        Node nodo5 = new Node(5, "nodo numero 5");
        Node nodo6 = new Node(6, "nodo numero 6");
        tree.setRoot(nodo6);
        nodo6.setIndex(6);
        nodo6.setLeft(nodo4);
        nodo4.setIndex(2); // wrong index
        nodo4.setLeft(nodo2);
        nodo4.setRight(nodo5);
        nodo2.setIndex(4); // wrong index
        nodo5.setIndex(5);
        nodo2.setLeft(nodo1);
        nodo2.setRight(nodo3);
        nodo1.setIndex(1);
        nodo3.setIndex(3);
        tree.setSize(6);
        
        assertFalse(tree.repOK());
    }
    
    /**
     * Test method for {@link treelist.TreeList#repOK()}. Wrong Size
     */
    @Test
    public void testRepOKWrongSizeBinTree() {
        TreeList tree = new TreeList();
        Node nodo1 = new Node(1, "nodo numero 1");
        Node nodo2 = new Node(2, "nodo numero 2");
        Node nodo3 = new Node(3, "nodo numero 3");
        Node nodo4 = new Node(4, "nodo numero 4");
        Node nodo5 = new Node(5, "nodo numero 5");
        Node nodo6 = new Node(6, "nodo numero 6");
        tree.setRoot(nodo6);
        nodo6.setIndex(6);
        nodo6.setLeft(nodo4);
        nodo4.setIndex(4);
        nodo4.setLeft(nodo2);
        nodo4.setRight(nodo5);
        nodo2.setIndex(2);
        nodo5.setIndex(5);
        nodo2.setLeft(nodo1);
        nodo2.setRight(nodo3);
        nodo1.setIndex(1);
        nodo3.setIndex(3);
        tree.setSize(5);
        
        assertFalse(tree.repOK());
    }
    
}