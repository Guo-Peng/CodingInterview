package com.guopeng.algorithm.codeinterview.chapter6;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * NumberOfK Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 18, 2017</pre>
 */
public class NumberOfKTest {
    static NumberOfK ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new NumberOfK();
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
    public void testNumberOfK() throws Exception {
        int[] arr = {1, 2, 3, 3, 3, 3, 4, 5};
        assertEquals(4, ins.numberOfK(arr, 3));
        assertEquals(1, ins.numberOfK(arr, 1));
        assertEquals(1, ins.numberOfK(arr, 5));


        expectedExc.expectMessage("Invalid Input");
        ins.numberOfK(null, 6);

        expectedExc.expectMessage("no such element");
        ins.numberOfK(arr, 6);
    }


} 
