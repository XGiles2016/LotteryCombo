/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lottery;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Xavi
 */
public class ComboTest {
    
    public ComboTest() {
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
     * Test of makeFullList method, of class Combo.
     */
    @Test
    public void testMakeFullList() throws Exception {
        System.out.println("makeFullList");
        Combo instance = new Combo();
        ArrayList expResult = null;
        ArrayList result = instance.makeFullList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of realList method, of class Combo.
     */
    @Test
    public void testRealList() throws Exception {
        System.out.println("realList");
        Combo instance = new Combo();
        int[] expResult = null;
        int[] result = instance.realList();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printList method, of class Combo.
     */
    @Test
    public void testPrintList() throws Exception {
        System.out.println("printList");
        Combo instance = new Combo();
        instance.printList();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCombo method, of class Combo.
     */
    @Test
    public void testGetCombo() throws Exception {
        System.out.println("getCombo");
        Combo instance = new Combo();
        int[] expResult = null;
        int[] result = instance.getCombo();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
