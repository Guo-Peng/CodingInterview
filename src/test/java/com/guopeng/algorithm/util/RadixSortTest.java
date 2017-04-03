package com.guopeng.algorithm.util;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * RadixSort Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>四月 3, 2017</pre>
 */
public class RadixSortTest {
    static RadixSort ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new RadixSort();
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
    public void testRadixSort() throws Exception {
        int[] arr = {100, 23, 5, 60};
        assertArrayEquals(new int[]{5, 23, 60, 100}, ins.radixSort(arr, 4));
    }


    @Test
    public void testDim() throws Exception {
        //TODO: Test goes here... 
    /* 
    try { 
       Method method = RadixSort.getClass().getMethod("dim", int[].class, int.class); 
       method.setAccessible(true); 
       method.invoke(<Object>, <Parameters>); 
    } catch(NoSuchMethodException e) { 
    } catch(IllegalAccessException e) { 
    } catch(InvocationTargetException e) { 
    } 
    */
    }

} 
