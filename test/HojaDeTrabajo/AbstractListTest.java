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
public class AbstractListTest {
    
    public AbstractListTest() {
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
     * Test of isEmpty method, of class AbstractList.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        AbstractList instance = new AbstractListImpl();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Remover method, of class AbstractList.
     */
    @Test
    public void testRemover() {
        System.out.println("Remover");
        Object valor = null;
        AbstractList instance = new AbstractListImpl();
        Object expResult = null;
        Object result = instance.Remover(valor);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AbstractListImpl extends AbstractList {

        public T Remover(T valor) {
            return null;
        }
    }
    
}
