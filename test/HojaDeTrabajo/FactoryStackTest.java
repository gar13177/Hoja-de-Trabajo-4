/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package HojaDeTrabajo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin
 */
public class FactoryStackTest {
    
    public FactoryStackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of finalize method, of class FactoryStack.
     */
    @Test
    public void testFinalize() {
        System.out.println("finalize");
        FactoryStack instance = new FactoryStack();
        instance.finalize();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getStack method, of class FactoryStack.
     */
    @Test
    public void testGetStack() {
        System.out.println("getStack");
        int entry = 0;
        int tipoLista = 0;
        FactoryStack instance = new FactoryStack();
        AbstractStack expResult = null;
        AbstractStack result = instance.getStack(entry, tipoLista);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
