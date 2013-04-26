package randoopFailures;

import junit.framework.TestCase;

/**
 * Este archivo fue generado por randoop (configuracion por defecto, con una
 * cota de tiempo de 5 minutos), el cual queda como reporte de un importante
 * error encontrado en la revision 32 del proyecto. El problema esta en el
 * archivo TreeList.java, en el cual la operación add no tiene en cuenta los
 * arboles vacios (recien instanciados), y asume que siempre hay como minimo un
 * nodo en la estructura interna.
 * 
 * Este error es corregido en la revision
 * 
 * @author Pellegrini Franco
 * 
 */
public class RandoopTest_failure_1_revision32 extends TestCase {
    
    public static boolean debug = false;
    
    public void test1() throws Throwable {
        
        if (debug) {
            System.out.printf("%nRandoopTest_failure_1_revision32.test1");
        }
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        java.lang.String var2 = var0.toString();
        var0.add(0, (-1L));
        
    }
    
}
