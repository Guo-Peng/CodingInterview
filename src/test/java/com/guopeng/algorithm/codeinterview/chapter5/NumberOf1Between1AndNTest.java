package com.guopeng.algorithm.codeinterview.chapter5;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * NumberOf1Between1AndN Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 16, 2017</pre>
 */
public class NumberOf1Between1AndNTest {
    static NumberOf1Between1AndN ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new NumberOf1Between1AndN();
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
    public void testNumberOf1Between1AndN() throws Exception {
        assertEquals(1, ins.numberOf1Between1AndN(1));
        assertEquals(1, ins.numberOf1Between1AndN(5));
        assertEquals(2, ins.numberOf1Between1AndN(10));
        assertEquals(16, ins.numberOf1Between1AndN(55));
        assertEquals(20, ins.numberOf1Between1AndN(99));
        assertEquals(4001, ins.numberOf1Between1AndN(10000));
        assertEquals(18821, ins.numberOf1Between1AndN(21345));
        assertEquals(0, ins.numberOf1Between1AndN(0));
    }


    @Test
    public void testNumberOf1() throws Exception {
        //TODO: Test goes here... 
    /* 
    try { 
       Method method = NumberOf1Between1AndN.getClass().getMethod("numberOf1", int.class); 
       method.setAccessible(true); 
       method.invoke(<Object>, <Parameters>); 
    } catch(NoSuchMethodException e) { 
    } catch(IllegalAccessException e) { 
    } catch(InvocationTargetException e) { 
    } 
    */
    }

} 
