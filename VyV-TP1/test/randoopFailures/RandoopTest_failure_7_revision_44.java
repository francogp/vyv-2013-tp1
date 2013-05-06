package randoopFailures;

import junit.framework.*;

public class RandoopTest_failure_7_revision_44 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) System.out.printf("%nRandoopTest_failure_1.test1");


    ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
    java.lang.String var1 = var0.toString();
    var0.removeAll();
    java.lang.String var3 = var0.toString();
    var0.removeAll();
    ar.verificacion.validacion.treelistimplementation.TreeList var6 = new ar.verificacion.validacion.treelistimplementation.TreeList();
    java.lang.String var7 = var6.toString();
    boolean var8 = var6.isEmpty();
    int var9 = var6.size();
    java.lang.String var10 = var6.toString();
    var0.add(0, (java.lang.Object)var10);
    java.lang.String var12 = var0.toString();
    ar.verificacion.validacion.treelistimplementation.TreeList var14 = new ar.verificacion.validacion.treelistimplementation.TreeList();
    var14.removeAll();
    boolean var16 = var14.isEmpty();
    java.lang.String var17 = var14.toString();
    var0.add(1, (java.lang.Object)var17);
    java.lang.String var19 = var0.toString();
    ar.verificacion.validacion.treelistimplementation.TreeList var21 = new ar.verificacion.validacion.treelistimplementation.TreeList();
    java.lang.String var22 = var21.toString();
    boolean var23 = var21.isEmpty();
    boolean var24 = var21.isEmpty();
    var0.add(1, (java.lang.Object)var24);
    ar.verificacion.validacion.treelistimplementation.TreeList var27 = new ar.verificacion.validacion.treelistimplementation.TreeList();
    java.lang.String var28 = var27.toString();
    var27.removeAll();
    var27.removeAll();
    var27.removeAll();
    boolean var32 = var27.isEmpty();
    int var33 = var27.size();
    int var34 = var27.size();
    boolean var35 = var27.isEmpty();
    var0.add(0, (java.lang.Object)var27);
    java.lang.String var37 = var0.toString();
    var0.remove(1);
    int var40 = var0.size();
    var0.remove(0);
    
    // Check representation invariant.
    assertTrue("Representation invariant failed: Check rep invariant (method repOK) for var0", var0.repOK());

  }

}
