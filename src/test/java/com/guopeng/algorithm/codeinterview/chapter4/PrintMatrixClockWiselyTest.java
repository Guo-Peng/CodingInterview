package com.guopeng.algorithm.codeinterview.chapter4;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * PrintMatrixClockWisely Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 13, 2017</pre>
 */
public class PrintMatrixClockWiselyTest {
    static PrintMatrixClockWisely ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new PrintMatrixClockWisely();
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
    public void testPrintMatrixClockWisely() throws Exception {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        assertEquals("12348121615141395671110", ins.printMatrixClockWisely(matrix));

        matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        assertEquals("123481211109567", ins.printMatrixClockWisely(matrix));

        matrix = new int[][]{{1, 2, 3, 4}};
        assertEquals("1234", ins.printMatrixClockWisely(matrix));

        matrix = new int[][]{{1}, {2}, {3}, {4}};
        assertEquals("1234", ins.printMatrixClockWisely(matrix));

        matrix = new int[][]{{1}};
        assertEquals("1", ins.printMatrixClockWisely(matrix));
    }

} 
