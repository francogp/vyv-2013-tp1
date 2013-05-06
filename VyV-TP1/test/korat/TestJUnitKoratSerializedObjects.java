/**
 * 
 */
package korat;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

import junit.framework.TestCase;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import ar.verificacion.validacion.treelistimplementation.TreeList;

/**
 * Test Parametrizado del ejercicio 3, el cual utiliza un archivo generado por
 * korat como inputs de los Test.
 * 
 * @author franco pellegrini
 */
@RunWith(Parameterized.class)
public class TestJUnitKoratSerializedObjects extends TestCase {
    
    private static final String KORAT_SERIALIZED_FILE = "test/korat/serialized/objects.korat";
    
    @Parameterized.Parameters
    public static Collection<Object[]> inicializaParametroParaTest() {
        // inicializamod los parametros del JUnit con los arboles creados con
        // korat
        ObjectInputStream inputStream = null;
        List<Object[]> salida = new LinkedList<Object[]>();
        File filename = new File(KORAT_SERIALIZED_FILE);
        System.out.println("Parseando archivo de Korat...");
        try {
            // Construimos un objeto ObjectInputStream
            inputStream = new ObjectInputStream(new FileInputStream(filename));
            Object obj = null;
            
            while ((obj = inputStream.readObject()) != null) {
                if (obj instanceof TreeList) {
                    salida.add(new Object[] { (TreeList) obj });
                }
            }
            
        } catch (EOFException ex) {
            // Esto ocurre si alcanzamos el final del archivo
            System.out.println("Se alcanzo el final del archivo."
                    + "\nEncontrados " + salida.size() + " TreeList"
                    + "\nComenzando Test JUnit Parametrizado...");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            // Cerramos el ObjectInputStream
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
        
        return salida;
    }
    
    private TreeList treeList;
    
    // Inicializamos el parametro del JUnit con un arbol a testear
    public TestJUnitKoratSerializedObjects(TreeList treeList) {
        this.treeList = treeList;
    }
    
    private void testAdd() {
        
        // agregamos algunos nodos mas para testear add
        treeList.add(0, 1);
        assertTrue(
                "Representation invariant failed: Check rep invariant (method repOK) using treeList.add(0, 1) for treelist "
                        + treeList.toString(), treeList.repOK());
        treeList.add(0, 2);
        assertTrue(
                "Representation invariant failed: Check rep invariant (method repOK) using treeList.add(0, 2) for treelist "
                        + treeList.toString(), treeList.repOK());
        treeList.add(1, 5);
        assertTrue(
                "Representation invariant failed: Check rep invariant (method repOK) using treeList.add(1, 5) for treelist "
                        + treeList.toString(), treeList.repOK());
        // agregamos al final
        treeList.add(treeList.size(), 15);
        assertTrue(
                "Representation invariant failed: Check rep invariant (method repOK) using treeList.add(treeList.size(), 5) for treelist "
                        + treeList.toString(), treeList.repOK());
    }
    
    // Este test se evaluara por cada TreeList leido del archivo que produjo
    // korat
    @Test
    public void testPrimeNumberChecker() {
        System.out.println("TreeList a testear : " + treeList.toString());
        testAdd();
        testRemove();
    }
    
    private void testRemove() {
        
        if (!treeList.isEmpty()) {
            // removemos el primer nodo (si lo tiene)
            treeList.remove(0);
            assertTrue(
                    "Representation invariant failed: Check rep invariant (method repOK) using treeList.remove(0) for treelist "
                            + treeList.toString(), treeList.repOK());
        }
        if (treeList.size() > 1) {
            // removemos el segundo nodo (si lo tiene)
            treeList.remove(1);
            assertTrue(
                    "Representation invariant failed: Check rep invariant (method repOK) using treeList.remove(1) for treelist "
                            + treeList.toString(), treeList.repOK());
        }
        if (!treeList.isEmpty()) {
            // removemos el ultimo nodo (si lo tiene)
            treeList.remove(treeList.size() - 1);
            assertTrue(
                    "Representation invariant failed: Check rep invariant (method repOK) using treeList.remove(treeList.size()-1) for treelist "
                            + treeList.toString(), treeList.repOK());
        }
        
        // removemos el ultimo nodo (si lo tiene)
        treeList.removeAll();
        assertTrue(
                "Representation invariant failed: Check rep invariant (method repOK) using treeList.removeAll() for treelist "
                        + treeList.toString(), treeList.repOK());
    }
    
}
