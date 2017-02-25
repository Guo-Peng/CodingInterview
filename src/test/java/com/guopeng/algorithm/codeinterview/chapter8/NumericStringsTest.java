package com.guopeng.algorithm.codeinterview.chapter8;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * NumericStrings Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 25, 2017</pre>
 */
public class NumericStringsTest {
    static NumericStrings ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new NumericStrings();
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testIsNumeric() throws Exception {
        assertEquals(true, ins.isNumeric("100"));
        assertEquals(true, ins.isNumeric("123.45e+6"));
        assertEquals(true, ins.isNumeric("+500"));
        assertEquals(true, ins.isNumeric("5e2"));
        assertEquals(true, ins.isNumeric("3.1416"));
        assertEquals(true, ins.isNumeric("600."));
        assertEquals(true, ins.isNumeric("-.123"));
        assertEquals(true, ins.isNumeric("-1E-16"));
        assertEquals(true, ins.isNumeric("-1.79769313486232E+308"));

        assertEquals(false, ins.isNumeric("12e"));
        assertEquals(false, ins.isNumeric("1a3.14"));
        assertEquals(false, ins.isNumeric("1+23"));
        assertEquals(false, ins.isNumeric("1.2.3"));
        assertEquals(false, ins.isNumeric("+-5"));
        assertEquals(false, ins.isNumeric("12e+5.4"));
        assertEquals(false, ins.isNumeric("."));
        assertEquals(false, ins.isNumeric("e1"));
        assertEquals(false, ins.isNumeric("+."));
    }


    @Test
    public void testScanInt() throws Exception {
        //TODO: Test goes here... 
    /* 
    try { 
       Method method = NumericStrings.getClass().getMethod("scanInt", String.class, int.class); 
       method.setAccessible(true); 
       method.invoke(<Object>, <Parameters>); 
    } catch(NoSuchMethodException e) { 
    } catch(IllegalAccessException e) { 
    } catch(InvocationTargetException e) { 
    } 
    */
    }

} 
