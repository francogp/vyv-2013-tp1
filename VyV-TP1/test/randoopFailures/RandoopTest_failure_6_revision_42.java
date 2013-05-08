package randoopFailures;

import junit.framework.TestCase;

/**
 * Este archivo fue generado por randoop (configuracion por defecto, con una
 * cota de tiempo de 5 minutos).
 * 
 * @author Pellegrini Franco
 */
@SuppressWarnings("unused")
public class RandoopTest_failure_6_revision_42 extends TestCase {
    
    public static boolean debug = false;
    
    public void test1() throws Throwable {
        
        if (debug) {
            System.out.printf("%nRandoopTest_failure_6_revision42.test1");
        }
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        int var5 = var0.size();
        boolean var6 = var0.isEmpty();
        var0.add(0, "{}");
        ar.verificacion.validacion.treelistimplementation.TreeList var11 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        java.lang.String var12 = var11.toString();
        var11.add(0, 1);
        java.lang.String var16 = var11.toString();
        var11.removeAll();
        boolean var18 = var11.isEmpty();
        var0.add(0, var11);
        boolean var20 = var0.isEmpty();
        var0.remove(1);
        
    }
    
}
