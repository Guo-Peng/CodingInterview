package com.guopeng.algorithm.real.leetcode.Greedy;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * MinimumArrowToBurstBalloons Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>四月 9, 2017</pre>
 */
public class MinimumArrowToBurstBalloonsTest {
    static MinimumArrowToBurstBalloons ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new MinimumArrowToBurstBalloons();
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
    public void testFindMinArrowShots() throws Exception {
        int[][] points = {{10, 16}, {2, 8}, {1, 6}, {7, 12}};
        assertEquals(2, ins.findMinArrowShots(points));

        points = new int[][]{{0, 9}, {1, 8}, {7, 8}, {1, 6}, {9, 16}, {7, 13}, {7, 10}, {6, 11}, {6, 9}, {9, 13}};
        assertEquals(3, ins.findMinArrowShots(points));

        points = new int[][]{{2, 3}, {2, 3}};
        assertEquals(1, ins.findMinArrowShots(points));
    }


} 
