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
public class AbstractStackTest {
    
    public AbstractStackTest() {
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
     * Test of eval method, of class AbstractStack.
     */
    @Test
    public void testEval() {
        System.out.println("eval");
        String exp = "";
        AbstractStack stack = null;
        AbstractStack instance = new AbstractStackImpl();
        int expResult = 0;
        int result = instance.eval(exp, stack);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of pop method, of class AbstractStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        AbstractStack instance = new AbstractStackImpl();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class AbstractStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object dato = null;
        AbstractStack instance = new AbstractStackImpl();
        instance.push(dato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class AbstractStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        AbstractStack instance = new AbstractStackImpl();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class AbstractStackImpl extends AbstractStack {

        public T pop() {
            return null;
        }

        public void push(T dato) {
        }

        public boolean isEmpty() {
            return false;
        }
    }
    
}
