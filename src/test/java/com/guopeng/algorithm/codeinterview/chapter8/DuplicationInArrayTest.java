package com.guopeng.algorithm.codeinterview.chapter8;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * DuplicationInArray Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 25, 2017</pre>
 */
public class DuplicationInArrayTest {
    static DuplicationInArray ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new DuplicationInArray();
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
    public void testDuplicationInArray() throws Exception {
        int[] arr = {2, 3, 1, 0, 2, 5, 3};
        assertEquals(2, ins.duplicationInArray(arr));
    }


    @Test
    public void testExchange() throws Exception {
        //TODO: Test goes here... 
    /* 
    try { 
       Method method = DuplicationInArray.getClass().getMethod("exchange", int[].class, int.class, int.class); 
       method.setAccessible(true); 
       method.invoke(<Object>, <Parameters>); 
    } catch(NoSuchMethodException e) { 
    } catch(IllegalAccessException e) { 
    } catch(InvocationTargetException e) { 
    } 
    */
    }

} 
