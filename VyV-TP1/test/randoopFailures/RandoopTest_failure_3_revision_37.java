package randoopFailures;

import junit.framework.TestCase;

/**
 * Este archivo fue generado por randoop (configuracion por defecto, con una
 * cota de tiempo de 5 minutos), el cual queda como reporte de un importante
 * error encontrado en la revision 37 del proyecto. Se asume que los errores
 * provienen del repOK, por lo que se deja su resolucion para el ejercicio 3.
 * 
 * @author Pellegrini Franco
 */
@SuppressWarnings("unused")
public class RandoopTest_failure_3_revision_37 extends TestCase {
    
    public static boolean debug = false;
    
    public void test1() throws Throwable {
        
        if (debug) {
            System.out.printf("%nRandoopTest_failure_3_revision37.test1");
        }
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        java.lang.String var2 = var0.toString();
        var0.add(0, (-1L));
        var0.add(1, (short) 1);
        int var9 = var0.size();
        int var10 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.add(1, var12);
        
        // Check representation invariant.
        assertTrue(
                "Representation invariant failed: Check rep invariant (method repOK) for var0",
                var0.repOK());
        
    }
    
}
