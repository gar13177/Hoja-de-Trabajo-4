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
public class NodoCircularTest {
    
    public NodoCircularTest() {
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
     * Test of setSiguiente method, of class NodoCircular.
     */
    @Test
    public void testSetSiguiente() {
        System.out.println("setSiguiente");
        NodoCircular instance = null;
        instance.setSiguiente(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnterior method, of class NodoCircular.
     */
    @Test
    public void testGetAnterior() {
        System.out.println("getAnterior");
        NodoCircular instance = null;
        NodoCircular expResult = null;
        NodoCircular result = instance.getAnterior();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnterior method, of class NodoCircular.
     */
    @Test
    public void testSetAnterior() {
        System.out.println("setAnterior");
        NodoCircular instance = null;
        instance.setAnterior(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
