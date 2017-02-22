package com.guopeng.algorithm.codeinterview.chapter5;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * GetUglyNumber Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 16, 2017</pre>
 */
public class GetUglyNumberTest {
    static GetUglyNumber ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new GetUglyNumber();
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
    public void testGetUglyNumber() throws Exception {
        assertEquals(1, ins.getUglyNumber(1));
        assertEquals(2, ins.getUglyNumber(2));
        assertEquals(3, ins.getUglyNumber(3));
        assertEquals(4, ins.getUglyNumber(4));
        assertEquals(5, ins.getUglyNumber(5));
        assertEquals(6, ins.getUglyNumber(6));

        assertEquals(859963392, ins.getUglyNumber(1500));

        expectedExc.expectMessage("Invalid Input");
        expectedExc.expect(Exception.class);
        assertEquals(6, ins.getUglyNumber(6));
    }


    @Test
    public void testMinOf3Number() throws Exception {
        //TODO: Test goes here... 
    /* 
    try { 
       Method method = GetUglyNumber.getClass().getMethod("minOf3Number", int[].class, int.class, int.class, int.class); 
       method.setAccessible(true); 
       method.invoke(<Object>, <Parameters>); 
    } catch(NoSuchMethodException e) { 
    } catch(IllegalAccessException e) { 
    } catch(InvocationTargetException e) { 
    } 
    */
    }

} 
