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
public class IListaTest {
    
    public IListaTest() {
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
     * Test of getTamaño method, of class ILista.
     */
    @Test
    public void testGetTamaño() {
        System.out.println("getTama\u00f1o");
        ILista instance = new IListaImpl();
        int expResult = 0;
        int result = instance.getTamaño();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isEmpty method, of class ILista.
     */
    @Test
    public void testIsEmpty() {
        System.out.println("isEmpty");
        ILista instance = new IListaImpl();
        boolean expResult = false;
        boolean result = instance.isEmpty();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AgregarPrincipio method, of class ILista.
     */
    @Test
    public void testAgregarPrincipio() {
        System.out.println("AgregarPrincipio");
        Object value = null;
        ILista instance = new IListaImpl();
        instance.AgregarPrincipio(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of AgregarFinal method, of class ILista.
     */
    @Test
    public void testAgregarFinal() {
        System.out.println("AgregarFinal");
        Object value = null;
        ILista instance = new IListaImpl();
        instance.AgregarFinal(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RemoverUltimo method, of class ILista.
     */
    @Test
    public void testRemoverUltimo() {
        System.out.println("RemoverUltimo");
        ILista instance = new IListaImpl();
        Object expResult = null;
        Object result = instance.RemoverUltimo();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class ILista.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        ILista instance = new IListaImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get method, of class ILista.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int pos = 0;
        ILista instance = new IListaImpl();
        Object expResult = null;
        Object result = instance.get(pos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set method, of class ILista.
     */
    @Test
    public void testSet() {
        System.out.println("set");
        Object valor = null;
        int pos = 0;
        ILista instance = new IListaImpl();
        instance.set(valor, pos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toArray method, of class ILista.
     */
    @Test
    public void testToArray() {
        System.out.println("toArray");
        ILista instance = new IListaImpl();
        Comparable[] expResult = null;
        Comparable[] result = instance.toArray();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Agregar method, of class ILista.
     */
    @Test
    public void testAgregar() {
        System.out.println("Agregar");
        Object valor = null;
        int pos = 0;
        ILista instance = new IListaImpl();
        instance.Agregar(valor, pos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class IListaImpl implements ILista {

        public int getTamaño() {
            return 0;
        }

        public boolean isEmpty() {
            return false;
        }

        public void AgregarPrincipio(T value) {
        }

        public void AgregarFinal(T value) {
        }

        public T RemoverUltimo() {
            return null;
        }

        public String toString() {
            return "";
        }

        public T get(int pos) {
            return null;
        }

        public void set(T valor, int pos) {
        }

        public Comparable[] toArray() {
            return null;
        }

        public void Agregar(T valor, int pos) {
        }
    }
    
}
