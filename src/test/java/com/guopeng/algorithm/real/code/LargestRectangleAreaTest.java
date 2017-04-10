package com.guopeng.algorithm.real.code;

import static org.junit.Assert.*;

import com.guopeng.algorithm.real.code.Stack.LargestRectangleArea;
import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * LargestRectangleArea Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>四月 7, 2017</pre>
 */
public class LargestRectangleAreaTest {
    static LargestRectangleArea ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new LargestRectangleArea();
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
    public void testLargestRectangleArea() throws Exception {
        int[] heights = {2, 1, 5, 6, 2, 3};
        assertEquals(10, ins.largestRectangleArea(heights));

        heights = new int[]{1};
        assertEquals(1, ins.largestRectangleArea(heights));

        heights = new int[]{1, 1};
        assertEquals(2, ins.largestRectangleArea(heights));

        heights = new int[]{2, 1, 2};
        assertEquals(3, ins.largestRectangleArea(heights));

        heights = new int[]{4, 2, 0, 3, 2, 5};
        assertEquals(6, ins.largestRectangleArea(heights));
    }


} 
