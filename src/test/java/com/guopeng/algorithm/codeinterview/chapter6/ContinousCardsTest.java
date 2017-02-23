package com.guopeng.algorithm.codeinterview.chapter6;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * ContinousCards Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 24, 2017</pre>
 */
public class ContinousCardsTest {
    static ContinousCards ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new ContinousCards();
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
    public void testIsContinue() throws Exception {
        int[] arr = {2, 3, 5, 6, 0};

        assertEquals(true, ins.isContinue(arr));

        arr = new int[]{0, 2, 3, 6, 0};
        assertEquals(true, ins.isContinue(arr));

        arr = new int[]{2, 4, 3, 5, 6};
        assertEquals(true, ins.isContinue(arr));

        arr = new int[]{0, 2, 3, 3, 0};
        assertEquals(false, ins.isContinue(arr));
    }


} 
