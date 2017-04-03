package com.guopeng.algorithm.real.meituan;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * LeastJump Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>三月 29, 2017</pre>
 */
public class LeastJumpTest {
    static LeastJump ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new LeastJump();
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
    public void testLeastJump() throws Exception {
        int[] arr = {5, 4, 6, 2, 1, 1, 2, 3, 5, 3};
        System.out.println(ins.leastJump(arr));
    }


} 
