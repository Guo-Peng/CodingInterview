package com.guopeng.algorithm.util;

import static org.junit.Assert.*;

import org.junit.*;
import org.junit.rules.ExpectedException;

/**
 * QuickSort Tester.
 *
 * @author guopeng
 * @version 1.0
 * @since <pre>三月 4, 2017</pre>
 */
public class QuickSortTest {
    static QuickSort ins;

    @Rule
    public ExpectedException expectedExc = ExpectedException.none();

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        ins = new QuickSort();
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
    public void testQuickSort() throws Exception {
        int[] arr = {7, 6, 5, 4, 3, 2, 1};

        ins.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, arr);

        arr = new int[]{5, 7, 4, 6, 9, 2, 1};

        ins.quickSort(arr, 0, arr.length - 1);
        assertArrayEquals(new int[]{1, 2, 4, 5, 6, 7, 9}, arr);
    }

} 
