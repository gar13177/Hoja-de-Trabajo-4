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
public class NodoDobleTest {
    
    public NodoDobleTest() {
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
     * Test of compareTo method, of class NodoDoble.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object other = null;
        NodoDoble instance = new NodoDoble();
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAnterior method, of class NodoDoble.
     */
    @Test
    public void testGetAnterior() {
        System.out.println("getAnterior");
        NodoDoble instance = new NodoDoble();
        NodoDoble expResult = null;
        NodoDoble result = instance.getAnterior();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAnterior method, of class NodoDoble.
     */
    @Test
    public void testSetAnterior() {
        System.out.println("setAnterior");
        NodoDoble instance = new NodoDoble();
        instance.setAnterior(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSiguiente method, of class NodoDoble.
     */
    @Test
    public void testSetSiguiente() {
        System.out.println("setSiguiente");
        NodoDoble instance = new NodoDoble();
        instance.setSiguiente(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
