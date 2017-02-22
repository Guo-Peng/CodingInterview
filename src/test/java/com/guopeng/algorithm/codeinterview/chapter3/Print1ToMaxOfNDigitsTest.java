package com.guopeng.algorithm.codeinterview.chapter3;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * Print1ToMaxOfNDigits Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 8, 2017</pre>
 */
public class Print1ToMaxOfNDigitsTest {
    static Print1ToMaxOfNDigits ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new Print1ToMaxOfNDigits();
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
    public void testPrint1ToMaxOfNDigits() throws Exception {
        ins.print1ToMaxOfNDigits(3);
    }


    @Test
    public void testSetNBit() throws Exception {
        //TODO: Test goes here... 
    /* 
    try { 
       Method method = Print1ToMaxOfNDigits.getClass().getMethod("setNBit", int.class, String.class); 
       method.setAccessible(true); 
       method.invoke(<Object>, <Parameters>); 
    } catch(NoSuchMethodException e) { 
    } catch(IllegalAccessException e) { 
    } catch(InvocationTargetException e) { 
    } 
    */
    }

    @Test
    public void testPrintNum() throws Exception {
        //TODO: Test goes here... 
    /* 
    try { 
       Method method = Print1ToMaxOfNDigits.getClass().getMethod("printNum", String.class); 
       method.setAccessible(true); 
       method.invoke(<Object>, <Parameters>); 
    } catch(NoSuchMethodException e) { 
    } catch(IllegalAccessException e) { 
    } catch(InvocationTargetException e) { 
    } 
    */
    }

} 
