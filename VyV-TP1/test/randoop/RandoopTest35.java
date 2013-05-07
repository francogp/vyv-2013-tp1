package randoop;

import junit.framework.*;

@SuppressWarnings("unused")
public class RandoopTest35 extends TestCase {
    
    public static boolean debug = false;
    
    public void test1() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test1");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        var0.removeAll();
        boolean var6 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var8 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var9 = var8.size();
        int var10 = var8.size();
        var8.removeAll();
        int var12 = var8.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(5, (java.lang.Object) var8);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
    }
    
    public void test2() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test2");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        var3.add(0, (java.lang.Object) 100L);
        int var8 = var3.size();
        boolean var9 = var3.isEmpty();
        boolean var10 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var10);
        ar.verificacion.validacion.treelistimplementation.TreeList var13 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var14 = var13.size();
        var13.add(0, (java.lang.Object) 100L);
        int var18 = var13.size();
        int var19 = var13.size();
        int var20 = var13.size();
        var13.removeAll();
        boolean var22 = var13.isEmpty();
        boolean var23 = var13.isEmpty();
        var0.add(1, (java.lang.Object) var23);
        var0.add(0, (java.lang.Object) 'a');
        int var28 = var0.size();
        var0.remove(2);
        ar.verificacion.validacion.treelistimplementation.TreeList var32 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var33 = var32.size();
        var32.add(0, (java.lang.Object) 100L);
        int var37 = var32.size();
        boolean var38 = var32.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var40 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var41 = var40.size();
        boolean var42 = var40.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var44 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var45 = var44.size();
        boolean var46 = var44.isEmpty();
        boolean var47 = var44.isEmpty();
        boolean var48 = var44.isEmpty();
        var40.add(0, (java.lang.Object) var48);
        boolean var50 = var40.isEmpty();
        var40.removeAll();
        boolean var52 = var40.isEmpty();
        var32.add(1, (java.lang.Object) var40);
        var32.removeAll();
        var0.add(2, (java.lang.Object) var32);
        int var56 = var32.size();
        int var57 = var32.size();
        boolean var58 = var32.isEmpty();
        int var59 = var32.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var61 = var32.get(10);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 3);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var45 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var48 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var50 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var52 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var56 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var57 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var58 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var59 == 0);
        
    }
    
    public void test3() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test3");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        var0.add(0, (java.lang.Object) (byte) 1);
        java.lang.Object var9 = var0.get(0);
        int var10 = var0.size();
        int var11 = var0.size();
        boolean var12 = var0.isEmpty();
        boolean var13 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var16 = var15.size();
        var15.add(0, (java.lang.Object) 100L);
        int var20 = var15.size();
        boolean var21 = var15.isEmpty();
        boolean var22 = var15.isEmpty();
        var15.remove(0);
        var15.removeAll();
        var15.removeAll();
        int var27 = var15.size();
        int var28 = var15.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var30 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var31 = var30.size();
        var30.add(0, (java.lang.Object) 100L);
        int var35 = var30.size();
        int var36 = var30.size();
        int var37 = var30.size();
        java.lang.Object var39 = var30.get(0);
        int var40 = var30.size();
        int var41 = var30.size();
        int var42 = var30.size();
        java.lang.Object var44 = var30.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var46 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var47 = var46.size();
        var46.removeAll();
        int var49 = var46.size();
        int var50 = var46.size();
        boolean var51 = var46.isEmpty();
        var46.removeAll();
        var30.add(0, (java.lang.Object) var46);
        var15.add(0, (java.lang.Object) var30);
        int var55 = var15.size();
        var0.add(0, (java.lang.Object) var15);
        var0.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var59 = var0.get(100);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var9 + "' != '" + (byte) 1 + "'",
                var9.equals((byte) 1));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var39 + "' != '" + 100L + "'", var39.equals(100L));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var44 + "' != '" + 100L + "'", var44.equals(100L));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var49 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var50 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var55 == 1);
        
    }
    
    public void test4() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test4");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        boolean var6 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var8 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var8.removeAll();
        boolean var10 = var8.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var13 = var12.size();
        var12.removeAll();
        var12.removeAll();
        var8.add(0, (java.lang.Object) var12);
        boolean var17 = var8.isEmpty();
        boolean var18 = var8.isEmpty();
        var0.add(1, (java.lang.Object) var18);
        int var20 = var0.size();
        var0.add(2, (java.lang.Object) '4');
        java.lang.Object var25 = var0.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var27 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var28 = var27.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var30 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var31 = var30.size();
        boolean var32 = var30.isEmpty();
        var27.add(0, (java.lang.Object) var30);
        int var34 = var27.size();
        int var35 = var27.size();
        var27.removeAll();
        var0.add(2, (java.lang.Object) var27);
        var0.removeAll();
        int var39 = var0.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var41 = var0.get(10);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var25 + "' != '" + 100L + "'", var25.equals(100L));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == 0);
        
    }
    
    public void test5() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test5");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var0.remove(0);
        int var9 = var0.size();
        var0.removeAll();
        boolean var11 = var0.isEmpty();
        int var12 = var0.size();
        boolean var13 = var0.isEmpty();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
    }
    
    public void test6() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test6");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        boolean var10 = var0.isEmpty();
        var0.removeAll();
        boolean var12 = var0.isEmpty();
        int var13 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var16.removeAll();
        boolean var18 = var16.isEmpty();
        int var19 = var16.size();
        boolean var20 = var16.isEmpty();
        boolean var21 = var16.isEmpty();
        int var22 = var16.size();
        int var23 = var16.size();
        int var24 = var16.size();
        boolean var25 = var16.isEmpty();
        int var26 = var16.size();
        var0.add(0, (java.lang.Object) var16);
        boolean var28 = var16.isEmpty();
        boolean var29 = var16.isEmpty();
        int var30 = var16.size();
        boolean var31 = var16.isEmpty();
        int var32 = var16.size();
        int var33 = var16.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var35 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var36 = var35.size();
        var35.add(0, (java.lang.Object) 100L);
        int var40 = var35.size();
        int var41 = var35.size();
        int var42 = var35.size();
        var35.add(1, (java.lang.Object) 1.0d);
        boolean var46 = var35.isEmpty();
        var35.removeAll();
        var35.removeAll();
        int var49 = var35.size();
        var35.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var16.add(4, (java.lang.Object) var35);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var49 == 0);
        
    }
    
    public void test7() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test7");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        int var7 = var0.size();
        var0.add(1, (java.lang.Object) 1.0d);
        var0.remove(1);
        boolean var13 = var0.isEmpty();
        var0.removeAll();
        int var15 = var0.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var17 = var0.get(0);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
    }
    
    public void test8() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test8");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        boolean var6 = var0.isEmpty();
        boolean var7 = var0.isEmpty();
        int var8 = var0.size();
        var0.remove(0);
        var0.removeAll();
        var0.removeAll();
        boolean var13 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var16 = var15.isEmpty();
        var15.removeAll();
        int var18 = var15.size();
        var15.removeAll();
        var0.add(0, (java.lang.Object) var15);
        var15.removeAll();
        boolean var22 = var15.isEmpty();
        int var23 = var15.size();
        int var24 = var15.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var15.remove(1);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
    }
    
    public void test9() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test9");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        boolean var4 = var0.isEmpty();
        boolean var5 = var0.isEmpty();
        int var6 = var0.size();
        var0.removeAll();
        boolean var8 = var0.isEmpty();
        boolean var9 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var11 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var11.removeAll();
        int var13 = var11.size();
        var11.removeAll();
        var11.removeAll();
        var0.add(0, (java.lang.Object) var11);
        var11.removeAll();
        boolean var18 = var11.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var20 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var21 = var20.size();
        var20.add(0, (java.lang.Object) 100L);
        boolean var25 = var20.isEmpty();
        var20.removeAll();
        var20.removeAll();
        boolean var28 = var20.isEmpty();
        var11.add(0, (java.lang.Object) var28);
        var11.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == true);
        
    }
    
    public void test10() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test10");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.removeAll();
        boolean var5 = var0.isEmpty();
        boolean var6 = var0.isEmpty();
        int var7 = var0.size();
        var0.removeAll();
        var0.removeAll();
        int var10 = var0.size();
        int var11 = var0.size();
        boolean var12 = var0.isEmpty();
        int var13 = var0.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
    }
    
    public void test11() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test11");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        boolean var5 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        boolean var8 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var10 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var11 = var10.size();
        var10.add(0, (java.lang.Object) 100L);
        int var15 = var10.size();
        int var16 = var10.size();
        int var17 = var10.size();
        var10.add(1, (java.lang.Object) 1.0d);
        int var21 = var10.size();
        var0.add(0, (java.lang.Object) var10);
        boolean var23 = var10.isEmpty();
        int var24 = var10.size();
        boolean var25 = var10.isEmpty();
        boolean var26 = var10.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var28 = var10.get(10);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == false);
        
    }
    
    public void test12() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test12");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var5 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var5.removeAll();
        boolean var7 = var5.isEmpty();
        int var8 = var5.size();
        var5.add(0, (java.lang.Object) 1L);
        ar.verificacion.validacion.treelistimplementation.TreeList var13 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var14 = var13.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var17 = var16.size();
        boolean var18 = var16.isEmpty();
        var13.add(0, (java.lang.Object) var16);
        var16.add(0, (java.lang.Object) (-1.0d));
        var16.removeAll();
        boolean var24 = var16.isEmpty();
        int var25 = var16.size();
        boolean var26 = var16.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var28 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var29 = var28.isEmpty();
        var28.removeAll();
        var16.add(0, (java.lang.Object) var28);
        var28.removeAll();
        var5.add(0, (java.lang.Object) var28);
        var0.add(0, (java.lang.Object) var5);
        java.lang.Object var36 = var5.get(1);
        var5.add(1, (java.lang.Object) 100.0f);
        var5.removeAll();
        boolean var41 = var5.isEmpty();
        boolean var42 = var5.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var44 = var5.get(4);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var36 + "' != '" + 1L + "'", var36.equals(1L));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == true);
        
    }
    
    public void test13() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test13");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        boolean var4 = var0.isEmpty();
        int var5 = var0.size();
        boolean var6 = var0.isEmpty();
        int var7 = var0.size();
        boolean var8 = var0.isEmpty();
        int var9 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var11 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var12 = var11.size();
        boolean var13 = var11.isEmpty();
        var11.removeAll();
        var11.removeAll();
        var11.removeAll();
        boolean var17 = var11.isEmpty();
        var11.removeAll();
        int var19 = var11.size();
        int var20 = var11.size();
        var11.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var23 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var24 = var23.size();
        boolean var25 = var23.isEmpty();
        boolean var26 = var23.isEmpty();
        boolean var27 = var23.isEmpty();
        var23.removeAll();
        boolean var29 = var23.isEmpty();
        int var30 = var23.size();
        int var31 = var23.size();
        var11.add(0, (java.lang.Object) var31);
        int var33 = var11.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(10, (java.lang.Object) var11);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == 1);
        
    }
    
    public void test14() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test14");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        boolean var5 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        int var9 = var0.size();
        var0.removeAll();
        boolean var11 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var13 = var0.get(3);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
    }
    
    public void test15() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test15");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        boolean var5 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        boolean var8 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var10 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var11 = var10.size();
        var10.add(0, (java.lang.Object) 100L);
        int var15 = var10.size();
        int var16 = var10.size();
        int var17 = var10.size();
        var10.add(1, (java.lang.Object) 1.0d);
        int var21 = var10.size();
        var0.add(0, (java.lang.Object) var10);
        boolean var23 = var10.isEmpty();
        var10.removeAll();
        boolean var25 = var10.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var27 = var10.get(100);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
    }
    
    public void test16() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test16");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.removeAll();
        int var3 = var0.size();
        boolean var4 = var0.isEmpty();
        int var5 = var0.size();
        var0.removeAll();
        int var7 = var0.size();
        int var8 = var0.size();
        var0.removeAll();
        boolean var10 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
    }
    
    public void test17() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test17");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.removeAll();
        int var3 = var0.size();
        boolean var4 = var0.isEmpty();
        int var5 = var0.size();
        int var6 = var0.size();
        int var7 = var0.size();
        int var8 = var0.size();
        int var9 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var11 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var12 = var11.size();
        var11.removeAll();
        int var14 = var11.size();
        int var15 = var11.size();
        var11.removeAll();
        var11.removeAll();
        boolean var18 = var11.isEmpty();
        boolean var19 = var11.isEmpty();
        var11.removeAll();
        var11.removeAll();
        var0.add(0, (java.lang.Object) var11);
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var24 = var0.get(4);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
    }
    
    public void test18() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test18");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        boolean var10 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var12.removeAll();
        boolean var14 = var12.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var17 = var16.size();
        var16.removeAll();
        var16.removeAll();
        var12.add(0, (java.lang.Object) var16);
        var16.removeAll();
        var3.add(0, (java.lang.Object) var16);
        java.lang.Object var24 = var3.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var26 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var27 = var26.size();
        var26.removeAll();
        int var29 = var26.size();
        var26.removeAll();
        var3.add(2, (java.lang.Object) var26);
        var26.removeAll();
        int var33 = var26.size();
        int var34 = var26.size();
        boolean var35 = var26.isEmpty();
        int var36 = var26.size();
        var26.removeAll();
        int var38 = var26.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var40 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var40.removeAll();
        int var42 = var40.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var44 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var44.removeAll();
        boolean var46 = var44.isEmpty();
        int var47 = var44.size();
        var44.add(0, (java.lang.Object) 1L);
        int var51 = var44.size();
        var44.removeAll();
        var44.removeAll();
        var40.add(0, (java.lang.Object) var44);
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var26.add((-1), (java.lang.Object) var44);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertNotNull(var24);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == 1);
        
    }
    
    public void test19() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test19");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        int var7 = var0.size();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
    }
    
    public void test20() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test20");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        int var7 = var0.size();
        int var8 = var0.size();
        int var9 = var0.size();
        int var10 = var0.size();
        boolean var11 = var0.isEmpty();
        boolean var12 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == false);
        
    }
    
    public void test21() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test21");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        var0.add(0, (java.lang.Object) 0L);
        boolean var9 = var0.isEmpty();
        int var10 = var0.size();
        boolean var11 = var0.isEmpty();
        java.lang.Object var13 = var0.get(0);
        int var14 = var0.size();
        var0.removeAll();
        boolean var16 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove(3);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var13 + "' != '" + 0L + "'", var13.equals(0L));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
    }
    
    public void test22() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test22");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        var0.removeAll();
        var0.removeAll();
        int var12 = var0.size();
        var0.removeAll();
        boolean var14 = var0.isEmpty();
        var0.removeAll();
        int var16 = var0.size();
        var0.removeAll();
        var0.removeAll();
        boolean var19 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var21 = var0.get(1);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
    }
    
    public void test23() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test23");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        var0.add(0, (java.lang.Object) (byte) 1);
        int var8 = var0.size();
        int var9 = var0.size();
        boolean var10 = var0.isEmpty();
        boolean var11 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var13 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var14 = var13.size();
        var13.add(0, (java.lang.Object) 100L);
        int var18 = var13.size();
        int var19 = var13.size();
        int var20 = var13.size();
        boolean var21 = var13.isEmpty();
        var13.remove(0);
        int var24 = var13.size();
        var13.removeAll();
        var13.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var28 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var29 = var28.size();
        boolean var30 = var28.isEmpty();
        boolean var31 = var28.isEmpty();
        boolean var32 = var28.isEmpty();
        var28.removeAll();
        var13.add(0, (java.lang.Object) var28);
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(3, (java.lang.Object) 0);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == true);
        
    }
    
    public void test24() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test24");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        var3.removeAll();
        boolean var11 = var3.isEmpty();
        int var12 = var3.size();
        boolean var13 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var15.removeAll();
        boolean var17 = var15.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var19 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var20 = var19.size();
        var19.removeAll();
        var19.removeAll();
        var15.add(0, (java.lang.Object) var19);
        var3.add(0, (java.lang.Object) var19);
        var19.removeAll();
        boolean var26 = var19.isEmpty();
        boolean var27 = var19.isEmpty();
        var19.removeAll();
        boolean var29 = var19.isEmpty();
        int var30 = var19.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var32 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var32.removeAll();
        boolean var34 = var32.isEmpty();
        int var35 = var32.size();
        boolean var36 = var32.isEmpty();
        int var37 = var32.size();
        int var38 = var32.size();
        boolean var39 = var32.isEmpty();
        int var40 = var32.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var42 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var43 = var42.size();
        boolean var44 = var42.isEmpty();
        var42.removeAll();
        int var46 = var42.size();
        boolean var47 = var42.isEmpty();
        boolean var48 = var42.isEmpty();
        int var49 = var42.size();
        boolean var50 = var42.isEmpty();
        var42.add(0, (java.lang.Object) 10L);
        var42.removeAll();
        var42.removeAll();
        var42.removeAll();
        var42.removeAll();
        var32.add(0, (java.lang.Object) var42);
        int var59 = var42.size();
        boolean var60 = var42.isEmpty();
        var19.add(0, (java.lang.Object) var60);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var44 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var48 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var49 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var50 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var59 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var60 == true);
        
    }
    
    public void test25() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test25");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        int var7 = var3.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var3.remove(10);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
    }
    
    public void test26() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test26");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        boolean var10 = var0.isEmpty();
        boolean var11 = var0.isEmpty();
        boolean var12 = var0.isEmpty();
        int var13 = var0.size();
        var0.remove(0);
        int var16 = var0.size();
        var0.removeAll();
        int var18 = var0.size();
        boolean var19 = var0.isEmpty();
        var0.removeAll();
        boolean var21 = var0.isEmpty();
        boolean var22 = var0.isEmpty();
        int var23 = var0.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var25 = var0.get(4);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 0);
        
    }
    
    public void test27() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test27");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        boolean var10 = var0.isEmpty();
        var0.removeAll();
        boolean var12 = var0.isEmpty();
        boolean var13 = var0.isEmpty();
        boolean var14 = var0.isEmpty();
        boolean var15 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        boolean var18 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove(4);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
    }
    
    public void test28() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test28");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        var0.add(0, (java.lang.Object) (byte) 1);
        java.lang.Object var9 = var0.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var11 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var12 = var11.size();
        boolean var13 = var11.isEmpty();
        boolean var14 = var11.isEmpty();
        var11.removeAll();
        var11.removeAll();
        var11.removeAll();
        boolean var18 = var11.isEmpty();
        var0.add(1, (java.lang.Object) var11);
        boolean var20 = var11.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var22 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var23 = var22.isEmpty();
        var22.removeAll();
        int var25 = var22.size();
        var22.removeAll();
        var22.add(0, (java.lang.Object) (byte) 1);
        int var30 = var22.size();
        int var31 = var22.size();
        boolean var32 = var22.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var11.add(10, (java.lang.Object) var22);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var9 + "' != '" + (byte) 1 + "'",
                var9.equals((byte) 1));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == false);
        
    }
    
    public void test29() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test29");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        boolean var7 = var0.isEmpty();
        int var8 = var0.size();
        boolean var9 = var0.isEmpty();
        int var10 = var0.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
    }
    
    public void test30() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test30");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        boolean var10 = var0.isEmpty();
        int var11 = var0.size();
        int var12 = var0.size();
        boolean var13 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
    }
    
    public void test31() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test31");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        var3.removeAll();
        boolean var11 = var3.isEmpty();
        int var12 = var3.size();
        boolean var13 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var16 = var15.isEmpty();
        var15.removeAll();
        var3.add(0, (java.lang.Object) var15);
        var3.removeAll();
        int var20 = var3.size();
        boolean var21 = var3.isEmpty();
        int var22 = var3.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var24 = var3.get(10);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
    }
    
    public void test32() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test32");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        boolean var5 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var7 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var8 = var7.size();
        boolean var9 = var7.isEmpty();
        boolean var10 = var7.isEmpty();
        var7.removeAll();
        var0.add(0, (java.lang.Object) var7);
        int var13 = var0.size();
        var0.removeAll();
        int var15 = var0.size();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
    }
    
    public void test33() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test33");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        var0.add(0, (java.lang.Object) (byte) 1);
        boolean var11 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var13 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var14 = var13.size();
        var13.add(0, (java.lang.Object) 100L);
        int var18 = var13.size();
        int var19 = var13.size();
        int var20 = var13.size();
        var13.add(1, (java.lang.Object) 1.0d);
        boolean var24 = var13.isEmpty();
        var0.add(1, (java.lang.Object) var13);
        java.lang.Object var27 = var0.get(0);
        boolean var28 = var0.isEmpty();
        java.lang.Object var30 = var0.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var32 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var33 = var32.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var35 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var36 = var35.size();
        boolean var37 = var35.isEmpty();
        var32.add(0, (java.lang.Object) var35);
        int var39 = var35.size();
        boolean var40 = var35.isEmpty();
        var35.removeAll();
        var35.removeAll();
        var35.removeAll();
        var35.removeAll();
        int var45 = var35.size();
        var35.removeAll();
        var35.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(100, (java.lang.Object) var35);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var27 + "' != '" + (byte) 1 + "'",
                var27.equals((byte) 1));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var30 + "' != '" + (byte) 1 + "'",
                var30.equals((byte) 1));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var45 == 0);
        
    }
    
    public void test34() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test34");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        var0.removeAll();
        boolean var6 = var0.isEmpty();
        var0.removeAll();
        int var8 = var0.size();
        int var9 = var0.size();
        boolean var10 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
    }
    
    public void test35() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test35");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        var0.removeAll();
        boolean var3 = var0.isEmpty();
        var0.removeAll();
        boolean var5 = var0.isEmpty();
        var0.removeAll();
        boolean var7 = var0.isEmpty();
        var0.removeAll();
        boolean var9 = var0.isEmpty();
        int var10 = var0.size();
        boolean var11 = var0.isEmpty();
        boolean var12 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
    }
    
    public void test36() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test36");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var0.remove(0);
        var0.removeAll();
        int var10 = var0.size();
        int var11 = var0.size();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        int var15 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var17 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var18 = var17.size();
        boolean var19 = var17.isEmpty();
        var17.removeAll();
        var17.removeAll();
        var17.removeAll();
        var17.add(0, (java.lang.Object) 0L);
        boolean var26 = var17.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(2, (java.lang.Object) var17);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == false);
        
    }
    
    public void test37() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test37");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        boolean var5 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        int var8 = var0.size();
        var0.removeAll();
        boolean var10 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var13 = var12.size();
        var12.add(0, (java.lang.Object) 100L);
        int var17 = var12.size();
        int var18 = var12.size();
        int var19 = var12.size();
        boolean var20 = var12.isEmpty();
        int var21 = var12.size();
        boolean var22 = var12.isEmpty();
        int var23 = var12.size();
        boolean var24 = var12.isEmpty();
        int var25 = var12.size();
        int var26 = var12.size();
        var0.add(0, (java.lang.Object) var26);
        boolean var28 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var30 = var0.get(1);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == false);
        
    }
    
    public void test38() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test38");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.removeAll();
        boolean var5 = var0.isEmpty();
        var0.removeAll();
        boolean var7 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        boolean var10 = var0.isEmpty();
        boolean var11 = var0.isEmpty();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
    }
    
    public void test39() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test39");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.removeAll();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var7 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var8 = var7.isEmpty();
        boolean var9 = var7.isEmpty();
        var7.removeAll();
        boolean var11 = var7.isEmpty();
        var7.removeAll();
        boolean var13 = var7.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var16 = var15.size();
        boolean var17 = var15.isEmpty();
        var15.removeAll();
        int var19 = var15.size();
        boolean var20 = var15.isEmpty();
        var15.removeAll();
        var7.add(0, (java.lang.Object) var15);
        java.lang.Object var24 = var7.get(0);
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(3, (java.lang.Object) var7);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertNotNull(var24);
        
    }
    
    public void test40() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test40");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        var0.removeAll();
        int var6 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var9 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var10 = var9.isEmpty();
        var9.removeAll();
        int var12 = var9.size();
        var9.removeAll();
        int var14 = var9.size();
        var0.add(0, (java.lang.Object) var9);
        var9.removeAll();
        int var17 = var9.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
    }
    
    public void test41() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test41");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var6 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var7 = var6.size();
        boolean var8 = var6.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var10 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var11 = var10.size();
        boolean var12 = var10.isEmpty();
        boolean var13 = var10.isEmpty();
        boolean var14 = var10.isEmpty();
        var6.add(0, (java.lang.Object) var14);
        var0.add(0, (java.lang.Object) var6);
        int var17 = var6.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var19 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var20 = var19.size();
        boolean var21 = var19.isEmpty();
        var19.removeAll();
        int var23 = var19.size();
        boolean var24 = var19.isEmpty();
        boolean var25 = var19.isEmpty();
        boolean var26 = var19.isEmpty();
        var6.add(0, (java.lang.Object) var26);
        ar.verificacion.validacion.treelistimplementation.TreeList var29 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var29.removeAll();
        boolean var31 = var29.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var33 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var34 = var33.size();
        var33.removeAll();
        var33.removeAll();
        var29.add(0, (java.lang.Object) var33);
        boolean var38 = var29.isEmpty();
        boolean var39 = var29.isEmpty();
        boolean var40 = var29.isEmpty();
        var29.removeAll();
        var6.add(0, (java.lang.Object) var29);
        var6.removeAll();
        boolean var44 = var6.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var44 == true);
        
    }
    
    public void test42() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test42");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        int var7 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var10 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var11 = var10.size();
        var10.add(0, (java.lang.Object) 100L);
        int var15 = var10.size();
        var10.remove(0);
        var10.removeAll();
        var0.add(0, (java.lang.Object) var10);
        boolean var20 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var22 = var0.get((-1));
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == false);
        
    }
    
    public void test43() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test43");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        boolean var5 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var10 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var11 = var10.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var13 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var14 = var13.size();
        boolean var15 = var13.isEmpty();
        var10.add(0, (java.lang.Object) var13);
        var13.add(0, (java.lang.Object) (-1.0d));
        var13.removeAll();
        boolean var21 = var13.isEmpty();
        var13.removeAll();
        var0.add(0, (java.lang.Object) var13);
        int var24 = var13.size();
        int var25 = var13.size();
        int var26 = var13.size();
        var13.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var29 = var13.get(10);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == 0);
        
    }
    
    public void test44() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test44");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        var0.add(0, (java.lang.Object) (byte) 1);
        java.lang.Object var9 = var0.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var11 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var12 = var11.size();
        boolean var13 = var11.isEmpty();
        boolean var14 = var11.isEmpty();
        var11.removeAll();
        var11.removeAll();
        var11.removeAll();
        boolean var18 = var11.isEmpty();
        var0.add(1, (java.lang.Object) var11);
        var11.removeAll();
        boolean var21 = var11.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var23 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var24 = var23.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var26 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var27 = var26.size();
        boolean var28 = var26.isEmpty();
        var23.add(0, (java.lang.Object) var26);
        var26.add(0, (java.lang.Object) (-1.0d));
        var26.removeAll();
        boolean var34 = var26.isEmpty();
        int var35 = var26.size();
        boolean var36 = var26.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var38 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var38.removeAll();
        boolean var40 = var38.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var42 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var43 = var42.size();
        var42.removeAll();
        var42.removeAll();
        var38.add(0, (java.lang.Object) var42);
        var26.add(0, (java.lang.Object) var42);
        var42.removeAll();
        boolean var49 = var42.isEmpty();
        boolean var50 = var42.isEmpty();
        var11.add(0, (java.lang.Object) var50);
        boolean var52 = var11.isEmpty();
        int var53 = var11.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var9 + "' != '" + (byte) 1 + "'",
                var9.equals((byte) 1));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var49 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var50 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var52 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var53 == 1);
        
    }
    
    public void test45() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test45");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        int var10 = var0.size();
        int var11 = var0.size();
        boolean var12 = var0.isEmpty();
        var0.removeAll();
        boolean var14 = var0.isEmpty();
        int var15 = var0.size();
        boolean var16 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var18 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var19 = var18.size();
        boolean var20 = var18.isEmpty();
        var18.removeAll();
        var18.removeAll();
        var18.removeAll();
        var18.removeAll();
        var18.removeAll();
        var18.add(0, (java.lang.Object) (byte) 1);
        var18.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(3, (java.lang.Object) var18);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
    }
    
    public void test46() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test46");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var6 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var7 = var6.size();
        boolean var8 = var6.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var10 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var11 = var10.size();
        boolean var12 = var10.isEmpty();
        boolean var13 = var10.isEmpty();
        boolean var14 = var10.isEmpty();
        var6.add(0, (java.lang.Object) var14);
        var0.add(0, (java.lang.Object) var6);
        var0.removeAll();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var20 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var21 = var20.size();
        boolean var22 = var20.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var24 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var25 = var24.size();
        boolean var26 = var24.isEmpty();
        boolean var27 = var24.isEmpty();
        boolean var28 = var24.isEmpty();
        var20.add(0, (java.lang.Object) var28);
        boolean var30 = var20.isEmpty();
        boolean var31 = var20.isEmpty();
        boolean var32 = var20.isEmpty();
        var0.add(0, (java.lang.Object) var32);
        int var34 = var0.size();
        int var35 = var0.size();
        boolean var36 = var0.isEmpty();
        int var37 = var0.size();
        boolean var38 = var0.isEmpty();
        boolean var39 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == false);
        
    }
    
    public void test47() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test47");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        boolean var10 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var12.removeAll();
        boolean var14 = var12.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var17 = var16.size();
        var16.removeAll();
        var16.removeAll();
        var12.add(0, (java.lang.Object) var16);
        var16.removeAll();
        var3.add(0, (java.lang.Object) var16);
        java.lang.Object var24 = var3.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var26 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var27 = var26.size();
        var26.add(0, (java.lang.Object) 100L);
        int var31 = var26.size();
        boolean var32 = var26.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var34 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var34.removeAll();
        boolean var36 = var34.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var38 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var39 = var38.size();
        var38.removeAll();
        var38.removeAll();
        var34.add(0, (java.lang.Object) var38);
        boolean var43 = var34.isEmpty();
        boolean var44 = var34.isEmpty();
        var26.add(1, (java.lang.Object) var44);
        int var46 = var26.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var48 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var48.removeAll();
        boolean var50 = var48.isEmpty();
        int var51 = var48.size();
        boolean var52 = var48.isEmpty();
        int var53 = var48.size();
        boolean var54 = var48.isEmpty();
        var26.add(1, (java.lang.Object) var48);
        var3.add(1, (java.lang.Object) 1);
        int var57 = var3.size();
        var3.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var60 = var3.get(2);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertNotNull(var24);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var44 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == 2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var50 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var52 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var53 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var54 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var57 == 3);
        
    }
    
    public void test48() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test48");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        boolean var10 = var0.isEmpty();
        boolean var11 = var0.isEmpty();
        boolean var12 = var0.isEmpty();
        int var13 = var0.size();
        var0.remove(0);
        int var16 = var0.size();
        var0.removeAll();
        int var18 = var0.size();
        boolean var19 = var0.isEmpty();
        var0.removeAll();
        boolean var21 = var0.isEmpty();
        boolean var22 = var0.isEmpty();
        var0.removeAll();
        boolean var24 = var0.isEmpty();
        int var25 = var0.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var27 = var0.get(10);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 0);
        
    }
    
    public void test49() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test49");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        int var7 = var0.size();
        java.lang.Object var9 = var0.get(0);
        int var10 = var0.size();
        var0.removeAll();
        boolean var12 = var0.isEmpty();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var16 = var15.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var18 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var19 = var18.size();
        boolean var20 = var18.isEmpty();
        var15.add(0, (java.lang.Object) var18);
        var18.add(0, (java.lang.Object) (-1.0d));
        boolean var25 = var18.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var27 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var27.removeAll();
        boolean var29 = var27.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var31 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var32 = var31.size();
        var31.removeAll();
        var31.removeAll();
        var27.add(0, (java.lang.Object) var31);
        var31.removeAll();
        var18.add(0, (java.lang.Object) var31);
        java.lang.Object var39 = var18.get(0);
        var18.removeAll();
        var18.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add((-1), (java.lang.Object) var18);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var9 + "' != '" + 100L + "'", var9.equals(100L));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertNotNull(var39);
        
    }
    
    public void test50() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test50");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        var0.removeAll();
        int var6 = var0.size();
        var0.removeAll();
        boolean var8 = var0.isEmpty();
        boolean var9 = var0.isEmpty();
        int var10 = var0.size();
        boolean var11 = var0.isEmpty();
        boolean var12 = var0.isEmpty();
        int var13 = var0.size();
        boolean var14 = var0.isEmpty();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var17 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var18 = var17.size();
        boolean var19 = var17.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var21 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var22 = var21.size();
        boolean var23 = var21.isEmpty();
        boolean var24 = var21.isEmpty();
        boolean var25 = var21.isEmpty();
        var17.add(0, (java.lang.Object) var25);
        int var27 = var17.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var29 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var30 = var29.size();
        var29.add(0, (java.lang.Object) 100L);
        var29.removeAll();
        boolean var35 = var29.isEmpty();
        var17.add(1, (java.lang.Object) var29);
        int var37 = var17.size();
        int var38 = var17.size();
        var17.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(10, (java.lang.Object) var17);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == 2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == 2);
        
    }
    
    public void test51() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test51");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        var3.add(0, (java.lang.Object) 100L);
        int var8 = var3.size();
        boolean var9 = var3.isEmpty();
        boolean var10 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var10);
        ar.verificacion.validacion.treelistimplementation.TreeList var13 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var14 = var13.size();
        var13.add(0, (java.lang.Object) 100L);
        int var18 = var13.size();
        int var19 = var13.size();
        int var20 = var13.size();
        var13.removeAll();
        boolean var22 = var13.isEmpty();
        boolean var23 = var13.isEmpty();
        var0.add(1, (java.lang.Object) var23);
        var0.add(0, (java.lang.Object) 'a');
        var0.remove(0);
        var0.removeAll();
        var0.removeAll();
        int var32 = var0.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == 0);
        
    }
    
    public void test52() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test52");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        var0.removeAll();
        int var8 = var0.size();
        int var9 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var11 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var11.removeAll();
        boolean var13 = var11.isEmpty();
        int var14 = var11.size();
        boolean var15 = var11.isEmpty();
        boolean var16 = var11.isEmpty();
        int var17 = var11.size();
        var11.removeAll();
        boolean var19 = var11.isEmpty();
        boolean var20 = var11.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var22 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var22.removeAll();
        int var24 = var22.size();
        var22.removeAll();
        var22.removeAll();
        var11.add(0, (java.lang.Object) var22);
        boolean var28 = var22.isEmpty();
        boolean var29 = var22.isEmpty();
        boolean var30 = var22.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(3, (java.lang.Object) var22);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == true);
        
    }
    
    public void test53() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test53");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.removeAll();
        boolean var5 = var0.isEmpty();
        boolean var6 = var0.isEmpty();
        boolean var7 = var0.isEmpty();
        boolean var8 = var0.isEmpty();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var11 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var12 = var11.size();
        var11.add(0, (java.lang.Object) 100L);
        int var16 = var11.size();
        int var17 = var11.size();
        int var18 = var11.size();
        var11.add(1, (java.lang.Object) 1.0d);
        boolean var22 = var11.isEmpty();
        boolean var23 = var11.isEmpty();
        var11.removeAll();
        var0.add(0, (java.lang.Object) var11);
        int var26 = var0.size();
        var0.removeAll();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var30 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var31 = var30.size();
        var30.add(0, (java.lang.Object) 100L);
        int var35 = var30.size();
        boolean var36 = var30.isEmpty();
        boolean var37 = var30.isEmpty();
        int var38 = var30.size();
        var30.remove(0);
        var30.removeAll();
        boolean var42 = var30.isEmpty();
        int var43 = var30.size();
        var30.removeAll();
        boolean var45 = var30.isEmpty();
        boolean var46 = var30.isEmpty();
        boolean var47 = var30.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(1, (java.lang.Object) var47);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var45 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == true);
        
    }
    
    public void test54() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test54");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        boolean var5 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        boolean var9 = var0.isEmpty();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var13 = var12.size();
        boolean var14 = var12.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var17 = var16.size();
        boolean var18 = var16.isEmpty();
        boolean var19 = var16.isEmpty();
        boolean var20 = var16.isEmpty();
        var12.add(0, (java.lang.Object) var20);
        boolean var22 = var12.isEmpty();
        boolean var23 = var12.isEmpty();
        boolean var24 = var12.isEmpty();
        java.lang.Object var26 = var12.get(0);
        boolean var27 = var12.isEmpty();
        int var28 = var12.size();
        int var29 = var12.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(100, (java.lang.Object) var29);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var26 + "' != '" + true + "'", var26.equals(true));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 1);
        
    }
    
    public void test55() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test55");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        var0.removeAll();
        int var8 = var0.size();
        var0.removeAll();
        int var10 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var13 = var12.size();
        var12.removeAll();
        int var15 = var12.size();
        var12.removeAll();
        var12.add(0, (java.lang.Object) 100L);
        int var20 = var12.size();
        var12.removeAll();
        var0.add(0, (java.lang.Object) var12);
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var24 = var0.get(10);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 1);
        
    }
    
    public void test56() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test56");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        int var7 = var0.size();
        int var8 = var0.size();
        var0.remove(0);
        int var11 = var0.size();
        boolean var12 = var0.isEmpty();
        var0.removeAll();
        boolean var14 = var0.isEmpty();
        int var15 = var0.size();
        boolean var16 = var0.isEmpty();
        int var17 = var0.size();
        boolean var18 = var0.isEmpty();
        boolean var19 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var21 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var22 = var21.size();
        var21.removeAll();
        int var24 = var21.size();
        int var25 = var21.size();
        var21.removeAll();
        var21.removeAll();
        var21.removeAll();
        boolean var29 = var21.isEmpty();
        int var30 = var21.size();
        var0.add(0, (java.lang.Object) var30);
        ar.verificacion.validacion.treelistimplementation.TreeList var33 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var34 = var33.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var36 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var37 = var36.size();
        boolean var38 = var36.isEmpty();
        var33.add(0, (java.lang.Object) var36);
        int var40 = var33.size();
        int var41 = var33.size();
        boolean var42 = var33.isEmpty();
        boolean var43 = var33.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(10, (java.lang.Object) var33);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == false);
        
    }
    
    public void test57() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test57");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        var0.removeAll();
        int var8 = var0.size();
        var0.removeAll();
        int var10 = var0.size();
        var0.removeAll();
        var0.removeAll();
        int var13 = var0.size();
        var0.removeAll();
        int var15 = var0.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
    }
    
    public void test58() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test58");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.removeAll();
        int var3 = var0.size();
        boolean var4 = var0.isEmpty();
        int var5 = var0.size();
        int var6 = var0.size();
        int var7 = var0.size();
        int var8 = var0.size();
        boolean var9 = var0.isEmpty();
        boolean var10 = var0.isEmpty();
        var0.removeAll();
        int var12 = var0.size();
        int var13 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var16.removeAll();
        boolean var18 = var16.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var20 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var21 = var20.size();
        var20.removeAll();
        var20.removeAll();
        var16.add(0, (java.lang.Object) var20);
        boolean var25 = var16.isEmpty();
        boolean var26 = var16.isEmpty();
        var16.removeAll();
        int var28 = var16.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(4, (java.lang.Object) var28);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 0);
        
    }
    
    public void test59() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test59");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        boolean var10 = var0.isEmpty();
        boolean var11 = var0.isEmpty();
        boolean var12 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var14 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var15 = var14.size();
        boolean var16 = var14.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var18 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var19 = var18.size();
        boolean var20 = var18.isEmpty();
        boolean var21 = var18.isEmpty();
        boolean var22 = var18.isEmpty();
        var14.add(0, (java.lang.Object) var22);
        boolean var24 = var14.isEmpty();
        var14.removeAll();
        boolean var26 = var14.isEmpty();
        var0.add(0, (java.lang.Object) var14);
        int var28 = var14.size();
        int var29 = var14.size();
        boolean var30 = var14.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var32 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var32.removeAll();
        boolean var34 = var32.isEmpty();
        int var35 = var32.size();
        var32.removeAll();
        int var37 = var32.size();
        boolean var38 = var32.isEmpty();
        var32.removeAll();
        int var40 = var32.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var42 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var43 = var42.size();
        boolean var44 = var42.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var46 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var47 = var46.size();
        boolean var48 = var46.isEmpty();
        boolean var49 = var46.isEmpty();
        boolean var50 = var46.isEmpty();
        var42.add(0, (java.lang.Object) var50);
        boolean var52 = var42.isEmpty();
        var42.removeAll();
        boolean var54 = var42.isEmpty();
        var32.add(0, (java.lang.Object) var42);
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var14.add(1, (java.lang.Object) var32);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var44 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var48 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var49 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var50 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var52 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var54 == true);
        
    }
    
    public void test60() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test60");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        int var4 = var0.size();
        int var5 = var0.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove(4);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
    }
    
    public void test61() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test61");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        var0.add(0, (java.lang.Object) (byte) 1);
        java.lang.Object var9 = var0.get(0);
        int var10 = var0.size();
        int var11 = var0.size();
        var0.remove(0);
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var15 = var0.get(0);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var9 + "' != '" + (byte) 1 + "'",
                var9.equals((byte) 1));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 1);
        
    }
    
    public void test62() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test62");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var5 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var5.removeAll();
        boolean var7 = var5.isEmpty();
        int var8 = var5.size();
        var5.add(0, (java.lang.Object) 1L);
        ar.verificacion.validacion.treelistimplementation.TreeList var13 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var14 = var13.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var17 = var16.size();
        boolean var18 = var16.isEmpty();
        var13.add(0, (java.lang.Object) var16);
        var16.add(0, (java.lang.Object) (-1.0d));
        var16.removeAll();
        boolean var24 = var16.isEmpty();
        int var25 = var16.size();
        boolean var26 = var16.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var28 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var29 = var28.isEmpty();
        var28.removeAll();
        var16.add(0, (java.lang.Object) var28);
        var28.removeAll();
        var5.add(0, (java.lang.Object) var28);
        var0.add(0, (java.lang.Object) var5);
        java.lang.Object var36 = var5.get(1);
        java.lang.Object var38 = var5.get(1);
        ar.verificacion.validacion.treelistimplementation.TreeList var40 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var41 = var40.size();
        boolean var42 = var40.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var44 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var45 = var44.size();
        boolean var46 = var44.isEmpty();
        boolean var47 = var44.isEmpty();
        boolean var48 = var44.isEmpty();
        var40.add(0, (java.lang.Object) var48);
        boolean var50 = var40.isEmpty();
        var40.removeAll();
        boolean var52 = var40.isEmpty();
        int var53 = var40.size();
        var40.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var56 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var56.removeAll();
        boolean var58 = var56.isEmpty();
        int var59 = var56.size();
        boolean var60 = var56.isEmpty();
        boolean var61 = var56.isEmpty();
        int var62 = var56.size();
        int var63 = var56.size();
        int var64 = var56.size();
        boolean var65 = var56.isEmpty();
        int var66 = var56.size();
        var40.add(0, (java.lang.Object) var56);
        boolean var68 = var56.isEmpty();
        boolean var69 = var56.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var71 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var72 = var71.size();
        boolean var73 = var71.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var75 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var76 = var75.size();
        boolean var77 = var75.isEmpty();
        boolean var78 = var75.isEmpty();
        boolean var79 = var75.isEmpty();
        var71.add(0, (java.lang.Object) var79);
        boolean var81 = var71.isEmpty();
        var71.removeAll();
        int var83 = var71.size();
        var71.removeAll();
        var56.add(0, (java.lang.Object) var71);
        boolean var86 = var71.isEmpty();
        int var87 = var71.size();
        int var88 = var71.size();
        var5.add(1, (java.lang.Object) var88);
        int var90 = var5.size();
        var5.removeAll();
        var5.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var5.remove(100);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var36 + "' != '" + 1L + "'", var36.equals(1L));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var38 + "' != '" + 1L + "'", var38.equals(1L));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var45 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var48 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var50 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var52 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var53 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var58 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var59 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var60 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var61 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var62 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var63 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var64 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var65 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var66 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var68 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var69 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var72 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var73 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var76 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var77 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var78 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var79 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var81 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var83 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var86 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var87 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var88 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var90 == 3);
        
    }
    
    public void test63() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test63");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        var0.removeAll();
        int var6 = var0.size();
        var0.removeAll();
        boolean var8 = var0.isEmpty();
        boolean var9 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var11 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var12 = var11.size();
        boolean var13 = var11.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var16 = var15.size();
        boolean var17 = var15.isEmpty();
        boolean var18 = var15.isEmpty();
        boolean var19 = var15.isEmpty();
        var11.add(0, (java.lang.Object) var19);
        boolean var21 = var11.isEmpty();
        var11.removeAll();
        var11.removeAll();
        var0.add(0, (java.lang.Object) var11);
        int var25 = var11.size();
        int var26 = var11.size();
        int var27 = var11.size();
        int var28 = var11.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var11.remove(0);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 0);
        
    }
    
    public void test64() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test64");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var6 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var7 = var6.size();
        boolean var8 = var6.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var10 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var11 = var10.size();
        boolean var12 = var10.isEmpty();
        boolean var13 = var10.isEmpty();
        boolean var14 = var10.isEmpty();
        var6.add(0, (java.lang.Object) var14);
        var0.add(0, (java.lang.Object) var6);
        int var17 = var6.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var19 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var20 = var19.size();
        boolean var21 = var19.isEmpty();
        var19.removeAll();
        int var23 = var19.size();
        boolean var24 = var19.isEmpty();
        boolean var25 = var19.isEmpty();
        boolean var26 = var19.isEmpty();
        var6.add(0, (java.lang.Object) var26);
        ar.verificacion.validacion.treelistimplementation.TreeList var29 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var29.removeAll();
        boolean var31 = var29.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var33 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var34 = var33.size();
        var33.removeAll();
        var33.removeAll();
        var29.add(0, (java.lang.Object) var33);
        boolean var38 = var29.isEmpty();
        boolean var39 = var29.isEmpty();
        boolean var40 = var29.isEmpty();
        var29.removeAll();
        var6.add(0, (java.lang.Object) var29);
        java.lang.Object var44 = var6.get(0);
        var6.remove(2);
        int var47 = var6.size();
        var6.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertNotNull(var44);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == 2);
        
    }
    
    public void test65() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test65");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        boolean var6 = var0.isEmpty();
        int var7 = var0.size();
        var0.removeAll();
        boolean var9 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var11 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var12 = var11.size();
        var11.add(0, (java.lang.Object) 100L);
        int var16 = var11.size();
        boolean var17 = var11.isEmpty();
        boolean var18 = var11.isEmpty();
        int var19 = var11.size();
        var11.remove(0);
        var11.removeAll();
        var11.removeAll();
        boolean var24 = var11.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var26 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var27 = var26.isEmpty();
        var26.removeAll();
        int var29 = var26.size();
        var26.removeAll();
        var11.add(0, (java.lang.Object) var26);
        var11.removeAll();
        int var33 = var11.size();
        int var34 = var11.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(5, (java.lang.Object) var34);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 0);
        
    }
    
    public void test66() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test66");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        var3.removeAll();
        boolean var11 = var3.isEmpty();
        int var12 = var3.size();
        boolean var13 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var16 = var15.isEmpty();
        var15.removeAll();
        var3.add(0, (java.lang.Object) var15);
        int var19 = var3.size();
        boolean var20 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var22 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var23 = var22.size();
        var22.removeAll();
        var22.removeAll();
        boolean var26 = var22.isEmpty();
        var3.add(1, (java.lang.Object) var22);
        boolean var28 = var3.isEmpty();
        var3.remove(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var32 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var32.removeAll();
        boolean var34 = var32.isEmpty();
        int var35 = var32.size();
        var32.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var38 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var39 = var38.size();
        boolean var40 = var38.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var42 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var43 = var42.size();
        boolean var44 = var42.isEmpty();
        boolean var45 = var42.isEmpty();
        boolean var46 = var42.isEmpty();
        var38.add(0, (java.lang.Object) var46);
        var32.add(0, (java.lang.Object) var38);
        int var49 = var38.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var51 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var52 = var51.size();
        boolean var53 = var51.isEmpty();
        var51.removeAll();
        int var55 = var51.size();
        boolean var56 = var51.isEmpty();
        boolean var57 = var51.isEmpty();
        boolean var58 = var51.isEmpty();
        var38.add(0, (java.lang.Object) var58);
        ar.verificacion.validacion.treelistimplementation.TreeList var61 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var61.removeAll();
        boolean var63 = var61.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var65 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var66 = var65.size();
        var65.removeAll();
        var65.removeAll();
        var61.add(0, (java.lang.Object) var65);
        boolean var70 = var61.isEmpty();
        boolean var71 = var61.isEmpty();
        boolean var72 = var61.isEmpty();
        var61.removeAll();
        var38.add(0, (java.lang.Object) var61);
        var3.add(0, (java.lang.Object) 0);
        boolean var76 = var3.isEmpty();
        boolean var77 = var3.isEmpty();
        boolean var78 = var3.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var80 = var3.get(3);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var44 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var45 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var49 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var52 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var53 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var55 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var56 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var57 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var58 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var63 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var66 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var70 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var71 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var72 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var76 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var77 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var78 == false);
        
    }
    
    public void test67() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test67");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var6 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var7 = var6.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var9 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var10 = var9.size();
        boolean var11 = var9.isEmpty();
        var6.add(0, (java.lang.Object) var9);
        var9.add(0, (java.lang.Object) (-1.0d));
        boolean var16 = var9.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var18 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var18.removeAll();
        boolean var20 = var18.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var22 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var23 = var22.size();
        var22.removeAll();
        var22.removeAll();
        var18.add(0, (java.lang.Object) var22);
        var22.removeAll();
        var9.add(0, (java.lang.Object) var22);
        ar.verificacion.validacion.treelistimplementation.TreeList var30 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var31 = var30.size();
        boolean var32 = var30.isEmpty();
        var30.removeAll();
        int var34 = var30.size();
        boolean var35 = var30.isEmpty();
        var22.add(0, (java.lang.Object) var30);
        int var37 = var22.size();
        var0.add(0, (java.lang.Object) var22);
        int var39 = var0.size();
        var0.removeAll();
        int var41 = var0.size();
        boolean var42 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        boolean var45 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var47 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var47.removeAll();
        boolean var49 = var47.isEmpty();
        int var50 = var47.size();
        var47.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var53 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var54 = var53.size();
        boolean var55 = var53.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var57 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var58 = var57.size();
        boolean var59 = var57.isEmpty();
        boolean var60 = var57.isEmpty();
        boolean var61 = var57.isEmpty();
        var53.add(0, (java.lang.Object) var61);
        var47.add(0, (java.lang.Object) var53);
        var47.removeAll();
        var47.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var67 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var68 = var67.size();
        boolean var69 = var67.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var71 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var72 = var71.size();
        boolean var73 = var71.isEmpty();
        boolean var74 = var71.isEmpty();
        boolean var75 = var71.isEmpty();
        var67.add(0, (java.lang.Object) var75);
        boolean var77 = var67.isEmpty();
        boolean var78 = var67.isEmpty();
        boolean var79 = var67.isEmpty();
        var47.add(0, (java.lang.Object) var79);
        var47.removeAll();
        int var82 = var47.size();
        boolean var83 = var47.isEmpty();
        var0.add(0, (java.lang.Object) var83);
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var45 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var49 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var50 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var54 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var55 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var58 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var59 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var60 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var61 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var68 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var69 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var72 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var73 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var74 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var75 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var77 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var78 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var79 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var82 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var83 == true);
        
    }
    
    public void test68() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test68");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        var0.removeAll();
        boolean var5 = var0.isEmpty();
        var0.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove(4);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
    }
    
    public void test69() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test69");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        boolean var5 = var0.isEmpty();
        var0.removeAll();
        int var7 = var0.size();
        int var8 = var0.size();
        int var9 = var0.size();
        boolean var10 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var12 = var0.get(3);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
    }
    
    public void test70() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test70");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        var4.removeAll();
        var4.removeAll();
        var0.add(0, (java.lang.Object) var4);
        boolean var9 = var0.isEmpty();
        boolean var10 = var0.isEmpty();
        boolean var11 = var0.isEmpty();
        boolean var12 = var0.isEmpty();
        java.lang.Object var14 = var0.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var17 = var16.size();
        var16.removeAll();
        int var19 = var16.size();
        int var20 = var16.size();
        var16.removeAll();
        var16.removeAll();
        var16.removeAll();
        boolean var24 = var16.isEmpty();
        int var25 = var16.size();
        var0.add(0, (java.lang.Object) var25);
        boolean var27 = var0.isEmpty();
        boolean var28 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var30 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var31 = var30.size();
        boolean var32 = var30.isEmpty();
        boolean var33 = var30.isEmpty();
        boolean var34 = var30.isEmpty();
        boolean var35 = var30.isEmpty();
        int var36 = var30.size();
        boolean var37 = var30.isEmpty();
        int var38 = var30.size();
        boolean var39 = var30.isEmpty();
        var0.add(2, (java.lang.Object) var30);
        var30.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertNotNull(var14);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == true);
        
    }
    
    public void test71() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test71");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        boolean var10 = var0.isEmpty();
        int var11 = var0.size();
        int var12 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var14 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var15 = var14.isEmpty();
        boolean var16 = var14.isEmpty();
        var14.removeAll();
        var14.add(0, (java.lang.Object) 1.0d);
        var14.removeAll();
        var0.add(0, (java.lang.Object) var14);
        boolean var23 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == false);
        
    }
    
    public void test72() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test72");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        var3.add(0, (java.lang.Object) 100L);
        int var8 = var3.size();
        boolean var9 = var3.isEmpty();
        boolean var10 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var10);
        java.lang.Object var13 = var0.get(0);
        var0.removeAll();
        boolean var15 = var0.isEmpty();
        var0.removeAll();
        boolean var17 = var0.isEmpty();
        int var18 = var0.size();
        int var19 = var0.size();
        int var20 = var0.size();
        boolean var21 = var0.isEmpty();
        boolean var22 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var13 + "' != '" + false + "'", var13.equals(false));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
    }
    
    public void test73() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test73");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        var0.removeAll();
        boolean var6 = var0.isEmpty();
        boolean var7 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        int var10 = var0.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove(5);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
    }
    
    public void test74() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test74");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        boolean var6 = var0.isEmpty();
        boolean var7 = var0.isEmpty();
        int var8 = var0.size();
        var0.remove(0);
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        boolean var14 = var0.isEmpty();
        int var15 = var0.size();
        boolean var16 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove(5);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
    }
    
    public void test75() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test75");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        boolean var5 = var0.isEmpty();
        int var6 = var0.size();
        boolean var7 = var0.isEmpty();
        int var8 = var0.size();
        boolean var9 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        int var13 = var0.size();
        int var14 = var0.size();
        boolean var15 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var17 = var0.get((-1));
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == true);
        
    }
    
    public void test76() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test76");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        java.lang.Object var11 = var0.get(0);
        int var12 = var0.size();
        int var13 = var0.size();
        var0.removeAll();
        int var15 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var17 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var18 = var17.size();
        var17.removeAll();
        int var20 = var17.size();
        var17.removeAll();
        var17.removeAll();
        boolean var23 = var17.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(2, (java.lang.Object) var17);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var11 + "' != '" + true + "'", var11.equals(true));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
    }
    
    public void test77() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test77");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        int var6 = var0.size();
        int var7 = var0.size();
        int var8 = var0.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var10 = var0.get(100);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
    }
    
    public void test78() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test78");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        var0.removeAll();
        int var11 = var0.size();
        boolean var12 = var0.isEmpty();
        int var13 = var0.size();
        boolean var14 = var0.isEmpty();
        boolean var15 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var17 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var18 = var17.size();
        boolean var19 = var17.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var21 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var22 = var21.size();
        boolean var23 = var21.isEmpty();
        boolean var24 = var21.isEmpty();
        boolean var25 = var21.isEmpty();
        var17.add(0, (java.lang.Object) var25);
        boolean var27 = var17.isEmpty();
        var17.removeAll();
        boolean var29 = var17.isEmpty();
        int var30 = var17.size();
        var17.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var33 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var33.removeAll();
        boolean var35 = var33.isEmpty();
        int var36 = var33.size();
        boolean var37 = var33.isEmpty();
        boolean var38 = var33.isEmpty();
        int var39 = var33.size();
        int var40 = var33.size();
        int var41 = var33.size();
        boolean var42 = var33.isEmpty();
        int var43 = var33.size();
        var17.add(0, (java.lang.Object) var33);
        var17.removeAll();
        var17.removeAll();
        int var47 = var17.size();
        var17.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(5, (java.lang.Object) var17);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == 0);
        
    }
    
    public void test79() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test79");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        var0.removeAll();
        int var6 = var0.size();
        var0.removeAll();
        boolean var8 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var10 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var11 = var10.size();
        var10.removeAll();
        int var13 = var10.size();
        boolean var14 = var10.isEmpty();
        int var15 = var10.size();
        int var16 = var10.size();
        var0.add(0, (java.lang.Object) var16);
        boolean var18 = var0.isEmpty();
        java.lang.Object var20 = var0.get(0);
        int var21 = var0.size();
        int var22 = var0.size();
        int var23 = var0.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var20 + "' != '" + 0 + "'", var20.equals(0));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 1);
        
    }
    
    public void test80() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test80");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.removeAll();
        var0.removeAll();
        int var4 = var0.size();
        int var5 = var0.size();
        boolean var6 = var0.isEmpty();
        var0.removeAll();
        int var8 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var10 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var11 = var10.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var13 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var14 = var13.size();
        boolean var15 = var13.isEmpty();
        var10.add(0, (java.lang.Object) var13);
        int var17 = var13.size();
        var13.removeAll();
        int var19 = var13.size();
        var13.removeAll();
        boolean var21 = var13.isEmpty();
        boolean var22 = var13.isEmpty();
        int var23 = var13.size();
        boolean var24 = var13.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(10, (java.lang.Object) var24);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
    }
    
    public void test81() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test81");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var6 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var7 = var6.size();
        boolean var8 = var6.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var10 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var11 = var10.size();
        boolean var12 = var10.isEmpty();
        boolean var13 = var10.isEmpty();
        boolean var14 = var10.isEmpty();
        var6.add(0, (java.lang.Object) var14);
        var0.add(0, (java.lang.Object) var6);
        int var17 = var6.size();
        boolean var18 = var6.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var20 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var21 = var20.size();
        boolean var22 = var20.isEmpty();
        boolean var23 = var20.isEmpty();
        var20.removeAll();
        var20.removeAll();
        var6.add(1, (java.lang.Object) var20);
        int var27 = var6.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 2);
        
    }
    
    public void test82() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test82");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        boolean var5 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        boolean var8 = var0.isEmpty();
        boolean var9 = var0.isEmpty();
        boolean var10 = var0.isEmpty();
        int var11 = var0.size();
        int var12 = var0.size();
        boolean var13 = var0.isEmpty();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
    }
    
    public void test83() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test83");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        var0.removeAll();
        boolean var6 = var0.isEmpty();
        var0.removeAll();
        int var8 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var10 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var11 = var10.size();
        boolean var12 = var10.isEmpty();
        boolean var13 = var10.isEmpty();
        boolean var14 = var10.isEmpty();
        boolean var15 = var10.isEmpty();
        int var16 = var10.size();
        boolean var17 = var10.isEmpty();
        int var18 = var10.size();
        boolean var19 = var10.isEmpty();
        var10.removeAll();
        var10.removeAll();
        boolean var22 = var10.isEmpty();
        var0.add(0, (java.lang.Object) var10);
        boolean var24 = var0.isEmpty();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == false);
        
    }
    
    public void test84() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test84");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        var0.add(0, (java.lang.Object) 100L);
        boolean var8 = var0.isEmpty();
        boolean var9 = var0.isEmpty();
        var0.removeAll();
        int var11 = var0.size();
        boolean var12 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
    }
    
    public void test85() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test85");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        boolean var10 = var0.isEmpty();
        var0.removeAll();
        boolean var12 = var0.isEmpty();
        int var13 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var16.removeAll();
        boolean var18 = var16.isEmpty();
        int var19 = var16.size();
        boolean var20 = var16.isEmpty();
        boolean var21 = var16.isEmpty();
        int var22 = var16.size();
        int var23 = var16.size();
        int var24 = var16.size();
        boolean var25 = var16.isEmpty();
        int var26 = var16.size();
        var0.add(0, (java.lang.Object) var16);
        ar.verificacion.validacion.treelistimplementation.TreeList var29 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var29.removeAll();
        boolean var31 = var29.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var33 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var34 = var33.size();
        var33.removeAll();
        var33.removeAll();
        var29.add(0, (java.lang.Object) var33);
        var33.removeAll();
        var33.removeAll();
        boolean var40 = var33.isEmpty();
        boolean var41 = var33.isEmpty();
        var0.add(0, (java.lang.Object) var33);
        boolean var43 = var33.isEmpty();
        int var44 = var33.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var44 == 0);
        
    }
    
    public void test86() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test86");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        var4.removeAll();
        var4.removeAll();
        var0.add(0, (java.lang.Object) var4);
        var4.removeAll();
        var4.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var13 = var12.isEmpty();
        var12.removeAll();
        int var15 = var12.size();
        var12.removeAll();
        var12.add(0, (java.lang.Object) (byte) 1);
        java.lang.Object var21 = var12.get(0);
        int var22 = var12.size();
        int var23 = var12.size();
        int var24 = var12.size();
        var12.remove(0);
        boolean var27 = var12.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var4.add(5, (java.lang.Object) var27);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var21 + "' != '" + (byte) 1 + "'",
                var21.equals((byte) 1));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == true);
        
    }
    
    public void test87() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test87");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        var0.add(0, (java.lang.Object) 1.0d);
        java.lang.Object var8 = var0.get(0);
        boolean var9 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove(100);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var8 + "' != '" + 1.0d + "'", var8.equals(1.0d));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == false);
        
    }
    
    public void test88() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test88");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        boolean var4 = var0.isEmpty();
        var0.removeAll();
        boolean var6 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var8 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var9 = var8.size();
        boolean var10 = var8.isEmpty();
        var8.removeAll();
        int var12 = var8.size();
        boolean var13 = var8.isEmpty();
        var8.removeAll();
        var0.add(0, (java.lang.Object) var8);
        boolean var16 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var18 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var19 = var18.size();
        boolean var20 = var18.isEmpty();
        var18.removeAll();
        var18.removeAll();
        var18.removeAll();
        int var24 = var18.size();
        boolean var25 = var18.isEmpty();
        var18.removeAll();
        var18.removeAll();
        int var28 = var18.size();
        boolean var29 = var18.isEmpty();
        var18.removeAll();
        int var31 = var18.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(100, (java.lang.Object) var18);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
    }
    
    public void test89() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test89");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var6 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var7 = var6.size();
        boolean var8 = var6.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var10 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var11 = var10.size();
        boolean var12 = var10.isEmpty();
        boolean var13 = var10.isEmpty();
        boolean var14 = var10.isEmpty();
        var6.add(0, (java.lang.Object) var14);
        var0.add(0, (java.lang.Object) var6);
        int var17 = var6.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var19 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var20 = var19.size();
        boolean var21 = var19.isEmpty();
        var19.removeAll();
        int var23 = var19.size();
        boolean var24 = var19.isEmpty();
        boolean var25 = var19.isEmpty();
        boolean var26 = var19.isEmpty();
        var6.add(0, (java.lang.Object) var26);
        boolean var28 = var6.isEmpty();
        java.lang.Object var30 = var6.get(1);
        ar.verificacion.validacion.treelistimplementation.TreeList var32 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var33 = var32.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var35 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var36 = var35.size();
        boolean var37 = var35.isEmpty();
        var32.add(0, (java.lang.Object) var35);
        var35.add(0, (java.lang.Object) (-1.0d));
        var35.removeAll();
        boolean var43 = var35.isEmpty();
        var35.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var46 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var47 = var46.size();
        var46.add(0, (java.lang.Object) 100L);
        int var51 = var46.size();
        boolean var52 = var46.isEmpty();
        boolean var53 = var46.isEmpty();
        var35.add(0, (java.lang.Object) var53);
        boolean var55 = var35.isEmpty();
        boolean var56 = var35.isEmpty();
        int var57 = var35.size();
        boolean var58 = var35.isEmpty();
        var6.add(2, (java.lang.Object) var35);
        int var60 = var35.size();
        java.lang.Object var62 = var35.get(0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var30 + "' != '" + true + "'", var30.equals(true));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var52 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var53 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var55 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var56 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var57 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var58 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var60 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var62 + "' != '" + false + "'", var62.equals(false));
        
    }
    
    public void test90() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test90");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        boolean var5 = var0.isEmpty();
        int var6 = var0.size();
        int var7 = var0.size();
        var0.removeAll();
        boolean var9 = var0.isEmpty();
        boolean var10 = var0.isEmpty();
        int var11 = var0.size();
        var0.removeAll();
        int var13 = var0.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var15 = var0.get(10);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
    }
    
    public void test91() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test91");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        boolean var10 = var0.isEmpty();
        var0.removeAll();
        boolean var12 = var0.isEmpty();
        int var13 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var16.removeAll();
        boolean var18 = var16.isEmpty();
        int var19 = var16.size();
        boolean var20 = var16.isEmpty();
        boolean var21 = var16.isEmpty();
        int var22 = var16.size();
        int var23 = var16.size();
        int var24 = var16.size();
        boolean var25 = var16.isEmpty();
        int var26 = var16.size();
        var0.add(0, (java.lang.Object) var16);
        boolean var28 = var16.isEmpty();
        boolean var29 = var16.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var31 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var32 = var31.size();
        boolean var33 = var31.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var35 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var36 = var35.size();
        boolean var37 = var35.isEmpty();
        boolean var38 = var35.isEmpty();
        boolean var39 = var35.isEmpty();
        var31.add(0, (java.lang.Object) var39);
        boolean var41 = var31.isEmpty();
        var31.removeAll();
        int var43 = var31.size();
        var31.removeAll();
        var16.add(0, (java.lang.Object) var31);
        boolean var46 = var31.isEmpty();
        int var47 = var31.size();
        int var48 = var31.size();
        var31.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var51 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var52 = var51.size();
        var51.add(0, (java.lang.Object) 100L);
        int var56 = var51.size();
        boolean var57 = var51.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var59 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var60 = var59.size();
        boolean var61 = var59.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var63 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var64 = var63.size();
        boolean var65 = var63.isEmpty();
        boolean var66 = var63.isEmpty();
        boolean var67 = var63.isEmpty();
        var59.add(0, (java.lang.Object) var67);
        boolean var69 = var59.isEmpty();
        var59.removeAll();
        boolean var71 = var59.isEmpty();
        var51.add(1, (java.lang.Object) var59);
        boolean var73 = var59.isEmpty();
        boolean var74 = var59.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var31.add(100, (java.lang.Object) var74);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var48 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var52 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var56 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var57 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var60 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var61 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var64 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var65 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var66 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var67 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var69 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var71 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var73 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var74 == true);
        
    }
    
    public void test92() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test92");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        var3.removeAll();
        boolean var11 = var3.isEmpty();
        int var12 = var3.size();
        boolean var13 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var15.removeAll();
        boolean var17 = var15.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var19 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var20 = var19.size();
        var19.removeAll();
        var19.removeAll();
        var15.add(0, (java.lang.Object) var19);
        var3.add(0, (java.lang.Object) var19);
        var19.removeAll();
        boolean var26 = var19.isEmpty();
        boolean var27 = var19.isEmpty();
        boolean var28 = var19.isEmpty();
        boolean var29 = var19.isEmpty();
        var19.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
    }
    
    public void test93() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test93");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        boolean var10 = var0.isEmpty();
        var0.removeAll();
        boolean var12 = var0.isEmpty();
        boolean var13 = var0.isEmpty();
        var0.removeAll();
        int var15 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var18 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var19 = var18.size();
        var18.removeAll();
        int var21 = var18.size();
        boolean var22 = var18.isEmpty();
        var18.removeAll();
        var18.removeAll();
        int var25 = var18.size();
        int var26 = var18.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var28 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var29 = var28.isEmpty();
        var28.removeAll();
        int var31 = var28.size();
        var28.removeAll();
        var28.add(0, (java.lang.Object) (byte) 1);
        boolean var36 = var28.isEmpty();
        boolean var37 = var28.isEmpty();
        var18.add(0, (java.lang.Object) var37);
        var0.add(0, (java.lang.Object) 0);
        boolean var40 = var0.isEmpty();
        boolean var41 = var0.isEmpty();
        int var42 = var0.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove(3);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == 1);
        
    }
    
    public void test94() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test94");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        int var7 = var0.size();
        int var8 = var0.size();
        var0.remove(0);
        int var11 = var0.size();
        var0.removeAll();
        boolean var13 = var0.isEmpty();
        var0.removeAll();
        boolean var15 = var0.isEmpty();
        boolean var16 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var18 = var0.get(0);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
    }
    
    public void test95() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test95");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        var3.removeAll();
        boolean var11 = var3.isEmpty();
        int var12 = var3.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var14 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var15 = var14.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var17 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var18 = var17.size();
        boolean var19 = var17.isEmpty();
        var14.add(0, (java.lang.Object) var17);
        int var21 = var17.size();
        boolean var22 = var17.isEmpty();
        var17.removeAll();
        var17.removeAll();
        var3.add(0, (java.lang.Object) var17);
        boolean var26 = var3.isEmpty();
        boolean var27 = var3.isEmpty();
        var3.removeAll();
        var3.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == false);
        
    }
    
    public void test96() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test96");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        int var4 = var0.size();
        boolean var5 = var0.isEmpty();
        boolean var6 = var0.isEmpty();
        int var7 = var0.size();
        var0.removeAll();
        var0.removeAll();
        boolean var10 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        int var13 = var0.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
    }
    
    public void test97() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test97");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        boolean var10 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var12.removeAll();
        boolean var14 = var12.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var17 = var16.size();
        var16.removeAll();
        var16.removeAll();
        var12.add(0, (java.lang.Object) var16);
        var16.removeAll();
        var3.add(0, (java.lang.Object) var16);
        java.lang.Object var24 = var3.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var26 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var27 = var26.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var29 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var30 = var29.size();
        boolean var31 = var29.isEmpty();
        var26.add(0, (java.lang.Object) var29);
        var26.removeAll();
        var26.removeAll();
        int var35 = var26.size();
        boolean var36 = var26.isEmpty();
        var3.add(2, (java.lang.Object) var36);
        var3.remove(1);
        java.lang.Object var41 = var3.get(1);
        boolean var42 = var3.isEmpty();
        int var43 = var3.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var45 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var45.removeAll();
        boolean var47 = var45.isEmpty();
        int var48 = var45.size();
        var45.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var51 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var52 = var51.size();
        boolean var53 = var51.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var55 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var56 = var55.size();
        boolean var57 = var55.isEmpty();
        boolean var58 = var55.isEmpty();
        boolean var59 = var55.isEmpty();
        var51.add(0, (java.lang.Object) var59);
        var45.add(0, (java.lang.Object) var51);
        int var62 = var51.size();
        var51.removeAll();
        var51.removeAll();
        var3.add(2, (java.lang.Object) var51);
        int var66 = var51.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertNotNull(var24);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var41 + "' != '" + true + "'", var41.equals(true));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == 2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var48 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var52 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var53 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var56 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var57 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var58 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var59 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var62 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var66 == 0);
        
    }
    
    public void test98() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test98");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var5 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var5.removeAll();
        boolean var7 = var5.isEmpty();
        int var8 = var5.size();
        var5.add(0, (java.lang.Object) 1L);
        ar.verificacion.validacion.treelistimplementation.TreeList var13 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var14 = var13.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var17 = var16.size();
        boolean var18 = var16.isEmpty();
        var13.add(0, (java.lang.Object) var16);
        var16.add(0, (java.lang.Object) (-1.0d));
        var16.removeAll();
        boolean var24 = var16.isEmpty();
        int var25 = var16.size();
        boolean var26 = var16.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var28 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var29 = var28.isEmpty();
        var28.removeAll();
        var16.add(0, (java.lang.Object) var28);
        var28.removeAll();
        var5.add(0, (java.lang.Object) var28);
        var0.add(0, (java.lang.Object) var5);
        var0.removeAll();
        int var36 = var0.size();
        var0.removeAll();
        boolean var38 = var0.isEmpty();
        int var39 = var0.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var41 = var0.get(3);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == 0);
        
    }
    
    public void test99() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test99");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        int var2 = var0.size();
        boolean var3 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var5 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var6 = var5.size();
        boolean var7 = var5.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var9 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var10 = var9.size();
        boolean var11 = var9.isEmpty();
        boolean var12 = var9.isEmpty();
        boolean var13 = var9.isEmpty();
        var5.add(0, (java.lang.Object) var13);
        boolean var15 = var5.isEmpty();
        boolean var16 = var5.isEmpty();
        boolean var17 = var5.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var19 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var20 = var19.size();
        boolean var21 = var19.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var23 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var24 = var23.size();
        boolean var25 = var23.isEmpty();
        boolean var26 = var23.isEmpty();
        boolean var27 = var23.isEmpty();
        var19.add(0, (java.lang.Object) var27);
        boolean var29 = var19.isEmpty();
        var19.removeAll();
        boolean var31 = var19.isEmpty();
        var5.add(0, (java.lang.Object) var19);
        ar.verificacion.validacion.treelistimplementation.TreeList var34 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var35 = var34.size();
        var34.add(0, (java.lang.Object) 100L);
        int var39 = var34.size();
        int var40 = var34.size();
        int var41 = var34.size();
        var34.removeAll();
        boolean var43 = var34.isEmpty();
        boolean var44 = var34.isEmpty();
        int var45 = var34.size();
        var34.removeAll();
        int var47 = var34.size();
        boolean var48 = var34.isEmpty();
        var34.removeAll();
        var5.add(1, (java.lang.Object) var34);
        boolean var51 = var34.isEmpty();
        boolean var52 = var34.isEmpty();
        boolean var53 = var34.isEmpty();
        var0.add(0, (java.lang.Object) var34);
        ar.verificacion.validacion.treelistimplementation.TreeList var56 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var56.removeAll();
        boolean var58 = var56.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var60 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var61 = var60.size();
        var60.removeAll();
        var60.removeAll();
        var56.add(0, (java.lang.Object) var60);
        boolean var65 = var56.isEmpty();
        boolean var66 = var56.isEmpty();
        int var67 = var56.size();
        int var68 = var56.size();
        int var69 = var56.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var71 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var72 = var71.size();
        boolean var73 = var71.isEmpty();
        var71.removeAll();
        int var75 = var71.size();
        boolean var76 = var71.isEmpty();
        boolean var77 = var71.isEmpty();
        int var78 = var71.size();
        boolean var79 = var71.isEmpty();
        var71.removeAll();
        var56.add(0, (java.lang.Object) var71);
        var0.add(0, (java.lang.Object) var71);
        int var83 = var0.size();
        int var84 = var0.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var44 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var45 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var48 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var52 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var53 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var58 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var61 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var65 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var66 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var67 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var68 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var69 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var72 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var73 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var75 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var76 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var77 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var78 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var79 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var83 == 2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var84 == 2);
        
    }
    
    public void test100() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test100");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.removeAll();
        var0.removeAll();
        int var6 = var0.size();
        int var7 = var0.size();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
    }
    
    public void test101() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test101");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        var3.add(0, (java.lang.Object) 100L);
        int var8 = var3.size();
        boolean var9 = var3.isEmpty();
        boolean var10 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var10);
        ar.verificacion.validacion.treelistimplementation.TreeList var13 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var14 = var13.size();
        var13.add(0, (java.lang.Object) 100L);
        int var18 = var13.size();
        int var19 = var13.size();
        int var20 = var13.size();
        var13.removeAll();
        boolean var22 = var13.isEmpty();
        boolean var23 = var13.isEmpty();
        var0.add(1, (java.lang.Object) var23);
        var0.add(0, (java.lang.Object) 'a');
        int var28 = var0.size();
        var0.remove(2);
        boolean var31 = var0.isEmpty();
        var0.remove(0);
        boolean var34 = var0.isEmpty();
        var0.removeAll();
        int var36 = var0.size();
        boolean var37 = var0.isEmpty();
        int var38 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var40 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var41 = var40.size();
        var40.removeAll();
        int var43 = var40.size();
        boolean var44 = var40.isEmpty();
        int var45 = var40.size();
        int var46 = var40.size();
        int var47 = var40.size();
        int var48 = var40.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var50 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var51 = var50.size();
        boolean var52 = var50.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var54 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var55 = var54.size();
        boolean var56 = var54.isEmpty();
        boolean var57 = var54.isEmpty();
        boolean var58 = var54.isEmpty();
        var50.add(0, (java.lang.Object) var58);
        boolean var60 = var50.isEmpty();
        boolean var61 = var50.isEmpty();
        boolean var62 = var50.isEmpty();
        java.lang.Object var64 = var50.get(0);
        boolean var65 = var50.isEmpty();
        var40.add(0, (java.lang.Object) var50);
        boolean var67 = var50.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(10, (java.lang.Object) var67);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 3);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var44 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var45 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var48 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var52 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var55 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var56 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var57 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var58 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var60 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var61 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var62 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var64 + "' != '" + true + "'", var64.equals(true));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var65 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var67 == false);
        
    }
    
    public void test102() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test102");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        boolean var10 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var12.removeAll();
        boolean var14 = var12.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var17 = var16.size();
        var16.removeAll();
        var16.removeAll();
        var12.add(0, (java.lang.Object) var16);
        var16.removeAll();
        var3.add(0, (java.lang.Object) var16);
        java.lang.Object var24 = var3.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var26 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var27 = var26.size();
        var26.removeAll();
        int var29 = var26.size();
        var26.removeAll();
        var3.add(2, (java.lang.Object) var26);
        int var32 = var3.size();
        var3.remove(0);
        boolean var35 = var3.isEmpty();
        boolean var36 = var3.isEmpty();
        boolean var37 = var3.isEmpty();
        int var38 = var3.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertNotNull(var24);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == 3);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == 2);
        
    }
    
    public void test103() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test103");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        boolean var5 = var0.isEmpty();
        int var6 = var0.size();
        boolean var7 = var0.isEmpty();
        boolean var8 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        int var12 = var0.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
    }
    
    public void test104() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test104");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        boolean var6 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var8 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var8.removeAll();
        boolean var10 = var8.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var13 = var12.size();
        var12.removeAll();
        var12.removeAll();
        var8.add(0, (java.lang.Object) var12);
        boolean var17 = var8.isEmpty();
        boolean var18 = var8.isEmpty();
        var0.add(1, (java.lang.Object) var18);
        int var20 = var0.size();
        var0.add(2, (java.lang.Object) '4');
        java.lang.Object var25 = var0.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var27 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var28 = var27.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var30 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var31 = var30.size();
        boolean var32 = var30.isEmpty();
        var27.add(0, (java.lang.Object) var30);
        int var34 = var27.size();
        int var35 = var27.size();
        var27.removeAll();
        var0.add(2, (java.lang.Object) var27);
        int var38 = var0.size();
        var0.remove(2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var25 + "' != '" + 100L + "'", var25.equals(100L));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == 4);
        
    }
    
    public void test105() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test105");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        boolean var4 = var0.isEmpty();
        int var5 = var0.size();
        boolean var6 = var0.isEmpty();
        int var7 = var0.size();
        var0.removeAll();
        boolean var9 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var13 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var14 = var13.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var17 = var16.size();
        boolean var18 = var16.isEmpty();
        var13.add(0, (java.lang.Object) var16);
        int var20 = var13.size();
        int var21 = var13.size();
        var13.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var24 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var24.removeAll();
        boolean var26 = var24.isEmpty();
        int var27 = var24.size();
        var24.removeAll();
        int var29 = var24.size();
        boolean var30 = var24.isEmpty();
        boolean var31 = var24.isEmpty();
        int var32 = var24.size();
        var13.add(0, (java.lang.Object) var24);
        var0.add(0, (java.lang.Object) var24);
        int var35 = var0.size();
        java.lang.Object var37 = var0.get(0);
        boolean var38 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertNotNull(var37);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == false);
        
    }
    
    public void test106() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test106");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        int var7 = var0.size();
        int var8 = var0.size();
        var0.remove(0);
        var0.removeAll();
        var0.removeAll();
        boolean var13 = var0.isEmpty();
        boolean var14 = var0.isEmpty();
        var0.removeAll();
        int var16 = var0.size();
        int var17 = var0.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
    }
    
    public void test107() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test107");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        boolean var10 = var0.isEmpty();
        var0.removeAll();
        boolean var12 = var0.isEmpty();
        int var13 = var0.size();
        int var14 = var0.size();
        var0.removeAll();
        int var16 = var0.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove((-1));
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
    }
    
    public void test108() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test108");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        var0.removeAll();
        int var6 = var0.size();
        var0.removeAll();
        boolean var8 = var0.isEmpty();
        boolean var9 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var11 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var12 = var11.size();
        boolean var13 = var11.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var16 = var15.size();
        boolean var17 = var15.isEmpty();
        boolean var18 = var15.isEmpty();
        boolean var19 = var15.isEmpty();
        var11.add(0, (java.lang.Object) var19);
        boolean var21 = var11.isEmpty();
        var11.removeAll();
        var11.removeAll();
        var0.add(0, (java.lang.Object) var11);
        var11.removeAll();
        var11.removeAll();
        boolean var27 = var11.isEmpty();
        int var28 = var11.size();
        int var29 = var11.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var31 = var11.get(4);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 0);
        
    }
    
    public void test109() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test109");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        var3.removeAll();
        boolean var11 = var3.isEmpty();
        int var12 = var3.size();
        boolean var13 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var16 = var15.isEmpty();
        var15.removeAll();
        var3.add(0, (java.lang.Object) var15);
        var3.removeAll();
        int var20 = var3.size();
        boolean var21 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var23 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var24 = var23.size();
        var23.add(0, (java.lang.Object) 100L);
        int var28 = var23.size();
        int var29 = var23.size();
        int var30 = var23.size();
        boolean var31 = var23.isEmpty();
        int var32 = var23.size();
        boolean var33 = var23.isEmpty();
        int var34 = var23.size();
        var3.add(0, (java.lang.Object) var23);
        boolean var36 = var23.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var38 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var39 = var38.isEmpty();
        boolean var40 = var38.isEmpty();
        var38.removeAll();
        boolean var42 = var38.isEmpty();
        var38.removeAll();
        var23.add(1, (java.lang.Object) var38);
        ar.verificacion.validacion.treelistimplementation.TreeList var46 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var47 = var46.size();
        boolean var48 = var46.isEmpty();
        boolean var49 = var46.isEmpty();
        boolean var50 = var46.isEmpty();
        var46.removeAll();
        int var52 = var46.size();
        var46.removeAll();
        int var54 = var46.size();
        boolean var55 = var46.isEmpty();
        var46.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var58 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var59 = var58.isEmpty();
        boolean var60 = var58.isEmpty();
        var58.removeAll();
        var58.add(0, (java.lang.Object) 1.0d);
        int var65 = var58.size();
        var58.removeAll();
        var58.removeAll();
        var46.add(0, (java.lang.Object) var58);
        var46.remove(0);
        boolean var71 = var46.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var23.add(3, (java.lang.Object) var46);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var48 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var49 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var50 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var52 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var54 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var55 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var59 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var60 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var65 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var71 == true);
        
    }
    
    public void test110() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test110");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        int var2 = var0.size();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        boolean var6 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var8 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var9 = var8.size();
        var8.add(0, (java.lang.Object) 100L);
        int var13 = var8.size();
        int var14 = var8.size();
        int var15 = var8.size();
        java.lang.Object var17 = var8.get(0);
        int var18 = var8.size();
        int var19 = var8.size();
        int var20 = var8.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var22 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var23 = var22.size();
        boolean var24 = var22.isEmpty();
        boolean var25 = var22.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var27 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var27.removeAll();
        boolean var29 = var27.isEmpty();
        int var30 = var27.size();
        var27.add(0, (java.lang.Object) 1L);
        ar.verificacion.validacion.treelistimplementation.TreeList var35 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var36 = var35.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var38 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var39 = var38.size();
        boolean var40 = var38.isEmpty();
        var35.add(0, (java.lang.Object) var38);
        var38.add(0, (java.lang.Object) (-1.0d));
        var38.removeAll();
        boolean var46 = var38.isEmpty();
        int var47 = var38.size();
        boolean var48 = var38.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var50 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var51 = var50.isEmpty();
        var50.removeAll();
        var38.add(0, (java.lang.Object) var50);
        var50.removeAll();
        var27.add(0, (java.lang.Object) var50);
        var22.add(0, (java.lang.Object) var27);
        java.lang.Object var58 = var27.get(1);
        var27.add(1, (java.lang.Object) 100.0f);
        java.lang.Object var63 = var27.get(1);
        var8.add(0, (java.lang.Object) var27);
        var0.add(0, (java.lang.Object) var27);
        int var66 = var0.size();
        var0.removeAll();
        boolean var68 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var17 + "' != '" + 100L + "'", var17.equals(100L));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var48 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var58 + "' != '" + 1L + "'", var58.equals(1L));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var63 + "' != '" + 100.0f + "'", var63.equals(100.0f));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var66 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var68 == true);
        
    }
    
    public void test111() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test111");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        var0.removeAll();
        int var6 = var0.size();
        var0.removeAll();
        boolean var8 = var0.isEmpty();
        boolean var9 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var11 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var12 = var11.size();
        boolean var13 = var11.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var16 = var15.size();
        boolean var17 = var15.isEmpty();
        boolean var18 = var15.isEmpty();
        boolean var19 = var15.isEmpty();
        var11.add(0, (java.lang.Object) var19);
        boolean var21 = var11.isEmpty();
        var11.removeAll();
        var11.removeAll();
        var0.add(0, (java.lang.Object) var11);
        var11.removeAll();
        var11.removeAll();
        boolean var27 = var11.isEmpty();
        int var28 = var11.size();
        var11.removeAll();
        int var30 = var11.size();
        int var31 = var11.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
    }
    
    public void test112() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test112");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        int var7 = var0.size();
        var0.add(1, (java.lang.Object) 1.0d);
        int var11 = var0.size();
        var0.remove(0);
        int var14 = var0.size();
        boolean var15 = var0.isEmpty();
        boolean var16 = var0.isEmpty();
        int var17 = var0.size();
        boolean var18 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == false);
        
    }
    
    public void test113() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test113");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        boolean var5 = var0.isEmpty();
        int var6 = var0.size();
        boolean var7 = var0.isEmpty();
        boolean var8 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove((-1));
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
    }
    
    public void test114() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test114");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        boolean var5 = var0.isEmpty();
        int var6 = var0.size();
        int var7 = var0.size();
        var0.removeAll();
        int var9 = var0.size();
        int var10 = var0.size();
        boolean var11 = var0.isEmpty();
        int var12 = var0.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove(3);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
    }
    
    public void test115() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test115");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        int var7 = var0.size();
        java.lang.Object var9 = var0.get(0);
        int var10 = var0.size();
        int var11 = var0.size();
        int var12 = var0.size();
        java.lang.Object var14 = var0.get(0);
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var17 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var18 = var17.size();
        boolean var19 = var17.isEmpty();
        boolean var20 = var17.isEmpty();
        boolean var21 = var17.isEmpty();
        boolean var22 = var17.isEmpty();
        int var23 = var17.size();
        boolean var24 = var17.isEmpty();
        int var25 = var17.size();
        var0.add(0, (java.lang.Object) var17);
        int var27 = var0.size();
        int var28 = var0.size();
        var0.removeAll();
        var0.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var32 = var0.get(100);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var9 + "' != '" + 100L + "'", var9.equals(100L));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var14 + "' != '" + 100L + "'", var14.equals(100L));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 1);
        
    }
    
    public void test116() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test116");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        var0.removeAll();
        int var8 = var0.size();
        int var9 = var0.size();
        int var10 = var0.size();
        boolean var11 = var0.isEmpty();
        int var12 = var0.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
    }
    
    public void test117() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test117");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        boolean var10 = var0.isEmpty();
        boolean var11 = var0.isEmpty();
        boolean var12 = var0.isEmpty();
        java.lang.Object var14 = var0.get(0);
        boolean var15 = var0.isEmpty();
        int var16 = var0.size();
        boolean var17 = var0.isEmpty();
        java.lang.Object var19 = var0.get(0);
        int var20 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var22 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var22.removeAll();
        boolean var24 = var22.isEmpty();
        int var25 = var22.size();
        var22.removeAll();
        boolean var27 = var22.isEmpty();
        boolean var28 = var22.isEmpty();
        boolean var29 = var22.isEmpty();
        var22.removeAll();
        boolean var31 = var22.isEmpty();
        int var32 = var22.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(5, (java.lang.Object) var22);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var14 + "' != '" + true + "'", var14.equals(true));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var19 + "' != '" + true + "'", var19.equals(true));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == 0);
        
    }
    
    public void test118() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test118");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.add(0, (java.lang.Object) 1L);
        ar.verificacion.validacion.treelistimplementation.TreeList var8 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var9 = var8.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var11 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var12 = var11.size();
        boolean var13 = var11.isEmpty();
        var8.add(0, (java.lang.Object) var11);
        var11.add(0, (java.lang.Object) (-1.0d));
        var11.removeAll();
        boolean var19 = var11.isEmpty();
        int var20 = var11.size();
        boolean var21 = var11.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var23 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var24 = var23.isEmpty();
        var23.removeAll();
        var11.add(0, (java.lang.Object) var23);
        var23.removeAll();
        var0.add(0, (java.lang.Object) var23);
        ar.verificacion.validacion.treelistimplementation.TreeList var30 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var31 = var30.size();
        var30.removeAll();
        int var33 = var30.size();
        var30.removeAll();
        boolean var35 = var30.isEmpty();
        var30.removeAll();
        var30.removeAll();
        boolean var38 = var30.isEmpty();
        boolean var39 = var30.isEmpty();
        var0.add(1, (java.lang.Object) var30);
        int var41 = var0.size();
        int var42 = var0.size();
        var0.remove(2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == 3);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == 3);
        
    }
    
    public void test119() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test119");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        var0.add(0, (java.lang.Object) 0L);
        int var9 = var0.size();
        var0.removeAll();
        var0.removeAll();
        boolean var12 = var0.isEmpty();
        var0.removeAll();
        int var14 = var0.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var16 = var0.get(1);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
    }
    
    public void test120() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test120");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        boolean var10 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var12.removeAll();
        boolean var14 = var12.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var17 = var16.size();
        var16.removeAll();
        var16.removeAll();
        var12.add(0, (java.lang.Object) var16);
        var16.removeAll();
        var3.add(0, (java.lang.Object) var16);
        java.lang.Object var24 = var3.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var26 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var27 = var26.size();
        var26.removeAll();
        int var29 = var26.size();
        var26.removeAll();
        var3.add(2, (java.lang.Object) var26);
        int var32 = var3.size();
        var3.remove(0);
        boolean var35 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var37 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var38 = var37.isEmpty();
        var37.removeAll();
        int var40 = var37.size();
        var37.removeAll();
        var37.add(0, (java.lang.Object) (byte) 1);
        java.lang.Object var46 = var37.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var48 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var49 = var48.size();
        boolean var50 = var48.isEmpty();
        boolean var51 = var48.isEmpty();
        var48.removeAll();
        var48.removeAll();
        var48.removeAll();
        boolean var55 = var48.isEmpty();
        var37.add(1, (java.lang.Object) var48);
        var48.removeAll();
        var48.removeAll();
        boolean var59 = var48.isEmpty();
        int var60 = var48.size();
        var3.add(0, (java.lang.Object) var48);
        boolean var62 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var64 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var65 = var64.isEmpty();
        boolean var66 = var64.isEmpty();
        var64.removeAll();
        var64.removeAll();
        int var69 = var64.size();
        var64.removeAll();
        boolean var71 = var64.isEmpty();
        int var72 = var64.size();
        var3.add(2, (java.lang.Object) var72);
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var3.remove(10);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertNotNull(var24);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == 3);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var46 + "' != '" + (byte) 1 + "'",
                var46.equals((byte) 1));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var49 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var50 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var55 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var59 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var60 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var62 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var65 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var66 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var69 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var71 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var72 == 0);
        
    }
    
    public void test121() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test121");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        boolean var4 = var0.isEmpty();
        boolean var5 = var0.isEmpty();
        var0.removeAll();
        boolean var7 = var0.isEmpty();
        boolean var8 = var0.isEmpty();
        int var9 = var0.size();
        int var10 = var0.size();
        var0.removeAll();
        int var12 = var0.size();
        var0.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var15 = var0.get(100);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
    }
    
    public void test122() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test122");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        int var7 = var0.size();
        boolean var8 = var0.isEmpty();
        int var9 = var0.size();
        boolean var10 = var0.isEmpty();
        boolean var11 = var0.isEmpty();
        boolean var12 = var0.isEmpty();
        boolean var13 = var0.isEmpty();
        var0.removeAll();
        int var15 = var0.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var17 = var0.get((-1));
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
    }
    
    public void test123() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test123");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        var0.add(0, (java.lang.Object) 100L);
        int var8 = var0.size();
        var0.removeAll();
        int var10 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var13 = var12.size();
        var12.removeAll();
        int var15 = var12.size();
        boolean var16 = var12.isEmpty();
        int var17 = var12.size();
        boolean var18 = var12.isEmpty();
        var0.add(0, (java.lang.Object) var12);
        var0.removeAll();
        boolean var21 = var0.isEmpty();
        int var22 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var25 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var25.removeAll();
        boolean var27 = var25.isEmpty();
        int var28 = var25.size();
        var25.removeAll();
        int var30 = var25.size();
        boolean var31 = var25.isEmpty();
        boolean var32 = var25.isEmpty();
        int var33 = var25.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var35 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var36 = var35.size();
        boolean var37 = var35.isEmpty();
        boolean var38 = var35.isEmpty();
        boolean var39 = var35.isEmpty();
        var35.removeAll();
        int var41 = var35.size();
        boolean var42 = var35.isEmpty();
        int var43 = var35.size();
        var35.removeAll();
        var25.add(0, (java.lang.Object) var35);
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(10, (java.lang.Object) 0);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == 0);
        
    }
    
    public void test124() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test124");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        int var2 = var0.size();
        var0.removeAll();
        boolean var4 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
    }
    
    public void test125() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test125");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        boolean var10 = var0.isEmpty();
        var0.removeAll();
        boolean var12 = var0.isEmpty();
        int var13 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var16.removeAll();
        boolean var18 = var16.isEmpty();
        int var19 = var16.size();
        boolean var20 = var16.isEmpty();
        boolean var21 = var16.isEmpty();
        int var22 = var16.size();
        int var23 = var16.size();
        int var24 = var16.size();
        boolean var25 = var16.isEmpty();
        int var26 = var16.size();
        var0.add(0, (java.lang.Object) var16);
        int var28 = var0.size();
        boolean var29 = var0.isEmpty();
        int var30 = var0.size();
        boolean var31 = var0.isEmpty();
        var0.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var34 = var0.get(3);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == false);
        
    }
    
    public void test126() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test126");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        var3.removeAll();
        boolean var11 = var3.isEmpty();
        int var12 = var3.size();
        var3.removeAll();
        var3.removeAll();
        int var15 = var3.size();
        boolean var16 = var3.isEmpty();
        int var17 = var3.size();
        boolean var18 = var3.isEmpty();
        int var19 = var3.size();
        var3.removeAll();
        var3.removeAll();
        var3.removeAll();
        boolean var23 = var3.isEmpty();
        int var24 = var3.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
    }
    
    public void test127() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test127");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.removeAll();
        int var3 = var0.size();
        boolean var4 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        int var7 = var0.size();
        int var8 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var10 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var11 = var10.isEmpty();
        var10.removeAll();
        int var13 = var10.size();
        var10.removeAll();
        var10.add(0, (java.lang.Object) (byte) 1);
        boolean var18 = var10.isEmpty();
        boolean var19 = var10.isEmpty();
        var0.add(0, (java.lang.Object) var19);
        var0.removeAll();
        int var22 = var0.size();
        boolean var23 = var0.isEmpty();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
    }
    
    public void test128() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test128");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        int var10 = var0.size();
        int var11 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var13 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var14 = var13.size();
        boolean var15 = var13.isEmpty();
        boolean var16 = var13.isEmpty();
        boolean var17 = var13.isEmpty();
        boolean var18 = var13.isEmpty();
        var13.removeAll();
        var13.removeAll();
        var13.removeAll();
        int var22 = var13.size();
        int var23 = var13.size();
        int var24 = var13.size();
        boolean var25 = var13.isEmpty();
        var0.add(1, (java.lang.Object) var13);
        int var27 = var0.size();
        boolean var28 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == false);
        
    }
    
    public void test129() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test129");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        boolean var5 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var7 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var8 = var7.size();
        boolean var9 = var7.isEmpty();
        boolean var10 = var7.isEmpty();
        var7.removeAll();
        var0.add(0, (java.lang.Object) var7);
        int var13 = var0.size();
        var0.removeAll();
        var0.removeAll();
        int var16 = var0.size();
        int var17 = var0.size();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
    }
    
    public void test130() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test130");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        boolean var10 = var0.isEmpty();
        var0.removeAll();
        boolean var12 = var0.isEmpty();
        boolean var13 = var0.isEmpty();
        var0.removeAll();
        int var15 = var0.size();
        int var16 = var0.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
    }
    
    public void test131() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test131");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        boolean var4 = var0.isEmpty();
        int var5 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var8 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var9 = var8.size();
        boolean var10 = var8.isEmpty();
        boolean var11 = var8.isEmpty();
        boolean var12 = var8.isEmpty();
        boolean var13 = var8.isEmpty();
        int var14 = var8.size();
        boolean var15 = var8.isEmpty();
        int var16 = var8.size();
        boolean var17 = var8.isEmpty();
        var8.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(100, (java.lang.Object) var8);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
    }
    
    public void test132() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test132");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        var0.removeAll();
        int var6 = var0.size();
        var0.removeAll();
        var0.removeAll();
        int var9 = var0.size();
        int var10 = var0.size();
        boolean var11 = var0.isEmpty();
        boolean var12 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
    }
    
    public void test133() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test133");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        int var4 = var0.size();
        boolean var5 = var0.isEmpty();
        boolean var6 = var0.isEmpty();
        int var7 = var0.size();
        int var8 = var0.size();
        var0.removeAll();
        int var10 = var0.size();
        int var11 = var0.size();
        int var12 = var0.size();
        int var13 = var0.size();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
    }
    
    public void test134() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test134");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        var3.add(0, (java.lang.Object) 100L);
        int var8 = var3.size();
        boolean var9 = var3.isEmpty();
        boolean var10 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var10);
        ar.verificacion.validacion.treelistimplementation.TreeList var13 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var14 = var13.size();
        var13.add(0, (java.lang.Object) 100L);
        int var18 = var13.size();
        int var19 = var13.size();
        int var20 = var13.size();
        var13.removeAll();
        boolean var22 = var13.isEmpty();
        boolean var23 = var13.isEmpty();
        var0.add(1, (java.lang.Object) var23);
        var0.add(0, (java.lang.Object) 'a');
        int var28 = var0.size();
        var0.remove(2);
        boolean var31 = var0.isEmpty();
        java.lang.Object var33 = var0.get(0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 3);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var33 + "' != '" + 'a' + "'", var33.equals('a'));
        
    }
    
    public void test135() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test135");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        int var7 = var0.size();
        var0.removeAll();
        boolean var9 = var0.isEmpty();
        boolean var10 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var13 = var12.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var16 = var15.size();
        boolean var17 = var15.isEmpty();
        var12.add(0, (java.lang.Object) var15);
        var12.remove(0);
        int var21 = var12.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(5, (java.lang.Object) var12);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 0);
        
    }
    
    public void test136() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test136");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        var0.removeAll();
        int var6 = var0.size();
        boolean var7 = var0.isEmpty();
        boolean var8 = var0.isEmpty();
        boolean var9 = var0.isEmpty();
        int var10 = var0.size();
        boolean var11 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var17 = var0.get(100);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
    }
    
    public void test137() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test137");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        boolean var4 = var0.isEmpty();
        int var5 = var0.size();
        boolean var6 = var0.isEmpty();
        int var7 = var0.size();
        var0.removeAll();
        boolean var9 = var0.isEmpty();
        int var10 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var13 = var12.size();
        boolean var14 = var12.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var17 = var16.size();
        boolean var18 = var16.isEmpty();
        boolean var19 = var16.isEmpty();
        boolean var20 = var16.isEmpty();
        var12.add(0, (java.lang.Object) var20);
        int var22 = var12.size();
        int var23 = var12.size();
        boolean var24 = var12.isEmpty();
        int var25 = var12.size();
        boolean var26 = var12.isEmpty();
        var12.removeAll();
        var0.add(0, (java.lang.Object) var12);
        int var29 = var12.size();
        var12.removeAll();
        var12.removeAll();
        boolean var32 = var12.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == true);
        
    }
    
    public void test138() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test138");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        var3.removeAll();
        boolean var11 = var3.isEmpty();
        int var12 = var3.size();
        boolean var13 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var16 = var15.isEmpty();
        var15.removeAll();
        var3.add(0, (java.lang.Object) var15);
        var3.removeAll();
        int var20 = var3.size();
        boolean var21 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var23 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var24 = var23.size();
        var23.add(0, (java.lang.Object) 100L);
        int var28 = var23.size();
        int var29 = var23.size();
        int var30 = var23.size();
        boolean var31 = var23.isEmpty();
        int var32 = var23.size();
        boolean var33 = var23.isEmpty();
        int var34 = var23.size();
        var3.add(0, (java.lang.Object) var23);
        boolean var36 = var23.isEmpty();
        int var37 = var23.size();
        int var38 = var23.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == 1);
        
    }
    
    public void test139() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test139");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.add(0, (java.lang.Object) 1L);
        ar.verificacion.validacion.treelistimplementation.TreeList var8 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var9 = var8.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var11 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var12 = var11.size();
        boolean var13 = var11.isEmpty();
        var8.add(0, (java.lang.Object) var11);
        var11.add(0, (java.lang.Object) (-1.0d));
        var11.removeAll();
        boolean var19 = var11.isEmpty();
        int var20 = var11.size();
        boolean var21 = var11.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var23 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var24 = var23.isEmpty();
        var23.removeAll();
        var11.add(0, (java.lang.Object) var23);
        var23.removeAll();
        var0.add(0, (java.lang.Object) var23);
        var0.remove(1);
        boolean var31 = var0.isEmpty();
        var0.removeAll();
        int var33 = var0.size();
        boolean var34 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove(5);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == true);
        
    }
    
    public void test140() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test140");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        int var2 = var0.size();
        boolean var3 = var0.isEmpty();
        var0.removeAll();
        int var5 = var0.size();
        int var6 = var0.size();
        int var7 = var0.size();
        boolean var8 = var0.isEmpty();
        int var9 = var0.size();
        int var10 = var0.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var12 = var0.get(1);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
    }
    
    public void test141() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test141");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        var3.removeAll();
        boolean var11 = var3.isEmpty();
        boolean var12 = var3.isEmpty();
        boolean var13 = var3.isEmpty();
        boolean var14 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var17 = var16.isEmpty();
        boolean var18 = var16.isEmpty();
        var16.removeAll();
        var16.add(0, (java.lang.Object) 1.0d);
        int var23 = var16.size();
        var16.removeAll();
        var16.removeAll();
        boolean var26 = var16.isEmpty();
        int var27 = var16.size();
        int var28 = var16.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var3.add(2, (java.lang.Object) var28);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 0);
        
    }
    
    public void test142() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test142");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        var0.add(0, (java.lang.Object) (byte) 1);
        java.lang.Object var9 = var0.get(0);
        int var10 = var0.size();
        int var11 = var0.size();
        int var12 = var0.size();
        java.lang.Object var14 = var0.get(0);
        boolean var15 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var17 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var18 = var17.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var20 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var21 = var20.size();
        var20.add(0, (java.lang.Object) 100L);
        int var25 = var20.size();
        boolean var26 = var20.isEmpty();
        boolean var27 = var20.isEmpty();
        var17.add(0, (java.lang.Object) var27);
        ar.verificacion.validacion.treelistimplementation.TreeList var30 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var31 = var30.size();
        var30.add(0, (java.lang.Object) 100L);
        int var35 = var30.size();
        int var36 = var30.size();
        int var37 = var30.size();
        var30.removeAll();
        boolean var39 = var30.isEmpty();
        boolean var40 = var30.isEmpty();
        var17.add(1, (java.lang.Object) var40);
        var17.removeAll();
        var17.removeAll();
        boolean var44 = var17.isEmpty();
        var0.add(1, (java.lang.Object) var17);
        boolean var46 = var17.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var48 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var49 = var48.size();
        var48.removeAll();
        int var51 = var48.size();
        var48.removeAll();
        var48.add(0, (java.lang.Object) 100L);
        int var56 = var48.size();
        var48.removeAll();
        boolean var58 = var48.isEmpty();
        boolean var59 = var48.isEmpty();
        var48.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var17.add(3, (java.lang.Object) var48);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var9 + "' != '" + (byte) 1 + "'",
                var9.equals((byte) 1));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var14 + "' != '" + (byte) 1 + "'",
                var14.equals((byte) 1));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var44 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var49 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var56 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var58 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var59 == true);
        
    }
    
    public void test143() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test143");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        boolean var4 = var0.isEmpty();
        boolean var5 = var0.isEmpty();
        int var6 = var0.size();
        int var7 = var0.size();
        int var8 = var0.size();
        boolean var9 = var0.isEmpty();
        int var10 = var0.size();
        int var11 = var0.size();
        int var12 = var0.size();
        boolean var13 = var0.isEmpty();
        int var14 = var0.size();
        int var15 = var0.size();
        boolean var16 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
    }
    
    public void test144() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test144");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        var4.removeAll();
        var4.removeAll();
        var0.add(0, (java.lang.Object) var4);
        boolean var9 = var4.isEmpty();
        boolean var10 = var4.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var13 = var12.size();
        boolean var14 = var12.isEmpty();
        boolean var15 = var12.isEmpty();
        boolean var16 = var12.isEmpty();
        var12.removeAll();
        int var18 = var12.size();
        var12.removeAll();
        boolean var20 = var12.isEmpty();
        boolean var21 = var12.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var23 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var24 = var23.size();
        boolean var25 = var23.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var27 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var28 = var27.size();
        boolean var29 = var27.isEmpty();
        boolean var30 = var27.isEmpty();
        boolean var31 = var27.isEmpty();
        var23.add(0, (java.lang.Object) var31);
        boolean var33 = var23.isEmpty();
        var23.removeAll();
        var23.removeAll();
        var12.add(0, (java.lang.Object) var23);
        int var37 = var23.size();
        int var38 = var23.size();
        var4.add(0, (java.lang.Object) var23);
        int var40 = var4.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var4.remove(5);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == 1);
        
    }
    
    public void test145() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test145");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        boolean var6 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var8 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var8.removeAll();
        boolean var10 = var8.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var13 = var12.size();
        var12.removeAll();
        var12.removeAll();
        var8.add(0, (java.lang.Object) var12);
        boolean var17 = var8.isEmpty();
        boolean var18 = var8.isEmpty();
        var0.add(1, (java.lang.Object) var18);
        int var20 = var0.size();
        var0.add(2, (java.lang.Object) '4');
        java.lang.Object var25 = var0.get(2);
        var0.remove(2);
        var0.remove(1);
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var32 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var32.removeAll();
        boolean var34 = var32.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var36 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var37 = var36.size();
        var36.removeAll();
        var36.removeAll();
        var32.add(0, (java.lang.Object) var36);
        var36.removeAll();
        var36.removeAll();
        boolean var43 = var36.isEmpty();
        var36.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var46 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var47 = var46.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var49 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var50 = var49.size();
        boolean var51 = var49.isEmpty();
        var46.add(0, (java.lang.Object) var49);
        var49.add(0, (java.lang.Object) (-1.0d));
        var49.removeAll();
        var49.removeAll();
        var36.add(0, (java.lang.Object) var49);
        boolean var59 = var49.isEmpty();
        var0.add(0, (java.lang.Object) var49);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var25 + "' != '" + '4' + "'", var25.equals('4'));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var50 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var59 == true);
        
    }
    
    public void test146() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test146");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        var3.add(0, (java.lang.Object) 100L);
        int var8 = var3.size();
        boolean var9 = var3.isEmpty();
        boolean var10 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var10);
        ar.verificacion.validacion.treelistimplementation.TreeList var13 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var14 = var13.size();
        var13.add(0, (java.lang.Object) 100L);
        int var18 = var13.size();
        int var19 = var13.size();
        int var20 = var13.size();
        var13.removeAll();
        boolean var22 = var13.isEmpty();
        boolean var23 = var13.isEmpty();
        var0.add(1, (java.lang.Object) var23);
        var0.add(0, (java.lang.Object) 'a');
        int var28 = var0.size();
        boolean var29 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var31 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var32 = var31.isEmpty();
        boolean var33 = var31.isEmpty();
        var31.removeAll();
        var31.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var37 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var38 = var37.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var40 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var41 = var40.size();
        boolean var42 = var40.isEmpty();
        var37.add(0, (java.lang.Object) var40);
        var40.add(0, (java.lang.Object) (-1.0d));
        boolean var47 = var40.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var49 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var49.removeAll();
        boolean var51 = var49.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var53 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var54 = var53.size();
        var53.removeAll();
        var53.removeAll();
        var49.add(0, (java.lang.Object) var53);
        var53.removeAll();
        var40.add(0, (java.lang.Object) var53);
        ar.verificacion.validacion.treelistimplementation.TreeList var61 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var62 = var61.size();
        boolean var63 = var61.isEmpty();
        var61.removeAll();
        int var65 = var61.size();
        boolean var66 = var61.isEmpty();
        var53.add(0, (java.lang.Object) var61);
        int var68 = var53.size();
        var31.add(0, (java.lang.Object) var53);
        java.lang.Object var71 = var53.get(0);
        var53.removeAll();
        var53.removeAll();
        var53.removeAll();
        var53.removeAll();
        var0.add(2, (java.lang.Object) var53);
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove((-1));
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 3);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var54 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var62 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var63 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var65 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var66 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var68 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertNotNull(var71);
        
    }
    
    public void test147() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test147");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        boolean var10 = var0.isEmpty();
        boolean var11 = var0.isEmpty();
        int var12 = var0.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
    }
    
    public void test148() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test148");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        var0.add(0, (java.lang.Object) (byte) 1);
        boolean var8 = var0.isEmpty();
        int var9 = var0.size();
        var0.removeAll();
        boolean var11 = var0.isEmpty();
        var0.removeAll();
        int var13 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var16.removeAll();
        boolean var18 = var16.isEmpty();
        int var19 = var16.size();
        var16.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var22 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var23 = var22.size();
        boolean var24 = var22.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var26 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var27 = var26.size();
        boolean var28 = var26.isEmpty();
        boolean var29 = var26.isEmpty();
        boolean var30 = var26.isEmpty();
        var22.add(0, (java.lang.Object) var30);
        var16.add(0, (java.lang.Object) var22);
        ar.verificacion.validacion.treelistimplementation.TreeList var34 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var35 = var34.size();
        var34.add(0, (java.lang.Object) 100L);
        int var39 = var34.size();
        boolean var40 = var34.isEmpty();
        boolean var41 = var34.isEmpty();
        var34.remove(0);
        var34.removeAll();
        var22.add(1, (java.lang.Object) var34);
        boolean var46 = var22.isEmpty();
        var22.remove(0);
        int var49 = var22.size();
        var22.removeAll();
        int var51 = var22.size();
        var22.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(5, (java.lang.Object) var22);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var49 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == 0);
        
    }
    
    public void test149() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test149");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        var3.add(0, (java.lang.Object) 100L);
        int var8 = var3.size();
        boolean var9 = var3.isEmpty();
        boolean var10 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var10);
        ar.verificacion.validacion.treelistimplementation.TreeList var13 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var14 = var13.size();
        var13.add(0, (java.lang.Object) 100L);
        int var18 = var13.size();
        int var19 = var13.size();
        int var20 = var13.size();
        var13.removeAll();
        boolean var22 = var13.isEmpty();
        boolean var23 = var13.isEmpty();
        var0.add(1, (java.lang.Object) var23);
        var0.add(0, (java.lang.Object) 'a');
        int var28 = var0.size();
        var0.remove(2);
        ar.verificacion.validacion.treelistimplementation.TreeList var32 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var33 = var32.size();
        var32.add(0, (java.lang.Object) 100L);
        int var37 = var32.size();
        boolean var38 = var32.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var40 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var41 = var40.size();
        boolean var42 = var40.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var44 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var45 = var44.size();
        boolean var46 = var44.isEmpty();
        boolean var47 = var44.isEmpty();
        boolean var48 = var44.isEmpty();
        var40.add(0, (java.lang.Object) var48);
        boolean var50 = var40.isEmpty();
        var40.removeAll();
        boolean var52 = var40.isEmpty();
        var32.add(1, (java.lang.Object) var40);
        var32.removeAll();
        var0.add(2, (java.lang.Object) var32);
        ar.verificacion.validacion.treelistimplementation.TreeList var57 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var58 = var57.size();
        var57.removeAll();
        int var60 = var57.size();
        var57.removeAll();
        var57.add(0, (java.lang.Object) 100L);
        var57.removeAll();
        var0.add(2, (java.lang.Object) var57);
        java.lang.Object var68 = var0.get(2);
        var0.removeAll();
        boolean var70 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var72 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var73 = var72.isEmpty();
        var72.removeAll();
        boolean var75 = var72.isEmpty();
        boolean var76 = var72.isEmpty();
        var72.removeAll();
        int var78 = var72.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(10, (java.lang.Object) var78);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 3);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var45 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var48 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var50 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var52 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var58 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var60 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertNotNull(var68);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var70 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var73 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var75 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var76 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var78 == 0);
        
    }
    
    public void test150() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test150");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        boolean var6 = var0.isEmpty();
        boolean var7 = var0.isEmpty();
        var0.removeAll();
        int var9 = var0.size();
        boolean var10 = var0.isEmpty();
        int var11 = var0.size();
        int var12 = var0.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove(2);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
    }
    
    public void test151() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test151");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        int var7 = var0.size();
        int var8 = var0.size();
        var0.remove(0);
        int var11 = var0.size();
        boolean var12 = var0.isEmpty();
        var0.removeAll();
        boolean var14 = var0.isEmpty();
        int var15 = var0.size();
        boolean var16 = var0.isEmpty();
        int var17 = var0.size();
        boolean var18 = var0.isEmpty();
        var0.removeAll();
        boolean var20 = var0.isEmpty();
        var0.removeAll();
        boolean var22 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove((-1));
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
    }
    
    public void test152() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test152");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        var0.add(0, (java.lang.Object) 1.0d);
        java.lang.Object var8 = var0.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var10 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var11 = var10.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var13 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var14 = var13.size();
        boolean var15 = var13.isEmpty();
        var10.add(0, (java.lang.Object) var13);
        var13.add(0, (java.lang.Object) (-1.0d));
        var13.removeAll();
        boolean var21 = var13.isEmpty();
        int var22 = var13.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var24 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var25 = var24.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var27 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var28 = var27.size();
        boolean var29 = var27.isEmpty();
        var24.add(0, (java.lang.Object) var27);
        int var31 = var27.size();
        boolean var32 = var27.isEmpty();
        var27.removeAll();
        var27.removeAll();
        var13.add(0, (java.lang.Object) var27);
        var27.removeAll();
        boolean var37 = var27.isEmpty();
        var0.add(1, (java.lang.Object) var27);
        java.lang.Object var40 = var0.get(0);
        boolean var41 = var0.isEmpty();
        var0.removeAll();
        boolean var43 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var45 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var46 = var45.size();
        boolean var47 = var45.isEmpty();
        var45.removeAll();
        var45.removeAll();
        var45.removeAll();
        boolean var51 = var45.isEmpty();
        boolean var52 = var45.isEmpty();
        boolean var53 = var45.isEmpty();
        var45.removeAll();
        var0.add(0, (java.lang.Object) var45);
        boolean var56 = var45.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var8 + "' != '" + 1.0d + "'", var8.equals(1.0d));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var40 + "' != '" + 1.0d + "'", var40.equals(1.0d));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var52 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var53 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var56 == true);
        
    }
    
    public void test153() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test153");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        var3.removeAll();
        boolean var11 = var3.isEmpty();
        var3.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var14 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var15 = var14.size();
        var14.add(0, (java.lang.Object) 100L);
        int var19 = var14.size();
        boolean var20 = var14.isEmpty();
        boolean var21 = var14.isEmpty();
        var3.add(0, (java.lang.Object) var21);
        boolean var23 = var3.isEmpty();
        var3.removeAll();
        var3.removeAll();
        boolean var26 = var3.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var3.remove(10);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
    }
    
    public void test154() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test154");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        var3.removeAll();
        boolean var11 = var3.isEmpty();
        int var12 = var3.size();
        boolean var13 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var15.removeAll();
        boolean var17 = var15.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var19 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var20 = var19.size();
        var19.removeAll();
        var19.removeAll();
        var15.add(0, (java.lang.Object) var19);
        var3.add(0, (java.lang.Object) var19);
        int var25 = var3.size();
        int var26 = var3.size();
        boolean var27 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var29 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var30 = var29.size();
        var29.add(0, (java.lang.Object) 100L);
        int var34 = var29.size();
        int var35 = var29.size();
        int var36 = var29.size();
        boolean var37 = var29.isEmpty();
        int var38 = var29.size();
        var29.removeAll();
        boolean var40 = var29.isEmpty();
        boolean var41 = var29.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var43 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var44 = var43.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var46 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var47 = var46.size();
        boolean var48 = var46.isEmpty();
        var43.add(0, (java.lang.Object) var46);
        int var50 = var43.size();
        int var51 = var43.size();
        var43.removeAll();
        var29.add(0, (java.lang.Object) var43);
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var3.add((-1), (java.lang.Object) 0);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var44 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var48 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var50 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == 1);
        
    }
    
    public void test155() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test155");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        int var7 = var0.size();
        var0.add(1, (java.lang.Object) 1.0d);
        int var11 = var0.size();
        var0.remove(0);
        int var14 = var0.size();
        boolean var15 = var0.isEmpty();
        int var16 = var0.size();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 1);
        
    }
    
    public void test156() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test156");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        var0.add(0, (java.lang.Object) 1.0d);
        int var7 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var10 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var11 = var10.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var13 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var14 = var13.size();
        boolean var15 = var13.isEmpty();
        var10.add(0, (java.lang.Object) var13);
        var13.add(0, (java.lang.Object) (-1.0d));
        boolean var20 = var13.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var22 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var22.removeAll();
        boolean var24 = var22.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var26 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var27 = var26.size();
        var26.removeAll();
        var26.removeAll();
        var22.add(0, (java.lang.Object) var26);
        var26.removeAll();
        var13.add(0, (java.lang.Object) var26);
        ar.verificacion.validacion.treelistimplementation.TreeList var34 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var35 = var34.size();
        boolean var36 = var34.isEmpty();
        var34.removeAll();
        int var38 = var34.size();
        boolean var39 = var34.isEmpty();
        var26.add(0, (java.lang.Object) var34);
        boolean var41 = var34.isEmpty();
        var0.add(0, (java.lang.Object) var34);
        int var43 = var0.size();
        boolean var44 = var0.isEmpty();
        var0.removeAll();
        boolean var46 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var48 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var49 = var48.size();
        var48.add(0, (java.lang.Object) 100L);
        boolean var53 = var48.isEmpty();
        boolean var54 = var48.isEmpty();
        int var55 = var48.size();
        var48.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(1, (java.lang.Object) var48);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var44 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var49 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var53 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var54 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var55 == 1);
        
    }
    
    public void test157() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test157");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.removeAll();
        int var3 = var0.size();
        int var4 = var0.size();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        boolean var8 = var0.isEmpty();
        int var9 = var0.size();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
    }
    
    public void test158() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test158");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        var3.removeAll();
        boolean var11 = var3.isEmpty();
        int var12 = var3.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var14 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var15 = var14.size();
        boolean var16 = var14.isEmpty();
        boolean var17 = var14.isEmpty();
        var14.removeAll();
        var14.removeAll();
        int var20 = var14.size();
        int var21 = var14.size();
        var3.add(0, (java.lang.Object) var14);
        boolean var23 = var3.isEmpty();
        int var24 = var3.size();
        var3.removeAll();
        boolean var26 = var3.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
    }
    
    public void test159() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test159");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        boolean var10 = var0.isEmpty();
        int var11 = var0.size();
        int var12 = var0.size();
        int var13 = var0.size();
        int var14 = var0.size();
        int var15 = var0.size();
        boolean var16 = var0.isEmpty();
        boolean var17 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove(1);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == false);
        
    }
    
    public void test160() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test160");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        boolean var5 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        boolean var8 = var0.isEmpty();
        int var9 = var0.size();
        var0.removeAll();
        int var11 = var0.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove(2);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
    }
    
    public void test161() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test161");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        int var2 = var0.size();
        var0.removeAll();
        int var4 = var0.size();
        int var5 = var0.size();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
    }
    
    public void test162() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test162");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        int var7 = var3.size();
        boolean var8 = var3.isEmpty();
        var3.removeAll();
        var3.removeAll();
        var3.removeAll();
        var3.removeAll();
        int var13 = var3.size();
        var3.removeAll();
        var3.removeAll();
        int var16 = var3.size();
        int var17 = var3.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var19 = var3.get(3);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
    }
    
    public void test163() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test163");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        int var10 = var0.size();
        int var11 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var13 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var14 = var13.size();
        boolean var15 = var13.isEmpty();
        boolean var16 = var13.isEmpty();
        boolean var17 = var13.isEmpty();
        boolean var18 = var13.isEmpty();
        var13.removeAll();
        var13.removeAll();
        var13.removeAll();
        int var22 = var13.size();
        int var23 = var13.size();
        int var24 = var13.size();
        boolean var25 = var13.isEmpty();
        var0.add(1, (java.lang.Object) var13);
        var0.removeAll();
        var0.removeAll();
        int var29 = var0.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var31 = var0.get(1);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 0);
        
    }
    
    public void test164() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test164");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        boolean var6 = var0.isEmpty();
        int var7 = var0.size();
        int var8 = var0.size();
        int var9 = var0.size();
        boolean var10 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
    }
    
    public void test165() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test165");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        int var5 = var0.size();
        var0.removeAll();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var9 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var10 = var9.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var13 = var12.size();
        boolean var14 = var12.isEmpty();
        var9.add(0, (java.lang.Object) var12);
        int var16 = var9.size();
        int var17 = var9.size();
        var9.removeAll();
        boolean var19 = var9.isEmpty();
        var9.removeAll();
        var0.add(0, (java.lang.Object) var9);
        int var22 = var0.size();
        boolean var23 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var25 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var25.removeAll();
        int var27 = var25.size();
        var25.removeAll();
        var25.removeAll();
        var25.removeAll();
        boolean var31 = var25.isEmpty();
        var25.removeAll();
        var25.removeAll();
        boolean var34 = var25.isEmpty();
        boolean var35 = var25.isEmpty();
        var0.add(1, (java.lang.Object) var35);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == true);
        
    }
    
    public void test166() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test166");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        boolean var10 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var12.removeAll();
        boolean var14 = var12.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var17 = var16.size();
        var16.removeAll();
        var16.removeAll();
        var12.add(0, (java.lang.Object) var16);
        var16.removeAll();
        var3.add(0, (java.lang.Object) var16);
        java.lang.Object var24 = var3.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var26 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var27 = var26.size();
        var26.removeAll();
        int var29 = var26.size();
        var26.removeAll();
        var3.add(2, (java.lang.Object) var26);
        int var32 = var3.size();
        var3.removeAll();
        boolean var34 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var36 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var37 = var36.size();
        boolean var38 = var36.isEmpty();
        var36.removeAll();
        var36.removeAll();
        var36.removeAll();
        int var42 = var36.size();
        boolean var43 = var36.isEmpty();
        var36.removeAll();
        var36.removeAll();
        int var46 = var36.size();
        boolean var47 = var36.isEmpty();
        var36.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var3.add(3, (java.lang.Object) var36);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertNotNull(var24);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == 3);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == true);
        
    }
    
    public void test167() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test167");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        boolean var4 = var0.isEmpty();
        int var5 = var0.size();
        boolean var6 = var0.isEmpty();
        int var7 = var0.size();
        var0.removeAll();
        boolean var9 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var13 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var14 = var13.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var17 = var16.size();
        boolean var18 = var16.isEmpty();
        var13.add(0, (java.lang.Object) var16);
        int var20 = var13.size();
        int var21 = var13.size();
        var13.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var24 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var24.removeAll();
        boolean var26 = var24.isEmpty();
        int var27 = var24.size();
        var24.removeAll();
        int var29 = var24.size();
        boolean var30 = var24.isEmpty();
        boolean var31 = var24.isEmpty();
        int var32 = var24.size();
        var13.add(0, (java.lang.Object) var24);
        var0.add(0, (java.lang.Object) var24);
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == 0);
        
    }
    
    public void test168() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test168");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        var0.remove(0);
        boolean var8 = var0.isEmpty();
        int var9 = var0.size();
        int var10 = var0.size();
        var0.removeAll();
        int var12 = var0.size();
        var0.removeAll();
        boolean var14 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
    }
    
    public void test169() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test169");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        var0.add(0, (java.lang.Object) (byte) 1);
        java.lang.Object var9 = var0.get(0);
        int var10 = var0.size();
        int var11 = var0.size();
        int var12 = var0.size();
        java.lang.Object var14 = var0.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var17 = var16.size();
        boolean var18 = var16.isEmpty();
        boolean var19 = var16.isEmpty();
        var16.removeAll();
        var16.removeAll();
        var0.add(1, (java.lang.Object) var16);
        boolean var23 = var0.isEmpty();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var26 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var27 = var26.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var29 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var30 = var29.size();
        boolean var31 = var29.isEmpty();
        var26.add(0, (java.lang.Object) var29);
        var29.add(0, (java.lang.Object) (-1.0d));
        boolean var36 = var29.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var38 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var38.removeAll();
        boolean var40 = var38.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var42 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var43 = var42.size();
        var42.removeAll();
        var42.removeAll();
        var38.add(0, (java.lang.Object) var42);
        var42.removeAll();
        var29.add(0, (java.lang.Object) var42);
        java.lang.Object var50 = var29.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var52 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var53 = var52.size();
        var52.removeAll();
        int var55 = var52.size();
        var52.removeAll();
        var29.add(2, (java.lang.Object) var52);
        var0.add(0, (java.lang.Object) var52);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var9 + "' != '" + (byte) 1 + "'",
                var9.equals((byte) 1));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var14 + "' != '" + (byte) 1 + "'",
                var14.equals((byte) 1));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertNotNull(var50);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var53 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var55 == 0);
        
    }
    
    public void test170() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test170");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        var4.removeAll();
        var4.removeAll();
        var0.add(0, (java.lang.Object) var4);
        boolean var9 = var0.isEmpty();
        boolean var10 = var0.isEmpty();
        boolean var11 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var13 = var0.get(4);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == false);
        
    }
    
    public void test171() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test171");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var6 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var7 = var6.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var9 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var10 = var9.size();
        boolean var11 = var9.isEmpty();
        var6.add(0, (java.lang.Object) var9);
        var9.add(0, (java.lang.Object) (-1.0d));
        boolean var16 = var9.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var18 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var18.removeAll();
        boolean var20 = var18.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var22 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var23 = var22.size();
        var22.removeAll();
        var22.removeAll();
        var18.add(0, (java.lang.Object) var22);
        var22.removeAll();
        var9.add(0, (java.lang.Object) var22);
        ar.verificacion.validacion.treelistimplementation.TreeList var30 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var31 = var30.size();
        boolean var32 = var30.isEmpty();
        var30.removeAll();
        int var34 = var30.size();
        boolean var35 = var30.isEmpty();
        var22.add(0, (java.lang.Object) var30);
        int var37 = var22.size();
        var0.add(0, (java.lang.Object) var22);
        int var39 = var0.size();
        int var40 = var0.size();
        boolean var41 = var0.isEmpty();
        int var42 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var44 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var45 = var44.size();
        boolean var46 = var44.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var48 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var49 = var48.size();
        boolean var50 = var48.isEmpty();
        boolean var51 = var48.isEmpty();
        boolean var52 = var48.isEmpty();
        var44.add(0, (java.lang.Object) var52);
        boolean var54 = var44.isEmpty();
        boolean var55 = var44.isEmpty();
        boolean var56 = var44.isEmpty();
        int var57 = var44.size();
        var44.remove(0);
        int var60 = var44.size();
        var44.removeAll();
        int var62 = var44.size();
        boolean var63 = var44.isEmpty();
        var44.removeAll();
        var0.add(1, (java.lang.Object) var44);
        var0.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var68 = var0.get(1);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var45 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var49 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var50 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var52 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var54 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var55 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var56 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var57 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var60 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var62 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var63 == true);
        
    }
    
    public void test172() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test172");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var6 = var0.get((-1));
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
    }
    
    public void test173() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test173");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.add(0, (java.lang.Object) 1L);
        ar.verificacion.validacion.treelistimplementation.TreeList var8 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var9 = var8.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var11 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var12 = var11.size();
        boolean var13 = var11.isEmpty();
        var8.add(0, (java.lang.Object) var11);
        var11.add(0, (java.lang.Object) (-1.0d));
        var11.removeAll();
        boolean var19 = var11.isEmpty();
        int var20 = var11.size();
        boolean var21 = var11.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var23 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var24 = var23.isEmpty();
        var23.removeAll();
        var11.add(0, (java.lang.Object) var23);
        var23.removeAll();
        var0.add(0, (java.lang.Object) var23);
        int var29 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var31 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var32 = var31.size();
        var31.removeAll();
        int var34 = var31.size();
        var31.removeAll();
        boolean var36 = var31.isEmpty();
        var31.removeAll();
        var31.removeAll();
        int var39 = var31.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(100, (java.lang.Object) var31);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == 0);
        
    }
    
    public void test174() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test174");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        var4.removeAll();
        var4.removeAll();
        var0.add(0, (java.lang.Object) var4);
        boolean var9 = var0.isEmpty();
        boolean var10 = var0.isEmpty();
        int var11 = var0.size();
        int var12 = var0.size();
        int var13 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var16 = var15.size();
        boolean var17 = var15.isEmpty();
        var15.removeAll();
        int var19 = var15.size();
        boolean var20 = var15.isEmpty();
        boolean var21 = var15.isEmpty();
        int var22 = var15.size();
        boolean var23 = var15.isEmpty();
        var15.removeAll();
        var0.add(0, (java.lang.Object) var15);
        var0.remove(0);
        java.lang.Object var29 = var0.get(0);
        var0.removeAll();
        boolean var31 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertNotNull(var29);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
    }
    
    public void test175() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test175");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var6 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var7 = var6.size();
        boolean var8 = var6.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var10 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var11 = var10.size();
        boolean var12 = var10.isEmpty();
        boolean var13 = var10.isEmpty();
        boolean var14 = var10.isEmpty();
        var6.add(0, (java.lang.Object) var14);
        var0.add(0, (java.lang.Object) var6);
        var0.removeAll();
        var0.removeAll();
        int var19 = var0.size();
        var0.removeAll();
        int var21 = var0.size();
        boolean var22 = var0.isEmpty();
        boolean var23 = var0.isEmpty();
        boolean var24 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
    }
    
    public void test176() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test176");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.removeAll();
        int var5 = var0.size();
        boolean var6 = var0.isEmpty();
        boolean var7 = var0.isEmpty();
        int var8 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var10 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var11 = var10.size();
        boolean var12 = var10.isEmpty();
        boolean var13 = var10.isEmpty();
        boolean var14 = var10.isEmpty();
        var10.removeAll();
        int var16 = var10.size();
        boolean var17 = var10.isEmpty();
        int var18 = var10.size();
        var10.removeAll();
        var0.add(0, (java.lang.Object) var10);
        int var21 = var10.size();
        int var22 = var10.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var24 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var24.removeAll();
        boolean var26 = var24.isEmpty();
        int var27 = var24.size();
        var24.removeAll();
        int var29 = var24.size();
        var24.removeAll();
        boolean var31 = var24.isEmpty();
        boolean var32 = var24.isEmpty();
        int var33 = var24.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var35 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var36 = var35.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var38 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var39 = var38.size();
        boolean var40 = var38.isEmpty();
        var35.add(0, (java.lang.Object) var38);
        int var42 = var38.size();
        boolean var43 = var38.isEmpty();
        var38.removeAll();
        var38.removeAll();
        var38.removeAll();
        var38.removeAll();
        int var48 = var38.size();
        var24.add(0, (java.lang.Object) var48);
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var10.add(1, (java.lang.Object) var48);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var48 == 0);
        
    }
    
    public void test177() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test177");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        int var10 = var0.size();
        int var11 = var0.size();
        boolean var12 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var14 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var15 = var14.size();
        var14.add(0, (java.lang.Object) 100L);
        int var19 = var14.size();
        boolean var20 = var14.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var22 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var23 = var22.size();
        boolean var24 = var22.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var26 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var27 = var26.size();
        boolean var28 = var26.isEmpty();
        boolean var29 = var26.isEmpty();
        boolean var30 = var26.isEmpty();
        var22.add(0, (java.lang.Object) var30);
        boolean var32 = var22.isEmpty();
        var22.removeAll();
        boolean var34 = var22.isEmpty();
        var14.add(1, (java.lang.Object) var22);
        var0.add(1, (java.lang.Object) 1);
        boolean var37 = var0.isEmpty();
        boolean var38 = var0.isEmpty();
        int var39 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var41 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var42 = var41.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var44 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var45 = var44.size();
        boolean var46 = var44.isEmpty();
        var41.add(0, (java.lang.Object) var44);
        var44.add(0, (java.lang.Object) (-1.0d));
        var44.removeAll();
        boolean var52 = var44.isEmpty();
        var44.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var55 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var56 = var55.size();
        var55.add(0, (java.lang.Object) 100L);
        int var60 = var55.size();
        int var61 = var55.size();
        int var62 = var55.size();
        int var63 = var55.size();
        var55.remove(0);
        int var66 = var55.size();
        int var67 = var55.size();
        var44.add(0, (java.lang.Object) var67);
        boolean var69 = var44.isEmpty();
        boolean var70 = var44.isEmpty();
        var0.add(0, (java.lang.Object) var44);
        int var72 = var44.size();
        var44.removeAll();
        int var74 = var44.size();
        int var75 = var44.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var77 = var44.get(10);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == 2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var45 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var52 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var56 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var60 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var61 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var62 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var63 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var66 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var67 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var69 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var70 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var72 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var74 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var75 == 0);
        
    }
    
    public void test178() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test178");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        var0.add(0, (java.lang.Object) 0L);
        int var9 = var0.size();
        var0.removeAll();
        boolean var11 = var0.isEmpty();
        int var12 = var0.size();
        boolean var13 = var0.isEmpty();
        var0.removeAll();
        int var15 = var0.size();
        boolean var16 = var0.isEmpty();
        boolean var17 = var0.isEmpty();
        boolean var18 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
    }
    
    public void test179() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test179");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.add(0, (java.lang.Object) 1L);
        ar.verificacion.validacion.treelistimplementation.TreeList var8 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var9 = var8.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var11 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var12 = var11.size();
        boolean var13 = var11.isEmpty();
        var8.add(0, (java.lang.Object) var11);
        var11.add(0, (java.lang.Object) (-1.0d));
        var11.removeAll();
        boolean var19 = var11.isEmpty();
        int var20 = var11.size();
        boolean var21 = var11.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var23 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var24 = var23.isEmpty();
        var23.removeAll();
        var11.add(0, (java.lang.Object) var23);
        var23.removeAll();
        var0.add(0, (java.lang.Object) var23);
        var0.remove(1);
        var0.removeAll();
        boolean var32 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        int var35 = var0.size();
        boolean var36 = var0.isEmpty();
        int var37 = var0.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == 0);
        
    }
    
    public void test180() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test180");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        var4.removeAll();
        var4.removeAll();
        var0.add(0, (java.lang.Object) var4);
        var4.removeAll();
        var4.removeAll();
        boolean var11 = var4.isEmpty();
        var4.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var14 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var15 = var14.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var17 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var18 = var17.size();
        boolean var19 = var17.isEmpty();
        var14.add(0, (java.lang.Object) var17);
        var17.add(0, (java.lang.Object) (-1.0d));
        var17.removeAll();
        var17.removeAll();
        var4.add(0, (java.lang.Object) var17);
        ar.verificacion.validacion.treelistimplementation.TreeList var28 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var28.removeAll();
        boolean var30 = var28.isEmpty();
        int var31 = var28.size();
        var28.add(0, (java.lang.Object) 1L);
        boolean var35 = var28.isEmpty();
        var28.removeAll();
        int var37 = var28.size();
        int var38 = var28.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var4.add((-1), (java.lang.Object) var28);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == 0);
        
    }
    
    public void test181() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test181");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        var3.removeAll();
        boolean var11 = var3.isEmpty();
        int var12 = var3.size();
        var3.removeAll();
        var3.removeAll();
        int var15 = var3.size();
        boolean var16 = var3.isEmpty();
        var3.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var19 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var20 = var19.isEmpty();
        var19.removeAll();
        int var22 = var19.size();
        var19.removeAll();
        var19.add(0, (java.lang.Object) (byte) 1);
        java.lang.Object var28 = var19.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var30 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var31 = var30.size();
        boolean var32 = var30.isEmpty();
        boolean var33 = var30.isEmpty();
        var30.removeAll();
        var30.removeAll();
        var30.removeAll();
        boolean var37 = var30.isEmpty();
        var19.add(1, (java.lang.Object) var30);
        var30.removeAll();
        var3.add(0, (java.lang.Object) var30);
        int var41 = var3.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var28 + "' != '" + (byte) 1 + "'",
                var28.equals((byte) 1));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == 1);
        
    }
    
    public void test182() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test182");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var6 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var7 = var6.size();
        boolean var8 = var6.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var10 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var11 = var10.size();
        boolean var12 = var10.isEmpty();
        boolean var13 = var10.isEmpty();
        boolean var14 = var10.isEmpty();
        var6.add(0, (java.lang.Object) var14);
        var0.add(0, (java.lang.Object) var6);
        int var17 = var6.size();
        java.lang.Object var19 = var6.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var21 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var22 = var21.isEmpty();
        boolean var23 = var21.isEmpty();
        var21.removeAll();
        var21.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var27 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var28 = var27.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var30 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var31 = var30.size();
        boolean var32 = var30.isEmpty();
        var27.add(0, (java.lang.Object) var30);
        var30.add(0, (java.lang.Object) (-1.0d));
        boolean var37 = var30.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var39 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var39.removeAll();
        boolean var41 = var39.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var43 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var44 = var43.size();
        var43.removeAll();
        var43.removeAll();
        var39.add(0, (java.lang.Object) var43);
        var43.removeAll();
        var30.add(0, (java.lang.Object) var43);
        ar.verificacion.validacion.treelistimplementation.TreeList var51 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var52 = var51.size();
        boolean var53 = var51.isEmpty();
        var51.removeAll();
        int var55 = var51.size();
        boolean var56 = var51.isEmpty();
        var43.add(0, (java.lang.Object) var51);
        int var58 = var43.size();
        var21.add(0, (java.lang.Object) var43);
        boolean var60 = var43.isEmpty();
        int var61 = var43.size();
        var6.add(0, (java.lang.Object) var43);
        boolean var63 = var6.isEmpty();
        boolean var64 = var6.isEmpty();
        java.lang.Object var66 = var6.get(0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var19 + "' != '" + true + "'", var19.equals(true));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var44 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var52 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var53 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var55 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var56 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var58 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var60 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var61 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var63 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var64 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertNotNull(var66);
        
    }
    
    public void test183() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test183");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        int var4 = var0.size();
        boolean var5 = var0.isEmpty();
        boolean var6 = var0.isEmpty();
        int var7 = var0.size();
        var0.removeAll();
        boolean var9 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var11 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var12 = var11.size();
        boolean var13 = var11.isEmpty();
        var11.removeAll();
        int var15 = var11.size();
        boolean var16 = var11.isEmpty();
        boolean var17 = var11.isEmpty();
        int var18 = var11.size();
        boolean var19 = var11.isEmpty();
        var11.add(0, (java.lang.Object) 10L);
        var11.removeAll();
        var11.removeAll();
        var11.removeAll();
        var11.removeAll();
        var0.add(0, (java.lang.Object) var11);
        boolean var28 = var0.isEmpty();
        boolean var29 = var0.isEmpty();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == false);
        
    }
    
    public void test184() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test184");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.removeAll();
        var0.removeAll();
        boolean var4 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var6 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var7 = var6.size();
        boolean var8 = var6.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var10 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var11 = var10.size();
        boolean var12 = var10.isEmpty();
        boolean var13 = var10.isEmpty();
        boolean var14 = var10.isEmpty();
        var6.add(0, (java.lang.Object) var14);
        var6.removeAll();
        var0.add(0, (java.lang.Object) var6);
        boolean var18 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var20 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var21 = var20.size();
        var20.add(0, (java.lang.Object) 100L);
        int var25 = var20.size();
        int var26 = var20.size();
        var20.removeAll();
        var20.removeAll();
        var20.removeAll();
        int var30 = var20.size();
        boolean var31 = var20.isEmpty();
        int var32 = var20.size();
        var0.add(0, (java.lang.Object) var32);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == 0);
        
    }
    
    public void test185() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test185");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        var4.removeAll();
        var4.removeAll();
        var0.add(0, (java.lang.Object) var4);
        boolean var9 = var0.isEmpty();
        boolean var10 = var0.isEmpty();
        int var11 = var0.size();
        int var12 = var0.size();
        var0.removeAll();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var17 = var16.size();
        boolean var18 = var16.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var20 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var21 = var20.size();
        boolean var22 = var20.isEmpty();
        boolean var23 = var20.isEmpty();
        boolean var24 = var20.isEmpty();
        var16.add(0, (java.lang.Object) var24);
        var16.removeAll();
        var16.removeAll();
        int var28 = var16.size();
        boolean var29 = var16.isEmpty();
        var16.removeAll();
        boolean var31 = var16.isEmpty();
        var16.removeAll();
        int var33 = var16.size();
        int var34 = var16.size();
        int var35 = var16.size();
        var0.add(0, (java.lang.Object) var16);
        int var37 = var16.size();
        boolean var38 = var16.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == true);
        
    }
    
    public void test186() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test186");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.add(0, (java.lang.Object) 1L);
        boolean var7 = var0.isEmpty();
        var0.removeAll();
        int var9 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var11 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var11.removeAll();
        boolean var13 = var11.isEmpty();
        int var14 = var11.size();
        var11.removeAll();
        boolean var16 = var11.isEmpty();
        var11.removeAll();
        boolean var18 = var11.isEmpty();
        var11.removeAll();
        var11.removeAll();
        boolean var21 = var11.isEmpty();
        var0.add(0, (java.lang.Object) var21);
        var0.removeAll();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
    }
    
    public void test187() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test187");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.removeAll();
        int var3 = var0.size();
        boolean var4 = var0.isEmpty();
        int var5 = var0.size();
        int var6 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var8 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var9 = var8.isEmpty();
        var8.removeAll();
        int var11 = var8.size();
        var8.removeAll();
        var8.add(0, (java.lang.Object) (byte) 1);
        java.lang.Object var17 = var8.get(0);
        int var18 = var8.size();
        int var19 = var8.size();
        var8.remove(0);
        var0.add(0, (java.lang.Object) var8);
        boolean var23 = var8.isEmpty();
        boolean var24 = var8.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var26 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var27 = var26.size();
        boolean var28 = var26.isEmpty();
        var26.removeAll();
        var26.removeAll();
        var26.removeAll();
        boolean var32 = var26.isEmpty();
        var26.removeAll();
        int var34 = var26.size();
        var26.removeAll();
        boolean var36 = var26.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var8.add(2, (java.lang.Object) var36);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var17 + "' != '" + (byte) 1 + "'",
                var17.equals((byte) 1));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == true);
        
    }
    
    public void test188() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test188");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        boolean var10 = var0.isEmpty();
        boolean var11 = var0.isEmpty();
        boolean var12 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var14 = var0.get(0);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
    }
    
    public void test189() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test189");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        var0.add(0, (java.lang.Object) 0L);
        int var9 = var0.size();
        var0.removeAll();
        var0.removeAll();
        boolean var12 = var0.isEmpty();
        var0.removeAll();
        boolean var14 = var0.isEmpty();
        var0.removeAll();
        boolean var16 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove(10);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
    }
    
    public void test190() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test190");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        var0.removeAll();
        int var8 = var0.size();
        int var9 = var0.size();
        boolean var10 = var0.isEmpty();
        int var11 = var0.size();
        boolean var12 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
    }
    
    public void test191() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test191");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        var3.removeAll();
        boolean var11 = var3.isEmpty();
        var3.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var14 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var15 = var14.size();
        var14.add(0, (java.lang.Object) 100L);
        int var19 = var14.size();
        int var20 = var14.size();
        int var21 = var14.size();
        int var22 = var14.size();
        var14.remove(0);
        int var25 = var14.size();
        int var26 = var14.size();
        var3.add(0, (java.lang.Object) var26);
        boolean var28 = var3.isEmpty();
        var3.removeAll();
        var3.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var32 = var3.get(1);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == false);
        
    }
    
    public void test192() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test192");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        boolean var10 = var0.isEmpty();
        boolean var11 = var0.isEmpty();
        boolean var12 = var0.isEmpty();
        java.lang.Object var14 = var0.get(0);
        var0.removeAll();
        boolean var16 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var14 + "' != '" + true + "'", var14.equals(true));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
    }
    
    public void test193() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test193");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        int var10 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var13 = var12.size();
        boolean var14 = var12.isEmpty();
        boolean var15 = var12.isEmpty();
        boolean var16 = var12.isEmpty();
        var12.removeAll();
        int var18 = var12.size();
        boolean var19 = var12.isEmpty();
        boolean var20 = var12.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var22 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var23 = var22.isEmpty();
        boolean var24 = var22.isEmpty();
        var22.removeAll();
        boolean var26 = var22.isEmpty();
        var22.removeAll();
        boolean var28 = var22.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var30 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var31 = var30.size();
        boolean var32 = var30.isEmpty();
        var30.removeAll();
        int var34 = var30.size();
        boolean var35 = var30.isEmpty();
        var30.removeAll();
        var22.add(0, (java.lang.Object) var30);
        ar.verificacion.validacion.treelistimplementation.TreeList var39 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var40 = var39.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var42 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var43 = var42.size();
        boolean var44 = var42.isEmpty();
        var39.add(0, (java.lang.Object) var42);
        var39.remove(0);
        var39.removeAll();
        var30.add(0, (java.lang.Object) var39);
        var12.add(0, (java.lang.Object) var30);
        int var51 = var12.size();
        var12.removeAll();
        int var53 = var12.size();
        var12.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(4, (java.lang.Object) var12);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var44 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var53 == 0);
        
    }
    
    public void test194() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test194");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        int var4 = var0.size();
        var0.removeAll();
        boolean var6 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
    }
    
    public void test195() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test195");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        int var7 = var0.size();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        int var11 = var0.size();
        var0.removeAll();
        int var13 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var16.removeAll();
        boolean var18 = var16.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var20 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var21 = var20.size();
        var20.removeAll();
        var20.removeAll();
        var16.add(0, (java.lang.Object) var20);
        boolean var25 = var16.isEmpty();
        var16.removeAll();
        var16.removeAll();
        var16.removeAll();
        int var29 = var16.size();
        int var30 = var16.size();
        var16.removeAll();
        var16.removeAll();
        var0.add(0, (java.lang.Object) var16);
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var35 = var16.get(5);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 0);
        
    }
    
    public void test196() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test196");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        var0.add(0, (java.lang.Object) 100L);
        int var8 = var0.size();
        var0.removeAll();
        int var10 = var0.size();
        boolean var11 = var0.isEmpty();
        int var12 = var0.size();
        boolean var13 = var0.isEmpty();
        boolean var14 = var0.isEmpty();
        int var15 = var0.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
    }
    
    public void test197() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test197");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        boolean var5 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        boolean var8 = var0.isEmpty();
        int var9 = var0.size();
        boolean var10 = var0.isEmpty();
        int var11 = var0.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
    }
    
    public void test198() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test198");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        boolean var10 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var12.removeAll();
        boolean var14 = var12.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var17 = var16.size();
        var16.removeAll();
        var16.removeAll();
        var12.add(0, (java.lang.Object) var16);
        var16.removeAll();
        var3.add(0, (java.lang.Object) var16);
        boolean var23 = var3.isEmpty();
        var3.removeAll();
        boolean var25 = var3.isEmpty();
        boolean var26 = var3.isEmpty();
        boolean var27 = var3.isEmpty();
        int var28 = var3.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var30 = var3.get(3);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 0);
        
    }
    
    public void test199() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test199");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        var0.add(0, (java.lang.Object) (byte) 1);
        var0.removeAll();
        boolean var12 = var0.isEmpty();
        boolean var13 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var16 = var15.size();
        var15.add(0, (java.lang.Object) 100L);
        int var20 = var15.size();
        boolean var21 = var15.isEmpty();
        boolean var22 = var15.isEmpty();
        var15.remove(0);
        var15.removeAll();
        var15.removeAll();
        var15.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var29 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var30 = var29.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var32 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var33 = var32.size();
        boolean var34 = var32.isEmpty();
        var29.add(0, (java.lang.Object) var32);
        var32.add(0, (java.lang.Object) (-1.0d));
        boolean var39 = var32.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var41 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var41.removeAll();
        boolean var43 = var41.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var45 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var46 = var45.size();
        var45.removeAll();
        var45.removeAll();
        var41.add(0, (java.lang.Object) var45);
        var45.removeAll();
        var32.add(0, (java.lang.Object) var45);
        boolean var52 = var32.isEmpty();
        var15.add(0, (java.lang.Object) var32);
        var15.removeAll();
        var0.add(0, (java.lang.Object) var15);
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var52 == false);
        
    }
    
    public void test200() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test200");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        boolean var4 = var0.isEmpty();
        boolean var5 = var0.isEmpty();
        int var6 = var0.size();
        var0.removeAll();
        boolean var8 = var0.isEmpty();
        boolean var9 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var11 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var11.removeAll();
        int var13 = var11.size();
        var11.removeAll();
        var11.removeAll();
        var0.add(0, (java.lang.Object) var11);
        boolean var17 = var11.isEmpty();
        boolean var18 = var11.isEmpty();
        var11.removeAll();
        boolean var20 = var11.isEmpty();
        var11.removeAll();
        int var22 = var11.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
    }
    
    public void test201() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test201");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        var3.removeAll();
        boolean var11 = var3.isEmpty();
        int var12 = var3.size();
        var3.removeAll();
        var3.removeAll();
        int var15 = var3.size();
        boolean var16 = var3.isEmpty();
        var3.removeAll();
        boolean var18 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var20 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var21 = var20.isEmpty();
        boolean var22 = var20.isEmpty();
        var20.removeAll();
        var20.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var26 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var27 = var26.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var29 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var30 = var29.size();
        boolean var31 = var29.isEmpty();
        var26.add(0, (java.lang.Object) var29);
        var29.add(0, (java.lang.Object) (-1.0d));
        boolean var36 = var29.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var38 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var38.removeAll();
        boolean var40 = var38.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var42 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var43 = var42.size();
        var42.removeAll();
        var42.removeAll();
        var38.add(0, (java.lang.Object) var42);
        var42.removeAll();
        var29.add(0, (java.lang.Object) var42);
        ar.verificacion.validacion.treelistimplementation.TreeList var50 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var51 = var50.size();
        boolean var52 = var50.isEmpty();
        var50.removeAll();
        int var54 = var50.size();
        boolean var55 = var50.isEmpty();
        var42.add(0, (java.lang.Object) var50);
        int var57 = var42.size();
        var20.add(0, (java.lang.Object) var42);
        boolean var59 = var42.isEmpty();
        int var60 = var42.size();
        boolean var61 = var42.isEmpty();
        boolean var62 = var42.isEmpty();
        java.lang.Object var64 = var42.get(0);
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var3.add((-1), (java.lang.Object) 0);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var52 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var54 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var55 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var57 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var59 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var60 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var61 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var62 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertNotNull(var64);
        
    }
    
    public void test202() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test202");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        var0.removeAll();
        int var8 = var0.size();
        var0.removeAll();
        int var10 = var0.size();
        var0.removeAll();
        var0.removeAll();
        boolean var13 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        int var18 = var0.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
    }
    
    public void test203() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test203");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        int var7 = var0.size();
        var0.add(1, (java.lang.Object) 1.0d);
        var0.remove(1);
        int var13 = var0.size();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove(10);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 1);
        
    }
    
    public void test204() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test204");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        boolean var10 = var0.isEmpty();
        boolean var11 = var0.isEmpty();
        boolean var12 = var0.isEmpty();
        int var13 = var0.size();
        var0.remove(0);
        var0.removeAll();
        boolean var17 = var0.isEmpty();
        int var18 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var20 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var21 = var20.size();
        var20.add(0, (java.lang.Object) 100L);
        int var25 = var20.size();
        boolean var26 = var20.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var28 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var29 = var28.size();
        boolean var30 = var28.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var32 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var33 = var32.size();
        boolean var34 = var32.isEmpty();
        boolean var35 = var32.isEmpty();
        boolean var36 = var32.isEmpty();
        var28.add(0, (java.lang.Object) var36);
        boolean var38 = var28.isEmpty();
        var28.removeAll();
        boolean var40 = var28.isEmpty();
        var20.add(1, (java.lang.Object) var28);
        var0.add(0, (java.lang.Object) 1);
        var0.removeAll();
        int var44 = var0.size();
        int var45 = var0.size();
        int var46 = var0.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var44 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var45 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == 0);
        
    }
    
    public void test205() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test205");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        java.lang.Object var8 = var0.get(0);
        int var9 = var0.size();
        boolean var10 = var0.isEmpty();
        boolean var11 = var0.isEmpty();
        boolean var12 = var0.isEmpty();
        var0.removeAll();
        boolean var14 = var0.isEmpty();
        boolean var15 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var17 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var17.removeAll();
        boolean var19 = var17.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var21 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var22 = var21.size();
        var21.removeAll();
        var21.removeAll();
        var17.add(0, (java.lang.Object) var21);
        boolean var26 = var21.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var28 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var28.removeAll();
        boolean var30 = var28.isEmpty();
        int var31 = var28.size();
        boolean var32 = var28.isEmpty();
        boolean var33 = var28.isEmpty();
        var28.removeAll();
        boolean var35 = var28.isEmpty();
        boolean var36 = var28.isEmpty();
        int var37 = var28.size();
        var28.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var40 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var41 = var40.size();
        var40.add(0, (java.lang.Object) 100L);
        int var45 = var40.size();
        int var46 = var40.size();
        var40.removeAll();
        var40.removeAll();
        var40.removeAll();
        int var50 = var40.size();
        var28.add(0, (java.lang.Object) var40);
        var21.add(0, (java.lang.Object) var40);
        boolean var53 = var21.isEmpty();
        boolean var54 = var21.isEmpty();
        var0.add(0, (java.lang.Object) var21);
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var21.remove(4);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var8 + "' != '" + 100L + "'", var8.equals(100L));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var45 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var50 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var53 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var54 == false);
        
    }
    
    public void test206() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test206");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        boolean var4 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var6 = var0.get(5);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
    }
    
    public void test207() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test207");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        boolean var4 = var0.isEmpty();
        boolean var5 = var0.isEmpty();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var8 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var9 = var8.size();
        boolean var10 = var8.isEmpty();
        var8.removeAll();
        var8.removeAll();
        int var13 = var8.size();
        var8.removeAll();
        var8.removeAll();
        boolean var16 = var8.isEmpty();
        var0.add(0, (java.lang.Object) var16);
        var0.removeAll();
        var0.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var21 = var0.get((-1));
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
    }
    
    public void test208() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test208");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        boolean var10 = var0.isEmpty();
        var0.removeAll();
        int var12 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var15.removeAll();
        boolean var17 = var15.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var19 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var20 = var19.size();
        var19.removeAll();
        var19.removeAll();
        var15.add(0, (java.lang.Object) var19);
        boolean var24 = var15.isEmpty();
        boolean var25 = var15.isEmpty();
        boolean var26 = var15.isEmpty();
        var15.removeAll();
        var0.add(0, (java.lang.Object) var15);
        int var29 = var0.size();
        int var30 = var0.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove(3);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 1);
        
    }
    
    public void test209() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test209");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        var0.removeAll();
        int var6 = var0.size();
        int var7 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var9 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var10 = var9.isEmpty();
        var9.removeAll();
        var0.add(0, (java.lang.Object) var9);
        ar.verificacion.validacion.treelistimplementation.TreeList var14 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var15 = var14.size();
        var14.add(0, (java.lang.Object) 100L);
        int var19 = var14.size();
        int var20 = var14.size();
        var14.removeAll();
        int var22 = var14.size();
        var14.removeAll();
        int var24 = var14.size();
        var14.removeAll();
        var14.removeAll();
        boolean var27 = var14.isEmpty();
        var0.add(0, (java.lang.Object) var14);
        boolean var29 = var0.isEmpty();
        int var30 = var0.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 2);
        
    }
    
    public void test210() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test210");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        boolean var10 = var0.isEmpty();
        boolean var11 = var0.isEmpty();
        boolean var12 = var0.isEmpty();
        int var13 = var0.size();
        int var14 = var0.size();
        boolean var15 = var0.isEmpty();
        int var16 = var0.size();
        boolean var17 = var0.isEmpty();
        boolean var18 = var0.isEmpty();
        var0.remove(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var22 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var23 = var22.size();
        boolean var24 = var22.isEmpty();
        boolean var25 = var22.isEmpty();
        var22.removeAll();
        var22.removeAll();
        int var28 = var22.size();
        int var29 = var22.size();
        var0.add(0, (java.lang.Object) var22);
        int var31 = var22.size();
        int var32 = var22.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var34 = var22.get(100);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == 0);
        
    }
    
    public void test211() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test211");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        int var7 = var0.size();
        int var8 = var0.size();
        boolean var9 = var0.isEmpty();
        var0.removeAll();
        int var11 = var0.size();
        var0.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove(0);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
    }
    
    public void test212() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test212");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        boolean var6 = var0.isEmpty();
        boolean var7 = var0.isEmpty();
        int var8 = var0.size();
        boolean var9 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove(10);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == false);
        
    }
    
    public void test213() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test213");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        int var7 = var0.size();
        int var8 = var0.size();
        var0.remove(0);
        int var11 = var0.size();
        var0.removeAll();
        int var13 = var0.size();
        boolean var14 = var0.isEmpty();
        int var15 = var0.size();
        boolean var16 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
    }
    
    public void test214() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test214");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        var0.removeAll();
        boolean var6 = var0.isEmpty();
        int var7 = var0.size();
        int var8 = var0.size();
        boolean var9 = var0.isEmpty();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
    }
    
    public void test215() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test215");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        int var7 = var0.size();
        var0.add(1, (java.lang.Object) 1.0d);
        int var11 = var0.size();
        var0.remove(0);
        var0.removeAll();
        boolean var15 = var0.isEmpty();
        boolean var16 = var0.isEmpty();
        boolean var17 = var0.isEmpty();
        int var18 = var0.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
    }
    
    public void test216() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test216");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        boolean var10 = var0.isEmpty();
        boolean var11 = var0.isEmpty();
        boolean var12 = var0.isEmpty();
        int var13 = var0.size();
        var0.remove(0);
        int var16 = var0.size();
        boolean var17 = var0.isEmpty();
        int var18 = var0.size();
        boolean var19 = var0.isEmpty();
        var0.removeAll();
        int var21 = var0.size();
        var0.removeAll();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 0);
        
    }
    
    public void test217() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test217");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        boolean var10 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var12.removeAll();
        boolean var14 = var12.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var17 = var16.size();
        var16.removeAll();
        var16.removeAll();
        var12.add(0, (java.lang.Object) var16);
        var16.removeAll();
        var3.add(0, (java.lang.Object) var16);
        java.lang.Object var24 = var3.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var26 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var27 = var26.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var29 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var30 = var29.size();
        boolean var31 = var29.isEmpty();
        var26.add(0, (java.lang.Object) var29);
        var26.removeAll();
        var26.removeAll();
        int var35 = var26.size();
        boolean var36 = var26.isEmpty();
        var3.add(2, (java.lang.Object) var36);
        var3.remove(1);
        boolean var40 = var3.isEmpty();
        var3.removeAll();
        boolean var42 = var3.isEmpty();
        var3.removeAll();
        var3.removeAll();
        boolean var45 = var3.isEmpty();
        boolean var46 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var48 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var49 = var48.size();
        boolean var50 = var48.isEmpty();
        boolean var51 = var48.isEmpty();
        boolean var52 = var48.isEmpty();
        boolean var53 = var48.isEmpty();
        var48.removeAll();
        var48.removeAll();
        var48.removeAll();
        int var57 = var48.size();
        int var58 = var48.size();
        int var59 = var48.size();
        boolean var60 = var48.isEmpty();
        var48.removeAll();
        boolean var62 = var48.isEmpty();
        boolean var63 = var48.isEmpty();
        boolean var64 = var48.isEmpty();
        var3.add(0, (java.lang.Object) var48);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertNotNull(var24);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var45 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var49 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var50 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var52 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var53 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var57 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var58 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var59 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var60 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var62 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var63 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var64 == true);
        
    }
    
    public void test218() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test218");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        var0.removeAll();
        var0.removeAll();
        int var12 = var0.size();
        boolean var13 = var0.isEmpty();
        var0.removeAll();
        boolean var15 = var0.isEmpty();
        int var16 = var0.size();
        boolean var17 = var0.isEmpty();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
    }
    
    public void test219() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test219");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        boolean var4 = var0.isEmpty();
        boolean var5 = var0.isEmpty();
        int var6 = var0.size();
        int var7 = var0.size();
        int var8 = var0.size();
        boolean var9 = var0.isEmpty();
        var0.removeAll();
        boolean var11 = var0.isEmpty();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var14 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var15 = var14.size();
        var14.add(0, (java.lang.Object) 100L);
        int var19 = var14.size();
        boolean var20 = var14.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var22 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var22.removeAll();
        boolean var24 = var22.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var26 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var27 = var26.size();
        var26.removeAll();
        var26.removeAll();
        var22.add(0, (java.lang.Object) var26);
        boolean var31 = var22.isEmpty();
        boolean var32 = var22.isEmpty();
        var14.add(1, (java.lang.Object) var32);
        int var34 = var14.size();
        var14.add(2, (java.lang.Object) '4');
        java.lang.Object var39 = var14.get(2);
        var14.remove(1);
        boolean var42 = var14.isEmpty();
        var0.add(0, (java.lang.Object) var14);
        var0.removeAll();
        boolean var45 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var39 + "' != '" + '4' + "'", var39.equals('4'));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var45 == true);
        
    }
    
    public void test220() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test220");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        boolean var4 = var0.isEmpty();
        boolean var5 = var0.isEmpty();
        var0.removeAll();
        int var7 = var0.size();
        boolean var8 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var10 = var0.get((-1));
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
    }
    
    public void test221() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test221");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        boolean var5 = var0.isEmpty();
        int var6 = var0.size();
        int var7 = var0.size();
        var0.removeAll();
        boolean var9 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var11 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var12 = var11.isEmpty();
        boolean var13 = var11.isEmpty();
        var11.removeAll();
        var11.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var17 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var18 = var17.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var20 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var21 = var20.size();
        boolean var22 = var20.isEmpty();
        var17.add(0, (java.lang.Object) var20);
        var20.add(0, (java.lang.Object) (-1.0d));
        boolean var27 = var20.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var29 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var29.removeAll();
        boolean var31 = var29.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var33 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var34 = var33.size();
        var33.removeAll();
        var33.removeAll();
        var29.add(0, (java.lang.Object) var33);
        var33.removeAll();
        var20.add(0, (java.lang.Object) var33);
        ar.verificacion.validacion.treelistimplementation.TreeList var41 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var42 = var41.size();
        boolean var43 = var41.isEmpty();
        var41.removeAll();
        int var45 = var41.size();
        boolean var46 = var41.isEmpty();
        var33.add(0, (java.lang.Object) var41);
        int var48 = var33.size();
        var11.add(0, (java.lang.Object) var33);
        var33.removeAll();
        int var51 = var33.size();
        int var52 = var33.size();
        int var53 = var33.size();
        int var54 = var33.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(5, (java.lang.Object) var33);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var45 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var48 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var52 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var53 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var54 == 0);
        
    }
    
    public void test222() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test222");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        int var6 = var0.size();
        boolean var7 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        int var10 = var0.size();
        boolean var11 = var0.isEmpty();
        var0.removeAll();
        int var13 = var0.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove(3);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
    }
    
    public void test223() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test223");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        int var7 = var0.size();
        int var8 = var0.size();
        var0.remove(0);
        int var11 = var0.size();
        var0.removeAll();
        int var13 = var0.size();
        boolean var14 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var16.removeAll();
        boolean var18 = var16.isEmpty();
        var16.removeAll();
        var16.removeAll();
        int var21 = var16.size();
        var0.add(0, (java.lang.Object) var16);
        boolean var23 = var16.isEmpty();
        var16.removeAll();
        boolean var25 = var16.isEmpty();
        boolean var26 = var16.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
    }
    
    public void test224() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test224");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        int var10 = var0.size();
        int var11 = var0.size();
        boolean var12 = var0.isEmpty();
        int var13 = var0.size();
        int var14 = var0.size();
        int var15 = var0.size();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 1);
        
    }
    
    public void test225() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test225");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var6 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var7 = var6.size();
        boolean var8 = var6.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var10 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var11 = var10.size();
        boolean var12 = var10.isEmpty();
        boolean var13 = var10.isEmpty();
        boolean var14 = var10.isEmpty();
        var6.add(0, (java.lang.Object) var14);
        var0.add(0, (java.lang.Object) var6);
        ar.verificacion.validacion.treelistimplementation.TreeList var18 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var19 = var18.size();
        var18.add(0, (java.lang.Object) 100L);
        int var23 = var18.size();
        boolean var24 = var18.isEmpty();
        boolean var25 = var18.isEmpty();
        var18.remove(0);
        var18.removeAll();
        var6.add(1, (java.lang.Object) var18);
        boolean var30 = var18.isEmpty();
        var18.removeAll();
        var18.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var34 = var18.get((-1));
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == true);
        
    }
    
    public void test226() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test226");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        var0.removeAll();
        boolean var6 = var0.isEmpty();
        var0.removeAll();
        int var8 = var0.size();
        boolean var9 = var0.isEmpty();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
    }
    
    public void test227() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test227");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        boolean var10 = var0.isEmpty();
        boolean var11 = var0.isEmpty();
        boolean var12 = var0.isEmpty();
        int var13 = var0.size();
        var0.remove(0);
        int var16 = var0.size();
        boolean var17 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var19 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var19.removeAll();
        boolean var21 = var19.isEmpty();
        int var22 = var19.size();
        boolean var23 = var19.isEmpty();
        boolean var24 = var19.isEmpty();
        int var25 = var19.size();
        int var26 = var19.size();
        int var27 = var19.size();
        boolean var28 = var19.isEmpty();
        var19.removeAll();
        boolean var30 = var19.isEmpty();
        int var31 = var19.size();
        var19.removeAll();
        var19.removeAll();
        var19.removeAll();
        var19.removeAll();
        int var36 = var19.size();
        var0.add(0, (java.lang.Object) var19);
        var19.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == 0);
        
    }
    
    public void test228() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test228");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        boolean var10 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var12.removeAll();
        boolean var14 = var12.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var17 = var16.size();
        var16.removeAll();
        var16.removeAll();
        var12.add(0, (java.lang.Object) var16);
        var16.removeAll();
        var3.add(0, (java.lang.Object) var16);
        java.lang.Object var24 = var3.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var26 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var27 = var26.size();
        var26.removeAll();
        int var29 = var26.size();
        var26.removeAll();
        var3.add(2, (java.lang.Object) var26);
        var26.removeAll();
        var26.removeAll();
        int var34 = var26.size();
        boolean var35 = var26.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var37 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var38 = var37.size();
        boolean var39 = var37.isEmpty();
        var37.removeAll();
        var37.removeAll();
        int var42 = var37.size();
        var37.removeAll();
        var37.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var26.add(5, (java.lang.Object) var37);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertNotNull(var24);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == 0);
        
    }
    
    public void test229() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test229");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.removeAll();
        boolean var5 = var0.isEmpty();
        boolean var6 = var0.isEmpty();
        int var7 = var0.size();
        var0.removeAll();
        var0.removeAll();
        boolean var10 = var0.isEmpty();
        boolean var11 = var0.isEmpty();
        int var12 = var0.size();
        int var13 = var0.size();
        int var14 = var0.size();
        boolean var15 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == true);
        
    }
    
    public void test230() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test230");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        boolean var4 = var0.isEmpty();
        boolean var5 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
    }
    
    public void test231() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test231");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        boolean var5 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        int var8 = var0.size();
        boolean var9 = var0.isEmpty();
        int var10 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var13 = var12.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var16 = var15.size();
        var15.add(0, (java.lang.Object) 100L);
        int var20 = var15.size();
        boolean var21 = var15.isEmpty();
        boolean var22 = var15.isEmpty();
        var12.add(0, (java.lang.Object) var22);
        java.lang.Object var25 = var12.get(0);
        int var26 = var12.size();
        boolean var27 = var12.isEmpty();
        var12.removeAll();
        var12.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(1, (java.lang.Object) var12);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var25 + "' != '" + false + "'", var25.equals(false));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == false);
        
    }
    
    public void test232() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test232");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.add(0, (java.lang.Object) 1L);
        int var7 = var0.size();
        boolean var8 = var0.isEmpty();
        boolean var9 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var11 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var12 = var11.size();
        var11.add(0, (java.lang.Object) 100L);
        int var16 = var11.size();
        int var17 = var11.size();
        java.lang.Object var19 = var11.get(0);
        var11.removeAll();
        var11.removeAll();
        var0.add(1, (java.lang.Object) var11);
        boolean var23 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var25 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var26 = var25.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var28 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var29 = var28.size();
        var28.add(0, (java.lang.Object) 100L);
        int var33 = var28.size();
        boolean var34 = var28.isEmpty();
        boolean var35 = var28.isEmpty();
        var25.add(0, (java.lang.Object) var35);
        ar.verificacion.validacion.treelistimplementation.TreeList var38 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var39 = var38.size();
        var38.add(0, (java.lang.Object) 100L);
        int var43 = var38.size();
        int var44 = var38.size();
        int var45 = var38.size();
        var38.removeAll();
        boolean var47 = var38.isEmpty();
        boolean var48 = var38.isEmpty();
        var25.add(1, (java.lang.Object) var48);
        var25.removeAll();
        var25.removeAll();
        var0.add(0, (java.lang.Object) var25);
        boolean var53 = var25.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var55 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var56 = var55.size();
        var55.add(0, (java.lang.Object) 100L);
        int var60 = var55.size();
        int var61 = var55.size();
        int var62 = var55.size();
        var55.add(1, (java.lang.Object) 1.0d);
        boolean var66 = var55.isEmpty();
        boolean var67 = var55.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var25.add((-1), (java.lang.Object) var67);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var19 + "' != '" + 100L + "'", var19.equals(100L));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var44 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var45 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var48 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var53 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var56 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var60 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var61 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var62 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var66 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var67 == false);
        
    }
    
    public void test233() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test233");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        var4.removeAll();
        var4.removeAll();
        var0.add(0, (java.lang.Object) var4);
        boolean var9 = var0.isEmpty();
        boolean var10 = var0.isEmpty();
        int var11 = var0.size();
        int var12 = var0.size();
        int var13 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var16 = var15.size();
        boolean var17 = var15.isEmpty();
        var15.removeAll();
        int var19 = var15.size();
        boolean var20 = var15.isEmpty();
        boolean var21 = var15.isEmpty();
        int var22 = var15.size();
        boolean var23 = var15.isEmpty();
        var15.removeAll();
        var0.add(0, (java.lang.Object) var15);
        ar.verificacion.validacion.treelistimplementation.TreeList var27 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var28 = var27.size();
        boolean var29 = var27.isEmpty();
        var27.removeAll();
        int var31 = var27.size();
        int var32 = var27.size();
        var27.removeAll();
        boolean var34 = var27.isEmpty();
        int var35 = var27.size();
        var27.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add((-1), (java.lang.Object) var27);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 0);
        
    }
    
    public void test234() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test234");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        boolean var5 = var0.isEmpty();
        int var6 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var9 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var10 = var9.size();
        var9.add(0, (java.lang.Object) 100L);
        boolean var14 = var9.isEmpty();
        int var15 = var9.size();
        var0.add(0, (java.lang.Object) var15);
        ar.verificacion.validacion.treelistimplementation.TreeList var18 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var19 = var18.size();
        boolean var20 = var18.isEmpty();
        var18.removeAll();
        var18.removeAll();
        var18.removeAll();
        int var24 = var18.size();
        boolean var25 = var18.isEmpty();
        var18.removeAll();
        var18.removeAll();
        int var28 = var18.size();
        boolean var29 = var18.isEmpty();
        var18.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(4, (java.lang.Object) var18);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
    }
    
    public void test235() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test235");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        int var7 = var0.size();
        int var8 = var0.size();
        var0.remove(0);
        int var11 = var0.size();
        var0.removeAll();
        boolean var13 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var15.removeAll();
        boolean var17 = var15.isEmpty();
        int var18 = var15.size();
        var15.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var21 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var22 = var21.size();
        boolean var23 = var21.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var25 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var26 = var25.size();
        boolean var27 = var25.isEmpty();
        boolean var28 = var25.isEmpty();
        boolean var29 = var25.isEmpty();
        var21.add(0, (java.lang.Object) var29);
        var15.add(0, (java.lang.Object) var21);
        int var32 = var21.size();
        var21.removeAll();
        var21.removeAll();
        var0.add(0, (java.lang.Object) var21);
        ar.verificacion.validacion.treelistimplementation.TreeList var37 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var38 = var37.size();
        var37.removeAll();
        int var40 = var37.size();
        boolean var41 = var37.isEmpty();
        int var42 = var37.size();
        int var43 = var37.size();
        int var44 = var37.size();
        boolean var45 = var37.isEmpty();
        var21.add(0, (java.lang.Object) var37);
        ar.verificacion.validacion.treelistimplementation.TreeList var48 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var49 = var48.size();
        var48.add(0, (java.lang.Object) 100L);
        int var53 = var48.size();
        int var54 = var48.size();
        int var55 = var48.size();
        int var56 = var48.size();
        var48.remove(0);
        int var59 = var48.size();
        boolean var60 = var48.isEmpty();
        var48.removeAll();
        boolean var62 = var48.isEmpty();
        var48.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var37.add(5, (java.lang.Object) var48);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var44 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var45 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var49 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var53 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var54 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var55 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var56 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var59 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var60 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var62 == true);
        
    }
    
    public void test236() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test236");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        boolean var3 = var0.isEmpty();
        boolean var4 = var0.isEmpty();
        boolean var5 = var0.isEmpty();
        var0.removeAll();
        int var7 = var0.size();
        int var8 = var0.size();
        int var9 = var0.size();
        boolean var10 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var12.removeAll();
        boolean var14 = var12.isEmpty();
        var12.removeAll();
        var12.removeAll();
        var12.removeAll();
        boolean var18 = var12.isEmpty();
        var12.removeAll();
        var0.add(0, (java.lang.Object) var12);
        ar.verificacion.validacion.treelistimplementation.TreeList var22 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var23 = var22.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var25 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var26 = var25.size();
        boolean var27 = var25.isEmpty();
        var22.add(0, (java.lang.Object) var25);
        var25.add(0, (java.lang.Object) (-1.0d));
        boolean var32 = var25.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var34 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var34.removeAll();
        boolean var36 = var34.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var38 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var39 = var38.size();
        var38.removeAll();
        var38.removeAll();
        var34.add(0, (java.lang.Object) var38);
        var38.removeAll();
        var25.add(0, (java.lang.Object) var38);
        java.lang.Object var46 = var25.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var48 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var49 = var48.size();
        var48.removeAll();
        int var51 = var48.size();
        var48.removeAll();
        var25.add(2, (java.lang.Object) var48);
        int var54 = var25.size();
        var25.remove(0);
        boolean var57 = var25.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var59 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var60 = var59.size();
        var59.add(0, (java.lang.Object) 100L);
        int var64 = var59.size();
        int var65 = var59.size();
        java.lang.Object var67 = var59.get(0);
        var59.remove(0);
        var59.removeAll();
        boolean var71 = var59.isEmpty();
        var25.add(1, (java.lang.Object) var71);
        var25.removeAll();
        var12.add(0, (java.lang.Object) var25);
        boolean var75 = var25.isEmpty();
        var25.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertNotNull(var46);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var49 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var54 == 3);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var57 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var60 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var64 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var65 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var67 + "' != '" + 100L + "'", var67.equals(100L));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var71 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var75 == true);
        
    }
    
    public void test237() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test237");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        var4.removeAll();
        var4.removeAll();
        var0.add(0, (java.lang.Object) var4);
        ar.verificacion.validacion.treelistimplementation.TreeList var10 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var11 = var10.size();
        var10.add(0, (java.lang.Object) 100L);
        int var15 = var10.size();
        int var16 = var10.size();
        int var17 = var10.size();
        int var18 = var10.size();
        var10.remove(0);
        int var21 = var10.size();
        var10.removeAll();
        boolean var23 = var10.isEmpty();
        var4.add(0, (java.lang.Object) var10);
        boolean var25 = var10.isEmpty();
        int var26 = var10.size();
        boolean var27 = var10.isEmpty();
        boolean var28 = var10.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == true);
        
    }
    
    public void test238() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test238");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        boolean var6 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var8 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var8.removeAll();
        boolean var10 = var8.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var13 = var12.size();
        var12.removeAll();
        var12.removeAll();
        var8.add(0, (java.lang.Object) var12);
        boolean var17 = var8.isEmpty();
        boolean var18 = var8.isEmpty();
        var0.add(1, (java.lang.Object) var18);
        int var20 = var0.size();
        var0.add(2, (java.lang.Object) '4');
        java.lang.Object var25 = var0.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var27 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var28 = var27.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var30 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var31 = var30.size();
        boolean var32 = var30.isEmpty();
        var27.add(0, (java.lang.Object) var30);
        int var34 = var27.size();
        int var35 = var27.size();
        var27.removeAll();
        var0.add(2, (java.lang.Object) var27);
        int var38 = var27.size();
        int var39 = var27.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var41 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var41.removeAll();
        boolean var43 = var41.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var45 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var46 = var45.size();
        var45.removeAll();
        var45.removeAll();
        var41.add(0, (java.lang.Object) var45);
        boolean var50 = var41.isEmpty();
        boolean var51 = var41.isEmpty();
        int var52 = var41.size();
        int var53 = var41.size();
        java.lang.Object var55 = var41.get(0);
        var41.removeAll();
        var41.removeAll();
        int var58 = var41.size();
        boolean var59 = var41.isEmpty();
        int var60 = var41.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var27.add(2, (java.lang.Object) var41);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var25 + "' != '" + 100L + "'", var25.equals(100L));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var50 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var52 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var53 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertNotNull(var55);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var58 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var59 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var60 == 0);
        
    }
    
    public void test239() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test239");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        int var4 = var0.size();
        int var5 = var0.size();
        var0.removeAll();
        int var7 = var0.size();
        boolean var8 = var0.isEmpty();
        int var9 = var0.size();
        boolean var10 = var0.isEmpty();
        boolean var11 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
    }
    
    public void test240() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test240");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        int var5 = var0.size();
        boolean var6 = var0.isEmpty();
        boolean var7 = var0.isEmpty();
        var0.removeAll();
        boolean var9 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var11 = var0.get(4);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
    }
    
    public void test241() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test241");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        int var6 = var0.size();
        int var7 = var0.size();
        int var8 = var0.size();
        var0.remove(0);
        boolean var11 = var0.isEmpty();
        var0.removeAll();
        int var13 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var17 = var16.size();
        boolean var18 = var16.isEmpty();
        boolean var19 = var16.isEmpty();
        boolean var20 = var16.isEmpty();
        boolean var21 = var16.isEmpty();
        var16.removeAll();
        var16.removeAll();
        var16.removeAll();
        int var25 = var16.size();
        var16.removeAll();
        var16.removeAll();
        var16.removeAll();
        var16.removeAll();
        boolean var30 = var16.isEmpty();
        var16.removeAll();
        int var32 = var16.size();
        boolean var33 = var16.isEmpty();
        boolean var34 = var16.isEmpty();
        int var35 = var16.size();
        int var36 = var16.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(3, (java.lang.Object) var16);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == 0);
        
    }
    
    public void test242() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test242");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        boolean var6 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var8 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var8.removeAll();
        boolean var10 = var8.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var13 = var12.size();
        var12.removeAll();
        var12.removeAll();
        var8.add(0, (java.lang.Object) var12);
        boolean var17 = var8.isEmpty();
        boolean var18 = var8.isEmpty();
        var0.add(1, (java.lang.Object) var18);
        ar.verificacion.validacion.treelistimplementation.TreeList var21 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var22 = var21.size();
        var21.removeAll();
        int var24 = var21.size();
        boolean var25 = var21.isEmpty();
        int var26 = var21.size();
        int var27 = var21.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var29 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var30 = var29.isEmpty();
        var29.removeAll();
        int var32 = var29.size();
        var29.removeAll();
        var29.add(0, (java.lang.Object) (byte) 1);
        java.lang.Object var38 = var29.get(0);
        int var39 = var29.size();
        int var40 = var29.size();
        var29.remove(0);
        var21.add(0, (java.lang.Object) var29);
        var21.removeAll();
        var0.add(0, (java.lang.Object) var21);
        boolean var46 = var21.isEmpty();
        int var47 = var21.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var38 + "' != '" + (byte) 1 + "'",
                var38.equals((byte) 1));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == 0);
        
    }
    
    public void test243() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test243");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        var4.removeAll();
        var4.removeAll();
        var0.add(0, (java.lang.Object) var4);
        boolean var9 = var0.isEmpty();
        boolean var10 = var0.isEmpty();
        int var11 = var0.size();
        boolean var12 = var0.isEmpty();
        boolean var13 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var16 = var15.size();
        var15.add(0, (java.lang.Object) 100L);
        boolean var20 = var15.isEmpty();
        boolean var21 = var15.isEmpty();
        int var22 = var15.size();
        boolean var23 = var15.isEmpty();
        boolean var24 = var15.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.add(4, (java.lang.Object) var15);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == false);
        
    }
    
    public void test244() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test244");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        int var4 = var0.size();
        boolean var5 = var0.isEmpty();
        boolean var6 = var0.isEmpty();
        int var7 = var0.size();
        boolean var8 = var0.isEmpty();
        int var9 = var0.size();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
    }
    
    public void test245() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test245");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        int var2 = var0.size();
        boolean var3 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var5 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var6 = var5.size();
        boolean var7 = var5.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var9 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var10 = var9.size();
        boolean var11 = var9.isEmpty();
        boolean var12 = var9.isEmpty();
        boolean var13 = var9.isEmpty();
        var5.add(0, (java.lang.Object) var13);
        boolean var15 = var5.isEmpty();
        boolean var16 = var5.isEmpty();
        boolean var17 = var5.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var19 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var20 = var19.size();
        boolean var21 = var19.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var23 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var24 = var23.size();
        boolean var25 = var23.isEmpty();
        boolean var26 = var23.isEmpty();
        boolean var27 = var23.isEmpty();
        var19.add(0, (java.lang.Object) var27);
        boolean var29 = var19.isEmpty();
        var19.removeAll();
        boolean var31 = var19.isEmpty();
        var5.add(0, (java.lang.Object) var19);
        ar.verificacion.validacion.treelistimplementation.TreeList var34 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var35 = var34.size();
        var34.add(0, (java.lang.Object) 100L);
        int var39 = var34.size();
        int var40 = var34.size();
        int var41 = var34.size();
        var34.removeAll();
        boolean var43 = var34.isEmpty();
        boolean var44 = var34.isEmpty();
        int var45 = var34.size();
        var34.removeAll();
        int var47 = var34.size();
        boolean var48 = var34.isEmpty();
        var34.removeAll();
        var5.add(1, (java.lang.Object) var34);
        boolean var51 = var34.isEmpty();
        boolean var52 = var34.isEmpty();
        boolean var53 = var34.isEmpty();
        var0.add(0, (java.lang.Object) var34);
        var0.removeAll();
        int var56 = var0.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var44 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var45 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var48 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var52 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var53 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var56 == 0);
        
    }
    
    public void test246() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test246");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        boolean var4 = var0.isEmpty();
        boolean var5 = var0.isEmpty();
        var0.removeAll();
        boolean var7 = var0.isEmpty();
        boolean var8 = var0.isEmpty();
        int var9 = var0.size();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var13 = var12.size();
        var12.add(0, (java.lang.Object) 100L);
        int var17 = var12.size();
        int var18 = var12.size();
        var12.removeAll();
        var12.removeAll();
        var12.removeAll();
        int var22 = var12.size();
        var0.add(0, (java.lang.Object) var12);
        int var24 = var12.size();
        int var25 = var12.size();
        var12.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var28 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var28.removeAll();
        boolean var30 = var28.isEmpty();
        int var31 = var28.size();
        boolean var32 = var28.isEmpty();
        boolean var33 = var28.isEmpty();
        int var34 = var28.size();
        var28.removeAll();
        boolean var36 = var28.isEmpty();
        int var37 = var28.size();
        var28.removeAll();
        int var39 = var28.size();
        var28.removeAll();
        int var41 = var28.size();
        var28.removeAll();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var12.add(2, (java.lang.Object) var28);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == 0);
        
    }
    
    public void test247() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test247");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        var0.add(0, (java.lang.Object) (byte) 1);
        java.lang.Object var9 = var0.get(0);
        int var10 = var0.size();
        int var11 = var0.size();
        boolean var12 = var0.isEmpty();
        boolean var13 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var16 = var15.size();
        var15.add(0, (java.lang.Object) 100L);
        int var20 = var15.size();
        boolean var21 = var15.isEmpty();
        boolean var22 = var15.isEmpty();
        var15.remove(0);
        var15.removeAll();
        var15.removeAll();
        int var27 = var15.size();
        int var28 = var15.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var30 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var31 = var30.size();
        var30.add(0, (java.lang.Object) 100L);
        int var35 = var30.size();
        int var36 = var30.size();
        int var37 = var30.size();
        java.lang.Object var39 = var30.get(0);
        int var40 = var30.size();
        int var41 = var30.size();
        int var42 = var30.size();
        java.lang.Object var44 = var30.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var46 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var47 = var46.size();
        var46.removeAll();
        int var49 = var46.size();
        int var50 = var46.size();
        boolean var51 = var46.isEmpty();
        var46.removeAll();
        var30.add(0, (java.lang.Object) var46);
        var15.add(0, (java.lang.Object) var30);
        int var55 = var15.size();
        var0.add(0, (java.lang.Object) var15);
        var0.removeAll();
        int var58 = var0.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove(5);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var9 + "' != '" + (byte) 1 + "'",
                var9.equals((byte) 1));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var39 + "' != '" + 100L + "'", var39.equals(100L));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var44 + "' != '" + 100L + "'", var44.equals(100L));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var49 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var50 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var55 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var58 == 0);
        
    }
    
    public void test248() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test248");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        boolean var2 = var0.isEmpty();
        var0.removeAll();
        var0.add(0, (java.lang.Object) 1.0d);
        int var7 = var0.size();
        var0.removeAll();
        boolean var9 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            var0.remove(4);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
    }
    
    public void test249() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test249");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        boolean var10 = var0.isEmpty();
        var0.removeAll();
        boolean var12 = var0.isEmpty();
        int var13 = var0.size();
        var0.removeAll();
        var0.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var17 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var17.removeAll();
        boolean var19 = var17.isEmpty();
        int var20 = var17.size();
        var17.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var23 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var24 = var23.size();
        boolean var25 = var23.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var27 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var28 = var27.size();
        boolean var29 = var27.isEmpty();
        boolean var30 = var27.isEmpty();
        boolean var31 = var27.isEmpty();
        var23.add(0, (java.lang.Object) var31);
        var17.add(0, (java.lang.Object) var23);
        int var34 = var23.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var36 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var37 = var36.size();
        boolean var38 = var36.isEmpty();
        var36.removeAll();
        int var40 = var36.size();
        boolean var41 = var36.isEmpty();
        boolean var42 = var36.isEmpty();
        boolean var43 = var36.isEmpty();
        var23.add(0, (java.lang.Object) var43);
        ar.verificacion.validacion.treelistimplementation.TreeList var46 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var46.removeAll();
        boolean var48 = var46.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var50 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var51 = var50.size();
        var50.removeAll();
        var50.removeAll();
        var46.add(0, (java.lang.Object) var50);
        boolean var55 = var46.isEmpty();
        boolean var56 = var46.isEmpty();
        boolean var57 = var46.isEmpty();
        var46.removeAll();
        var23.add(0, (java.lang.Object) var46);
        int var60 = var46.size();
        var46.removeAll();
        var0.add(0, (java.lang.Object) var46);
        boolean var63 = var0.isEmpty();
        int var64 = var0.size();
        boolean var65 = var0.isEmpty();
        boolean var66 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var38 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var42 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var48 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var55 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var56 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var57 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var60 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var63 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var64 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var65 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var66 == false);
        
    }
    
    public void test250() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test250");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.add(0, (java.lang.Object) 100L);
        int var5 = var0.size();
        boolean var6 = var0.isEmpty();
        boolean var7 = var0.isEmpty();
        var0.remove(0);
        var0.removeAll();
        var0.removeAll();
        int var12 = var0.size();
        int var13 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var15 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var16 = var15.size();
        boolean var17 = var15.isEmpty();
        var15.removeAll();
        var15.removeAll();
        var15.removeAll();
        var15.removeAll();
        var15.removeAll();
        var15.add(0, (java.lang.Object) (byte) 1);
        boolean var26 = var15.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var28 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var29 = var28.size();
        var28.add(0, (java.lang.Object) 100L);
        int var33 = var28.size();
        int var34 = var28.size();
        int var35 = var28.size();
        var28.add(1, (java.lang.Object) 1.0d);
        boolean var39 = var28.isEmpty();
        var15.add(1, (java.lang.Object) var28);
        boolean var41 = var15.isEmpty();
        var0.add(0, (java.lang.Object) var41);
        boolean var43 = var0.isEmpty();
        var0.remove(0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == false);
        
    }
    
    public void test251() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test251");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        int var7 = var3.size();
        boolean var8 = var3.isEmpty();
        var3.removeAll();
        var3.removeAll();
        var3.removeAll();
        var3.removeAll();
        int var13 = var3.size();
        var3.removeAll();
        int var15 = var3.size();
        int var16 = var3.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 0);
        
    }
    
    public void test252() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test252");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        var0.removeAll();
        boolean var3 = var0.isEmpty();
        var0.removeAll();
        boolean var5 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        int var8 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var10 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var10.removeAll();
        boolean var12 = var10.isEmpty();
        int var13 = var10.size();
        var10.removeAll();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var17 = var16.size();
        boolean var18 = var16.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var20 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var21 = var20.size();
        boolean var22 = var20.isEmpty();
        boolean var23 = var20.isEmpty();
        boolean var24 = var20.isEmpty();
        var16.add(0, (java.lang.Object) var24);
        var10.add(0, (java.lang.Object) var16);
        int var27 = var16.size();
        int var28 = var16.size();
        int var29 = var16.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var31 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var32 = var31.size();
        var31.add(0, (java.lang.Object) 100L);
        int var36 = var31.size();
        boolean var37 = var31.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var39 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var39.removeAll();
        boolean var41 = var39.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var43 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var44 = var43.size();
        var43.removeAll();
        var43.removeAll();
        var39.add(0, (java.lang.Object) var43);
        boolean var48 = var39.isEmpty();
        boolean var49 = var39.isEmpty();
        var31.add(1, (java.lang.Object) var49);
        int var51 = var31.size();
        var31.add(2, (java.lang.Object) '4');
        ar.verificacion.validacion.treelistimplementation.TreeList var56 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var56.removeAll();
        boolean var58 = var56.isEmpty();
        int var59 = var56.size();
        var56.removeAll();
        int var61 = var56.size();
        boolean var62 = var56.isEmpty();
        boolean var63 = var56.isEmpty();
        var31.add(3, (java.lang.Object) var63);
        boolean var65 = var31.isEmpty();
        var31.remove(2);
        var31.remove(2);
        var16.add(1, (java.lang.Object) var31);
        var0.add(0, (java.lang.Object) 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var44 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var48 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var49 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var51 == 2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var58 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var59 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var61 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var62 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var63 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var65 == false);
        
    }
    
    public void test253() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test253");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.add(0, (java.lang.Object) 1L);
        int var7 = var0.size();
        boolean var8 = var0.isEmpty();
        boolean var9 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var11 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var12 = var11.size();
        var11.add(0, (java.lang.Object) 100L);
        int var16 = var11.size();
        int var17 = var11.size();
        java.lang.Object var19 = var11.get(0);
        var11.removeAll();
        var11.removeAll();
        var0.add(1, (java.lang.Object) var11);
        boolean var23 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var25 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var26 = var25.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var28 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var29 = var28.size();
        var28.add(0, (java.lang.Object) 100L);
        int var33 = var28.size();
        boolean var34 = var28.isEmpty();
        boolean var35 = var28.isEmpty();
        var25.add(0, (java.lang.Object) var35);
        ar.verificacion.validacion.treelistimplementation.TreeList var38 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var39 = var38.size();
        var38.add(0, (java.lang.Object) 100L);
        int var43 = var38.size();
        int var44 = var38.size();
        int var45 = var38.size();
        var38.removeAll();
        boolean var47 = var38.isEmpty();
        boolean var48 = var38.isEmpty();
        var25.add(1, (java.lang.Object) var48);
        var25.removeAll();
        var25.removeAll();
        var0.add(0, (java.lang.Object) var25);
        int var53 = var25.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var19 + "' != '" + 100L + "'", var19.equals(100L));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var33 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var39 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var44 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var45 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var48 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var53 == 0);
        
    }
    
    public void test254() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test254");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        boolean var2 = var0.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var4 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var5 = var4.size();
        boolean var6 = var4.isEmpty();
        boolean var7 = var4.isEmpty();
        boolean var8 = var4.isEmpty();
        var0.add(0, (java.lang.Object) var8);
        int var10 = var0.size();
        int var11 = var0.size();
        boolean var12 = var0.isEmpty();
        int var13 = var0.size();
        boolean var14 = var0.isEmpty();
        boolean var15 = var0.isEmpty();
        int var16 = var0.size();
        var0.removeAll();
        int var18 = var0.size();
        int var19 = var0.size();
        int var20 = var0.size();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var6 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var7 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var11 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
    }
    
    public void test255() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test255");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        var3.add(0, (java.lang.Object) 100L);
        int var8 = var3.size();
        boolean var9 = var3.isEmpty();
        boolean var10 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var10);
        ar.verificacion.validacion.treelistimplementation.TreeList var13 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var14 = var13.size();
        var13.add(0, (java.lang.Object) 100L);
        int var18 = var13.size();
        int var19 = var13.size();
        int var20 = var13.size();
        var13.removeAll();
        boolean var22 = var13.isEmpty();
        boolean var23 = var13.isEmpty();
        var0.add(1, (java.lang.Object) var23);
        int var25 = var0.size();
        int var26 = var0.size();
        var0.removeAll();
        var0.removeAll();
        int var29 = var0.size();
        boolean var30 = var0.isEmpty();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var25 == 2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var26 == 2);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var29 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == true);
        
    }
    
    public void test256() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test256");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        var3.add(0, (java.lang.Object) 100L);
        int var8 = var3.size();
        boolean var9 = var3.isEmpty();
        boolean var10 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var10);
        ar.verificacion.validacion.treelistimplementation.TreeList var13 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var14 = var13.size();
        var13.add(0, (java.lang.Object) 100L);
        int var18 = var13.size();
        int var19 = var13.size();
        int var20 = var13.size();
        var13.removeAll();
        boolean var22 = var13.isEmpty();
        boolean var23 = var13.isEmpty();
        var0.add(1, (java.lang.Object) var23);
        var0.add(0, (java.lang.Object) 'a');
        int var28 = var0.size();
        java.lang.Object var30 = var0.get(0);
        boolean var31 = var0.isEmpty();
        boolean var32 = var0.isEmpty();
        var0.removeAll();
        int var34 = var0.size();
        var0.removeAll();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var23 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var28 == 3);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var30 + "' != '" + 'a' + "'", var30.equals('a'));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var32 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var34 == 0);
        
    }
    
    public void test257() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test257");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var0.removeAll();
        boolean var2 = var0.isEmpty();
        int var3 = var0.size();
        var0.add(0, (java.lang.Object) 1L);
        ar.verificacion.validacion.treelistimplementation.TreeList var8 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var9 = var8.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var11 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var12 = var11.size();
        boolean var13 = var11.isEmpty();
        var8.add(0, (java.lang.Object) var11);
        var11.add(0, (java.lang.Object) (-1.0d));
        var11.removeAll();
        boolean var19 = var11.isEmpty();
        int var20 = var11.size();
        boolean var21 = var11.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var23 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var24 = var23.isEmpty();
        var23.removeAll();
        var11.add(0, (java.lang.Object) var23);
        var23.removeAll();
        var0.add(0, (java.lang.Object) var23);
        ar.verificacion.validacion.treelistimplementation.TreeList var30 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var31 = var30.size();
        var30.add(0, (java.lang.Object) 100L);
        int var35 = var30.size();
        int var36 = var30.size();
        int var37 = var30.size();
        java.lang.Object var39 = var30.get(0);
        int var40 = var30.size();
        int var41 = var30.size();
        var23.add(0, (java.lang.Object) var41);
        int var43 = var23.size();
        int var44 = var23.size();
        int var45 = var23.size();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var47 = var23.get((-1));
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var2 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var19 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var20 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var24 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var37 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue("'" + var39 + "' != '" + 100L + "'", var39.equals(100L));
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var43 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var44 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var45 == 1);
        
    }
    
    public void test258() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test258");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        boolean var5 = var0.isEmpty();
        var0.removeAll();
        var0.removeAll();
        int var8 = var0.size();
        boolean var9 = var0.isEmpty();
        boolean var10 = var0.isEmpty();
        var0.removeAll();
        boolean var12 = var0.isEmpty();
        int var13 = var0.size();
        boolean var14 = var0.isEmpty();
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
    }
    
    public void test259() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test259");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        boolean var1 = var0.isEmpty();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        var0.add(0, (java.lang.Object) (byte) 1);
        int var8 = var0.size();
        int var9 = var0.size();
        boolean var10 = var0.isEmpty();
        var0.removeAll();
        boolean var12 = var0.isEmpty();
        boolean var13 = var0.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var15 = var0.get(0);
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var9 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var12 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == true);
        
    }
    
    public void test260() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test260");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        var0.removeAll();
        int var3 = var0.size();
        var0.removeAll();
        var0.add(0, (java.lang.Object) 100L);
        int var8 = var0.size();
        var0.removeAll();
        int var10 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var13 = var12.size();
        var12.removeAll();
        int var15 = var12.size();
        boolean var16 = var12.isEmpty();
        int var17 = var12.size();
        boolean var18 = var12.isEmpty();
        var0.add(0, (java.lang.Object) var12);
        var12.removeAll();
        boolean var21 = var12.isEmpty();
        boolean var22 = var12.isEmpty();
        // The following exception was thrown during execution.
        // This behavior will recorded for regression testing.
        try {
            java.lang.Object var24 = var12.get((-1));
            fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var3 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var8 == 1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var13 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var15 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var16 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var18 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var21 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var22 == true);
        
    }
    
    public void test261() throws Throwable {
        
        if (debug)
            System.out.printf("%nRandoopTest35.test261");
        
        ar.verificacion.validacion.treelistimplementation.TreeList var0 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var1 = var0.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var3 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var4 = var3.size();
        boolean var5 = var3.isEmpty();
        var0.add(0, (java.lang.Object) var3);
        var3.add(0, (java.lang.Object) (-1.0d));
        boolean var10 = var3.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var12 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        var12.removeAll();
        boolean var14 = var12.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var16 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var17 = var16.size();
        var16.removeAll();
        var16.removeAll();
        var12.add(0, (java.lang.Object) var16);
        var16.removeAll();
        var3.add(0, (java.lang.Object) var16);
        java.lang.Object var24 = var3.get(0);
        ar.verificacion.validacion.treelistimplementation.TreeList var26 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var27 = var26.size();
        ar.verificacion.validacion.treelistimplementation.TreeList var29 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var30 = var29.size();
        boolean var31 = var29.isEmpty();
        var26.add(0, (java.lang.Object) var29);
        var26.removeAll();
        var26.removeAll();
        int var35 = var26.size();
        boolean var36 = var26.isEmpty();
        var3.add(2, (java.lang.Object) var36);
        ar.verificacion.validacion.treelistimplementation.TreeList var39 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var40 = var39.size();
        boolean var41 = var39.isEmpty();
        ar.verificacion.validacion.treelistimplementation.TreeList var43 = new ar.verificacion.validacion.treelistimplementation.TreeList();
        int var44 = var43.size();
        boolean var45 = var43.isEmpty();
        boolean var46 = var43.isEmpty();
        boolean var47 = var43.isEmpty();
        var39.add(0, (java.lang.Object) var47);
        var39.removeAll();
        var39.removeAll();
        var3.add(3, (java.lang.Object) var39);
        var3.remove(2);
        var3.remove(2);
        var3.remove(1);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var1 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var4 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var5 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var10 == false);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var14 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var17 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertNotNull(var24);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var27 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var30 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var31 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var35 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var36 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var40 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var41 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var44 == 0);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var45 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var46 == true);
        
        // Regression assertion (captures the current behavior of the code)
        assertTrue(var47 == true);
        
    }
    
}
