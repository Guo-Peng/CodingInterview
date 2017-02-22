package com.guopeng.algorithm.codeinterview.chapter6;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * FindNumbersAppearOnce Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 18, 2017</pre>
 */
public class FindNumbersAppearOnceTest {
    static FindNumbersAppearOnce ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new FindNumbersAppearOnce();
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
    public void testFindNumbersAppearOnce() throws Exception {
        int[] arr = {2, 4, 3, 6, 3, 2, 5, 5};

        assertArrayEquals(new int[]{4, 6}, ins.findNumbersAppearOnce(arr));
    }


} 
