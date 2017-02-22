package com.guopeng.algorithm.codeinterview.chapter2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * FindInPartiallySortedMatrix Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>二月 1, 2017</pre>
 */
public class FindInPartiallySortedMatrixTest {
    static FindInPartiallySortedMatrix ins;

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new FindInPartiallySortedMatrix();
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
    public void testFind() {
        int[][] matrix = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        assertEquals("7 is in the matrix", true, ins.find(matrix, 7));
        assertEquals("4 is in the matrix", true, ins.find(matrix, 4));
        assertEquals("matrix is null", false, ins.find(null, 7));
        assertEquals("3 is not in the matrix", false, ins.find(matrix, 3));
    }


} 
