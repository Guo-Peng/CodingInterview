package com.guopeng.algorithm.real.leetcode.DynamicProgramming;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * BurstBalloons Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>四月 8, 2017</pre>
 */
public class BurstBalloonsTest {
    static BurstBalloons ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new BurstBalloons();
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
    public void testMaxCoins() throws Exception {
        int[] balloons = {3, 1, 5, 8};
        assertEquals(167, ins.maxCoins(balloons));
    }


} 
