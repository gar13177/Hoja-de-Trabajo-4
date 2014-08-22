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
public class IStackTest {
    
    public IStackTest() {
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
     * Test of pop method, of class IStack.
     */
    @Test
    public void testPop() {
        System.out.println("pop");
        IStack instance = new IStackImpl();
        Object expResult = null;
        Object result = instance.pop();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of push method, of class IStack.
     */
    @Test
    public void testPush() {
        System.out.println("push");
        Object t = null;
        IStack instance = new IStackImpl();
        instance.push(t);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class IStack.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        IStack instance = new IStackImpl();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IStackImpl implements IStack {

        public T pop() {
            return null;
        }

        public void push(T t) {
        }

        public boolean isEmpty() {
            return false;
        }
    }
    
}
