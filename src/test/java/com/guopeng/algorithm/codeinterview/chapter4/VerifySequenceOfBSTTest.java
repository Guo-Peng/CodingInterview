package com.guopeng.algorithm.codeinterview.chapter4;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * VerifySequenceOfBST Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 14, 2017</pre>
 */
public class VerifySequenceOfBSTTest {
    static VerifySequenceOfBST ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new VerifySequenceOfBST();
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
    public void testVerifySequenceOfBST() throws Exception {
        int[] arr = {5, 7, 6, 9, 11, 10, 8};
        assertEquals(true, ins.verifySequenceOfBST(arr));

        arr = new int[]{1, 2, 3, 4, 5, 6};
        assertEquals(true, ins.verifySequenceOfBST(arr));

        arr = new int[]{6, 5, 4, 3, 2, 1};
        assertEquals(true, ins.verifySequenceOfBST(arr));

        arr = new int[]{1};
        assertEquals(true, ins.verifySequenceOfBST(arr));

        arr = new int[]{7, 4, 6, 5};
        assertEquals(false, ins.verifySequenceOfBST(arr));

        assertEquals(false, ins.verifySequenceOfBST(null));
    }
} 
