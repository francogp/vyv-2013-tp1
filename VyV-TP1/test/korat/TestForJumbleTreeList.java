package korat;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

/**
 * Esta clase es utlizada para ejecutar Jumble ya que este no soporta los test
 * parametricos utilizados para resolver el ejercicio 3.
 * 
 * @author franco pellegrini
 * 
 */
public class TestForJumbleTreeList {
    
    /**
     * Jumble no soporta Test paramétricos, por lo que se hizo este "parche".
     */
    @Test
    public void parametricTest() {
        Result result = JUnitCore
                .runClasses(TestForKoratSerializedObjects.class);
        assertTrue(result.wasSuccessful());
    }
    
}
