package com.guopeng.algorithm.codeinterview.chapter5;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * GreatestSumOfSubArrays Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 16, 2017</pre>
 */
public class GreatestSumOfSubArraysTest {
    static GreatestSumOfSubArrays ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new GreatestSumOfSubArrays();
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
    public void testGreatestSumOfSubArrays() throws Exception {
        int[] arr = {1, -2, 3, 10, -4, 7, 2, -5};
        assertEquals(18, ins.greatestSumOfSubArrays(arr));

        arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        assertEquals(36, ins.greatestSumOfSubArrays(arr));

        arr = new int[]{-1, -2, -3, -4, -5, -6, -7, -8};
        assertEquals(-1, ins.greatestSumOfSubArrays(arr));

        expectedExc.expectMessage("Invalid Input");
        expectedExc.expect(Exception.class);
        ins.greatestSumOfSubArrays(null);
    }


} 
