package com.guopeng.algorithm.real.code.DynamicProgramming;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * BestTimeToBuyAndSellStock Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>四月 13, 2017</pre>
 */
public class BestTimeToBuyAndSellStockTest {
    static BestTimeToBuyAndSellStock ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new BestTimeToBuyAndSellStock();
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
    public void testMaxProfit() throws Exception {
        int[] arr = {7, 1, 5, 3, 6, 4};
        assertEquals(5, ins.maxProfit(arr));

        arr = new int[]{7, 6, 4, 3, 1};
        assertEquals(0, ins.maxProfit(arr));

        arr = new int[]{1};
        assertEquals(0, ins.maxProfit(arr));
    }


} 
