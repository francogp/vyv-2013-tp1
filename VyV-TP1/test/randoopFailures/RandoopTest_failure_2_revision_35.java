package randoopFailures;

import junit.framework.TestCase;

/**
 * Este archivo fue generado por randoop (configuracion por defecto, con una
 * cota de tiempo de 5 minutos), el cual queda como reporte de un importante
 * error encontrado en la revision 35 del proyecto. El problema esta en el
 * archivo TreeList.java, en el cual la operación remove no tiene en cuenta que
 * al decrementar los indices, el arbol puede ser nulo.
 * 
 * Este error es corregido en la revision 37
 * 
 * @author Pellegrini Franco
 * 
 */
public class RandoopTest_failure_2_revision_35 extends TestCase {
    
    public static boolean debug = false;
    
    public void test1() throws Throwable {
        
        if (debug) {
            System.out.printf("%nRandoopTest_failure_4.test1");
        }
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        java.lang.String var1 = var0.toString();
        boolean var2 = var0.isEmpty();
        java.lang.String var3 = var0.toString();
        var0.add(0, (byte) 1);
        boolean var7 = var0.isEmpty();
        boolean var8 = var0.isEmpty();
        java.lang.String var9 = var0.toString();
        var0.remove(0);
        
    }
    
}
