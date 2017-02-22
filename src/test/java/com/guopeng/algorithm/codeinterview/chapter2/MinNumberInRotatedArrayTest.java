package com.guopeng.algorithm.codeinterview.chapter2;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * MinNumberInRotatedArray Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 2, 2017</pre>
 */
public class MinNumberInRotatedArrayTest {
    static MinNumberInRotatedArray ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new MinNumberInRotatedArray();
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
    public void testMinNumberInRotatedArray() throws Exception {
        int arr[] = {4, 5, 8, 9, 1, 2, 3};
        assertEquals("rotated array without replicate value", 1, ins.minNumberInRotatedArray(arr));

        arr = new int[]{1, 0, 1, 1, 1};
        assertEquals("rotated array with replicate value", 0, ins.minNumberInRotatedArray(arr));

        arr = new int[]{1, 1, 1, 0, 1};
        assertEquals("rotated array with replicate value", 0, ins.minNumberInRotatedArray(arr));

        arr = new int[]{1};
        assertEquals("rotated array with one value", 1, ins.minNumberInRotatedArray(arr));

        arr = new int[]{1, 2, 3};
        assertEquals("rotated 0 value", 1, ins.minNumberInRotatedArray(arr));

        arr = new int[]{4, 3, 2};
        expectedExc.expectMessage("Invalid Input");
        ins.minNumberInRotatedArray(null);
        ins.minNumberInRotatedArray(arr);

        expectedExc.expect(Exception.class);
        expectedExc.expectMessage("Invalid Input");
        ins.minNumberInRotatedArray(null);


    }


} 
