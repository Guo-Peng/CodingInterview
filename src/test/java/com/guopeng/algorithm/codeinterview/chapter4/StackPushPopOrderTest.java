package com.guopeng.algorithm.codeinterview.chapter4;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * StackPushPopOrder Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 14, 2017</pre>
 */
public class StackPushPopOrderTest {
    static StackPushPopOrder ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new StackPushPopOrder();
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
    public void testIsPopOrder() throws Exception {
        int[] push = {1, 2, 3, 4, 5};
        int[] pop = {4, 5, 3, 2, 1};
        assertEquals(true, ins.isPopOrder(push, pop));

        push = new int[]{1, 2, 3, 4, 5};
        pop = new int[]{4, 3, 5, 1, 2};
        assertEquals(false, ins.isPopOrder(push, pop));

        push = new int[]{1};
        pop = new int[]{1};
        assertEquals(true, ins.isPopOrder(push, pop));

        push = new int[]{1};
        pop = new int[]{4};
        assertEquals(false, ins.isPopOrder(push, pop));

        assertEquals(false, ins.isPopOrder(push, null));
        assertEquals(false, ins.isPopOrder(null, null));
    }

} 
