package com.guopeng.algorithm.codeinterview.chapter5;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * MoreThanHalfNumber Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 15, 2017</pre>
 */
public class MoreThanHalfNumberTest {
    static MoreThanHalfNumber ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new MoreThanHalfNumber();
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
    public void testMoreThanHalfNumber() throws Exception {
        int[] arr = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        assertEquals(2, ins.moreThanHalfNumber(arr));

        arr = new int[]{1};
        assertEquals(1, ins.moreThanHalfNumber(arr));

        expectedExc.expectMessage("Invalid Input");
        expectedExc.expect(Exception.class);
        arr = new int[]{1, 2, 3, 2, 4, 5};
        assertEquals(2, ins.moreThanHalfNumber(arr));

        expectedExc.expectMessage("Invalid Input");
        expectedExc.expect(Exception.class);
        ins.moreThanHalfNumber(null);
    }


} 
