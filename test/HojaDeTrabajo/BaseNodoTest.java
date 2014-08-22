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
public class BaseNodoTest {
    
    public BaseNodoTest() {
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
     * Test of getSiguiente method, of class BaseNodo.
     */
    @Test
    public void testGetSiguiente() {
        System.out.println("getSiguiente");
        BaseNodo instance = new BaseNodo();
        BaseNodo expResult = null;
        BaseNodo result = instance.getSiguiente();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSiguiente method, of class BaseNodo.
     */
    @Test
    public void testSetSiguiente() {
        System.out.println("setSiguiente");
        BaseNodo instance = new BaseNodo();
        instance.setSiguiente(null);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValor method, of class BaseNodo.
     */
    @Test
    public void testGetValor() {
        System.out.println("getValor");
        BaseNodo instance = new BaseNodo();
        Object expResult = null;
        Object result = instance.getValor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValor method, of class BaseNodo.
     */
    @Test
    public void testSetValor() {
        System.out.println("setValor");
        Object _valor = null;
        BaseNodo instance = new BaseNodo();
        instance.setValor(_valor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class BaseNodo.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object other = null;
        BaseNodo instance = new BaseNodo();
        boolean expResult = false;
        boolean result = instance.equals(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of compareTo method, of class BaseNodo.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Object other = null;
        BaseNodo instance = new BaseNodo();
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
