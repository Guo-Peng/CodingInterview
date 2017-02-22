package com.guopeng.algorithm.codeinterview.chapter6;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * FindNumbersWithSum Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 20, 2017</pre>
 */
public class FindNumbersWithSumTest {
    static FindNumbersWithSum ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new FindNumbersWithSum();
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
    public void testTwoNumbersWithSum() throws Exception {
        int[] arr = {1, 2, 4, 7, 11, 15};
        ins.twoNumbersWithSum(arr, 15);

        ins.twoNumbersWithSum(arr, 14);
        ins.twoNumbersWithSum(null, 10);
    }

    @Test
    public void testContinueSequenceWithSum() throws Exception {
        ins.continueSequenceWithSum(3);
        ins.continueSequenceWithSum(15);
        ins.continueSequenceWithSum(100);
        ins.continueSequenceWithSum(4);
        ins.continueSequenceWithSum(0);
    }

} 
