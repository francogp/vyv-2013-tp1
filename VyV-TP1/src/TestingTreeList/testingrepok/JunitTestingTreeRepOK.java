/**
 * 
 */
package TestingTreeList.testingrepok;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import treelist.Node;

/**
 * Testing obligatorio a mano, ya que estos metodos deben funcionar bien si o si,
 * bajo casos especificos detallados a continuación.
 * 
 * @author Pellegrini Franco
 */
public class JunitTestingTreeRepOK {
    
    /**
     * Test method for {@link TestingTreeList.testingrepok.TestingTreeList#repOK()}. Bad info Bin Tree.
     */
    @Test
    public void testRepOKBadInfoBinTree() {
        TestingTreeList tree = new TestingTreeList();
        Node nodo1 = new Node(0, "nodo numero 1");
        Node nodo2 = new Node(1, "nodo numero 2");
        Node nodo3 = new Node(2, "nodo numero 3");
        Node nodo4 = new Node(3, null);
        Node nodo5 = new Node(4, "nodo numero 5");
        Node nodo6 = new Node(5, "nodo numero 6");
        tree.setRoot(nodo6);
        nodo6.setLeft(nodo4);
        nodo4.setLeft(nodo2);
        nodo4.setRight(nodo5);
        nodo2.setLeft(nodo1);
        nodo2.setRight(nodo3);
        tree.setSize(6);
        
        assertFalse(tree.repOK());
    }
    
    /**
     * Test method for {@link TestingTreeList.testingrepok.TestingTreeList#repOK()}. Ciclic "Tree"
     */
    @Test
    public void testRepOKCiclicBinTree() {
        TestingTreeList tree = new TestingTreeList();
        Node nodo1 = new Node(0, "nodo numero 1");
        Node nodo2 = new Node(1, "nodo numero 2");
        Node nodo3 = new Node(2, "nodo numero 3");
        Node nodo4 = new Node(3, "nodo numero 4");
        Node nodo5 = new Node(4, "nodo numero 5");
        Node nodo6 = new Node(5, "nodo numero 6");
        tree.setRoot(nodo6);
        nodo6.setIndex(6);
        nodo6.setLeft(nodo4);
        nodo4.setLeft(nodo2);
        nodo4.setRight(nodo5);
        nodo2.setLeft(nodo1);
        nodo2.setRight(nodo3);
        tree.setSize(6);
        
        // cicliclo
        nodo5.setLeft(nodo2);
        
        assertFalse(tree.repOK());
    }
    
    /**
     * Test method for {@link TestingTreeList.testingrepok.TestingTreeList#repOK()}. Good Bin Tree.
     */
    @Test
    public void testRepOKGoodBinTree() {
        TestingTreeList tree = new TestingTreeList();
        Node nodo1 = new Node(0, "nodo numero 1");
        Node nodo2 = new Node(1, "nodo numero 2");
        Node nodo3 = new Node(2, "nodo numero 3");
        Node nodo4 = new Node(3, "nodo numero 4");
        Node nodo5 = new Node(4, "nodo numero 5");
        Node nodo6 = new Node(5, "nodo numero 6");
        tree.setRoot(nodo6);
        nodo6.setLeft(nodo4);
        nodo4.setLeft(nodo2);
        nodo4.setRight(nodo5);
        nodo2.setLeft(nodo1);
        nodo2.setRight(nodo3);
        tree.setSize(6);
        
        assertTrue(tree.repOK());
    }
    
    /**
     * Test method for {@link TestingTreeList.testingrepok.TestingTreeList#repOK()}. Good Bin Tree.
     */
    @Test
    public void testRepOKGoodBinTreeEmpty() {
        TestingTreeList tree = new TestingTreeList();
        tree.setRoot(null);
        tree.setSize(0);
        
        assertTrue(tree.repOK());
    }
    
    /**
     * Test method for {@link TestingTreeList.testingrepok.TestingTreeList#repOK()}. One element Bin Tree.
     */
    @Test
    public void testRepOKGoodBinTreeOneElement() {
        TestingTreeList tree = new TestingTreeList();
        Node nodo1 = new Node(0, "nodo numero 1");
        tree.setRoot(nodo1);
        tree.setSize(1);
        
        assertTrue(tree.repOK());
    }
    
    /**
     * Test method for {@link TestingTreeList.testingrepok.TestingTreeList#repOK()}. Not Sorted Index
     */
    @Test
    public void testRepOKnotSortedIndexBinTree() {
        TestingTreeList tree = new TestingTreeList();
        Node nodo1 = new Node(0, "nodo numero 1");
        Node nodo2 = new Node(1, "nodo numero 2");
        Node nodo3 = new Node(2, "nodo numero 3");
        Node nodo4 = new Node(3, "nodo numero 4");
        Node nodo5 = new Node(4, "nodo numero 5");
        Node nodo6 = new Node(5, "nodo numero 6");
        tree.setRoot(nodo6);
        nodo6.setLeft(nodo4);
        nodo4.setIndex(2); // wrong index
        nodo4.setLeft(nodo2);
        nodo4.setRight(nodo5);
        nodo2.setIndex(4); // wrong index
        nodo2.setLeft(nodo1);
        nodo2.setRight(nodo3);
        tree.setSize(6);
        
        assertFalse(tree.repOK());
    }
    
    /**
     * Test method for {@link TestingTreeList.testingrepok.TestingTreeList#repOK()}. Repeated index Bin
     * Tree.
     */
    @Test
    public void testRepOKRepeatedIndexBinTree() {
        TestingTreeList tree = new TestingTreeList();
        Node nodo1 = new Node(0, "nodo numero 1");
        Node nodo2 = new Node(1, "nodo numero 2");
        Node nodo3 = new Node(2, "nodo numero 3");
        Node nodo4 = new Node(3, "nodo numero 4");
        Node nodo5 = new Node(4, "nodo numero 5");
        Node nodo6 = new Node(5, "nodo numero 6");
        Node nodo7 = new Node(5, "nodo numero 7");
        tree.setRoot(nodo7);
        nodo7.setLeft(nodo6);
        nodo6.setLeft(nodo4);
        nodo4.setLeft(nodo2);
        nodo4.setRight(nodo5);
        nodo2.setLeft(nodo1);
        nodo2.setRight(nodo3);
        tree.setSize(7);
        
        assertFalse(tree.repOK());
    }
    
    /**
     * Test method for {@link TestingTreeList.testingrepok.TestingTreeList#repOK()}. Wrong Size
     */
    @Test
    public void testRepOKWrongSizeBinTree() {
        TestingTreeList tree = new TestingTreeList();
        Node nodo1 = new Node(0, "nodo numero 1");
        Node nodo2 = new Node(1, "nodo numero 2");
        Node nodo3 = new Node(2, "nodo numero 3");
        Node nodo4 = new Node(3, "nodo numero 4");
        Node nodo5 = new Node(4, "nodo numero 5");
        Node nodo6 = new Node(5, "nodo numero 6");
        tree.setRoot(nodo6);
        nodo6.setLeft(nodo4);
        nodo4.setLeft(nodo2);
        nodo4.setRight(nodo5);
        nodo2.setLeft(nodo1);
        nodo2.setRight(nodo3);
        tree.setSize(5);
        
        assertFalse(tree.repOK());
    }
}
